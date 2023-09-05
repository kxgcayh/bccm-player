import 'package:pigeon/pigeon.dart';

// IMPORTANT INFORMATION
// This is a template pigeon file,
// After doing edits to this file you have to run pigeon to generate downloader_pigeon.g.dart:
//
// ```sh
// dart run pigeon --input pigeons/downloader_pigeon.dart
// ```
//
// See the "Contributing" docs for bccm_player for more info.

@ConfigurePigeon(PigeonOptions(
  dartOut: 'lib/src/pigeon/downloader_pigeon.g.dart',
  dartOptions: DartOptions(),
  javaOut: 'android/src/main/java/media/bcc/bccm_player/pigeon/DownloaderApi.java',
  javaOptions: JavaOptions(package: 'media.bcc.bccm_player.pigeon'),
  objcHeaderOut: 'ios/Classes/Pigeon/DownloaderApi.h',
  objcSourceOut: 'ios/Classes/Pigeon/DownloaderApi.m',
  objcOptions: ObjcOptions(),
))

/// An API called by the native side to notify about chromecast changes
@HostApi()
abstract class DownloaderPigeon {
  @async
  @ObjCSelector("startDownload:")
  Download startDownload(DownloadConfig downloadConfig);

  @async
  @ObjCSelector("getDownloadStatus:")
  double getDownloadStatus(String downloadKey);

  @async
  @ObjCSelector("getDownloads")
  List<Download> getDownloads();

  @async
  @ObjCSelector("getDownload:")
  Download? getDownload(String downloadKey);

  @async
  @ObjCSelector("removeDownload:")
  void removeDownload(String downloadKey);
}

class DownloadConfig {
  late String url;
  late String mimeType;
  late String title;
  late List<DownloaderTrack?> tracks;
  // We store the metadata as string (json), so that we don't have to implement serialization and deserialization on both Android and iOS.
  late Map<String?, String?> additionalData;
}

class DownloaderTrack {
  late String id;
  late String? label;
  late String? language;
  late double? frameRate;
  late int? bitrate;
  late int? width;
  late int? height;
  late bool isSelected;
}

class Download {
  late String key;
  late DownloadConfig config;
  late String? offlineUrl;
  late bool isFinished;
}

@FlutterApi()
abstract class DownloaderListenerPigeon {
  @ObjCSelector("onDownloadStatusChanged:")
  void onDownloadStatusChanged(DownloadStatusChangedEvent event);
}

class DownloadStatusChangedEvent {
  late Download download;
  late double progress;
}
