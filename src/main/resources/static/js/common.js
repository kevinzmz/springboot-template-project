/**
 *  加减天数
 *  入参days以天为单位
 *  返回格式：yyyy-MM-dd
 */
function addDate(date, days) {
    var val;
    if (date != null && date != "") {

        try {
            var d = new Date(date);
            //添加天数并进行日期初始化
            d.setDate(d.getDate() + days);
            var month = d.getMonth() + 1;
            var day = d.getDate();
            if (month < 10) {
                month = "0" + month;
            }
            if (day < 10) {
                day = "0" + day;
            }
            val = d.getFullYear() + "-" + month + "-" + day;

        } catch (e) {
            val = date;
        }
    } else {
        val = ""
    }

    return val;
}

/**
 * 加减天数
 * 入参days以天为单位
 * 出参格式：yyyy-MM-dd hh:mm:ss
 */
function addDateTime(date, days) {
    var val;
    if (date != null && date != "") {
        try {
            var d = new Date(date);
            d.setDate(d.getDate() + days);
            var month = d.getMonth() + 1;
            var day = d.getDate();
            var hour = d.getHours();
            var min = d.getMinutes();
            var sec = d.getSeconds();
            if (month < 10) {
                month = "0" + month;
            }
            if (day < 10) {
                day = "0" + day;
            }

            if(hour<10){
                hour = "0"+hour;
            }
            if(min<10){
                min = "0" + min;
            }
            if(sec<10){
                sec = "0" + sec;
            }

            val = d.getFullYear() + "-" + month + "-" + day + " " + hour + ":" + min + ":" + sec;
        } catch (e) {
            val = date;
        }
    } else {
        val = ""
    }

    return val;
}

/**
 * 加减天数
 * 入参days以天为单位
 * 出参格式：yyyy-MM-dd 00:00:00
 */
function addDateTimeZero(date, days) {
    var val;
    if (date != null && date != "") {
        try {
            var d = new Date(date);
            d.setDate(d.getDate() + days);
            var month = d.getMonth() + 1;
            var day = d.getDate();
            if (month < 10) {
                month = "0" + month;
            }
            if (day < 10) {
                day = "0" + day;
            }

            val = d.getFullYear() + "-" + month + "-" + day + " 00:00:00";
        } catch (e) {
            val = date;
        }
    } else {
        val = ""
    }

    return val;
}

/**
 * 将时间戳转换成时间格式字符串
 * @param timeStamp
 */
function converTimeStampToDateStr(timeStamp) {
    var dateTime = new Date();
    dateTime.setTime(timeStamp);
    return addDateTime(dateTime,0);
}

/**
 * 加载百度地图
 */
function loadJScript(){
    var script = document.createElement("script");
    script.type = "text/javascript";
    script.src = "http://api.map.baidu.com/api?v=2.0&ak=UarqQWkrbkTLx9Ku2x5LCrI0zviLfx7n&callback=init";
    document.body.appendChild(script);
}

/**
 * 处理界面值为null的显示
 * @param par
 * @returns {*}
 */
function handleParamNullData(par) {
    var res = '';
    if (par == null || par == 'null') {
        return res;
    }
    return par;
}
