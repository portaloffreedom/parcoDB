#!/bin/bash
for DACOMPILARE in *.jui; do
 /opt/qtjambi/qtjambi-linux64-community-4.6.3/bin/juic $DACOMPILARE -p parcodb.gui.builders -d ../../../../
done
