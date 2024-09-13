javac -d bin --release 8 src/herpfortress/*.java src/herpfortress/ai/*.java src/herpfortress/entity/*.java src/herpfortress/entity/pickup/*.java src/herpfortress/level/*.java src/herpfortress/particle/*.java src/herpfortress/unit/*.java src/herpfortress/unit/order/*.java src/herpfortress/weapon/*.java
cd bin
jar cMvf HerpFortress.jar META-INF/MANIFEST.MF herpfortress/*.class herpfortress/*/*.class herpfortress/*/*/*.class ../res/*
