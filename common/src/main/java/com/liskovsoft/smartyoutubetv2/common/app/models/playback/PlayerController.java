package com.liskovsoft.smartyoutubetv2.common.app.models.playback;

import com.liskovsoft.smartyoutubetv2.common.app.models.data.Video;
import com.liskovsoft.smartyoutubetv2.common.app.models.data.VideoGroup;

import java.io.InputStream;

// is paused, position, tracks (audio, video, subs), codecs, aspect, speed
// title, subtitle (description), subscribed/liked nums, published date, toggle buttons, simple buttons
public interface PlayerController {
    void updateRelated(VideoGroup group);
    void resetSuggestions();
    void initTitle(Video item);
    void openDash(InputStream dashManifest);
    void openHls(String hlsPlaylistUrl);
    long getPositionMs();
    void setPositionMs(long positionMs);
}