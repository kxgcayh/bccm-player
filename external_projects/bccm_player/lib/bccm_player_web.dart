// In order to *not* need this ignore, consider extracting the "web" version
// of your plugin as a separate package, instead of inlining it in the same
// package as the core of your plugin.
// ignore: avoid_web_libraries_in_flutter
import 'dart:html' as html show window;

import 'package:bccm_player/playback_service_interface.dart';
import 'package:flutter_web_plugins/flutter_web_plugins.dart';

/// A web implementation of the BccmPlayerPlatform of the BccmPlayer plugin.
class BccmPlayerWeb extends PlaybackServiceInterface {
  /// Constructs a BccmPlayerWeb
  BccmPlayerWeb();

  static void registerWith(Registrar registrar) {
    PlaybackServiceInterface.instance = BccmPlayerWeb();
  }

  /// Returns a [String] containing the version of the platform.
  @override
  Future<String?> getPlatformVersion() async {
    final version = html.window.navigator.userAgent;
    return version;
  }
}
