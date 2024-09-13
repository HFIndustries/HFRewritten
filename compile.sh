#!/bin/bash
javac -d bin src/herpfortress/*.java src/herpfortress/ai/*.java src/herpfortress/entity/*.java src/herpfortress/entity/pickup/*.java src/herpfortress/level/*.java src/herpfortress/particle/*.java src/herpfortress/unit/*.java src/herpfortress/unit/order/*.java src/herpfortress/weapon/*.java
cd bin
jar cMvf HerpFortress.jar herpfortress/*.class herpfortress/*/*.class herpfortress/*/*/*.class ../res/*
