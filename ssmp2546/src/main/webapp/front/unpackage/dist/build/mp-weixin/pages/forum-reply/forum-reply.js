(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/forum-reply/forum-reply"],{"125a":function(n,t,e){"use strict";e.r(t);var r=e("3690"),u=e("c248");for(var a in u)"default"!==a&&function(n){e.d(t,n,(function(){return u[n]}))}(a);e("3185");var c,o=e("f0c5"),i=Object(o["a"])(u["default"],r["b"],r["c"],!1,null,null,null,!1,r["a"],c);t["default"]=i.exports},3185:function(n,t,e){"use strict";var r=e("db96"),u=e.n(r);u.a},3690:function(n,t,e){"use strict";var r;e.d(t,"b",(function(){return u})),e.d(t,"c",(function(){return a})),e.d(t,"a",(function(){return r}));var u=function(){var n=this,t=n.$createElement;n._self._c},a=[]},"506b":function(n,t,e){"use strict";(function(n){e("c706");r(e("66fd"));var t=r(e("125a"));function r(n){return n&&n.__esModule?n:{default:n}}n(t.default)}).call(this,e("543d")["createPage"])},c248:function(n,t,e){"use strict";e.r(t);var r=e("dcc9"),u=e.n(r);for(var a in r)"default"!==a&&function(n){e.d(t,n,(function(){return r[n]}))}(a);t["default"]=u.a},db96:function(n,t,e){},dcc9:function(n,t,e){"use strict";(function(n){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var r=u(e("a34a"));function u(n){return n&&n.__esModule?n:{default:n}}function a(n,t,e,r,u,a,c){try{var o=n[a](c),i=o.value}catch(s){return void e(s)}o.done?t(i):Promise.resolve(i).then(r,u)}function c(n){return function(){var t=this,e=arguments;return new Promise((function(r,u){var c=n.apply(t,e);function o(n){a(c,r,u,o,i,"next",n)}function i(n){a(c,r,u,o,i,"throw",n)}o(void 0)}))}}var o={data:function(){return{pid:"",content:"",username:"",user:{}}},onLoad:function(t){var e=this;return c(r.default.mark((function u(){var a,c;return r.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return e.pid=t.pid,a=n.getStorageSync("nowTable"),r.next=4,e.$api.session(a);case 4:c=r.sent,e.user=c.data,"huiyuan"==a&&(e.username=e.user.huiyuanhao);case 7:case"end":return r.stop()}}),u)})))()},methods:{onReplyTap:function(){var n=this;return c(r.default.mark((function t(){return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,n.$api.save("forum",{parentid:n.pid,content:n.contont,username:n.username});case 2:n.$utils.msgBack("回复成功");case 3:case"end":return t.stop()}}),t)})))()}}};t.default=o}).call(this,e("543d")["default"])}},[["506b","common/runtime","common/vendor"]]]);