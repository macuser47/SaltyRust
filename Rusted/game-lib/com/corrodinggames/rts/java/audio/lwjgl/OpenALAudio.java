package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.Audio;
import com.corrodinggames.rts.java.audio.AudioDevice;
import com.corrodinggames.rts.java.audio.AudioRecorder;
import com.corrodinggames.rts.java.audio.a.a;
import com.corrodinggames.rts.java.audio.a.class_144;
import com.corrodinggames.rts.java.audio.a.class_145;
import com.corrodinggames.rts.java.audio.a.class_148;
import com.corrodinggames.rts.java.audio.a.class_154;
import com.corrodinggames.rts.java.audio.a.class_161;
import com.corrodinggames.rts.java.audio.a.class_173;
import com.corrodinggames.rts.java.audio.a.class_177;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;

public class OpenALAudio implements Audio {
   private final int deviceBufferSize;
   private final int deviceBufferCount;
   private class_144 idleSources;
   private class_144 allSources;
   private class_154 soundIdToSource;
   private class_161 sourceToSoundId;
   private long nextSoundId;
   private class_173 extensionToSoundClass;
   private class_173 extensionToMusicClass;
   private OpenALSound[] recentSounds;
   private int mostRecetSound;
   ArrayList music;
   boolean noDevice;

   public OpenALAudio() {
      this(16, 9, 512);
   }

   public OpenALAudio(int var1, int var2, int var3) {
      this.nextSoundId = 0L;
      this.extensionToSoundClass = new class_173();
      this.extensionToMusicClass = new class_173();
      this.mostRecetSound = -1;
      this.music = new ArrayList();
      this.noDevice = false;
      this.deviceBufferSize = var3;
      this.deviceBufferCount = var2;
      this.registerSound("ogg", Ogg$Sound.class);
      this.registerMusic("ogg", Ogg$Music.class);
      this.registerSound("wav", Wav$Sound.class);
      this.registerMusic("wav", Wav$Music.class);

      try {
         AL.create();
      } catch (LWJGLException var7) {
         this.noDevice = true;
         var7.printStackTrace();
         return;
      } catch (NullPointerException var8) {
         this.noDevice = true;
         var8.printStackTrace();
         return;
      }

      this.allSources = new class_144(false, var1);

      for(int var4 = 0; var4 < var1; ++var4) {
         int var5 = AL10.alGenSources();
         if (AL10.alGetError() != 0) {
            break;
         }

         this.allSources.method_1129(var5);
      }

      this.idleSources = new class_144(this.allSources);
      this.soundIdToSource = new class_154();
      this.sourceToSoundId = new class_161();
      FloatBuffer var9 = (FloatBuffer)BufferUtils.createFloatBuffer(6).put(new float[]{0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F}).flip();
      AL10.alListener(4111, var9);
      FloatBuffer var10 = (FloatBuffer)BufferUtils.createFloatBuffer(3).put(new float[]{0.0F, 0.0F, 0.0F}).flip();
      AL10.alListener(4102, var10);
      FloatBuffer var6 = (FloatBuffer)BufferUtils.createFloatBuffer(3).put(new float[]{0.0F, 0.0F, 0.0F}).flip();
      AL10.alListener(4100, var6);
      this.recentSounds = new OpenALSound[var1];
   }

   public void registerSound(String var1, Class var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("extension cannot be null.");
      } else if (var2 == null) {
         throw new IllegalArgumentException("soundClass cannot be null.");
      } else {
         this.extensionToSoundClass.method_1208(var1, var2);
      }
   }

   public void registerMusic(String var1, Class var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("extension cannot be null.");
      } else if (var2 == null) {
         throw new IllegalArgumentException("musicClass cannot be null.");
      } else {
         this.extensionToMusicClass.method_1208(var1, var2);
      }
   }

   public OpenALSound newSound(class_148 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("file cannot be null.");
      } else {
         Class var2 = (Class)this.extensionToSoundClass.method_1213(var1.method_1141().toLowerCase(Locale.ROOT));
         if (var2 == null) {
            throw new class_145("Unknown file extension for sound: " + var1);
         } else {
            try {
               return (OpenALSound)var2.getConstructor(OpenALAudio.class, a.class).newInstance(this, var1);
            } catch (Exception var4) {
               throw new class_145("Error creating sound " + var2.getName() + " for file: " + var1, var4);
            }
         }
      }
   }

   public OpenALMusic newMusic(class_148 var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("file cannot be null.");
      } else {
         Class var2 = (Class)this.extensionToMusicClass.method_1213(var1.method_1141().toLowerCase(Locale.ROOT));
         if (var2 == null) {
            throw new class_145("Unknown file extension for music: " + var1);
         } else {
            try {
               return (OpenALMusic)var2.getConstructor(OpenALAudio.class, a.class).newInstance(this, var1);
            } catch (Exception var4) {
               throw new class_145("Error creating music " + var2.getName() + " for file: " + var1, var4);
            }
         }
      }
   }

   int obtainSource(boolean var1) {
      if (this.noDevice) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = this.idleSources.field_1382; var2 < var3; ++var2) {
            int var4 = this.idleSources.method_1130(var2);
            int var5 = AL10.alGetSourcei(var4, 4112);
            if (var5 != 4114 && var5 != 4115) {
               if (var1) {
                  this.idleSources.method_1131(var2);
               } else {
                  long var6;
                  if (this.sourceToSoundId.method_1187(var4)) {
                     var6 = (Long)this.sourceToSoundId.method_1181(var4);
                     this.sourceToSoundId.method_1183(var4);
                     this.soundIdToSource.method_1159(var6);
                  }

                  var6 = (long)(this.nextSoundId++);
                  this.sourceToSoundId.method_1177(var4, var6);
                  this.soundIdToSource.method_1153(var6, var4);
               }

               AL10.alSourceStop(var4);
               AL10.alSourcei(var4, 4105, 0);
               AL10.alSourcef(var4, 4106, 1.0F);
               AL10.alSourcef(var4, 4099, 1.0F);
               AL10.alSource3f(var4, 4100, 0.0F, 0.0F, 1.0F);
               return var4;
            }
         }

         return -1;
      }
   }

   void freeSource(int var1) {
      if (!this.noDevice) {
         AL10.alSourceStop(var1);
         AL10.alSourcei(var1, 4105, 0);
         if (this.sourceToSoundId.method_1187(var1)) {
            long var2 = (Long)this.sourceToSoundId.method_1183(var1);
            this.soundIdToSource.method_1159(var2);
         }

         this.idleSources.method_1129(var1);
      }
   }

   void freeBuffer(int var1) {
      if (!this.noDevice) {
         int var2 = 0;

         for(int var3 = this.idleSources.field_1382; var2 < var3; ++var2) {
            int var4 = this.idleSources.method_1130(var2);
            if (AL10.alGetSourcei(var4, 4105) == var1) {
               if (this.sourceToSoundId.method_1187(var4)) {
                  long var5 = (Long)this.sourceToSoundId.method_1183(var4);
                  this.soundIdToSource.method_1159(var5);
               }

               AL10.alSourceStop(var4);
               AL10.alSourcei(var4, 4105, 0);
            }
         }

      }
   }

   void stopSourcesWithBuffer(int var1) {
      if (!this.noDevice) {
         int var2 = 0;

         for(int var3 = this.idleSources.field_1382; var2 < var3; ++var2) {
            int var4 = this.idleSources.method_1130(var2);
            if (AL10.alGetSourcei(var4, 4105) == var1) {
               if (this.sourceToSoundId.method_1187(var4)) {
                  long var5 = (Long)this.sourceToSoundId.method_1183(var4);
                  this.soundIdToSource.method_1159(var5);
               }

               AL10.alSourceStop(var4);
            }
         }

      }
   }

   void pauseSourcesWithBuffer(int var1) {
      if (!this.noDevice) {
         int var2 = 0;

         for(int var3 = this.idleSources.field_1382; var2 < var3; ++var2) {
            int var4 = this.idleSources.method_1130(var2);
            if (AL10.alGetSourcei(var4, 4105) == var1) {
               AL10.alSourcePause(var4);
            }
         }

      }
   }

   void resumeSourcesWithBuffer(int var1) {
      if (!this.noDevice) {
         int var2 = 0;

         for(int var3 = this.idleSources.field_1382; var2 < var3; ++var2) {
            int var4 = this.idleSources.method_1130(var2);
            if (AL10.alGetSourcei(var4, 4105) == var1 && AL10.alGetSourcei(var4, 4112) == 4115) {
               AL10.alSourcePlay(var4);
            }
         }

      }
   }

   public void backgroundUpdate() {
      if (!this.noDevice) {
         for(int var1 = 0; var1 < this.music.size(); ++var1) {
            ((OpenALMusic)this.music.get(var1)).backgroundUpdate();
         }

      }
   }

   public boolean hasDevice() {
      return this.noDevice;
   }

   public void update() {
      if (!this.noDevice) {
         for(int var1 = 0; var1 < this.music.size(); ++var1) {
            ((OpenALMusic)this.music.get(var1)).update();
         }

      }
   }

   public long getSoundId(int var1) {
      return !this.sourceToSoundId.method_1187(var1) ? -1L : (Long)this.sourceToSoundId.method_1181(var1);
   }

   public void stopSound(long var1) {
      if (this.soundIdToSource.method_1163(var1)) {
         int var3 = (Integer)this.soundIdToSource.method_1157(var1);
         AL10.alSourceStop(var3);
      }
   }

   public void pauseSound(long var1) {
      if (this.soundIdToSource.method_1163(var1)) {
         int var3 = (Integer)this.soundIdToSource.method_1157(var1);
         AL10.alSourcePause(var3);
      }
   }

   public void resumeSound(long var1) {
      if (this.soundIdToSource.method_1163(var1)) {
         int var3 = (Integer)this.soundIdToSource.method_1157(var1);
         if (AL10.alGetSourcei(var3, 4112) == 4115) {
            AL10.alSourcePlay(var3);
         }

      }
   }

   public void setSoundGain(long var1, float var3) {
      if (this.soundIdToSource.method_1163(var1)) {
         int var4 = (Integer)this.soundIdToSource.method_1157(var1);
         AL10.alSourcef(var4, 4106, var3);
      }
   }

   public void setSoundLooping(long var1, boolean var3) {
      if (this.soundIdToSource.method_1163(var1)) {
         int var4 = (Integer)this.soundIdToSource.method_1157(var1);
         AL10.alSourcei(var4, 4103, var3 ? 1 : 0);
      }
   }

   public void setSoundPitch(long var1, float var3) {
      if (this.soundIdToSource.method_1163(var1)) {
         int var4 = (Integer)this.soundIdToSource.method_1157(var1);
         AL10.alSourcef(var4, 4099, var3);
      }
   }

   public void setSoundPan(long var1, float var3, float var4) {
      if (this.soundIdToSource.method_1163(var1)) {
         int var5 = (Integer)this.soundIdToSource.method_1157(var1);
         AL10.alSource3f(var5, 4100, class_177.method_1246((var3 - 1.0F) * 3.1415927F / 2.0F), 0.0F, class_177.method_1245((var3 + 1.0F) * 3.1415927F / 2.0F));
         AL10.alSourcef(var5, 4106, var4);
      }
   }

   public void dispose() {
      if (!this.noDevice) {
         int var1 = 0;

         for(int var2 = this.allSources.field_1382; var1 < var2; ++var1) {
            int var3 = this.allSources.method_1130(var1);
            int var4 = AL10.alGetSourcei(var3, 4112);
            if (var4 != 4116) {
               AL10.alSourceStop(var3);
            }

            AL10.alDeleteSources(var3);
         }

         this.sourceToSoundId.method_1186();
         this.soundIdToSource.method_1162();
         AL.destroy();

         while(AL.isCreated()) {
            try {
               Thread.sleep(10L);
            } catch (InterruptedException var5) {
            }
         }

      }
   }

   public AudioDevice newAudioDevice(int var1, boolean var2) {
      return (AudioDevice)(this.noDevice ? new OpenALAudio$1(this, var2) : new OpenALAudioDevice(this, var1, var2, this.deviceBufferSize, this.deviceBufferCount));
   }

   public AudioRecorder newAudioRecorder(int var1, boolean var2) {
      return (AudioRecorder)(this.noDevice ? new OpenALAudio$2(this) : new JavaSoundAudioRecorder(var1, var2));
   }

   protected void retain(OpenALSound var1, boolean var2) {
      ++this.mostRecetSound;
      this.mostRecetSound %= this.recentSounds.length;
      if (var2 && this.recentSounds[this.mostRecetSound] != null) {
         this.recentSounds[this.mostRecetSound].stop();
      }

      this.recentSounds[this.mostRecetSound] = var1;
   }

   public void forget(OpenALSound var1) {
      for(int var2 = 0; var2 < this.recentSounds.length; ++var2) {
         if (this.recentSounds[var2] == var1) {
            this.recentSounds[var2] = null;
         }
      }

   }
}
