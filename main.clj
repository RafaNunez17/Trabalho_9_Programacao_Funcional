; ALUNO: Rafael Vitagliano Tannenbaum Nuñez

; 1. Utilizando a linguagem Clojure, crie uma função chamada ultimo que receba uma lista e devolva o último elemento desta lista sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.


(def lista '(7 3 4 9 10 25))

(defn ultimo 
  [l]
  (if (empty? (rest l)) (first l)
    (ultimo (rest l))))

(print "Exercício 1; Entrada: (7 3 4 9 10 25); Resultado: ")
(println(ultimo lista))


; 2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma lista e devolva o penúltimo elemento desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(def lista '(7 3 4 9 10 25))

(defn penultimo 
  [l]
  (if (empty? (rest (rest l))) (first l)
    (penultimo (rest l))))

(print "Exercício 2; Entrada: (7 3 4 9 10 25); Resultado: ")
(println(penultimo lista))

; 3. Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba uma lista e um inteiro N e devolva o elemento que está na posição N desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(def lista [7, 3, 4, 9, 10, 25])

(defn elementoN
  [[a & b] x]
  (if (> x 0)
    (recur b (dec x))
    a))

(print "Exercício 3; Entrada: [7, 3, 4, 9, 10, 25] 2; Resultado: ")
(println(elementoN lista 2))

; 4. Utilizando a linguagem Clojure, crie uma função chamada inverso que receba uma lista e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe [1,2,3] e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(def lista [7, 3, 4, 9, 10, 25])

(defn inverso 
  [lista]
  (loop [lista lista x (empty lista)]
    (if (empty? lista) x
      (recur (rest lista) (cons (first lista) x)))))

(print "Exercício 4; Entrada: [7, 3, 4, 9, 10, 25]; Resultado: ")
(println(inverso lista))


; 5. Utilizando a linguagem Clojure, crie uma função chamada mdc que receba dois inteiros e 
; devolve o mínimo divisor comum entre eles. Sem usar as funções já prontas e disponíveis 
; para esta mesma finalidade na linguagem Clojure. 

(defn mdc
  [a b]
  (if (= b 0)
    a
    (mdc b (mod a b))))

(print "Exercício 5; Entrada: 63 30; Resultado: ")
(println(mdc 63 30))