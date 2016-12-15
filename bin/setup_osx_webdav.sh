#!/bin/bash

cd "$(dirname "$0")"

cd ../../..

if [ -d "Oxygen XML Author.app/" ]
then
    echo "updating 'Oxygen XML Author.app/'"
    
    #make copy
    if [ ! -d "Oxygen XML Author backup.app/" ]
    then
        echo "make backup copy of 'Oxygen XML Author.app/'"
        cp -nR "Oxygen XML Author.app/" "Oxygen XML Author backup.app/"
    fi
    
    cd "Oxygen XML Author.app/Contents/"
    plutil -replace CFBundleURLTypes -xml '<array><dict><key>CFBundleTypeRole</key><string>Viewer</string><key>CFBundleURLName</key><string>Webdav URL</string><key>CFBundleURLSchemes</key><array><string>webdav</string><string>webdavs</string></array></dict></array>' Info.plist
    cd "../.."
    
    echo "'Oxygen XML Author.app' updated"
fi

if [ -d "Oxygen XML Editor.app/" ]
then
    echo "updating 'Oxygen XML Editor.app'"
    
    #make copy
    if [ ! -d "Oxygen XML Author backup.app/" ]
    then
        echo "make backup copy of 'Oxygen XML Editor.app/'"
        cp -nR "Oxygen XML Editor.app/" "Oxygen XML Editor backup.app/"
    fi
    
    cd "Oxygen XML Editor.app/Contents/"
    plutil -replace CFBundleURLTypes -xml '<array><dict><key>CFBundleTypeRole</key><string>Viewer</string><key>CFBundleURLName</key><string>Webdav URL</string><key>CFBundleURLSchemes</key><array><string>webdav</string><string>webdavs</string></array></dict></array>' Info.plist
    cd "../.."
    
    echo "'Oxygen XML Editor.app' updated"
fi
