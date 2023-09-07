// Autogenerated from Pigeon (v10.1.6), do not edit directly.
// See also: https://pub.dev/packages/pigeon

#import <Foundation/Foundation.h>

@protocol FlutterBinaryMessenger;
@protocol FlutterMessageCodec;
@class FlutterError;
@class FlutterStandardTypedData;

NS_ASSUME_NONNULL_BEGIN

@class DownloadConfig;
@class Download;
@class DownloadStatusChangedEvent;

@interface DownloadConfig : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithUrl:(NSString *)url
    mimeType:(NSString *)mimeType
    title:(NSString *)title
    audioTrackIds:(NSArray<NSString *> *)audioTrackIds
    videoTrackIds:(NSArray<NSString *> *)videoTrackIds
    additionalData:(NSDictionary<NSString *, NSString *> *)additionalData;
@property(nonatomic, copy) NSString * url;
@property(nonatomic, copy) NSString * mimeType;
@property(nonatomic, copy) NSString * title;
@property(nonatomic, strong) NSArray<NSString *> * audioTrackIds;
@property(nonatomic, strong) NSArray<NSString *> * videoTrackIds;
@property(nonatomic, strong) NSDictionary<NSString *, NSString *> * additionalData;
@end

@interface Download : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithKey:(NSString *)key
    config:(DownloadConfig *)config
    offlineUrl:(nullable NSString *)offlineUrl
    isFinished:(NSNumber *)isFinished;
@property(nonatomic, copy) NSString * key;
@property(nonatomic, strong) DownloadConfig * config;
@property(nonatomic, copy, nullable) NSString * offlineUrl;
@property(nonatomic, strong) NSNumber * isFinished;
@end

@interface DownloadStatusChangedEvent : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithDownload:(Download *)download
    progress:(NSNumber *)progress;
@property(nonatomic, strong) Download * download;
@property(nonatomic, strong) NSNumber * progress;
@end

/// The codec used by DownloaderPigeon.
NSObject<FlutterMessageCodec> *DownloaderPigeonGetCodec(void);

/// An API called by the native side to notify about chromecast changes
@protocol DownloaderPigeon
- (void)startDownload:(DownloadConfig *)downloadConfig completion:(void (^)(Download *_Nullable, FlutterError *_Nullable))completion;
- (void)getDownloadStatus:(NSString *)downloadKey completion:(void (^)(NSNumber *_Nullable, FlutterError *_Nullable))completion;
- (void)getDownloads:(void (^)(NSArray<Download *> *_Nullable, FlutterError *_Nullable))completion;
- (void)getDownload:(NSString *)downloadKey completion:(void (^)(Download *_Nullable, FlutterError *_Nullable))completion;
- (void)removeDownload:(NSString *)downloadKey completion:(void (^)(FlutterError *_Nullable))completion;
@end

extern void DownloaderPigeonSetup(id<FlutterBinaryMessenger> binaryMessenger, NSObject<DownloaderPigeon> *_Nullable api);

/// The codec used by DownloaderListenerPigeon.
NSObject<FlutterMessageCodec> *DownloaderListenerPigeonGetCodec(void);

@interface DownloaderListenerPigeon : NSObject
- (instancetype)initWithBinaryMessenger:(id<FlutterBinaryMessenger>)binaryMessenger;
- (void)onDownloadStatusChanged:(DownloadStatusChangedEvent *)event completion:(void (^)(FlutterError *_Nullable))completion;
@end

NS_ASSUME_NONNULL_END
