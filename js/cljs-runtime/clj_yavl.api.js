goog.provide('clj_yavl.api');
clj_yavl.api.google_colors = new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, ["#4285F4","#DB4437","#F4B400","#0F9D58"], null);
clj_yavl.api.default_config = new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"config","config",994861415),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword(null,"range","range",1639692286),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"category","category",-593092832),clj_yavl.api.google_colors], null),new cljs.core.Keyword(null,"axis","axis",-1215390822),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"labelFontSize","labelFontSize",717469659),(12),new cljs.core.Keyword(null,"titleFontSize","titleFontSize",-1632214750),(14)], null),new cljs.core.Keyword(null,"header","header",119441134),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"labelFontSize","labelFontSize",717469659),(12),new cljs.core.Keyword(null,"titleFontSize","titleFontSize",-1632214750),(14)], null),new cljs.core.Keyword(null,"legend","legend",-1027192245),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"labelFontSize","labelFontSize",717469659),(12),new cljs.core.Keyword(null,"titleFontSize","titleFontSize",-1632214750),(14)], null),new cljs.core.Keyword(null,"text","text",-1790561697),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"fontSize","fontSize",919623033),(12)], null)], null),new cljs.core.Keyword(null,"width","width",-384071477),(400),new cljs.core.Keyword(null,"height","height",1025178622),(300)], null);
/**
 * Infers the Vega-Lite type from a Malli schema node.
 */
clj_yavl.api.infer_vl_type = (function clj_yavl$api$infer_vl_type(schema_node){
var t = malli.core.type.cljs$core$IFn$_invoke$arity$1(schema_node);
if(cljs.core.truth_((function (){var fexpr__25276 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 9, [new cljs.core.Keyword(null,"double","double",884886883),null,new cljs.core.Symbol(null,"int?","int?",1799729645,null),null,new cljs.core.Keyword(null,"int","int",-1741416922),null,new cljs.core.Keyword(null,"number","number",1570378438),null,new cljs.core.Symbol(null,"float?","float?",673884616,null),null,new cljs.core.Keyword(null,"float","float",-1732389368),null,new cljs.core.Symbol(null,"integer?","integer?",1303791671,null),null,new cljs.core.Symbol(null,"number?","number?",-1747282210,null),null,new cljs.core.Symbol(null,"double?","double?",-2146564276,null),null], null), null);
return (fexpr__25276.cljs$core$IFn$_invoke$arity$1 ? fexpr__25276.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25276.call(null,t));
})())){
return "quantitative";
} else {
if(cljs.core.truth_((function (){var fexpr__25278 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"string","string",-1989541586),null,new cljs.core.Symbol(null,"string?","string?",-1129175764,null),null], null), null);
return (fexpr__25278.cljs$core$IFn$_invoke$arity$1 ? fexpr__25278.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25278.call(null,t));
})())){
return "nominal";
} else {
if(cljs.core.truth_((function (){var fexpr__25280 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Symbol(null,"boolean?","boolean?",1790940868,null),null,new cljs.core.Keyword(null,"boolean","boolean",-1919418404),null], null), null);
return (fexpr__25280.cljs$core$IFn$_invoke$arity$1 ? fexpr__25280.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25280.call(null,t));
})())){
return "nominal";
} else {
if(cljs.core.truth_((function (){var fexpr__25283 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Symbol(null,"inst?","inst?",1614698981,null),null,new cljs.core.Keyword(null,"inst","inst",645962501),null,new cljs.core.Keyword(null,"time","time",1385887882),null,new cljs.core.Symbol(null,"time?","time?",-1100776152,null),null], null), null);
return (fexpr__25283.cljs$core$IFn$_invoke$arity$1 ? fexpr__25283.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25283.call(null,t));
})())){
return "temporal";
} else {
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"enum","enum",1679018432),t)){
return "nominal";
} else {
return null;

}
}
}
}
}
});
/**
 * Finds the schema for a specific field within a dataset schema.
 * Handles schema being a Map or a Collection of Map.
 */
clj_yavl.api.get_field_schema = (function clj_yavl$api$get_field_schema(dataset_schema,field_name){
var schema = malli.core.schema.cljs$core$IFn$_invoke$arity$1(dataset_schema);
var t = malli.core.type.cljs$core$IFn$_invoke$arity$1(schema);
var map_schema = (cljs.core.truth_((function (){var fexpr__25286 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"sequential","sequential",-1082983960),null,new cljs.core.Keyword(null,"vector","vector",1902966158),null,new cljs.core.Keyword(null,"list","list",765357683),null,new cljs.core.Keyword(null,"set","set",304602554),null], null), null);
return (fexpr__25286.cljs$core$IFn$_invoke$arity$1 ? fexpr__25286.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25286.call(null,t));
})())?cljs.core.first(malli.core.children.cljs$core$IFn$_invoke$arity$1(schema)):schema);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(malli.core.type.cljs$core$IFn$_invoke$arity$1(map_schema),new cljs.core.Keyword(null,"map","map",1371690461))){
return cljs.core.some((function (p__25287){
var vec__25288 = p__25287;
var k = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25288,(0),null);
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25288,(1),null);
var v = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25288,(2),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.name(k),field_name)){
return v;
} else {
return null;
}
}),malli.core.children.cljs$core$IFn$_invoke$arity$1(map_schema));
} else {
return null;
}
});
/**
 * Finds the properties for a specific field within a dataset schema.
 */
clj_yavl.api.get_field_props = (function clj_yavl$api$get_field_props(dataset_schema,field_name){
var schema = malli.core.schema.cljs$core$IFn$_invoke$arity$1(dataset_schema);
var t = malli.core.type.cljs$core$IFn$_invoke$arity$1(schema);
var map_schema = (cljs.core.truth_((function (){var fexpr__25291 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"sequential","sequential",-1082983960),null,new cljs.core.Keyword(null,"vector","vector",1902966158),null,new cljs.core.Keyword(null,"list","list",765357683),null,new cljs.core.Keyword(null,"set","set",304602554),null], null), null);
return (fexpr__25291.cljs$core$IFn$_invoke$arity$1 ? fexpr__25291.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25291.call(null,t));
})())?cljs.core.first(malli.core.children.cljs$core$IFn$_invoke$arity$1(schema)):schema);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(malli.core.type.cljs$core$IFn$_invoke$arity$1(map_schema),new cljs.core.Keyword(null,"map","map",1371690461))){
return cljs.core.some((function (p__25293){
var vec__25294 = p__25293;
var k = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25294,(0),null);
var props = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25294,(1),null);
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25294,(2),null);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.name(k),field_name)){
return props;
} else {
return null;
}
}),malli.core.children.cljs$core$IFn$_invoke$arity$1(map_schema));
} else {
return null;
}
});
clj_yavl.api.infer_type_for_field = (function clj_yavl$api$infer_type_for_field(dataset_schema,field_name){
var temp__5825__auto__ = clj_yavl.api.get_field_schema(dataset_schema,field_name);
if(cljs.core.truth_(temp__5825__auto__)){
var field_schema = temp__5825__auto__;
return clj_yavl.api.infer_vl_type(field_schema);
} else {
return null;
}
});
/**
 * Creates a Vega-Lite calculate transform to rename values in a column.
 * Values not in the mapping are left unchanged.
 * 
 * Args:
 *   col-name: The name of the column (string).
 *   mapping: A map of {old-value new-value}.
 * 
 * Returns:
 *   A map representing a Vega-Lite calculate transform.
 */
clj_yavl.api.rename_column_values = (function clj_yavl$api$rename_column_values(col_name,mapping){
var escape_val = (function (v){
return clojure.string.replace(cljs.core.str.cljs$core$IFn$_invoke$arity$1(v),"'","\\'");
});
var expression = clojure.string.join.cljs$core$IFn$_invoke$arity$2(" : ",cljs.core.concat.cljs$core$IFn$_invoke$arity$2(cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p__25300){
var vec__25301 = p__25300;
var old = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25301,(0),null);
var new$ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25301,(1),null);
return ["datum['",cljs.core.str.cljs$core$IFn$_invoke$arity$1(col_name),"'] == '",escape_val(old),"' ? '",escape_val(new$),"'"].join('');
}),mapping),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [["datum['",cljs.core.str.cljs$core$IFn$_invoke$arity$1(col_name),"']"].join('')], null)));
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"calculate","calculate",-1224644403),expression,new cljs.core.Keyword(null,"as","as",1148689641),col_name], null);
});
/**
 * Creates a Vega-Lite calculate transform (map operation).
 * 
 * Args:
 *   new-col: The name of the new column (string).
 *   expression: The Vega expression string.
 * 
 * Returns:
 *   A map representing a Vega-Lite calculate transform.
 */
clj_yavl.api.transform_map = (function clj_yavl$api$transform_map(new_col,expression){
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"calculate","calculate",-1224644403),expression,new cljs.core.Keyword(null,"as","as",1148689641),new_col], null);
});
/**
 * Creates a Vega-Lite filter transform.
 * 
 * Args:
 *   predicate: The Vega expression string for filtering.
 * 
 * Returns:
 *   A map representing a Vega-Lite filter transform.
 */
clj_yavl.api.transform_filter = (function clj_yavl$api$transform_filter(predicate){
return new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"filter","filter",-948537934),predicate], null);
});
/**
 * Generates a tooltip definition (vector of field definitions) for Vega-Lite.
 * 
 * Args:
 *   keys: A sequence of field names (strings).
 *   dataset-schema: The Malli schema of the dataset.
 * 
 * Returns:
 *   A vector of maps, where each map matches StringFieldDef.
 */
clj_yavl.api.tooltip_def = (function clj_yavl$api$tooltip_def(keys,dataset_schema){
return cljs.core.vec((function (){var iter__5503__auto__ = (function clj_yavl$api$tooltip_def_$_iter__25305(s__25306){
return (new cljs.core.LazySeq(null,(function (){
var s__25306__$1 = s__25306;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__25306__$1);
if(temp__5825__auto__){
var s__25306__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__25306__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__25306__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__25308 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__25307 = (0);
while(true){
if((i__25307 < size__5502__auto__)){
var k = cljs.core._nth(c__5501__auto__,i__25307);
cljs.core.chunk_append(b__25308,(function (){var inferred_type = clj_yavl.api.infer_type_for_field(dataset_schema,k);
var field_props = clj_yavl.api.get_field_props(dataset_schema,k);
var custom_format = new cljs.core.Keyword(null,"format","format",-1306924766).cljs$core$IFn$_invoke$arity$1(field_props);
var field_def = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"field","field",-1302436500),k,new cljs.core.Keyword(null,"type","type",1174270348),inferred_type], null);
if(cljs.core.truth_(custom_format)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(field_def,new cljs.core.Keyword(null,"format","format",-1306924766),custom_format);
} else {
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(inferred_type,"quantitative")){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(field_def,new cljs.core.Keyword(null,"format","format",-1306924766),"s");
} else {
return field_def;

}
}
})());

var G__25380 = (i__25307 + (1));
i__25307 = G__25380;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__25308),clj_yavl$api$tooltip_def_$_iter__25305(cljs.core.chunk_rest(s__25306__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__25308),null);
}
} else {
var k = cljs.core.first(s__25306__$2);
return cljs.core.cons((function (){var inferred_type = clj_yavl.api.infer_type_for_field(dataset_schema,k);
var field_props = clj_yavl.api.get_field_props(dataset_schema,k);
var custom_format = new cljs.core.Keyword(null,"format","format",-1306924766).cljs$core$IFn$_invoke$arity$1(field_props);
var field_def = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"field","field",-1302436500),k,new cljs.core.Keyword(null,"type","type",1174270348),inferred_type], null);
if(cljs.core.truth_(custom_format)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(field_def,new cljs.core.Keyword(null,"format","format",-1306924766),custom_format);
} else {
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(inferred_type,"quantitative")){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(field_def,new cljs.core.Keyword(null,"format","format",-1306924766),"s");
} else {
return field_def;

}
}
})(),clj_yavl$api$tooltip_def_$_iter__25305(cljs.core.rest(s__25306__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(keys);
})());
});
/**
 * Wraps a Vega-Lite spec with a facet operator.
 * Lifts :config to the top level.
 * 
 * opts keys: :row, :column, :facet, :columns, :resolve
 */
clj_yavl.api.wrap_with_facet = (function clj_yavl$api$wrap_with_facet(spec,p__25315){
var map__25316 = p__25315;
var map__25316__$1 = cljs.core.__destructure_map(map__25316);
var row = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25316__$1,new cljs.core.Keyword(null,"row","row",-570139521));
var column = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25316__$1,new cljs.core.Keyword(null,"column","column",2078222095));
var facet = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25316__$1,new cljs.core.Keyword(null,"facet","facet",-801327574));
var columns = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25316__$1,new cljs.core.Keyword(null,"columns","columns",1998437288));
var resolve = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25316__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482));
if(cljs.core.truth_((function (){var or__5025__auto__ = row;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
var or__5025__auto____$1 = column;
if(cljs.core.truth_(or__5025__auto____$1)){
return or__5025__auto____$1;
} else {
return facet;
}
}
})())){
var config = new cljs.core.Keyword(null,"config","config",994861415).cljs$core$IFn$_invoke$arity$1(spec);
var data = new cljs.core.Keyword(null,"data","data",-232669377).cljs$core$IFn$_invoke$arity$1(spec);
var inner_spec = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$variadic(spec,new cljs.core.Keyword(null,"config","config",994861415),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"data","data",-232669377)], 0));
var facet_prop = (cljs.core.truth_(facet)?((cljs.core.map_QMARK_(facet))?facet:new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),facet], null)):(function (){var G__25317 = cljs.core.PersistentArrayMap.EMPTY;
var G__25317__$1 = (cljs.core.truth_(row)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25317,new cljs.core.Keyword(null,"row","row",-570139521),((cljs.core.map_QMARK_(row))?row:new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),row], null))):G__25317);
if(cljs.core.truth_(column)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25317__$1,new cljs.core.Keyword(null,"column","column",2078222095),((cljs.core.map_QMARK_(column))?column:new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),column], null)));
} else {
return G__25317__$1;
}
})());
var res = (function (){var G__25318 = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"facet","facet",-801327574),facet_prop,new cljs.core.Keyword(null,"spec","spec",347520401),inner_spec], null);
var G__25318__$1 = (cljs.core.truth_(config)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25318,new cljs.core.Keyword(null,"config","config",994861415),config):G__25318);
var G__25318__$2 = (cljs.core.truth_((function (){var and__5023__auto__ = facet;
if(cljs.core.truth_(and__5023__auto__)){
return columns;
} else {
return and__5023__auto__;
}
})())?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25318__$1,new cljs.core.Keyword(null,"columns","columns",1998437288),columns):G__25318__$1);
var G__25318__$3 = (cljs.core.truth_(resolve)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25318__$2,new cljs.core.Keyword(null,"resolve","resolve",-1584445482),resolve):G__25318__$2);
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25318__$3,new cljs.core.Keyword(null,"data","data",-232669377),data);

})();
return res;
} else {
return spec;
}
});
/**
 * Wraps a Vega-Lite spec with a repeat operator.
 * Lifts :config to the top level.
 * 
 * opts keys: :repeat, :columns (if repeat is array), :resolve
 */
clj_yavl.api.wrap_with_repeat = (function clj_yavl$api$wrap_with_repeat(spec,p__25323){
var map__25324 = p__25323;
var map__25324__$1 = cljs.core.__destructure_map(map__25324);
var repeat = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25324__$1,new cljs.core.Keyword(null,"repeat","repeat",832692087));
var columns = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25324__$1,new cljs.core.Keyword(null,"columns","columns",1998437288));
var resolve = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25324__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482));
if(cljs.core.truth_(repeat)){
var config = new cljs.core.Keyword(null,"config","config",994861415).cljs$core$IFn$_invoke$arity$1(spec);
var inner_spec = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(spec,new cljs.core.Keyword(null,"config","config",994861415));
var repeat_prop = (cljs.core.truth_((function (){var and__5023__auto__ = cljs.core.map_QMARK_(repeat);
if(and__5023__auto__){
var or__5025__auto__ = new cljs.core.Keyword(null,"row","row",-570139521).cljs$core$IFn$_invoke$arity$1(repeat);
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return new cljs.core.Keyword(null,"column","column",2078222095).cljs$core$IFn$_invoke$arity$1(repeat);
}
} else {
return and__5023__auto__;
}
})())?repeat:((cljs.core.vector_QMARK_(repeat))?repeat:((typeof repeat === 'string')?new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [repeat], null):repeat
)));
var res = (function (){var G__25325 = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"repeat","repeat",832692087),repeat_prop,new cljs.core.Keyword(null,"spec","spec",347520401),inner_spec], null);
var G__25325__$1 = (cljs.core.truth_((function (){var and__5023__auto__ = cljs.core.vector_QMARK_(repeat_prop);
if(and__5023__auto__){
return columns;
} else {
return and__5023__auto__;
}
})())?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25325,new cljs.core.Keyword(null,"columns","columns",1998437288),columns):G__25325);
if(cljs.core.truth_(resolve)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25325__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482),resolve);
} else {
return G__25325__$1;
}
})();
var G__25326 = res;
if(cljs.core.truth_(config)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25326,new cljs.core.Keyword(null,"config","config",994861415),config);
} else {
return G__25326;
}
} else {
return spec;
}
});
/**
 * Adds transform operations to a Vega-Lite spec.
 * 
 * opts keys: :transform (vector of maps), :calculate (map or vector of maps)
 */
clj_yavl.api.add_transforms = (function clj_yavl$api$add_transforms(spec,p__25328){
var map__25329 = p__25328;
var map__25329__$1 = cljs.core.__destructure_map(map__25329);
var transform = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25329__$1,new cljs.core.Keyword(null,"transform","transform",1381301764));
var calculate = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25329__$1,new cljs.core.Keyword(null,"calculate","calculate",-1224644403));
var calc_transforms = (cljs.core.truth_(calculate)?((cljs.core.vector_QMARK_(calculate))?calculate:new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [calculate], null)):null);
var existing = (function (){var or__5025__auto__ = new cljs.core.Keyword(null,"transform","transform",1381301764).cljs$core$IFn$_invoke$arity$1(spec);
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return cljs.core.PersistentVector.EMPTY;
}
})();
var additional = cljs.core.concat.cljs$core$IFn$_invoke$arity$2((function (){var or__5025__auto__ = transform;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return cljs.core.PersistentVector.EMPTY;
}
})(),(function (){var or__5025__auto__ = calc_transforms;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return cljs.core.PersistentVector.EMPTY;
}
})());
var all_transforms = cljs.core.vec(cljs.core.concat.cljs$core$IFn$_invoke$arity$2(existing,additional));
if(cljs.core.seq(all_transforms)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(spec,new cljs.core.Keyword(null,"transform","transform",1381301764),all_transforms);
} else {
return spec;
}
});
/**
 * Adds parameters to a Vega-Lite spec.
 * 
 * Args:
 *   spec: The Vega-Lite spec.
 *   params: A vector of parameter definitions.
 */
clj_yavl.api.add_params = (function clj_yavl$api$add_params(spec,params){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(spec,new cljs.core.Keyword(null,"params","params",710516235),params);
});
/**
 * Recursively merges maps.
 */
clj_yavl.api.deep_merge = (function clj_yavl$api$deep_merge(var_args){
var args__5755__auto__ = [];
var len__5749__auto___25389 = arguments.length;
var i__5750__auto___25390 = (0);
while(true){
if((i__5750__auto___25390 < len__5749__auto___25389)){
args__5755__auto__.push((arguments[i__5750__auto___25390]));

var G__25391 = (i__5750__auto___25390 + (1));
i__5750__auto___25390 = G__25391;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((0) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((0)),(0),null)):null);
return clj_yavl.api.deep_merge.cljs$core$IFn$_invoke$arity$variadic(argseq__5756__auto__);
});

(clj_yavl.api.deep_merge.cljs$core$IFn$_invoke$arity$variadic = (function (maps){
return cljs.core.apply.cljs$core$IFn$_invoke$arity$3(cljs.core.merge_with,(function (x,y){
if(((cljs.core.map_QMARK_(x)) && (cljs.core.map_QMARK_(y)))){
return clj_yavl.api.deep_merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([x,y], 0));
} else {
return y;
}
}),maps);
}));

(clj_yavl.api.deep_merge.cljs$lang$maxFixedArity = (0));

/** @this {Function} */
(clj_yavl.api.deep_merge.cljs$lang$applyTo = (function (seq25332){
var self__5735__auto__ = this;
return self__5735__auto__.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq25332));
}));

/**
 * Generates a Vega-Lite spec.
 * 
 * Args:
 * - encodings: map of channel (keyword) to encoding definition (map) or field name (string).
 * - common-specs: TopLevelSpec (map) defining global values (mark, data, etc.).
 * - charts-opts: map with optional keys:
 *   - :data-schema -> Malli schema of the dataset.
 */
clj_yavl.api.base_plot = (function clj_yavl$api$base_plot(encodings,common_specs,charts_opts){
var data_schema = new cljs.core.Keyword(null,"data-schema","data-schema",981553358).cljs$core$IFn$_invoke$arity$1(charts_opts);
var processed_encodings = cljs.core.reduce_kv((function (acc,channel,value){
var encoding_def = ((typeof value === 'string')?new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),value], null):value);
var field = new cljs.core.Keyword(null,"field","field",-1302436500).cljs$core$IFn$_invoke$arity$1(encoding_def);
var inferred_type = (cljs.core.truth_((function (){var and__5023__auto__ = data_schema;
if(cljs.core.truth_(and__5023__auto__)){
var and__5023__auto____$1 = field;
if(cljs.core.truth_(and__5023__auto____$1)){
return cljs.core.not(new cljs.core.Keyword(null,"type","type",1174270348).cljs$core$IFn$_invoke$arity$1(encoding_def));
} else {
return and__5023__auto____$1;
}
} else {
return and__5023__auto__;
}
})())?clj_yavl.api.infer_type_for_field(data_schema,field):null);
var final_def = (function (){var G__25340 = encoding_def;
if(cljs.core.truth_(inferred_type)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25340,new cljs.core.Keyword(null,"type","type",1174270348),inferred_type);
} else {
return G__25340;
}
})();
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(acc,channel,final_def);
}),cljs.core.PersistentArrayMap.EMPTY,encodings);
var final_specs = clj_yavl.api.deep_merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([clj_yavl.api.default_config,common_specs], 0));
return cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"data","data",-232669377),null], null),final_specs,((cljs.core.seq(processed_encodings))?new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"encoding","encoding",1728578272),processed_encodings], null):null)], 0));
});
/**
 * Helper to lift and merge :config from a list of specs.
 * Returns [merged-config specs-without-config].
 */
clj_yavl.api.lift_config_from_specs = (function clj_yavl$api$lift_config_from_specs(specs){
var configs = cljs.core.keep.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"config","config",994861415),specs);
var merged_config = ((cljs.core.seq(configs))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(clj_yavl.api.deep_merge,configs):null);
var clean_specs = cljs.core.mapv.cljs$core$IFn$_invoke$arity$2((function (p1__25341_SHARP_){
return cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(p1__25341_SHARP_,new cljs.core.Keyword(null,"config","config",994861415));
}),specs);
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [merged_config,clean_specs], null);
});
/**
 * Creates a Layered View (LayerSpec) from a sequence of specs.
 * Lifts and merges :config from children to the top level.
 * Removes :width and :height from children as they are not valid in LayerSpec units.
 * Accepts optional :resolve kwarg.
 */
clj_yavl.api.layer = (function clj_yavl$api$layer(var_args){
var args__5755__auto__ = [];
var len__5749__auto___25396 = arguments.length;
var i__5750__auto___25397 = (0);
while(true){
if((i__5750__auto___25397 < len__5749__auto___25396)){
args__5755__auto__.push((arguments[i__5750__auto___25397]));

var G__25398 = (i__5750__auto___25397 + (1));
i__5750__auto___25397 = G__25398;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((1) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((1)),(0),null)):null);
return clj_yavl.api.layer.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__5756__auto__);
});

(clj_yavl.api.layer.cljs$core$IFn$_invoke$arity$variadic = (function (specs,p__25345){
var map__25346 = p__25345;
var map__25346__$1 = cljs.core.__destructure_map(map__25346);
var resolve = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25346__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482));
var vec__25347 = clj_yavl.api.lift_config_from_specs(specs);
var config = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25347,(0),null);
var children = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25347,(1),null);
var clean_children = cljs.core.mapv.cljs$core$IFn$_invoke$arity$2((function (p1__25342_SHARP_){
return cljs.core.dissoc.cljs$core$IFn$_invoke$arity$variadic(p1__25342_SHARP_,new cljs.core.Keyword(null,"width","width",-384071477),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"height","height",1025178622)], 0));
}),children);
var G__25352 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"layer","layer",-1601820589),clean_children], null);
var G__25352__$1 = (cljs.core.truth_(config)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25352,new cljs.core.Keyword(null,"config","config",994861415),config):G__25352);
if(cljs.core.truth_(resolve)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25352__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482),resolve);
} else {
return G__25352__$1;
}
}));

(clj_yavl.api.layer.cljs$lang$maxFixedArity = (1));

/** @this {Function} */
(clj_yavl.api.layer.cljs$lang$applyTo = (function (seq25343){
var G__25344 = cljs.core.first(seq25343);
var seq25343__$1 = cljs.core.next(seq25343);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__25344,seq25343__$1);
}));

/**
 * Creates a Horizontally Concatenated View (HConcatSpec).
 * Lifts and merges :config from children to the top level.
 * Accepts optional :resolve kwarg.
 */
clj_yavl.api.hconcat = (function clj_yavl$api$hconcat(var_args){
var args__5755__auto__ = [];
var len__5749__auto___25399 = arguments.length;
var i__5750__auto___25400 = (0);
while(true){
if((i__5750__auto___25400 < len__5749__auto___25399)){
args__5755__auto__.push((arguments[i__5750__auto___25400]));

var G__25401 = (i__5750__auto___25400 + (1));
i__5750__auto___25400 = G__25401;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((1) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((1)),(0),null)):null);
return clj_yavl.api.hconcat.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__5756__auto__);
});

(clj_yavl.api.hconcat.cljs$core$IFn$_invoke$arity$variadic = (function (specs,p__25357){
var map__25358 = p__25357;
var map__25358__$1 = cljs.core.__destructure_map(map__25358);
var resolve = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25358__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482));
var vec__25359 = clj_yavl.api.lift_config_from_specs(specs);
var config = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25359,(0),null);
var children = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25359,(1),null);
var G__25362 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"hconcat","hconcat",633077476),children], null);
var G__25362__$1 = (cljs.core.truth_(config)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25362,new cljs.core.Keyword(null,"config","config",994861415),config):G__25362);
if(cljs.core.truth_(resolve)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25362__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482),resolve);
} else {
return G__25362__$1;
}
}));

(clj_yavl.api.hconcat.cljs$lang$maxFixedArity = (1));

/** @this {Function} */
(clj_yavl.api.hconcat.cljs$lang$applyTo = (function (seq25353){
var G__25354 = cljs.core.first(seq25353);
var seq25353__$1 = cljs.core.next(seq25353);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__25354,seq25353__$1);
}));

/**
 * Creates a Vertically Concatenated View (VConcatSpec).
 * Lifts and merges :config from children to the top level.
 * Accepts optional :resolve kwarg.
 */
clj_yavl.api.vconcat = (function clj_yavl$api$vconcat(var_args){
var args__5755__auto__ = [];
var len__5749__auto___25402 = arguments.length;
var i__5750__auto___25403 = (0);
while(true){
if((i__5750__auto___25403 < len__5749__auto___25402)){
args__5755__auto__.push((arguments[i__5750__auto___25403]));

var G__25404 = (i__5750__auto___25403 + (1));
i__5750__auto___25403 = G__25404;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((1) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((1)),(0),null)):null);
return clj_yavl.api.vconcat.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__5756__auto__);
});

(clj_yavl.api.vconcat.cljs$core$IFn$_invoke$arity$variadic = (function (specs,p__25365){
var map__25366 = p__25365;
var map__25366__$1 = cljs.core.__destructure_map(map__25366);
var resolve = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25366__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482));
var vec__25367 = clj_yavl.api.lift_config_from_specs(specs);
var config = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25367,(0),null);
var children = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25367,(1),null);
var G__25370 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"vconcat","vconcat",-2012274180),children], null);
var G__25370__$1 = (cljs.core.truth_(config)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25370,new cljs.core.Keyword(null,"config","config",994861415),config):G__25370);
if(cljs.core.truth_(resolve)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25370__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482),resolve);
} else {
return G__25370__$1;
}
}));

(clj_yavl.api.vconcat.cljs$lang$maxFixedArity = (1));

/** @this {Function} */
(clj_yavl.api.vconcat.cljs$lang$applyTo = (function (seq25363){
var G__25364 = cljs.core.first(seq25363);
var seq25363__$1 = cljs.core.next(seq25363);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__25364,seq25363__$1);
}));

/**
 * Creates a General Concatenated View (ConcatSpec).
 * Lifts and merges :config from children to the top level.
 * Accepts optional :resolve kwarg.
 */
clj_yavl.api.concat_specs = (function clj_yavl$api$concat_specs(var_args){
var args__5755__auto__ = [];
var len__5749__auto___25405 = arguments.length;
var i__5750__auto___25406 = (0);
while(true){
if((i__5750__auto___25406 < len__5749__auto___25405)){
args__5755__auto__.push((arguments[i__5750__auto___25406]));

var G__25407 = (i__5750__auto___25406 + (1));
i__5750__auto___25406 = G__25407;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((1) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((1)),(0),null)):null);
return clj_yavl.api.concat_specs.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__5756__auto__);
});

(clj_yavl.api.concat_specs.cljs$core$IFn$_invoke$arity$variadic = (function (specs,p__25373){
var map__25374 = p__25373;
var map__25374__$1 = cljs.core.__destructure_map(map__25374);
var resolve = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25374__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482));
var vec__25375 = clj_yavl.api.lift_config_from_specs(specs);
var config = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25375,(0),null);
var children = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25375,(1),null);
var G__25378 = new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"concat","concat",-2108183992),children], null);
var G__25378__$1 = (cljs.core.truth_(config)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25378,new cljs.core.Keyword(null,"config","config",994861415),config):G__25378);
if(cljs.core.truth_(resolve)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25378__$1,new cljs.core.Keyword(null,"resolve","resolve",-1584445482),resolve);
} else {
return G__25378__$1;
}
}));

(clj_yavl.api.concat_specs.cljs$lang$maxFixedArity = (1));

/** @this {Function} */
(clj_yavl.api.concat_specs.cljs$lang$applyTo = (function (seq25371){
var G__25372 = cljs.core.first(seq25371);
var seq25371__$1 = cljs.core.next(seq25371);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__25372,seq25371__$1);
}));

/**
 * Returns the provided map as a Vega-Lite specification.
 * Useful for explicit clarity or future validation.
 */
clj_yavl.api.spec = (function clj_yavl$api$spec(m){
return m;
});
clj_yavl.api.facet = clj_yavl.api.wrap_with_facet;
clj_yavl.api.repeat = clj_yavl.api.wrap_with_repeat;

//# sourceMappingURL=clj_yavl.api.js.map
