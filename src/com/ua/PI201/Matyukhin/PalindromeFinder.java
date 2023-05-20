package com.ua.PI201.Matyukhin;

public class PalindromeFinder {
    /* поле для текста */
    String text;
    /* Поле, куда будем вставлять слова-палиндромы */
    StringBuilder palindromeWords=new StringBuilder();

    /** Конструктор для чистки текста от знаков препинания
     *
     */
    public PalindromeFinder(String text) {
        this.text = text.replaceAll("/[^A-Za-z0-9 ]/", " ").toLowerCase(); /* конструктор для замены знаков
                                                                                              препинания */
    }

    /** Метод для поиска слов-палиндромов
     *
     * @see PalindromeFinder
     * @return возвращает итоговый текст типа StringBuilder со словами-палиндромами
     */
    public String palindromeIsDoing()
    {
        StringBuilder textReversed= new StringBuilder(text).reverse(); /*используем StringBuilder для разворота строки*/
        String[] reversedWords=textReversed.toString().split(" "); /* Данный текст вставляем в String для сравнения */
        String[] wordsOriginal=text.split(" "); /* убираем промежутки */
        for(int i=0;i<wordsOriginal.length;i++)
        {
            for(int j=0;j<reversedWords.length;j++)
            if(reversedWords[j].equals(wordsOriginal[i]))
            {

                palindromeWords.append(wordsOriginal[i]); /* используем вторую StringBuilder переменную, куда вставляем
                                                             слова-палиндромы */
            }
        }
        return palindromeWords.toString(); /* возвращаем итоговое значение со словами-палиндромами */
    }

}
