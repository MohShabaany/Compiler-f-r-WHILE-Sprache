section .data
		out_format db "Result: %d", 10, 0  ; Format string for printf-style output
section .text
  extern _printf
  global _main
_main:
push rbp            ;Sichern des aktuellen Basispunkts 
mov rbp, rsp        ;Festlegen des neuen Basispunkts 
sub rsp, 80         ;Reservieren von Stackspeicher für lokale Variablen

; Initialisierung der Variablen auf dem Stack
mov qword [rsp + 0], 3      ;Initialisiert x auf den Wert 3
mov qword [rsp + 16], 5      ;Initialisiert y auf den Wert 5
; Dieser Block transferiert Daten zwischen Speicher und Registern.
mov rax, [rsp + 0]             ;Holt den Wert aus dem Speicher
add rax, 0                 ;Erhöht den Wert in RAX um 0.

mov [rsp + 32], rax       ;Speichert den Wert zurück im Speicher.


; Beginn einer LOOP-Schleifenstruktur.
mov rbx, [rsp + 16]          ;RBX erhält den Wert aus dem Speicher.
test rbx, rbx               ;Überprüft, ob RBX gleich Null ist.
jle loop_end_0				;Beendet die Schleife, wenn RBX kleiner oder gleich Null ist.
loop_start_0:


dec qword [rsp + 32]         ;Wert um 1 verringern.
; Vermeidung von negativen Werten durch das Zurücksetzen auf 0 bei Bedarf.
cmp qword [rsp + 32], 0      ;Ist der Wert ≤ 0? .
jg Skip_Make_Zero_1         ;Falls nein, überspringen.

Make_Zero_1:
mov qword [rsp + 32], 0      ;Falls ja, setze den Wert auf 0 
Skip_Make_Zero_1:           ;Fortfahren mit dem nächsten Teil des Codes.


dec rbx                     ;RBX um 1 verringern.
test rbx, rbx               ;Testet RBX erneut.
jg loop_start_0             ;Fortsetzung, falls RBX > 0.
loop_end_0:                 ;Ende der LOOP-Schleife.

mov qword [rsp + 48], 1      ;Initialisiert w auf den Wert 1
mov qword [rsp + 64], 0      ;Initialisiert z auf den Wert 0

; Beginn einer LOOP-Schleifenstruktur.
mov rbx, [rsp + 32]          ;RBX erhält den Wert aus dem Speicher.
test rbx, rbx               ;Überprüft, ob RBX gleich Null ist.
jle loop_end_2				;Beendet die Schleife, wenn RBX kleiner oder gleich Null ist.
loop_start_2:

mov qword [rsp + 0], 0      ;Initialisiert x auf den Wert 0

dec rbx                     ;RBX um 1 verringern.
test rbx, rbx               ;Testet RBX erneut.
jg loop_start_2             ;Fortsetzung, falls RBX > 0.
loop_end_2:                 ;Ende der LOOP-Schleife.


; Beginn einer LOOP-Schleifenstruktur.
mov rbx, [rsp + 32]          ;RBX erhält den Wert aus dem Speicher.
test rbx, rbx               ;Überprüft, ob RBX gleich Null ist.
jle loop_end_3				;Beendet die Schleife, wenn RBX kleiner oder gleich Null ist.
loop_start_3:

mov qword [rsp + 16], 1      ;Initialisiert y auf den Wert 1

dec rbx                     ;RBX um 1 verringern.
test rbx, rbx               ;Testet RBX erneut.
jg loop_start_3             ;Fortsetzung, falls RBX > 0.
loop_end_3:                 ;Ende der LOOP-Schleife.


; Beginn einer LOOP-Schleifenstruktur.
mov rbx, [rsp + 48]          ;RBX erhält den Wert aus dem Speicher.
test rbx, rbx               ;Überprüft, ob RBX gleich Null ist.
jle loop_end_4				;Beendet die Schleife, wenn RBX kleiner oder gleich Null ist.
loop_start_4:

; Ergebnis ausgeben (Print) 
mov rdi, out_format         ;Legt den Formatstring fest.
mov rsi, [rsp + 0]          ;Wert, der ausgegeben wird.
call _printf                ;Ruft printf auf.


dec rbx                     ;RBX um 1 verringern.
test rbx, rbx               ;Testet RBX erneut.
jg loop_start_4             ;Fortsetzung, falls RBX > 0.
loop_end_4:                 ;Ende der LOOP-Schleife.


; Beginn einer LOOP-Schleifenstruktur.
mov rbx, [rsp + 64]          ;RBX erhält den Wert aus dem Speicher.
test rbx, rbx               ;Überprüft, ob RBX gleich Null ist.
jle loop_end_5				;Beendet die Schleife, wenn RBX kleiner oder gleich Null ist.
loop_start_5:

; Ergebnis ausgeben (Print) 
mov rdi, out_format         ;Legt den Formatstring fest.
mov rsi, [rsp + 16]          ;Wert, der ausgegeben wird.
call _printf                ;Ruft printf auf.


dec rbx                     ;RBX um 1 verringern.
test rbx, rbx               ;Testet RBX erneut.
jg loop_start_5             ;Fortsetzung, falls RBX > 0.
loop_end_5:                 ;Ende der LOOP-Schleife.

; Beenden und Aufräumen 
add rsp, 80                 ; Stack aufräumen.
pop rbp                     ; Holt den Basiszeiger zurück.
ret                         ; Funktion beenden

