package com.div.enums;

public enum CardType {
    DEBIT,
    /**
     * ATM-dən pul çıxarmaq üçün aşağı və ya heç bir komissiya yoxdur;
     * Xərc etdiyinizə görə faiz ödənilmir;
     */


    CREDIT,
    /**
     * Kredit kartı ilə alış-veriş etmək üçün bank hesabınızda vəsaitin olmasına ehtiyac yoxdur.
     * Hər dəfə ödənis zamani xərclədiyiniz məbləğ kredit limitinizə çatana qədər çıxılacaq.
     * ATM-dən pul çıxarmaq kimi müəyyən əməliyyatlar üçün yüksək komissiyalar;
     * Kredit üçün faiz ödənilir.
     */


    PREPAID,
    /**
     * əvvəlcədən vəsaitlərlə yüklənir.
     * karta qoyulan vəsait xərcləndikdən sonra daha çox pul əlavə olunmayana qədər
     * kartdan istifadə etmək mümkün olmayacaq.
     * Bank hesabı açmağa ehtiyac yoxdur,
     */


    VIRTUAL,
    /**
     * 16 rəqəmli kart nömrəsi,
     * Virtual kartdan istifadə edərək nağd pul çıxara bilməzsiniz.
     * Yalnız rəqəmsal pul kisəsi vasitəsilə mağazalarda istifadə edilə bilər
     * bəzi emitentlər yalnız bir dəfə istifadə oluna bilən birdəfəlik kartlar təklif edirlər
     */


    GIFT;
    /**
     hədiyyə kartları da əvvəlcədən vəsaitlərlə yüklənir.
     pul xərcləndikdən sonra siz hədiyyə kartını yenidən yükləyə bilməzsiniz və
     ondan artıq istifadə edə bilməzsiniz.
     Bank hesabı tələb etmir.
     Məhdud istifadə diapazonu;
     */

}
