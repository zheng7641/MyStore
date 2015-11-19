@@ -1,54 +0,0 @@
/*!
 * jquery.scrollLoading.js
 * by zhangxinxu  http://www.zhangxinxu.com
 * 2010-11-19 v1.0
 * 2012-01-13 v1.1 鍋忕Щ鍊艰绠椾慨鏀� position 鈫� offset
*/
(function($) {
	$.fn.scrollLoading = function(options) {
		var defaults = {
			attr: "data-url"	
		};
		var params = $.extend({}, defaults, options || {});
		params.cache = [];
		$(this).each(function() {
			var node = this.nodeName.toLowerCase(), url = $(this).attr(params["attr"]);
			if (!url) { return; }
			//閲嶇粍
			var data = {
				obj: $(this),
				tag: node,
				url: url
			};
			params.cache.push(data);
		});
		
		//鍔ㄦ€佹樉绀烘暟鎹�
		var loading = function() {
			var st = $(window).scrollTop(), sth = st + $(window).height();
			$.each(params.cache, function(i, data) {
				var o = data.obj, tag = data.tag, url = data.url;
				if (o) {
					post = o.offset().top; posb = post + o.height();
					if ((post > st && post < sth) || (posb > st && posb < sth)) {
						//鍦ㄦ祻瑙堝櫒绐楀彛鍐�
						if (tag === "img") {
							//鍥剧墖锛屾敼鍙榮rc
							o.attr("src", url);	
						} else {
							o.load(url);
						}	
						data.obj = null;		
					}
				}
			});		
			return false;	
		};
		
		//浜嬩欢瑙﹀彂
		//鍔犺浇瀹屾瘯鍗虫墽琛�
		loading();
		//婊氬姩鎵ц
		$(window).bind("scroll", loading);
	};
})(jQuery);
\ No newline at end of file