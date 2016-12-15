# oxygenxml-webdav

A plugin for oXygen XML Editor and scripts for Mac and Windows to register oXygen as a protocol handler for WebDAV links (`webdav://` and `webdavs://`). 

## Installation

1. Download the [latest release](https://github.com/shabanovd/oxygenxml-webdav/releases).
2. Unzip the release and copy the resulting `webdav` directory into oXygen's `plugins` folder.
3. Run installation script
    - On Mac, open Terminal, run `cd /Applications/oXygen/plugins/webdav/bin` and then `./setup_osx_webdav.sh`
4. (Mac only) Make Finder aware of app
    - This step is very counter-intuitive, but locate the `oXygen` folder in `/Applications`, and move it to another folder, say, your home folder, and back again to `/Applications`. Moving the file will cause the Finder to re-read the application's `Info.plist` file and thus register it as a protocol handler.
5. Try entering a WebDAV link in your browser. It should open in oXygen.
