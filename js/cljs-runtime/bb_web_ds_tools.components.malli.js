goog.provide('bb_web_ds_tools.components.malli');
/**
 * Parses a string to an integer. Cross-platform.
 * 
 *   Args:
 *  s (string): The string to parse.
 * 
 *   Returns:
 *  integer: The parsed integer.
 */
bb_web_ds_tools.components.malli.parse_int = (function bb_web_ds_tools$components$malli$parse_int(s){
return parseInt(s);
});
/**
 * Reads EDN from a string. Cross-platform.
 * 
 *   Args:
 *  s (string): The EDN string.
 * 
 *   Returns:
 *  any: The parsed data.
 */
bb_web_ds_tools.components.malli.read_edn = (function bb_web_ds_tools$components$malli$read_edn(s){
return cljs.reader.read_string.cljs$core$IFn$_invoke$arity$1(s);
});
/**
 * Parses a JSON string. Cross-platform.
 * 
 *   Args:
 *  s (string): The JSON string.
 * 
 *   Returns:
 *  any: The parsed data (keywordized keys in Clojure).
 */
bb_web_ds_tools.components.malli.parse_json = (function bb_web_ds_tools$components$malli$parse_json(s){
return cljs.core.js__GT_clj.cljs$core$IFn$_invoke$arity$variadic(JSON.parse(s),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"keywordize-keys","keywordize-keys",1310784252),true], 0));
});
/**
 * Generates a JSON string from data. Cross-platform.
 * 
 *   Args:
 *  data (any): The data to serialize.
 * 
 *   Returns:
 *  string: The JSON string.
 */
bb_web_ds_tools.components.malli.generate_json = (function bb_web_ds_tools$components$malli$generate_json(data){
return JSON.stringify(cljs.core.clj__GT_js(data),null,(2));
});
/**
 * Pretty prints data to a string. Cross-platform.
 * 
 *   Args:
 *  data (any): The data to print.
 * 
 *   Returns:
 *  string: The formatted string.
 */
bb_web_ds_tools.components.malli.pretty_print_str = (function bb_web_ds_tools$components$malli$pretty_print_str(data){
var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__42107_42153 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__42108_42154 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__42109_42155 = true;
var _STAR_print_fn_STAR__temp_val__42110_42156 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__42109_42155);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__42110_42156);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(data);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__42108_42154);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__42107_42153);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
});
/**
 * Detects input format (EDN or JSON) and parses it.
 * 
 *   Args:
 *  text (string): The input text.
 * 
 *   Returns:
 *  any: The parsed data or nil.
 */
bb_web_ds_tools.components.malli.detect_and_parse = (function bb_web_ds_tools$components$malli$detect_and_parse(text){
if(clojure.string.blank_QMARK_(text)){
return null;
} else {
try{return bb_web_ds_tools.components.malli.read_edn(text);
}catch (e42111){var _ = e42111;
try{return bb_web_ds_tools.components.malli.parse_json(text);
}catch (e42112){var ___$1 = e42112;
return null;
}}}
});
/**
 * Parses a Malli schema from EDN string.
 * 
 *   Args:
 *  schema-text (string): The schema EDN string.
 * 
 *   Returns:
 *  map: {:success true :schema ...} or {:success false :error ...}.
 */
bb_web_ds_tools.components.malli.parse_schema_and_generate = (function bb_web_ds_tools$components$malli$parse_schema_and_generate(schema_text){
try{var schema = bb_web_ds_tools.components.malli.read_edn(schema_text);
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),true,new cljs.core.Keyword(null,"schema","schema",-1582001791),schema], null);
}catch (e42114){var e = e42114;
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),false,new cljs.core.Keyword(null,"error","error",-978969032),["Invalid schema EDN: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(cljs.core.ex_message(e))].join('')], null);
}});
/**
 * Generates random data from a Malli schema.
 * 
 *   Args:
 *  schema (any): The Malli schema.
 *  samples (int): Number of samples.
 *  format (keyword): Output format (:edn or :json).
 * 
 *   Returns:
 *  map: {:success true :output string :data any}.
 */
bb_web_ds_tools.components.malli.generate_data = (function bb_web_ds_tools$components$malli$generate_data(schema,samples,format){
if(cljs.core.truth_((function (){var and__5023__auto__ = schema;
if(cljs.core.truth_(and__5023__auto__)){
return (samples > (0));
} else {
return and__5023__auto__;
}
})())){
var data = (((samples > (1)))?cljs.core.vec(cljs.core.repeatedly.cljs$core$IFn$_invoke$arity$2(samples,(function (){
return malli.generator.generate.cljs$core$IFn$_invoke$arity$1(schema);
}))):malli.generator.generate.cljs$core$IFn$_invoke$arity$1(schema));
var output = (function (){var G__42115 = format;
var G__42115__$1 = (((G__42115 instanceof cljs.core.Keyword))?G__42115.fqn:null);
switch (G__42115__$1) {
case "edn":
return bb_web_ds_tools.components.malli.pretty_print_str(data);

break;
case "json":
return bb_web_ds_tools.components.malli.generate_json(data);

break;
default:
return cljs.core.pr_str.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([data], 0));

}
})();
return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"success","success",1890645906),true,new cljs.core.Keyword(null,"output","output",-1105869043),output,new cljs.core.Keyword(null,"data","data",-232669377),data], null);
} else {
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),false,new cljs.core.Keyword(null,"error","error",-978969032),"Invalid schema or samples."], null);
}
});
/**
 * Recursively builds a tree of {:type ... :data ...} to align data with schema.
 */
bb_web_ds_tools.components.malli.annotate_schema = (function bb_web_ds_tools$components$malli$annotate_schema(schema,data){
if(((cljs.core.vector_QMARK_(schema)) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"map","map",1371690461),cljs.core.first(schema))))){
var vec__42117 = schema;
var seq__42118 = cljs.core.seq(vec__42117);
var first__42119 = cljs.core.first(seq__42118);
var seq__42118__$1 = cljs.core.next(seq__42118);
var type = first__42119;
var tail = seq__42118__$1;
var vec__42120 = ((cljs.core.map_QMARK_(cljs.core.first(tail)))?new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.first(tail),cljs.core.rest(tail)], null):new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [null,tail], null));
var props = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__42120,(0),null);
var entries = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__42120,(1),null);
var maps = ((cljs.core.map_QMARK_(data))?new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [data], null):cljs.core.filter.cljs$core$IFn$_invoke$arity$2(cljs.core.map_QMARK_,data));
return new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"map","map",1371690461),new cljs.core.Keyword(null,"schema-type","schema-type",-1474759536),type,new cljs.core.Keyword(null,"props","props",453281727),props,new cljs.core.Keyword(null,"children","children",-940561982),cljs.core.mapv.cljs$core$IFn$_invoke$arity$2((function (entry){
if(cljs.core.vector_QMARK_(entry)){
var has_props_QMARK_ = cljs.core.map_QMARK_(cljs.core.second(entry));
var k = cljs.core.first(entry);
var vec__42123 = ((has_props_QMARK_)?new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.second(entry),cljs.core.nth.cljs$core$IFn$_invoke$arity$2(entry,(2))], null):new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [null,cljs.core.second(entry)], null));
var p = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__42123,(0),null);
var v_schema = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__42123,(1),null);
var vals = cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p1__42116_SHARP_){
return cljs.core.get.cljs$core$IFn$_invoke$arity$2(p1__42116_SHARP_,k);
}),maps);
var child_node = (bb_web_ds_tools.components.malli.annotate_schema.cljs$core$IFn$_invoke$arity$2 ? bb_web_ds_tools.components.malli.annotate_schema.cljs$core$IFn$_invoke$arity$2(v_schema,vals) : bb_web_ds_tools.components.malli.annotate_schema.call(null,v_schema,vals));
return new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"entry","entry",505168823),new cljs.core.Keyword(null,"key","key",-1516042587),k,new cljs.core.Keyword(null,"props","props",453281727),p,new cljs.core.Keyword(null,"child","child",623967545),child_node], null);
} else {
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"entry-raw","entry-raw",-690420231),new cljs.core.Keyword(null,"original","original",-445386197),entry], null);
}
}),entries)], null);
} else {
if(cljs.core.truth_((function (){var and__5023__auto__ = cljs.core.vector_QMARK_(schema);
if(and__5023__auto__){
var G__42127 = cljs.core.first(schema);
var fexpr__42126 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"sequential","sequential",-1082983960),null,new cljs.core.Keyword(null,"vector","vector",1902966158),null,new cljs.core.Keyword(null,"set","set",304602554),null], null), null);
return (fexpr__42126.cljs$core$IFn$_invoke$arity$1 ? fexpr__42126.cljs$core$IFn$_invoke$arity$1(G__42127) : fexpr__42126.call(null,G__42127));
} else {
return and__5023__auto__;
}
})())){
var vec__42128 = schema;
var type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__42128,(0),null);
var child_schema = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__42128,(1),null);
var child_data = ((cljs.core.every_QMARK_(cljs.core.coll_QMARK_,data))?cljs.core.mapcat.cljs$core$IFn$_invoke$arity$variadic(cljs.core.identity,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([data], 0)):data);
return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"collection","collection",-683361892),new cljs.core.Keyword(null,"collection-type","collection-type",-448917118),type,new cljs.core.Keyword(null,"child","child",623967545),(bb_web_ds_tools.components.malli.annotate_schema.cljs$core$IFn$_invoke$arity$2 ? bb_web_ds_tools.components.malli.annotate_schema.cljs$core$IFn$_invoke$arity$2(child_schema,child_data) : bb_web_ds_tools.components.malli.annotate_schema.call(null,child_schema,child_data))], null);
} else {
if(((cljs.core.vector_QMARK_(schema)) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"maybe","maybe",-314397560),cljs.core.first(schema))))){
var vec__42134 = schema;
var type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__42134,(0),null);
var child_schema = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__42134,(1),null);
var child_data = cljs.core.remove.cljs$core$IFn$_invoke$arity$2(cljs.core.nil_QMARK_,data);
return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"wrapper","wrapper",-969103524),new cljs.core.Keyword(null,"wrapper-type","wrapper-type",-1307888434),type,new cljs.core.Keyword(null,"child","child",623967545),(bb_web_ds_tools.components.malli.annotate_schema.cljs$core$IFn$_invoke$arity$2 ? bb_web_ds_tools.components.malli.annotate_schema.cljs$core$IFn$_invoke$arity$2(child_schema,child_data) : bb_web_ds_tools.components.malli.annotate_schema.call(null,child_schema,child_data))], null);
} else {
return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"leaf","leaf",1306118732),new cljs.core.Keyword(null,"schema","schema",-1582001791),schema,new cljs.core.Keyword(null,"data","data",-232669377),data], null);

}
}
}
});
/**
 * Reconstructs schema from annotated tree using postwalk.
 */
bb_web_ds_tools.components.malli.deannotate_schema = (function bb_web_ds_tools$components$malli$deannotate_schema(tree){
return clojure.walk.postwalk((function (node){
if(cljs.core.map_QMARK_(node)){
var G__42137 = new cljs.core.Keyword(null,"type","type",1174270348).cljs$core$IFn$_invoke$arity$1(node);
var G__42137__$1 = (((G__42137 instanceof cljs.core.Keyword))?G__42137.fqn:null);
switch (G__42137__$1) {
case "map":
return cljs.core.into.cljs$core$IFn$_invoke$arity$2((cljs.core.truth_(new cljs.core.Keyword(null,"props","props",453281727).cljs$core$IFn$_invoke$arity$1(node))?new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"schema-type","schema-type",-1474759536).cljs$core$IFn$_invoke$arity$1(node),new cljs.core.Keyword(null,"props","props",453281727).cljs$core$IFn$_invoke$arity$1(node)], null):new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"schema-type","schema-type",-1474759536).cljs$core$IFn$_invoke$arity$1(node)], null)),new cljs.core.Keyword(null,"children","children",-940561982).cljs$core$IFn$_invoke$arity$1(node));

break;
case "entry":
if(cljs.core.truth_(new cljs.core.Keyword(null,"props","props",453281727).cljs$core$IFn$_invoke$arity$1(node))){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"key","key",-1516042587).cljs$core$IFn$_invoke$arity$1(node),new cljs.core.Keyword(null,"props","props",453281727).cljs$core$IFn$_invoke$arity$1(node),new cljs.core.Keyword(null,"child","child",623967545).cljs$core$IFn$_invoke$arity$1(node)], null);
} else {
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"key","key",-1516042587).cljs$core$IFn$_invoke$arity$1(node),new cljs.core.Keyword(null,"child","child",623967545).cljs$core$IFn$_invoke$arity$1(node)], null);
}

break;
case "entry-raw":
return new cljs.core.Keyword(null,"original","original",-445386197).cljs$core$IFn$_invoke$arity$1(node);

break;
case "collection":
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"collection-type","collection-type",-448917118).cljs$core$IFn$_invoke$arity$1(node),new cljs.core.Keyword(null,"child","child",623967545).cljs$core$IFn$_invoke$arity$1(node)], null);

break;
case "wrapper":
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"wrapper-type","wrapper-type",-1307888434).cljs$core$IFn$_invoke$arity$1(node),new cljs.core.Keyword(null,"child","child",623967545).cljs$core$IFn$_invoke$arity$1(node)], null);

break;
case "leaf":
return new cljs.core.Keyword(null,"schema","schema",-1582001791).cljs$core$IFn$_invoke$arity$1(node);

break;
default:
return node;

}
} else {
return node;
}
}),tree);
});
/**
 * Refines schema by replacing string types with enums and adding min/max to numbers and dates.
 */
bb_web_ds_tools.components.malli.refine_schema_with_data = (function bb_web_ds_tools$components$malli$refine_schema_with_data(schema,data,max_values){
var annotated = bb_web_ds_tools.components.malli.annotate_schema(schema,data);
var refined = clojure.walk.postwalk((function (node){
if(((cljs.core.map_QMARK_(node)) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"leaf","leaf",1306118732),new cljs.core.Keyword(null,"type","type",1174270348).cljs$core$IFn$_invoke$arity$1(node))))){
var s = new cljs.core.Keyword(null,"schema","schema",-1582001791).cljs$core$IFn$_invoke$arity$1(node);
var d = new cljs.core.Keyword(null,"data","data",-232669377).cljs$core$IFn$_invoke$arity$1(node);
var s_type = ((cljs.core.vector_QMARK_(s))?cljs.core.first(s):s);
if(((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(s_type,new cljs.core.Symbol(null,"string?","string?",-1129175764,null))) || (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(s_type,new cljs.core.Keyword(null,"string","string",-1989541586))))){
var strings = cljs.core.filter.cljs$core$IFn$_invoke$arity$2(cljs.core.string_QMARK_,d);
var distinct_vals = cljs.core.distinct.cljs$core$IFn$_invoke$arity$1(strings);
var cnt = cljs.core.count(distinct_vals);
if((((cnt > (0))) && ((cnt <= max_values)))){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(node,new cljs.core.Keyword(null,"schema","schema",-1582001791),cljs.core.into.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"enum","enum",1679018432)], null),cljs.core.sort.cljs$core$IFn$_invoke$arity$1(distinct_vals)));
} else {
return node;
}
} else {
if(cljs.core.truth_((function (){var fexpr__42138 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 6, [new cljs.core.Keyword(null,"double","double",884886883),null,new cljs.core.Symbol(null,"int?","int?",1799729645,null),null,new cljs.core.Keyword(null,"int","int",-1741416922),null,new cljs.core.Keyword(null,"number","number",1570378438),null,new cljs.core.Symbol(null,"number?","number?",-1747282210,null),null,new cljs.core.Symbol(null,"double?","double?",-2146564276,null),null], null), null);
return (fexpr__42138.cljs$core$IFn$_invoke$arity$1 ? fexpr__42138.cljs$core$IFn$_invoke$arity$1(s_type) : fexpr__42138.call(null,s_type));
})())){
var nums = cljs.core.filter.cljs$core$IFn$_invoke$arity$2(cljs.core.number_QMARK_,d);
if(cljs.core.seq(nums)){
var min_val = cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.min,nums);
var max_val = cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.max,nums);
var existing_props = ((((cljs.core.vector_QMARK_(s)) && (cljs.core.map_QMARK_(cljs.core.second(s)))))?cljs.core.second(s):null);
var new_props = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([existing_props,new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"min","min",444991522),min_val,new cljs.core.Keyword(null,"max","max",61366548),max_val], null)], 0));
var new_schema = ((cljs.core.vector_QMARK_(s))?((cljs.core.map_QMARK_(cljs.core.second(s)))?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(s,(1),new_props):cljs.core.into.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.first(s),new_props], null),cljs.core.rest(s))):new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [s,new_props], null));
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(node,new cljs.core.Keyword(null,"schema","schema",-1582001791),new_schema);
} else {
return node;
}
} else {
if(((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(s_type,new cljs.core.Symbol(null,"inst?","inst?",1614698981,null))) || (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(s_type,new cljs.core.Keyword(null,"inst","inst",645962501))))){
var dates = cljs.core.filter.cljs$core$IFn$_invoke$arity$2(cljs.core.inst_QMARK_,d);
if(cljs.core.seq(dates)){
var sorted = cljs.core.sort.cljs$core$IFn$_invoke$arity$1(dates);
var min_val = cljs.core.first(sorted);
var max_val = cljs.core.last(sorted);
var existing_props = ((((cljs.core.vector_QMARK_(s)) && (cljs.core.map_QMARK_(cljs.core.second(s)))))?cljs.core.second(s):null);
var new_props = cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([existing_props,new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"min","min",444991522),min_val,new cljs.core.Keyword(null,"max","max",61366548),max_val], null)], 0));
var new_schema = ((cljs.core.vector_QMARK_(s))?((cljs.core.map_QMARK_(cljs.core.second(s)))?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(s,(1),new_props):cljs.core.into.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.first(s),new_props], null),cljs.core.rest(s))):new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [s,new_props], null));
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(node,new cljs.core.Keyword(null,"schema","schema",-1582001791),new_schema);
} else {
return node;
}
} else {
return node;

}
}
}
} else {
return node;
}
}),annotated);
return bb_web_ds_tools.components.malli.deannotate_schema(refined);
});
/**
 * Infers a Malli schema from data.
 * 
 *   Args:
 *  input-data (coll): The input data sample.
 *  max-enum-values (int, optional): Max values to infer enum. Default 10.
 * 
 *   Returns:
 *  map: {:success true :schema-str string} or error.
 */
bb_web_ds_tools.components.malli.infer_schema = (function bb_web_ds_tools$components$malli$infer_schema(var_args){
var G__42140 = arguments.length;
switch (G__42140) {
case 1:
return bb_web_ds_tools.components.malli.infer_schema.cljs$core$IFn$_invoke$arity$1((arguments[(0)]));

break;
case 2:
return bb_web_ds_tools.components.malli.infer_schema.cljs$core$IFn$_invoke$arity$2((arguments[(0)]),(arguments[(1)]));

break;
default:
throw (new Error(["Invalid arity: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(arguments.length)].join('')));

}
});

(bb_web_ds_tools.components.malli.infer_schema.cljs$core$IFn$_invoke$arity$1 = (function (input_data){
return bb_web_ds_tools.components.malli.infer_schema.cljs$core$IFn$_invoke$arity$2(input_data,(10));
}));

(bb_web_ds_tools.components.malli.infer_schema.cljs$core$IFn$_invoke$arity$2 = (function (input_data,max_enum_values){
if(((cljs.core.coll_QMARK_(input_data)) && (cljs.core.seq(input_data)))){
var schema = malli.provider.provide.cljs$core$IFn$_invoke$arity$1(input_data);
var refined_schema = bb_web_ds_tools.components.malli.refine_schema_with_data(schema,input_data,max_enum_values);
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),true,new cljs.core.Keyword(null,"schema-str","schema-str",-1744815373),bb_web_ds_tools.components.malli.pretty_print_str(refined_schema)], null);
} else {
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),false,new cljs.core.Keyword(null,"error","error",-978969032),"Invalid input data or empty sequence."], null);
}
}));

(bb_web_ds_tools.components.malli.infer_schema.cljs$lang$maxFixedArity = 2);

/**
 * Parses generated data string back to data for saving.
 * 
 *   Args:
 *  generated-data (string): The data string.
 *  format (keyword): The format.
 * 
 *   Returns:
 *  any: The parsed data or nil.
 */
bb_web_ds_tools.components.malli.save_dataset_data = (function bb_web_ds_tools$components$malli$save_dataset_data(generated_data,format){
var G__42141 = format;
var G__42141__$1 = (((G__42141 instanceof cljs.core.Keyword))?G__42141.fqn:null);
switch (G__42141__$1) {
case "edn":
try{return bb_web_ds_tools.components.malli.read_edn(generated_data);
}catch (e42142){var _ = e42142;
return null;
}
break;
case "json":
try{return bb_web_ds_tools.components.malli.parse_json(generated_data);
}catch (e42143){var _ = e42143;
return null;
}
break;
default:
return null;

}
});
/**
 * Validates data against a schema.
 * 
 *   Args:
 *  schema (any): The Malli schema.
 *  data (any): The data to validate.
 * 
 *   Returns:
 *  map: {:success true :result string} or error.
 */
bb_web_ds_tools.components.malli.validate_data = (function bb_web_ds_tools$components$malli$validate_data(schema,data){
if(cljs.core.truth_((function (){var and__5023__auto__ = schema;
if(cljs.core.truth_(and__5023__auto__)){
return data;
} else {
return and__5023__auto__;
}
})())){
if(cljs.core.truth_(malli.core.validate.cljs$core$IFn$_invoke$arity$2(schema,data))){
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),true,new cljs.core.Keyword(null,"result","result",1415092211),"\u2705 Data is valid."], null);
} else {
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),false,new cljs.core.Keyword(null,"result","result",1415092211),malli.core.explain.cljs$core$IFn$_invoke$arity$2(schema,data)], null);
}
} else {
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),false,new cljs.core.Keyword(null,"error","error",-978969032),"Invalid schema or data."], null);
}
});
/**
 * Transforms a Malli schema to JSON Schema.
 * 
 *   Args:
 *  schema (any): The Malli schema.
 * 
 *   Returns:
 *  map: {:success true :json-schema string} or error.
 */
bb_web_ds_tools.components.malli.transform_to_json_schema = (function bb_web_ds_tools$components$malli$transform_to_json_schema(schema){
if(cljs.core.truth_(schema)){
try{return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),true,new cljs.core.Keyword(null,"json-schema","json-schema",389191695),bb_web_ds_tools.components.malli.generate_json(malli.json_schema.transform.cljs$core$IFn$_invoke$arity$1(schema))], null);
}catch (e42144){var e = e42144;
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),false,new cljs.core.Keyword(null,"error","error",-978969032),["Transformation failed: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(cljs.core.ex_message(e))].join('')], null);
}} else {
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"success","success",1890645906),false,new cljs.core.Keyword(null,"error","error",-978969032),"Invalid schema."], null);
}
});
/**
 * Renders the legacy inference panel.
 * 
 *     Args:
 *       props (map): {:values, :handle-change, :on-infer, :inferred-schema}.
 * 
 *     Returns:
 *       vector: A hiccup vector.
 */
bb_web_ds_tools.components.malli.inference_panel = (function bb_web_ds_tools$components$malli$inference_panel(p__42145){
var map__42146 = p__42145;
var map__42146__$1 = cljs.core.__destructure_map(map__42146);
var values = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__42146__$1,new cljs.core.Keyword(null,"values","values",372645556));
var handle_change = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__42146__$1,new cljs.core.Keyword(null,"handle-change","handle-change",741134083));
var on_infer = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__42146__$1,new cljs.core.Keyword(null,"on-infer","on-infer",78181482));
var inferred_schema = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__42146__$1,new cljs.core.Keyword(null,"inferred-schema","inferred-schema",1558411545));
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.card,cljs.core.PersistentArrayMap.EMPTY,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"h3","h3",2067611163),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"text-xl font-semibold text-white mb-4 flex items-center gap-2"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"span","span",1394872991),"\uD83E\uDDE9"], null),"Schema Inference"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"grid grid-cols-1 lg:grid-cols-2 gap-6"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.label,"Input Data (EDN)"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.textarea,new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword(null,"value","value",305978217),cljs.core.get.cljs$core$IFn$_invoke$arity$2(values,"inference-input"),new cljs.core.Keyword(null,"name","name",1843675177),"inference-input",new cljs.core.Keyword(null,"placeholder","placeholder",-104873083),"{:user/name \"Alice\" :user/age 30}",new cljs.core.Keyword(null,"on-change","on-change",-732046149),handle_change,new cljs.core.Keyword(null,"class","class",-2030961996),"h-64"], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"mt-4"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.button,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"on-click","on-click",1632826543),on_infer], null),"Infer Schema"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.label,"Inferred Schema"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.pre_block,new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"content","content",15833224),inferred_schema,new cljs.core.Keyword(null,"class","class",-2030961996),"h-64"], null)], null)], null)], null)], null)], null);
});

/**
 * Renders the legacy generation panel.
 * 
 *     Args:
 *       props (map): {:values, :handle-change, :on-generate, :generated-data}.
 * 
 *     Returns:
 *       vector: A hiccup vector.
 */
bb_web_ds_tools.components.malli.generation_panel = (function bb_web_ds_tools$components$malli$generation_panel(p__42147){
var map__42148 = p__42147;
var map__42148__$1 = cljs.core.__destructure_map(map__42148);
var values = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__42148__$1,new cljs.core.Keyword(null,"values","values",372645556));
var handle_change = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__42148__$1,new cljs.core.Keyword(null,"handle-change","handle-change",741134083));
var on_generate = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__42148__$1,new cljs.core.Keyword(null,"on-generate","on-generate",-1231561477));
var generated_data = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__42148__$1,new cljs.core.Keyword(null,"generated-data","generated-data",-924406973));
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.card,cljs.core.PersistentArrayMap.EMPTY,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"h3","h3",2067611163),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"text-xl font-semibold text-white mb-4 flex items-center gap-2"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"span","span",1394872991),"\uD83C\uDFB2"], null),"Data Generation"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"grid grid-cols-1 lg:grid-cols-2 gap-6"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.label,"Schema (EDN)"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.textarea,new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword(null,"value","value",305978217),cljs.core.get.cljs$core$IFn$_invoke$arity$2(values,"schema-text"),new cljs.core.Keyword(null,"name","name",1843675177),"schema-text",new cljs.core.Keyword(null,"placeholder","placeholder",-104873083),"[:map [:x int?] [:y int?]]",new cljs.core.Keyword(null,"on-change","on-change",-732046149),handle_change,new cljs.core.Keyword(null,"class","class",-2030961996),"h-64"], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"mt-4"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.button,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"on-click","on-click",1632826543),on_generate], null),"Generate Data"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.label,"Generated Data"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.common.pre_block,new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"content","content",15833224),generated_data,new cljs.core.Keyword(null,"class","class",-2030961996),"h-64"], null)], null)], null)], null)], null)], null);
});

//# sourceMappingURL=bb_web_ds_tools.components.malli.js.map
