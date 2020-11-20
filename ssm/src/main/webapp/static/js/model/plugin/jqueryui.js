$(function () {
    var v_slider = $("#slider-range");
    var v_info = $("#conscycle");
    var v_year = new Date().getFullYear();
    v_slider.slider({
        range: true,
        min: v_year - 2,
        max: v_year + 10,
        values: [v_year, v_year + 3],
        slide: function (event, ui) {
            var startVal = ui.values[0];
            var endVal = ui.values[1];
            var cycleVal = endVal - startVal;
            v_info.val(startVal + "年 - " + endVal + "年 ,周期" + cycleVal + "年");
        }
    });
    var startValue = v_slider.slider("values", 0);
    var endValue = v_slider.slider("values", 1);
    var cycleValue = endValue - startValue;
    v_info.val(startValue + "年 - " + endValue + "年 ,周期" + cycleValue + "年");
});