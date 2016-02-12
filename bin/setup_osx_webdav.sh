#!/bin/bash

cd ../..

cd "Oxygen XML Author.app/Contents/"
plutil -replace CFBundleURLTypes -xml '<dict><key>CFBundleTypeRole</key><string>Viewer</string><key>CFBundleURLName</key><string>Webdav URL</string><key>CFBundleURLSchemes</key><array><string>webdav</string><string>webdavs</string></array></dict>' Info.plist

cd "../../Oxygen XML Editor.app/Contents/"
plutil -replace CFBundleURLTypes -xml '<dict><key>CFBundleTypeRole</key><string>Viewer</string><key>CFBundleURLName</key><string>Webdav URL</string><key>CFBundleURLSchemes</key><array><string>webdav</string><string>webdavs</string></array></dict>' Info.plist
