#!/bin/bash

cd "$(dirname "$0")"

cd ../../..

#make copy
cp -nR "Oxygen XML Author.app/" "Oxygen XML Author backup.app/"
cp -nR "Oxygen XML Editor.app/" "Oxygen XML Editor backup.app/"

cd "Oxygen XML Author.app/Contents/"
plutil -replace CFBundleURLTypes -xml '<array><dict><key>CFBundleTypeRole</key><string>Viewer</string><key>CFBundleURLName</key><string>Webdav URL</string><key>CFBundleURLSchemes</key><array><string>webdav</string><string>webdavs</string></array></dict></array>' Info.plist

cd "../../Oxygen XML Editor.app/Contents/"
plutil -replace CFBundleURLTypes -xml '<array><dict><key>CFBundleTypeRole</key><string>Viewer</string><key>CFBundleURLName</key><string>Webdav URL</string><key>CFBundleURLSchemes</key><array><string>webdav</string><string>webdavs</string></array></dict></array>' Info.plist
