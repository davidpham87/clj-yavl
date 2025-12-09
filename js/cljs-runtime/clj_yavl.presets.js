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
var hierarchy__5626__auto__ = cljs.core.get.cljs$core$IFn$_invoke$arity$3(cljs.core.PersistentArrayMap.EMPTY,new cljs.core.Keyword(null,"hierarchy","hierarchy",-1053470341),(function (){var fexpr__25243 = cljs.core.get_global_hierarchy;
return (fexpr__25243.cljs$core$IFn$_invoke$arity$0 ? fexpr__25243.cljs$core$IFn$_invoke$arity$0() : fexpr__25243.call(null));
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
clj_yavl.presets.unit_spec.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"xyplot","xyplot",-1505772843),(function (p__25244){
var map__25245 = p__25244;
var map__25245__$1 = cljs.core.__destructure_map(map__25245);
var opts = map__25245__$1;
var x = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"x","x",2099068185));
var height = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"height","height",1025178622));
var y = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"y","y",-1757859776));
var color = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"color","color",1011675173));
var mark = cljs.core.get.cljs$core$IFn$_invoke$arity$3(map__25245__$1,new cljs.core.Keyword(null,"mark","mark",-373816345),new cljs.core.Keyword(null,"point","point",1813198264));
var config = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"config","config",994861415));
var width = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"width","width",-384071477));
var data_schema = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"data-schema","data-schema",981553358));
var title = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"title","title",636505583));
var size = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25245__$1,new cljs.core.Keyword(null,"size","size",1098693007));
var encodings = (function (){var G__25250 = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"x","x",2099068185),x,new cljs.core.Keyword(null,"y","y",-1757859776),y], null);
var G__25250__$1 = (cljs.core.truth_(color)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25250,new cljs.core.Keyword(null,"color","color",1011675173),color):G__25250);
if(cljs.core.truth_(size)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25250__$1,new cljs.core.Keyword(null,"size","size",1098693007),size);
} else {
return G__25250__$1;
}
})();
var mark__$1 = (((mark instanceof cljs.core.Keyword))?cljs.core.name(mark):mark);
var common_specs = (function (){var G__25251 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"mark","mark",-373816345),mark__$1], null);
var G__25251__$1 = (cljs.core.truth_(width)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25251,new cljs.core.Keyword(null,"width","width",-384071477),width):G__25251);
var G__25251__$2 = (cljs.core.truth_(height)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25251__$1,new cljs.core.Keyword(null,"height","height",1025178622),height):G__25251__$1);
if(cljs.core.truth_(config)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25251__$2,new cljs.core.Keyword(null,"config","config",994861415),config);
} else {
return G__25251__$2;
}
})();
return clj_yavl.presets.with_title(clj_yavl.api.wrap_with_repeat(clj_yavl.api.wrap_with_facet(clj_yavl.api.add_transforms(clj_yavl.api.base_plot(encodings,common_specs,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"data-schema","data-schema",981553358),data_schema], null)),opts),opts),opts),title);
}));
clj_yavl.presets.unit_spec.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"pie","pie",1530441672),(function (p__25252){
var map__25253 = p__25252;
var map__25253__$1 = cljs.core.__destructure_map(map__25253);
var opts = map__25253__$1;
var category = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25253__$1,new cljs.core.Keyword(null,"category","category",-593092832));
var value = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25253__$1,new cljs.core.Keyword(null,"value","value",305978217));
var inner_radius = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25253__$1,new cljs.core.Keyword(null,"inner-radius","inner-radius",-681823510));
var title = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25253__$1,new cljs.core.Keyword(null,"title","title",636505583));
var data_schema = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25253__$1,new cljs.core.Keyword(null,"data-schema","data-schema",981553358));
var width = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25253__$1,new cljs.core.Keyword(null,"width","width",-384071477));
var height = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25253__$1,new cljs.core.Keyword(null,"height","height",1025178622));
var config = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25253__$1,new cljs.core.Keyword(null,"config","config",994861415));
var encodings = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"theta","theta",-427510258),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"field","field",-1302436500),value,new cljs.core.Keyword(null,"type","type",1174270348),"quantitative",new cljs.core.Keyword(null,"stack","stack",-793405930),true], null),new cljs.core.Keyword(null,"color","color",1011675173),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"field","field",-1302436500),category,new cljs.core.Keyword(null,"type","type",1174270348),"nominal"], null)], null);
var mark_def = (function (){var G__25255 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"type","type",1174270348),"arc"], null);
if(cljs.core.truth_(inner_radius)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25255,new cljs.core.Keyword(null,"innerRadius","innerRadius",2016984517),inner_radius);
} else {
return G__25255;
}
})();
var common_specs = (function (){var G__25256 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"mark","mark",-373816345),mark_def], null);
var G__25256__$1 = (cljs.core.truth_(width)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25256,new cljs.core.Keyword(null,"width","width",-384071477),width):G__25256);
var G__25256__$2 = (cljs.core.truth_(height)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25256__$1,new cljs.core.Keyword(null,"height","height",1025178622),height):G__25256__$1);
if(cljs.core.truth_(config)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25256__$2,new cljs.core.Keyword(null,"config","config",994861415),config);
} else {
return G__25256__$2;
}
})();
return clj_yavl.presets.with_title(clj_yavl.api.wrap_with_repeat(clj_yavl.api.wrap_with_facet(clj_yavl.api.add_transforms(clj_yavl.api.base_plot(encodings,common_specs,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"data-schema","data-schema",981553358),data_schema], null)),opts),opts),opts),title);
}));
clj_yavl.presets.unit_spec.cljs$core$IMultiFn$_add_method$arity$3(null,new cljs.core.Keyword(null,"bar","bar",-1386246584),(function (p__25257){
var map__25258 = p__25257;
var map__25258__$1 = cljs.core.__destructure_map(map__25258);
var opts = map__25258__$1;
var x = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"x","x",2099068185));
var height = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"height","height",1025178622));
var y = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"y","y",-1757859776));
var group = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"group","group",582596132));
var color = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"color","color",1011675173));
var config = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"config","config",994861415));
var orientation = cljs.core.get.cljs$core$IFn$_invoke$arity$3(map__25258__$1,new cljs.core.Keyword(null,"orientation","orientation",623557579),new cljs.core.Keyword(null,"vertical","vertical",718696748));
var width = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"width","width",-384071477));
var data_schema = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"data-schema","data-schema",981553358));
var title = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"title","title",636505583));
var grouped_QMARK_ = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25258__$1,new cljs.core.Keyword(null,"grouped?","grouped?",531080948));
var is_horizontal = cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(orientation,new cljs.core.Keyword(null,"horizontal","horizontal",2062109475));
var base_encodings = (function (){var G__25265 = cljs.core.PersistentArrayMap.EMPTY;
var G__25265__$1 = (cljs.core.truth_(x)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25265,new cljs.core.Keyword(null,"x","x",2099068185),x):G__25265);
var G__25265__$2 = (cljs.core.truth_(y)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25265__$1,new cljs.core.Keyword(null,"y","y",-1757859776),y):G__25265__$1);
if(cljs.core.truth_(color)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25265__$2,new cljs.core.Keyword(null,"color","color",1011675173),color);
} else {
return G__25265__$2;
}
})();
var encodings = (cljs.core.truth_((function (){var and__5023__auto__ = grouped_QMARK_;
if(cljs.core.truth_(and__5023__auto__)){
return group;
} else {
return and__5023__auto__;
}
})())?((is_horizontal)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(base_encodings,new cljs.core.Keyword(null,"yOffset","yOffset",628399000),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),group], null)):cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(base_encodings,new cljs.core.Keyword(null,"xOffset","xOffset",670845631),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),group], null))):base_encodings);
var common_specs = (function (){var G__25266 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"mark","mark",-373816345),"bar"], null);
var G__25266__$1 = (cljs.core.truth_(width)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25266,new cljs.core.Keyword(null,"width","width",-384071477),width):G__25266);
var G__25266__$2 = (cljs.core.truth_(height)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25266__$1,new cljs.core.Keyword(null,"height","height",1025178622),height):G__25266__$1);
if(cljs.core.truth_(config)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25266__$2,new cljs.core.Keyword(null,"config","config",994861415),config);
} else {
return G__25266__$2;
}
})();
return clj_yavl.presets.with_title(clj_yavl.api.wrap_with_repeat(clj_yavl.api.wrap_with_facet(clj_yavl.api.add_transforms(clj_yavl.api.base_plot(encodings,common_specs,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"data-schema","data-schema",981553358),data_schema], null)),opts),opts),opts),title);
}));

//# sourceMappingURL=clj_yavl.presets.js.map
