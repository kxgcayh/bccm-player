// Autogenerated from Pigeon (v3.2.7), do not edit directly.
// See also: https://pub.dev/packages/pigeon
#import <Foundation/Foundation.h>
@protocol FlutterBinaryMessenger;
@protocol FlutterMessageCodec;
@class FlutterError;
@class FlutterStandardTypedData;

NS_ASSUME_NONNULL_BEGIN

typedef NS_ENUM(NSUInteger, CastConnectionState) {
  CastConnectionState_ = 0,
  CastConnectionStateNoDevicesAvailable = 1,
  CastConnectionStateNotConnected = 2,
  CastConnectionStateConnecting = 3,
  CastConnectionStateConnected = 4,
};

@class NpawConfig;
@class User;
@class MediaItem;
@class MediaMetadata;
@class ChromecastState;
@class PositionUpdateEvent;
@class IsPlayingChangedEvent;
@class MediaItemTransitionEvent;

@interface NpawConfig : NSObject
+ (instancetype)makeWithAppName:(nullable NSString *)appName
    appReleaseVersion:(nullable NSString *)appReleaseVersion
    accountCode:(nullable NSString *)accountCode;
@property(nonatomic, copy, nullable) NSString * appName;
@property(nonatomic, copy, nullable) NSString * appReleaseVersion;
@property(nonatomic, copy, nullable) NSString * accountCode;
@end

@interface User : NSObject
+ (instancetype)makeWithId:(nullable NSString *)id;
@property(nonatomic, copy, nullable) NSString * id;
@end

@interface MediaItem : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithUrl:(NSString *)url
    mimeType:(nullable NSString *)mimeType
    metadata:(nullable MediaMetadata *)metadata
    isLive:(nullable NSNumber *)isLive
    playbackStartPositionMs:(nullable NSNumber *)playbackStartPositionMs;
@property(nonatomic, copy) NSString * url;
@property(nonatomic, copy, nullable) NSString * mimeType;
@property(nonatomic, strong, nullable) MediaMetadata * metadata;
@property(nonatomic, strong, nullable) NSNumber * isLive;
@property(nonatomic, strong, nullable) NSNumber * playbackStartPositionMs;
@end

@interface MediaMetadata : NSObject
+ (instancetype)makeWithArtworkUri:(nullable NSString *)artworkUri
    title:(nullable NSString *)title
    artist:(nullable NSString *)artist
    episodeId:(nullable NSString *)episodeId
    extras:(nullable NSDictionary<NSString *, NSString *> *)extras;
@property(nonatomic, copy, nullable) NSString * artworkUri;
@property(nonatomic, copy, nullable) NSString * title;
@property(nonatomic, copy, nullable) NSString * artist;
@property(nonatomic, copy, nullable) NSString * episodeId;
@property(nonatomic, strong, nullable) NSDictionary<NSString *, NSString *> * extras;
@end

@interface ChromecastState : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithConnectionState:(CastConnectionState)connectionState;
@property(nonatomic, assign) CastConnectionState connectionState;
@end

@interface PositionUpdateEvent : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithPlayerId:(NSString *)playerId
    playbackPositionMs:(nullable NSNumber *)playbackPositionMs;
@property(nonatomic, copy) NSString * playerId;
@property(nonatomic, strong, nullable) NSNumber * playbackPositionMs;
@end

@interface IsPlayingChangedEvent : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithPlayerId:(NSString *)playerId
    isPlaying:(NSNumber *)isPlaying;
@property(nonatomic, copy) NSString * playerId;
@property(nonatomic, strong) NSNumber * isPlaying;
@end

@interface MediaItemTransitionEvent : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithPlayerId:(NSString *)playerId
    mediaItem:(nullable MediaItem *)mediaItem;
@property(nonatomic, copy) NSString * playerId;
@property(nonatomic, strong, nullable) MediaItem * mediaItem;
@end

/// The codec used by PlaybackPlatformPigeon.
NSObject<FlutterMessageCodec> *PlaybackPlatformPigeonGetCodec(void);

@protocol PlaybackPlatformPigeon
- (void)newPlayer:(nullable NSString *)url completion:(void(^)(NSString *_Nullable, FlutterError *_Nullable))completion;
- (void)queueMediaItem:(NSString *)playerId mediaItem:(MediaItem *)mediaItem completion:(void(^)(FlutterError *_Nullable))completion;
- (void)replaceCurrentMediaItem:(NSString *)playerId mediaItem:(MediaItem *)mediaItem playbackPositionFromPrimary:(nullable NSNumber *)playbackPositionFromPrimary completion:(void(^)(FlutterError *_Nullable))completion;
- (void)setPrimary:(NSString *)id completion:(void(^)(FlutterError *_Nullable))completion;
- (void)play:(NSString *)playerId error:(FlutterError *_Nullable *_Nonnull)error;
- (void)pause:(NSString *)playerId error:(FlutterError *_Nullable *_Nonnull)error;
- (void)stop:(NSString *)playerId reset:(NSNumber *)reset error:(FlutterError *_Nullable *_Nonnull)error;
- (void)setUser:(nullable User *)user error:(FlutterError *_Nullable *_Nonnull)error;
- (void)setNpawConfig:(nullable NpawConfig *)config error:(FlutterError *_Nullable *_Nonnull)error;
- (void)getChromecastState:(void(^)(ChromecastState *_Nullable, FlutterError *_Nullable))completion;
@end

extern void PlaybackPlatformPigeonSetup(id<FlutterBinaryMessenger> binaryMessenger, NSObject<PlaybackPlatformPigeon> *_Nullable api);

/// The codec used by PlaybackListenerPigeon.
NSObject<FlutterMessageCodec> *PlaybackListenerPigeonGetCodec(void);

@interface PlaybackListenerPigeon : NSObject
- (instancetype)initWithBinaryMessenger:(id<FlutterBinaryMessenger>)binaryMessenger;
- (void)onPositionUpdate:(PositionUpdateEvent *)event completion:(void(^)(NSError *_Nullable))completion;
- (void)onIsPlayingChanged:(IsPlayingChangedEvent *)event completion:(void(^)(NSError *_Nullable))completion;
- (void)onMediaItemTransition:(MediaItemTransitionEvent *)event completion:(void(^)(NSError *_Nullable))completion;
@end
NS_ASSUME_NONNULL_END
