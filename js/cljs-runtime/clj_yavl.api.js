goog.provide('clj_yavl.api');
clj_yavl.api.google_colors = new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, ["#4285F4","#DB4437","#F4B400","#0F9D58"], null);
clj_yavl.api.default_config = new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"config","config",994861415),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword(null,"range","range",1639692286),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"category","category",-593092832),clj_yavl.api.google_colors], null),new cljs.core.Keyword(null,"axis","axis",-1215390822),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"labelFontSize","labelFontSize",717469659),(12),new cljs.core.Keyword(null,"titleFontSize","titleFontSize",-1632214750),(14)], null),new cljs.core.Keyword(null,"header","header",119441134),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"labelFontSize","labelFontSize",717469659),(12),new cljs.core.Keyword(null,"titleFontSize","titleFontSize",-1632214750),(14)], null),new cljs.core.Keyword(null,"legend","legend",-1027192245),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"labelFontSize","labelFontSize",717469659),(12),new cljs.core.Keyword(null,"titleFontSize","titleFontSize",-1632214750),(14)], null),new cljs.core.Keyword(null,"text","text",-1790561697),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"fontSize","fontSize",919623033),(12)], null)], null),new cljs.core.Keyword(null,"width","width",-384071477),(400),new cljs.core.Keyword(null,"height","height",1025178622),(300)], null);
/**
 * Infers the Vega-Lite type from a Malli schema node.
 */
clj_yavl.api.infer_vl_type = (function clj_yavl$api$infer_vl_type(schema_node){
var t = malli.core.type.cljs$core$IFn$_invoke$arity$1(schema_node);
if(cljs.core.truth_((function (){var fexpr__25081 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 9, [new cljs.core.Keyword(null,"double","double",884886883),null,new cljs.core.Symbol(null,"int?","int?",1799729645,null),null,new cljs.core.Keyword(null,"int","int",-1741416922),null,new cljs.core.Keyword(null,"number","number",1570378438),null,new cljs.core.Symbol(null,"float?","float?",673884616,null),null,new cljs.core.Keyword(null,"float","float",-1732389368),null,new cljs.core.Symbol(null,"integer?","integer?",1303791671,null),null,new cljs.core.Symbol(null,"number?","number?",-1747282210,null),null,new cljs.core.Symbol(null,"double?","double?",-2146564276,null),null], null), null);
return (fexpr__25081.cljs$core$IFn$_invoke$arity$1 ? fexpr__25081.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25081.call(null,t));
})())){
return "quantitative";
} else {
if(cljs.core.truth_((function (){var fexpr__25082 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"string","string",-1989541586),null,new cljs.core.Symbol(null,"string?","string?",-1129175764,null),null], null), null);
return (fexpr__25082.cljs$core$IFn$_invoke$arity$1 ? fexpr__25082.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25082.call(null,t));
})())){
return "nominal";
} else {
if(cljs.core.truth_((function (){var fexpr__25083 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Symbol(null,"boolean?","boolean?",1790940868,null),null,new cljs.core.Keyword(null,"boolean","boolean",-1919418404),null], null), null);
return (fexpr__25083.cljs$core$IFn$_invoke$arity$1 ? fexpr__25083.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25083.call(null,t));
})())){
return "nominal";
} else {
if(cljs.core.truth_((function (){var fexpr__25084 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Symbol(null,"inst?","inst?",1614698981,null),null,new cljs.core.Keyword(null,"inst","inst",645962501),null,new cljs.core.Keyword(null,"time","time",1385887882),null,new cljs.core.Symbol(null,"time?","time?",-1100776152,null),null], null), null);
return (fexpr__25084.cljs$core$IFn$_invoke$arity$1 ? fexpr__25084.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25084.call(null,t));
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
var map_schema = (cljs.core.truth_((function (){var fexpr__25085 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"sequential","sequential",-1082983960),null,new cljs.core.Keyword(null,"vector","vector",1902966158),null,new cljs.core.Keyword(null,"list","list",765357683),null,new cljs.core.Keyword(null,"set","set",304602554),null], null), null);
return (fexpr__25085.cljs$core$IFn$_invoke$arity$1 ? fexpr__25085.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25085.call(null,t));
})())?cljs.core.first(malli.core.children.cljs$core$IFn$_invoke$arity$1(schema)):schema);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(malli.core.type.cljs$core$IFn$_invoke$arity$1(map_schema),new cljs.core.Keyword(null,"map","map",1371690461))){
return cljs.core.some((function (p__25086){
var vec__25089 = p__25086;
var k = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25089,(0),null);
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25089,(1),null);
var v = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25089,(2),null);
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
var map_schema = (cljs.core.truth_((function (){var fexpr__25112 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"sequential","sequential",-1082983960),null,new cljs.core.Keyword(null,"vector","vector",1902966158),null,new cljs.core.Keyword(null,"list","list",765357683),null,new cljs.core.Keyword(null,"set","set",304602554),null], null), null);
return (fexpr__25112.cljs$core$IFn$_invoke$arity$1 ? fexpr__25112.cljs$core$IFn$_invoke$arity$1(t) : fexpr__25112.call(null,t));
})())?cljs.core.first(malli.core.children.cljs$core$IFn$_invoke$arity$1(schema)):schema);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(malli.core.type.cljs$core$IFn$_invoke$arity$1(map_schema),new cljs.core.Keyword(null,"map","map",1371690461))){
return cljs.core.some((function (p__25113){
var vec__25114 = p__25113;
var k = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25114,(0),null);
var props = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25114,(1),null);
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25114,(2),null);
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
var expression = clojure.string.join.cljs$core$IFn$_invoke$arity$2(" : ",cljs.core.concat.cljs$core$IFn$_invoke$arity$2(cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p__25117){
var vec__25118 = p__25117;
var old = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25118,(0),null);
var new$ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__25118,(1),null);
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
return cljs.core.vec((function (){var iter__5503__auto__ = (function clj_yavl$api$tooltip_def_$_iter__25127(s__25128){
return (new cljs.core.LazySeq(null,(function (){
var s__25128__$1 = s__25128;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__25128__$1);
if(temp__5825__auto__){
var s__25128__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__25128__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__25128__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__25130 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__25129 = (0);
while(true){
if((i__25129 < size__5502__auto__)){
var k = cljs.core._nth(c__5501__auto__,i__25129);
cljs.core.chunk_append(b__25130,(function (){var inferred_type = clj_yavl.api.infer_type_for_field(dataset_schema,k);
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

var G__25259 = (i__25129 + (1));
i__25129 = G__25259;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__25130),clj_yavl$api$tooltip_def_$_iter__25127(cljs.core.chunk_rest(s__25128__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__25130),null);
}
} else {
var k = cljs.core.first(s__25128__$2);
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
})(),clj_yavl$api$tooltip_def_$_iter__25127(cljs.core.rest(s__25128__$2)));
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
 * opts keys: :row, :column, :facet, :columns
 */
clj_yavl.api.wrap_with_facet = (function clj_yavl$api$wrap_with_facet(spec,p__25167){
var map__25168 = p__25167;
var map__25168__$1 = cljs.core.__destructure_map(map__25168);
var row = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25168__$1,new cljs.core.Keyword(null,"row","row",-570139521));
var column = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25168__$1,new cljs.core.Keyword(null,"column","column",2078222095));
var facet = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25168__$1,new cljs.core.Keyword(null,"facet","facet",-801327574));
var columns = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25168__$1,new cljs.core.Keyword(null,"columns","columns",1998437288));
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
var inner_spec = cljs.core.dissoc.cljs$core$IFn$_invoke$arity$2(spec,new cljs.core.Keyword(null,"config","config",994861415));
var facet_prop = (cljs.core.truth_(facet)?(function (){var base = ((cljs.core.map_QMARK_(facet))?facet:new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),facet], null));
var G__25189 = base;
if(cljs.core.truth_(columns)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25189,new cljs.core.Keyword(null,"columns","columns",1998437288),columns);
} else {
return G__25189;
}
})():(function (){var G__25211 = cljs.core.PersistentArrayMap.EMPTY;
var G__25211__$1 = (cljs.core.truth_(row)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25211,new cljs.core.Keyword(null,"row","row",-570139521),((cljs.core.map_QMARK_(row))?row:new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),row], null))):G__25211);
if(cljs.core.truth_(column)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25211__$1,new cljs.core.Keyword(null,"column","column",2078222095),((cljs.core.map_QMARK_(column))?column:new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"field","field",-1302436500),column], null)));
} else {
return G__25211__$1;
}
})());
var res = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"facet","facet",-801327574),facet_prop,new cljs.core.Keyword(null,"spec","spec",347520401),inner_spec], null);
var G__25212 = res;
if(cljs.core.truth_(config)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25212,new cljs.core.Keyword(null,"config","config",994861415),config);
} else {
return G__25212;
}
} else {
return spec;
}
});
/**
 * Wraps a Vega-Lite spec with a repeat operator.
 * Lifts :config to the top level.
 * 
 * opts keys: :repeat, :columns (if repeat is array)
 */
clj_yavl.api.wrap_with_repeat = (function clj_yavl$api$wrap_with_repeat(spec,p__25221){
var map__25222 = p__25221;
var map__25222__$1 = cljs.core.__destructure_map(map__25222);
var repeat = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25222__$1,new cljs.core.Keyword(null,"repeat","repeat",832692087));
var columns = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25222__$1,new cljs.core.Keyword(null,"columns","columns",1998437288));
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
var res = (function (){var G__25233 = new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"repeat","repeat",832692087),repeat_prop,new cljs.core.Keyword(null,"spec","spec",347520401),inner_spec], null);
if(cljs.core.truth_((function (){var and__5023__auto__ = cljs.core.vector_QMARK_(repeat_prop);
if(and__5023__auto__){
return columns;
} else {
return and__5023__auto__;
}
})())){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25233,new cljs.core.Keyword(null,"columns","columns",1998437288),columns);
} else {
return G__25233;
}
})();
var G__25234 = res;
if(cljs.core.truth_(config)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25234,new cljs.core.Keyword(null,"config","config",994861415),config);
} else {
return G__25234;
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
clj_yavl.api.add_transforms = (function clj_yavl$api$add_transforms(spec,p__25235){
var map__25236 = p__25235;
var map__25236__$1 = cljs.core.__destructure_map(map__25236);
var transform = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25236__$1,new cljs.core.Keyword(null,"transform","transform",1381301764));
var calculate = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__25236__$1,new cljs.core.Keyword(null,"calculate","calculate",-1224644403));
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
 * Recursively merges maps.
 */
clj_yavl.api.deep_merge = (function clj_yavl$api$deep_merge(var_args){
var args__5755__auto__ = [];
var len__5749__auto___25267 = arguments.length;
var i__5750__auto___25268 = (0);
while(true){
if((i__5750__auto___25268 < len__5749__auto___25267)){
args__5755__auto__.push((arguments[i__5750__auto___25268]));

var G__25273 = (i__5750__auto___25268 + (1));
i__5750__auto___25268 = G__25273;
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
(clj_yavl.api.deep_merge.cljs$lang$applyTo = (function (seq25237){
var self__5735__auto__ = this;
return self__5735__auto__.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq25237));
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
var final_def = (function (){var G__25240 = encoding_def;
if(cljs.core.truth_(inferred_type)){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__25240,new cljs.core.Keyword(null,"type","type",1174270348),inferred_type);
} else {
return G__25240;
}
})();
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(acc,channel,final_def);
}),cljs.core.PersistentArrayMap.EMPTY,encodings);
var final_specs = clj_yavl.api.deep_merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([clj_yavl.api.default_config,common_specs], 0));
return cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([final_specs,((cljs.core.seq(processed_encodings))?new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"encoding","encoding",1728578272),processed_encodings], null):null)], 0));
});

//# sourceMappingURL=clj_yavl.api.js.map
