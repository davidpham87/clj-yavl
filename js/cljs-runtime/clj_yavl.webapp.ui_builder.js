goog.provide('clj_yavl.webapp.ui_builder');
if((typeof clj_yavl !== 'undefined') && (typeof clj_yavl.webapp !== 'undefined') && (typeof clj_yavl.webapp.ui_builder !== 'undefined') && (typeof clj_yavl.webapp.ui_builder.render_input !== 'undefined')){
} else {
clj_yavl.webapp.ui_builder.render_input = (function (){var method_table__5622__auto__ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var prefer_table__5623__auto__ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var method_cache__5624__auto__ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var cached_hierarchy__5625__auto__ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var hierarchy__5626__auto__ = cljs.core.get.cljs$core$IFn$_invoke$arity$3(cljs.core.PersistentArrayMap.EMPTY,new cljs.core.Keyword(null,"hierarchy","hierarchy",-1053470341),(function (){var fexpr__29821 = cljs.core.get_global_hierarchy;
return (fexpr__29821.cljs$core$IFn$_invoke$arity$0 ? fexpr__29821.cljs$core$IFn$_invoke$arity$0() : fexpr__29821.call(null));
})());
return (new cljs.core.MultiFn(cljs.core.symbol.cljs$core$IFn$_invoke$arity$2("clj-yavl.webapp.ui-builder","render-input"),(function (p__29822){
var map__29823 = p__29822;
var map__29823__$1 = cljs.core.__destructure_map(map__29823);
var conf = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29823__$1,new cljs.core.Keyword(null,"conf","conf",-983921284));
return new cljs.core.Keyword(null,"type","type",1174270348).cljs$core$IFn$_invoke$arity$1(conf);
}),new cljs.core.Keyword(null,"default","default",-1987822328),hierarchy__5626__auto__,method_table__5622__auto__,prefer_table__5623__auto__,method_cache__5624__auto__,cached_hierarchy__5625__auto__));
})();
}
clj_yavl.webapp.ui_builder.render_input.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"select","select",1147833503),(function (p__29825){
var map__29826 = p__29825;
var map__29826__$1 = cljs.core.__destructure_map(map__29826);
var arg = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29826__$1,new cljs.core.Keyword(null,"arg","arg",-1747261837));
var prop = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29826__$1,new cljs.core.Keyword(null,"prop","prop",-515168332));
var conf = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29826__$1,new cljs.core.Keyword(null,"conf","conf",-983921284));
var current_opts = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29826__$1,new cljs.core.Keyword(null,"current-opts","current-opts",-733644686));
return new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"select","select",1147833503),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"class","class",-2030961996),"bg-gray-800 border border-gray-600 text-xs p-1",new cljs.core.Keyword(null,"value","value",305978217),cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [arg,prop], null)),new cljs.core.Keyword(null,"on-change","on-change",-732046149),(function (p1__29824_SHARP_){
var val = p1__29824_SHARP_.target.value;
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(prop,new cljs.core.Keyword(null,"field","field",-1302436500))){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","update-field-selection","clj-yavl.webapp.events/update-field-selection",710299709),arg,prop,val], null));
} else {
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","update-ui-option","clj-yavl.webapp.events/update-ui-option",-1198388941),arg,prop,val], null));
}
})], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"option","option",65132272),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),""], null),"-"], null),(function (){var iter__5503__auto__ = (function clj_yavl$webapp$ui_builder$iter__29827(s__29828){
return (new cljs.core.LazySeq(null,(function (){
var s__29828__$1 = s__29828;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__29828__$1);
if(temp__5825__auto__){
var s__29828__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__29828__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__29828__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__29830 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__29829 = (0);
while(true){
if((i__29829 < size__5502__auto__)){
var opt = cljs.core._nth(c__5501__auto__,i__29829);
cljs.core.chunk_append(b__29830,cljs.core.with_meta(new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"option","option",65132272),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),opt], null),opt], null),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key","key",-1516042587),opt], null)));

var G__29886 = (i__29829 + (1));
i__29829 = G__29886;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__29830),clj_yavl$webapp$ui_builder$iter__29827(cljs.core.chunk_rest(s__29828__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__29830),null);
}
} else {
var opt = cljs.core.first(s__29828__$2);
return cljs.core.cons(cljs.core.with_meta(new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"option","option",65132272),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),opt], null),opt], null),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key","key",-1516042587),opt], null)),clj_yavl$webapp$ui_builder$iter__29827(cljs.core.rest(s__29828__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(new cljs.core.Keyword(null,"options","options",99638489).cljs$core$IFn$_invoke$arity$1(conf));
})()], null);
}));
clj_yavl.webapp.ui_builder.render_input.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"text-input","text-input",-1937260843),(function (p__29833){
var map__29834 = p__29833;
var map__29834__$1 = cljs.core.__destructure_map(map__29834);
var arg = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29834__$1,new cljs.core.Keyword(null,"arg","arg",-1747261837));
var prop = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29834__$1,new cljs.core.Keyword(null,"prop","prop",-515168332));
var current_opts = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29834__$1,new cljs.core.Keyword(null,"current-opts","current-opts",-733644686));
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"input","input",556931961),new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"type","type",1174270348),"text",new cljs.core.Keyword(null,"class","class",-2030961996),"bg-gray-800 border border-gray-600 text-xs p-1",new cljs.core.Keyword(null,"value","value",305978217),cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [arg,prop], null)),new cljs.core.Keyword(null,"on-change","on-change",-732046149),(function (p1__29831_SHARP_){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","update-ui-option","clj-yavl.webapp.events/update-ui-option",-1198388941),arg,prop,p1__29831_SHARP_.target.value], null));
})], null)], null);
}));
clj_yavl.webapp.ui_builder.render_input.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"number-input","number-input",-1816352688),(function (p__29836){
var map__29837 = p__29836;
var map__29837__$1 = cljs.core.__destructure_map(map__29837);
var arg = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29837__$1,new cljs.core.Keyword(null,"arg","arg",-1747261837));
var prop = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29837__$1,new cljs.core.Keyword(null,"prop","prop",-515168332));
var current_opts = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29837__$1,new cljs.core.Keyword(null,"current-opts","current-opts",-733644686));
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"input","input",556931961),new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"type","type",1174270348),"number",new cljs.core.Keyword(null,"class","class",-2030961996),"bg-gray-800 border border-gray-600 text-xs p-1",new cljs.core.Keyword(null,"value","value",305978217),cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [arg,prop], null)),new cljs.core.Keyword(null,"on-change","on-change",-732046149),(function (p1__29835_SHARP_){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","update-ui-option","clj-yavl.webapp.events/update-ui-option",-1198388941),arg,prop,parseFloat(p1__29835_SHARP_.target.value)], null));
})], null)], null);
}));
clj_yavl.webapp.ui_builder.render_input.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"boolean","boolean",-1919418404),(function (p__29839){
var map__29840 = p__29839;
var map__29840__$1 = cljs.core.__destructure_map(map__29840);
var arg = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29840__$1,new cljs.core.Keyword(null,"arg","arg",-1747261837));
var prop = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29840__$1,new cljs.core.Keyword(null,"prop","prop",-515168332));
var current_opts = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29840__$1,new cljs.core.Keyword(null,"current-opts","current-opts",-733644686));
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"input","input",556931961),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"type","type",1174270348),"checkbox",new cljs.core.Keyword(null,"checked","checked",-50955819),cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [arg,prop], null)),new cljs.core.Keyword(null,"on-change","on-change",-732046149),(function (p1__29838_SHARP_){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","update-ui-option","clj-yavl.webapp.events/update-ui-option",-1198388941),arg,prop,p1__29838_SHARP_.target.checked], null));
})], null)], null);
}));
clj_yavl.webapp.ui_builder.render_input.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"multi-select","multi-select",-1298511287),(function (p__29841){
var map__29842 = p__29841;
var map__29842__$1 = cljs.core.__destructure_map(map__29842);
var conf = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29842__$1,new cljs.core.Keyword(null,"conf","conf",-983921284));
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"select","select",1147833503),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"multiple","multiple",1244445549),true,new cljs.core.Keyword(null,"class","class",-2030961996),"bg-gray-800 border border-gray-600 text-xs p-1 h-20"], null),(function (){var iter__5503__auto__ = (function clj_yavl$webapp$ui_builder$iter__29843(s__29844){
return (new cljs.core.LazySeq(null,(function (){
var s__29844__$1 = s__29844;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__29844__$1);
if(temp__5825__auto__){
var s__29844__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__29844__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__29844__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__29846 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__29845 = (0);
while(true){
if((i__29845 < size__5502__auto__)){
var opt = cljs.core._nth(c__5501__auto__,i__29845);
cljs.core.chunk_append(b__29846,cljs.core.with_meta(new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"option","option",65132272),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),opt], null),opt], null),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key","key",-1516042587),opt], null)));

var G__29907 = (i__29845 + (1));
i__29845 = G__29907;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__29846),clj_yavl$webapp$ui_builder$iter__29843(cljs.core.chunk_rest(s__29844__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__29846),null);
}
} else {
var opt = cljs.core.first(s__29844__$2);
return cljs.core.cons(cljs.core.with_meta(new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"option","option",65132272),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),opt], null),opt], null),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key","key",-1516042587),opt], null)),clj_yavl$webapp$ui_builder$iter__29843(cljs.core.rest(s__29844__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(new cljs.core.Keyword(null,"options","options",99638489).cljs$core$IFn$_invoke$arity$1(conf));
})()], null);
}));
clj_yavl.webapp.ui_builder.render_input.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"json-editor","json-editor",-1682231471),(function (_){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"textarea","textarea",-650375824),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"class","class",-2030961996),"bg-gray-800 border border-gray-600 text-xs p-1 h-10",new cljs.core.Keyword(null,"placeholder","placeholder",-104873083),"JSON..."], null)], null);
}));
clj_yavl.webapp.ui_builder.render_input.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"default","default",-1987822328),(function (_){
return null;
}));
clj_yavl.webapp.ui_builder.render_ui_builder_item = (function clj_yavl$webapp$ui_builder$render_ui_builder_item(item,current_opts){
return new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"border border-gray-600 p-2 rounded"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"font-bold text-sm mb-2 text-blue-400"], null),cljs.core.name(new cljs.core.Keyword(null,"arg","arg",-1747261837).cljs$core$IFn$_invoke$arity$1(item)),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"span","span",1394872991),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"text-gray-500 text-xs ml-2"], null),cljs.core.name(new cljs.core.Keyword(null,"scope","scope",-439358418).cljs$core$IFn$_invoke$arity$1(item))], null)], null),cljs.core.into.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"grid grid-cols-2 gap-2"], null)], null),(function (){var iter__5503__auto__ = (function clj_yavl$webapp$ui_builder$render_ui_builder_item_$_iter__29851(s__29852){
return (new cljs.core.LazySeq(null,(function (){
var s__29852__$1 = s__29852;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__29852__$1);
if(temp__5825__auto__){
var s__29852__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__29852__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__29852__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__29854 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__29853 = (0);
while(true){
if((i__29853 < size__5502__auto__)){
var vec__29859 = cljs.core._nth(c__5501__auto__,i__29853);
var prop = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29859,(0),null);
var conf = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29859,(1),null);
cljs.core.chunk_append(b__29854,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"flex flex-col"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"label","label",1718410804),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"text-xs mb-1"], null),cljs.core.name(prop)], null),clj_yavl.webapp.ui_builder.render_input.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword(null,"arg","arg",-1747261837),new cljs.core.Keyword(null,"arg","arg",-1747261837).cljs$core$IFn$_invoke$arity$1(item),new cljs.core.Keyword(null,"item","item",249373802),item,new cljs.core.Keyword(null,"prop","prop",-515168332),prop,new cljs.core.Keyword(null,"conf","conf",-983921284),conf,new cljs.core.Keyword(null,"current-opts","current-opts",-733644686),current_opts], null))], null));

var G__29927 = (i__29853 + (1));
i__29853 = G__29927;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__29854),clj_yavl$webapp$ui_builder$render_ui_builder_item_$_iter__29851(cljs.core.chunk_rest(s__29852__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__29854),null);
}
} else {
var vec__29862 = cljs.core.first(s__29852__$2);
var prop = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29862,(0),null);
var conf = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29862,(1),null);
return cljs.core.cons(new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"flex flex-col"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"label","label",1718410804),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"text-xs mb-1"], null),cljs.core.name(prop)], null),clj_yavl.webapp.ui_builder.render_input.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword(null,"arg","arg",-1747261837),new cljs.core.Keyword(null,"arg","arg",-1747261837).cljs$core$IFn$_invoke$arity$1(item),new cljs.core.Keyword(null,"item","item",249373802),item,new cljs.core.Keyword(null,"prop","prop",-515168332),prop,new cljs.core.Keyword(null,"conf","conf",-983921284),conf,new cljs.core.Keyword(null,"current-opts","current-opts",-733644686),current_opts], null))], null),clj_yavl$webapp$ui_builder$render_ui_builder_item_$_iter__29851(cljs.core.rest(s__29852__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(new cljs.core.Keyword(null,"main","main",-2117802661).cljs$core$IFn$_invoke$arity$1(item));
})())], null);
});
clj_yavl.webapp.ui_builder.ui_builder_view = (function clj_yavl$webapp$ui_builder$ui_builder_view(){
var preset_key = cljs.core.deref(re_frame.core.subscribe.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.subs","ui-builder-preset","clj-yavl.webapp.subs/ui-builder-preset",706036439)], null)));
var current_opts = cljs.core.deref(re_frame.core.subscribe.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.subs","ui-builder-opts","clj-yavl.webapp.subs/ui-builder-opts",1086396574)], null)));
var inferred_schema = cljs.core.deref(re_frame.core.subscribe.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.subs","inferred-schema","clj-yavl.webapp.subs/inferred-schema",251714249)], null)));
var schema = (function (){var or__5025__auto__ = inferred_schema;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"map","map",1371690461),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"Name","Name",-131211369),new cljs.core.Keyword(null,"string","string",-1989541586)], null)], null);
}
})();
var ui_def = clj_yavl.webapp.ui_schema.generate_ui_schema.cljs$core$IFn$_invoke$arity$variadic(preset_key,schema,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([current_opts], 0));
return new cljs.core.PersistentVector(null, 6, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"p-4 text-gray-300 overflow-auto h-full bg-[#1e1e1e]"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"h2","h2",-372662728),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"text-lg font-bold mb-4"], null),"UI Builder"], null),(cljs.core.truth_(inferred_schema)?new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"mb-4 text-green-400 text-xs"], null),"Schema inferred from loaded dataset.",new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"mb-4 p-2 bg-gray-800 rounded text-xs font-mono whitespace-pre-wrap"], null),(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__29870_29934 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__29871_29935 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__29872_29936 = true;
var _STAR_print_fn_STAR__temp_val__29873_29937 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__29872_29936);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__29873_29937);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(schema);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__29871_29935);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__29870_29934);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})()], null)], null):null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"mb-4"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"label","label",1718410804),"Preset: "], null),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"select","select",1147833503),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"class","class",-2030961996),"bg-gray-700 text-white p-1",new cljs.core.Keyword(null,"value","value",305978217),preset_key,new cljs.core.Keyword(null,"on-change","on-change",-732046149),(function (p1__29869_SHARP_){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","set-ui-preset","clj-yavl.webapp.events/set-ui-preset",-407641133),cljs.core.keyword.cljs$core$IFn$_invoke$arity$1(p1__29869_SHARP_.target.value)], null));
})], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"option","option",65132272),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),"xyplot"], null),"XY Plot"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"option","option",65132272),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),"pie"], null),"Pie Chart"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"option","option",65132272),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),"bar"], null),"Bar Chart"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"space-y-4"], null),cljs.core.into.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"<>","<>",1280186386)], null),(function (){var iter__5503__auto__ = (function clj_yavl$webapp$ui_builder$ui_builder_view_$_iter__29878(s__29879){
return (new cljs.core.LazySeq(null,(function (){
var s__29879__$1 = s__29879;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__29879__$1);
if(temp__5825__auto__){
var s__29879__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__29879__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__29879__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__29881 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__29880 = (0);
while(true){
if((i__29880 < size__5502__auto__)){
var item = cljs.core._nth(c__5501__auto__,i__29880);
cljs.core.chunk_append(b__29881,clj_yavl.webapp.ui_builder.render_ui_builder_item(item,current_opts));

var G__29938 = (i__29880 + (1));
i__29880 = G__29938;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__29881),clj_yavl$webapp$ui_builder$ui_builder_view_$_iter__29878(cljs.core.chunk_rest(s__29879__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__29881),null);
}
} else {
var item = cljs.core.first(s__29879__$2);
return cljs.core.cons(clj_yavl.webapp.ui_builder.render_ui_builder_item(item,current_opts),clj_yavl$webapp$ui_builder$ui_builder_view_$_iter__29878(cljs.core.rest(s__29879__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(ui_def);
})())], null)], null);
});

//# sourceMappingURL=clj_yavl.webapp.ui_builder.js.map
