(ns project)

;;Open files
(def open-NU-list (slurp "resources/TestNU.txt"))
(def open-ofac-list (slurp "resources/ofac-test.txt"))
(def open-Dataico-list (slurp "resources/listdataico.xlsx"))


open-NU-list


(def numeros (list 1 2 3 4 5))

;;funcion   nombre     input   operador
(defn       suma1     [dato1] (+ dato1 1))


(map  suma1 numeros)