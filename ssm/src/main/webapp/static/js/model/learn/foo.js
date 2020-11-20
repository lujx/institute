$(function () {

    $("#sub").click(function () {
        var foo_form = $("#foo-form");

        console.log(foo_form);
        foo_form.action="/foo";
        foo_form.submit();
    });


    overrideMethod();
    overrideMethod("arg1");
});

//JS重载
function overrideMethod(arg1) {
    if (arg1 === undefined) {
        console.log("There have an argument " + arg1);
    } else {
        console.log("There have no argument.");
    }

    if (arguments.length === 1) {
        console.log("There use argument length to judge there have an argument ");
    } else {
        console.log("There use argument length to judge there have no argument.");
    }
}

