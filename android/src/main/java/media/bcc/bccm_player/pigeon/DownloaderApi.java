// Autogenerated from Pigeon (v10.1.6), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package media.bcc.bccm_player.pigeon;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class DownloaderApi {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) 
    {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<Object>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
        "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  public enum DownloadStatus {
    DOWNLOADING(0),
    PAUSED(1),
    FINISHED(2),
    FAILED(3),
    QUEUED(4),
    REMOVING(5);

    final int index;

    private DownloadStatus(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class DownloadConfig {
    private @NonNull String url;

    public @NonNull String getUrl() {
      return url;
    }

    public void setUrl(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"url\" is null.");
      }
      this.url = setterArg;
    }

    private @NonNull String mimeType;

    public @NonNull String getMimeType() {
      return mimeType;
    }

    public void setMimeType(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"mimeType\" is null.");
      }
      this.mimeType = setterArg;
    }

    private @NonNull String title;

    public @NonNull String getTitle() {
      return title;
    }

    public void setTitle(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"title\" is null.");
      }
      this.title = setterArg;
    }

    private @NonNull List<String> audioTrackIds;

    public @NonNull List<String> getAudioTrackIds() {
      return audioTrackIds;
    }

    public void setAudioTrackIds(@NonNull List<String> setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"audioTrackIds\" is null.");
      }
      this.audioTrackIds = setterArg;
    }

    private @NonNull List<String> videoTrackIds;

    public @NonNull List<String> getVideoTrackIds() {
      return videoTrackIds;
    }

    public void setVideoTrackIds(@NonNull List<String> setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"videoTrackIds\" is null.");
      }
      this.videoTrackIds = setterArg;
    }

    private @NonNull Map<String, String> additionalData;

    public @NonNull Map<String, String> getAdditionalData() {
      return additionalData;
    }

    public void setAdditionalData(@NonNull Map<String, String> setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"additionalData\" is null.");
      }
      this.additionalData = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    DownloadConfig() {}

    public static final class Builder {

      private @Nullable String url;

      public @NonNull Builder setUrl(@NonNull String setterArg) {
        this.url = setterArg;
        return this;
      }

      private @Nullable String mimeType;

      public @NonNull Builder setMimeType(@NonNull String setterArg) {
        this.mimeType = setterArg;
        return this;
      }

      private @Nullable String title;

      public @NonNull Builder setTitle(@NonNull String setterArg) {
        this.title = setterArg;
        return this;
      }

      private @Nullable List<String> audioTrackIds;

      public @NonNull Builder setAudioTrackIds(@NonNull List<String> setterArg) {
        this.audioTrackIds = setterArg;
        return this;
      }

      private @Nullable List<String> videoTrackIds;

      public @NonNull Builder setVideoTrackIds(@NonNull List<String> setterArg) {
        this.videoTrackIds = setterArg;
        return this;
      }

      private @Nullable Map<String, String> additionalData;

      public @NonNull Builder setAdditionalData(@NonNull Map<String, String> setterArg) {
        this.additionalData = setterArg;
        return this;
      }

      public @NonNull DownloadConfig build() {
        DownloadConfig pigeonReturn = new DownloadConfig();
        pigeonReturn.setUrl(url);
        pigeonReturn.setMimeType(mimeType);
        pigeonReturn.setTitle(title);
        pigeonReturn.setAudioTrackIds(audioTrackIds);
        pigeonReturn.setVideoTrackIds(videoTrackIds);
        pigeonReturn.setAdditionalData(additionalData);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(6);
      toListResult.add(url);
      toListResult.add(mimeType);
      toListResult.add(title);
      toListResult.add(audioTrackIds);
      toListResult.add(videoTrackIds);
      toListResult.add(additionalData);
      return toListResult;
    }

    static @NonNull DownloadConfig fromList(@NonNull ArrayList<Object> list) {
      DownloadConfig pigeonResult = new DownloadConfig();
      Object url = list.get(0);
      pigeonResult.setUrl((String) url);
      Object mimeType = list.get(1);
      pigeonResult.setMimeType((String) mimeType);
      Object title = list.get(2);
      pigeonResult.setTitle((String) title);
      Object audioTrackIds = list.get(3);
      pigeonResult.setAudioTrackIds((List<String>) audioTrackIds);
      Object videoTrackIds = list.get(4);
      pigeonResult.setVideoTrackIds((List<String>) videoTrackIds);
      Object additionalData = list.get(5);
      pigeonResult.setAdditionalData((Map<String, String>) additionalData);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class Download {
    private @NonNull String key;

    public @NonNull String getKey() {
      return key;
    }

    public void setKey(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"key\" is null.");
      }
      this.key = setterArg;
    }

    private @NonNull DownloadConfig config;

    public @NonNull DownloadConfig getConfig() {
      return config;
    }

    public void setConfig(@NonNull DownloadConfig setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"config\" is null.");
      }
      this.config = setterArg;
    }

    private @Nullable String offlineUrl;

    public @Nullable String getOfflineUrl() {
      return offlineUrl;
    }

    public void setOfflineUrl(@Nullable String setterArg) {
      this.offlineUrl = setterArg;
    }

    private @NonNull Double fractionDownloaded;

    public @NonNull Double getFractionDownloaded() {
      return fractionDownloaded;
    }

    public void setFractionDownloaded(@NonNull Double setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"fractionDownloaded\" is null.");
      }
      this.fractionDownloaded = setterArg;
    }

    private @NonNull DownloadStatus status;

    public @NonNull DownloadStatus getStatus() {
      return status;
    }

    public void setStatus(@NonNull DownloadStatus setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"status\" is null.");
      }
      this.status = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    Download() {}

    public static final class Builder {

      private @Nullable String key;

      public @NonNull Builder setKey(@NonNull String setterArg) {
        this.key = setterArg;
        return this;
      }

      private @Nullable DownloadConfig config;

      public @NonNull Builder setConfig(@NonNull DownloadConfig setterArg) {
        this.config = setterArg;
        return this;
      }

      private @Nullable String offlineUrl;

      public @NonNull Builder setOfflineUrl(@Nullable String setterArg) {
        this.offlineUrl = setterArg;
        return this;
      }

      private @Nullable Double fractionDownloaded;

      public @NonNull Builder setFractionDownloaded(@NonNull Double setterArg) {
        this.fractionDownloaded = setterArg;
        return this;
      }

      private @Nullable DownloadStatus status;

      public @NonNull Builder setStatus(@NonNull DownloadStatus setterArg) {
        this.status = setterArg;
        return this;
      }

      public @NonNull Download build() {
        Download pigeonReturn = new Download();
        pigeonReturn.setKey(key);
        pigeonReturn.setConfig(config);
        pigeonReturn.setOfflineUrl(offlineUrl);
        pigeonReturn.setFractionDownloaded(fractionDownloaded);
        pigeonReturn.setStatus(status);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(5);
      toListResult.add(key);
      toListResult.add((config == null) ? null : config.toList());
      toListResult.add(offlineUrl);
      toListResult.add(fractionDownloaded);
      toListResult.add(status == null ? null : status.index);
      return toListResult;
    }

    static @NonNull Download fromList(@NonNull ArrayList<Object> list) {
      Download pigeonResult = new Download();
      Object key = list.get(0);
      pigeonResult.setKey((String) key);
      Object config = list.get(1);
      pigeonResult.setConfig((config == null) ? null : DownloadConfig.fromList((ArrayList<Object>) config));
      Object offlineUrl = list.get(2);
      pigeonResult.setOfflineUrl((String) offlineUrl);
      Object fractionDownloaded = list.get(3);
      pigeonResult.setFractionDownloaded((Double) fractionDownloaded);
      Object status = list.get(4);
      pigeonResult.setStatus(status == null ? null : DownloadStatus.values()[(int) status]);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class DownloadFailedEvent {
    private @NonNull String key;

    public @NonNull String getKey() {
      return key;
    }

    public void setKey(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"key\" is null.");
      }
      this.key = setterArg;
    }

    private @Nullable String error;

    public @Nullable String getError() {
      return error;
    }

    public void setError(@Nullable String setterArg) {
      this.error = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    DownloadFailedEvent() {}

    public static final class Builder {

      private @Nullable String key;

      public @NonNull Builder setKey(@NonNull String setterArg) {
        this.key = setterArg;
        return this;
      }

      private @Nullable String error;

      public @NonNull Builder setError(@Nullable String setterArg) {
        this.error = setterArg;
        return this;
      }

      public @NonNull DownloadFailedEvent build() {
        DownloadFailedEvent pigeonReturn = new DownloadFailedEvent();
        pigeonReturn.setKey(key);
        pigeonReturn.setError(error);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(2);
      toListResult.add(key);
      toListResult.add(error);
      return toListResult;
    }

    static @NonNull DownloadFailedEvent fromList(@NonNull ArrayList<Object> list) {
      DownloadFailedEvent pigeonResult = new DownloadFailedEvent();
      Object key = list.get(0);
      pigeonResult.setKey((String) key);
      Object error = list.get(1);
      pigeonResult.setError((String) error);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class DownloadRemovedEvent {
    private @NonNull String key;

    public @NonNull String getKey() {
      return key;
    }

    public void setKey(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"key\" is null.");
      }
      this.key = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    DownloadRemovedEvent() {}

    public static final class Builder {

      private @Nullable String key;

      public @NonNull Builder setKey(@NonNull String setterArg) {
        this.key = setterArg;
        return this;
      }

      public @NonNull DownloadRemovedEvent build() {
        DownloadRemovedEvent pigeonReturn = new DownloadRemovedEvent();
        pigeonReturn.setKey(key);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(1);
      toListResult.add(key);
      return toListResult;
    }

    static @NonNull DownloadRemovedEvent fromList(@NonNull ArrayList<Object> list) {
      DownloadRemovedEvent pigeonResult = new DownloadRemovedEvent();
      Object key = list.get(0);
      pigeonResult.setKey((String) key);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class DownloadChangedEvent {
    private @NonNull Download download;

    public @NonNull Download getDownload() {
      return download;
    }

    public void setDownload(@NonNull Download setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"download\" is null.");
      }
      this.download = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    DownloadChangedEvent() {}

    public static final class Builder {

      private @Nullable Download download;

      public @NonNull Builder setDownload(@NonNull Download setterArg) {
        this.download = setterArg;
        return this;
      }

      public @NonNull DownloadChangedEvent build() {
        DownloadChangedEvent pigeonReturn = new DownloadChangedEvent();
        pigeonReturn.setDownload(download);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<Object>(1);
      toListResult.add((download == null) ? null : download.toList());
      return toListResult;
    }

    static @NonNull DownloadChangedEvent fromList(@NonNull ArrayList<Object> list) {
      DownloadChangedEvent pigeonResult = new DownloadChangedEvent();
      Object download = list.get(0);
      pigeonResult.setDownload((download == null) ? null : Download.fromList((ArrayList<Object>) download));
      return pigeonResult;
    }
  }

  public interface Result<T> {
    @SuppressWarnings("UnknownNullness")
    void success(T result);

    void error(@NonNull Throwable error);
  }

  private static class DownloaderPigeonCodec extends StandardMessageCodec {
    public static final DownloaderPigeonCodec INSTANCE = new DownloaderPigeonCodec();

    private DownloaderPigeonCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return Download.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 129:
          return Download.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 130:
          return DownloadConfig.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof Download) {
        stream.write(128);
        writeValue(stream, ((Download) value).toList());
      } else if (value instanceof Download) {
        stream.write(129);
        writeValue(stream, ((Download) value).toList());
      } else if (value instanceof DownloadConfig) {
        stream.write(130);
        writeValue(stream, ((DownloadConfig) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /**
   * An API called by the native side to notify about chromecast changes
   *
   * Generated interface from Pigeon that represents a handler of messages from Flutter.
   */
  public interface DownloaderPigeon {

    void startDownload(@NonNull DownloadConfig downloadConfig, @NonNull Result<Download> result);

    void getDownloadStatus(@NonNull String downloadKey, @NonNull Result<Double> result);

    void getDownloads(@NonNull Result<List<Download>> result);

    void getDownload(@NonNull String downloadKey, @NonNull Result<Download> result);

    void removeDownload(@NonNull String downloadKey, @NonNull Result<Void> result);

    /** The codec used by DownloaderPigeon. */
    static @NonNull MessageCodec<Object> getCodec() {
      return DownloaderPigeonCodec.INSTANCE;
    }
    /**Sets up an instance of `DownloaderPigeon` to handle messages through the `binaryMessenger`. */
    static void setup(@NonNull BinaryMessenger binaryMessenger, @Nullable DownloaderPigeon api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.bccm_player.DownloaderPigeon.startDownload", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                DownloadConfig downloadConfigArg = (DownloadConfig) args.get(0);
                Result<Download> resultCallback =
                    new Result<Download>() {
                      public void success(Download result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.startDownload(downloadConfigArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.bccm_player.DownloaderPigeon.getDownloadStatus", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String downloadKeyArg = (String) args.get(0);
                Result<Double> resultCallback =
                    new Result<Double>() {
                      public void success(Double result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getDownloadStatus(downloadKeyArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.bccm_player.DownloaderPigeon.getDownloads", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                Result<List<Download>> resultCallback =
                    new Result<List<Download>>() {
                      public void success(List<Download> result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getDownloads(resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.bccm_player.DownloaderPigeon.getDownload", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String downloadKeyArg = (String) args.get(0);
                Result<Download> resultCallback =
                    new Result<Download>() {
                      public void success(Download result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getDownload(downloadKeyArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger, "dev.flutter.pigeon.bccm_player.DownloaderPigeon.removeDownload", getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<Object>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String downloadKeyArg = (String) args.get(0);
                Result<Void> resultCallback =
                    new Result<Void>() {
                      public void success(Void result) {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.removeDownload(downloadKeyArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }

  private static class DownloaderListenerPigeonCodec extends StandardMessageCodec {
    public static final DownloaderListenerPigeonCodec INSTANCE = new DownloaderListenerPigeonCodec();

    private DownloaderListenerPigeonCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 128:
          return Download.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 129:
          return DownloadChangedEvent.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 130:
          return DownloadConfig.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 131:
          return DownloadFailedEvent.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 132:
          return DownloadRemovedEvent.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof Download) {
        stream.write(128);
        writeValue(stream, ((Download) value).toList());
      } else if (value instanceof DownloadChangedEvent) {
        stream.write(129);
        writeValue(stream, ((DownloadChangedEvent) value).toList());
      } else if (value instanceof DownloadConfig) {
        stream.write(130);
        writeValue(stream, ((DownloadConfig) value).toList());
      } else if (value instanceof DownloadFailedEvent) {
        stream.write(131);
        writeValue(stream, ((DownloadFailedEvent) value).toList());
      } else if (value instanceof DownloadRemovedEvent) {
        stream.write(132);
        writeValue(stream, ((DownloadRemovedEvent) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java. */
  public static class DownloaderListenerPigeon {
    private final @NonNull BinaryMessenger binaryMessenger;

    public DownloaderListenerPigeon(@NonNull BinaryMessenger argBinaryMessenger) {
      this.binaryMessenger = argBinaryMessenger;
    }

    /** Public interface for sending reply. */ 
    @SuppressWarnings("UnknownNullness")
    public interface Reply<T> {
      void reply(T reply);
    }
    /** The codec used by DownloaderListenerPigeon. */
    static @NonNull MessageCodec<Object> getCodec() {
      return DownloaderListenerPigeonCodec.INSTANCE;
    }
    public void onDownloadStatusChanged(@NonNull DownloadChangedEvent eventArg, @NonNull Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, "dev.flutter.pigeon.bccm_player.DownloaderListenerPigeon.onDownloadStatusChanged", getCodec());
      channel.send(
          new ArrayList<Object>(Collections.singletonList(eventArg)),
          channelReply -> callback.reply(null));
    }
    public void onDownloadRemoved(@NonNull DownloadRemovedEvent eventArg, @NonNull Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, "dev.flutter.pigeon.bccm_player.DownloaderListenerPigeon.onDownloadRemoved", getCodec());
      channel.send(
          new ArrayList<Object>(Collections.singletonList(eventArg)),
          channelReply -> callback.reply(null));
    }
    public void onDownloadFailed(@NonNull DownloadFailedEvent eventArg, @NonNull Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(
              binaryMessenger, "dev.flutter.pigeon.bccm_player.DownloaderListenerPigeon.onDownloadFailed", getCodec());
      channel.send(
          new ArrayList<Object>(Collections.singletonList(eventArg)),
          channelReply -> callback.reply(null));
    }
  }
}
