#!/bin/bash

cd ../../..

cd "Oxygen XML Author.app/Contents/"
cp Info.plist Info.plist.bak
plutil -replace CFBundleURLTypes -xml '<array><dict><key>CFBundleTypeRole</key><string>Viewer</string><key>CFBundleURLName</key><string>Webdav URL</string><key>CFBundleURLSchemes</key><array><string>webdav</string><string>webdavs</string></array></dict></array>' Info.plist

cd "../../Oxygen XML Editor.app/Contents/"
cp Info.plist Info.plist.bak
plutil -replace CFBundleURLTypes -xml '<array><dict><key>CFBundleTypeRole</key><string>Viewer</string><key>CFBundleURLName</key><string>Webdav URL</string><key>CFBundleURLSchemes</key><array><string>webdav</string><string>webdavs</string></array></dict></array>' Info.plist
