goog.provide('clj_yavl.presets');
if((typeof clj_yavl !== 'undefined') && (typeof clj_yavl.presets !== 'undefined') && (typeof clj_yavl.presets.unit_spec !== 'undefined')){
} else {
/**
 * Generates a Vega-Lite spec based on the :type key in the options map.
 */
clj_yavl.presets.unit_spec = (function (){var method_table__5622__auto__ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var prefer_table__5623__auto__ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var method_cache__5624__auto__ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var cached_hierarchy__5625__auto__ = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
var hierarchy__5626__auto__ = cljs.core.get.cljs$core$IFn$_invoke$arity$3(cljs.core.PersistentArrayMap.EMPTY,new cljs.core.Keyword(null,"hierarchy","hierarchy",-1053470341),(function (){var fexpr__26651 = cljs.core.get_global_hierarchy;
return (fexpr__26651.cljs$core$IFn$_invoke$arity$0 ? fexpr__26651.cljs$core$IFn$_invoke$arity$0() : fexpr__26651.call(null));
})());
return (new cljs.core.MultiFn(cljs.core.symbol.cljs$core$IFn$_invoke$arity$2("clj-yavl.presets","unit-spec"),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"default","default",-1987822328),hierarchy__5626__auto__,method_table__5622__auto__,prefer_table__5623__auto__,method_cache__5624__auto__,cached_hierarchy__5625__auto__));
})();
}
clj_yavl.presets.with_title = (function clj_yavl$presets$with_title(spec,title){
if(cljs.core.truth_(title)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(spec,new cljs.core.Keyword(null,"title","title",636505583),title);
} else {
return spec;
}
});
clj_yavl.presets.unit_spec.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"xyplot","xyplot",-1505772843),(function (p__26655){
var map__26656 = p__26655;
var map__26656__$1 = cljs.core.__destructure_map(map__26656);
var x = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26656__$1,new cljs.core.Keyword(null,"x","x",2099068185));
var y = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26656__$1,new cljs.core.Keyword(null,"y","y",-1757859776));
var mark = cljs.core.get.cljs$core$IFn$_invoke$arity$3(map__26656__$1,new cljs.core.Keyword(null,"mark","mark",-373816345),new cljs.core.Keyword(null,"point","point",1813198264));
var color = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26656__$1,new cljs.core.Keyword(null,"color","color",1011675173));
var size = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26656__$1,new cljs.core.Keyword(null,"size","size",1098693007));
var title = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26656__$1,new cljs.core.Keyword(null,"title","title",636505583));
var data_schema = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26656__$1,new cljs.core.Keyword(null,"data-schema","data-schema",981553358));
var encodings = (function (){var G__26658 = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"x","x",2099068185),x,new cljs.core.Keyword(null,"y","y",-1757859776),y], null);
var G__26658__$1 = (cljs.core.truth_(color)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__26658,new cljs.core.Keyword(null,"color","color",1011675173),color):G__26658);
if(cljs.core.truth_(size)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__26658__$1,new cljs.core.Keyword(null,"size","size",1098693007),size);
} else {
return G__26658__$1;
}
})();
var common_specs = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"mark","mark",-373816345),mark], null);
return clj_yavl.presets.with_title(clj_yavl.api.base_plot(encodings,common_specs,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"data-schema","data-schema",981553358),data_schema], null)),title);
}));
clj_yavl.presets.unit_spec.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"pie","pie",1530441672),(function (p__26673){
var map__26674 = p__26673;
var map__26674__$1 = cljs.core.__destructure_map(map__26674);
var category = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26674__$1,new cljs.core.Keyword(null,"category","category",-593092832));
var value = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26674__$1,new cljs.core.Keyword(null,"value","value",305978217));
var inner_radius = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26674__$1,new cljs.core.Keyword(null,"inner-radius","inner-radius",-681823510));
var title = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26674__$1,new cljs.core.Keyword(null,"title","title",636505583));
var data_schema = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26674__$1,new cljs.core.Keyword(null,"data-schema","data-schema",981553358));
var encodings = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"theta","theta",-427510258),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"field","field",-1302436500),value,new cljs.core.Keyword(null,"type","type",1174270348),"quantitative",new cljs.core.Keyword(null,"stack","stack",-793405930),true], null),new cljs.core.Keyword(null,"color","color",1011675173),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"field","field",-1302436500),category,new cljs.core.Keyword(null,"type","type",1174270348),"nominal"], null)], null);
var mark_def = (function (){var G__26676 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"type","type",1174270348),"arc"], null);
if(cljs.core.truth_(inner_radius)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__26676,new cljs.core.Keyword(null,"innerRadius","innerRadius",2016984517),inner_radius);
} else {
return G__26676;
}
})();
var common_specs = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"mark","mark",-373816345),mark_def], null);
return clj_yavl.presets.with_title(clj_yavl.api.base_plot(encodings,common_specs,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"data-schema","data-schema",981553358),data_schema], null)),title);
}));
clj_yavl.presets.unit_spec.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"bar","bar",-1386246584),(function (p__26678){
var map__26679 = p__26678;
var map__26679__$1 = cljs.core.__destructure_map(map__26679);
var x = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26679__$1,new cljs.core.Keyword(null,"x","x",2099068185));
var y = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26679__$1,new cljs.core.Keyword(null,"y","y",-1757859776));
var color = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26679__$1,new cljs.core.Keyword(null,"color","color",1011675173));
var group = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26679__$1,new cljs.core.Keyword(null,"group","group",582596132));
var grouped_QMARK_ = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26679__$1,new cljs.core.Keyword(null,"grouped?","grouped?",531080948));
var orientation = cljs.core.get.cljs$core$IFn$_invoke$arity$3(map__26679__$1,new cljs.core.Keyword(null,"orientation","orientation",623557579),new cljs.core.Keyword(null,"vertical","vertical",718696748));
var title = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26679__$1,new cljs.core.Keyword(null,"title","title",636505583));
var data_schema = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26679__$1,new cljs.core.Keyword(null,"data-schema","data-schema",981553358));
var is_horizontal = cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(orientation,new cljs.core.Keyword(null,"horizontal","horizontal",2062109475));
var base_encodings = (function (){var G__26685 = cljs.core.PersistentArrayMap.EMPTY;
var G__26685__$1 = (cljs.core.truth_(x)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__26685,new cljs.core.Keyword(null,"x","x",2099068185),x):G__26685);
var G__26685__$2 = (cljs.core.truth_(y)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__26685__$1,new cljs.core.Keyword(null,"y","y",-1757859776),y):G__26685__$1);
if(cljs.core.truth_(color)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__26685__$2,new cljs.core.Keyword(null,"color","color",1011675173),color);
} else {
return G__26685__$2;
}
})();
var encodings = (cljs.core.truth_((function (){var and__5023__auto__ = grouped_QMARK_;
if(cljs.core.truth_(and__5023__auto__)){
return group;
} else {
return and__5023__auto__;
}
})())?((is_horizontal)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(base_encodings,new cljs.core.Keyword(null,"yOffset","yOffset",628399000),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),group], null)):cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(base_encodings,new cljs.core.Keyword(null,"xOffset","xOffset",670845631),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),group], null))):base_encodings);
var common_specs = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"mark","mark",-373816345),"bar"], null);
return clj_yavl.presets.with_title(clj_yavl.api.base_plot(encodings,common_specs,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"data-schema","data-schema",981553358),data_schema], null)),title);
}));

//# sourceMappingURL=clj_yavl.presets.js.map
