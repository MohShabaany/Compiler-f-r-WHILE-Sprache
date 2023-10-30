# Compiler-fuer-WHILE-Sprache
# Kompilieren und Ausführen von x86 Assembly-Code im Terminal:
Diese Arbeit wird auf einem macOS-System durchgeführt,das über 64-Bit-Register verfügt. Es muss sichergestellt werden, dass der NASM-Compiler auf dem System installiert ist. Nach der Installation sollten die unten aufgeführten Schritte befolgt werden:

1- Das Terminal sollte geöffnet werden.

2- Es sollte zum Verzeichnis navigiert werden, in dem der Compiler liegt, indem der cd-Befehl zusammen mit dem Pfad zum Compiler-Verzeichnis verwendet wird.

3- Nachdem das Compiler-Verzeichnis erreicht wurde, müssen die folgenden Befehle ausgeführt werden, um die Assembly-Datei zu kompilieren und das Programm auszuführen:

  a- Kompilieren Sie Ihre assembly.asm-Datei mit diesem Befehl zu einer Object-Datei.
      nasm -f macho64 assembly.asm
  
  b- Anschließend wird die Object-Datei mit diesem Befehl verlinkt und das ausführbare Programm ’assembly’ erstellt.
      clang assembly.o -o assembly -Wl,-no_pie
  
  c- Schließlich wird das kompilierte Programm mit diesem Befehl ausgeführt.
      ./assembly

