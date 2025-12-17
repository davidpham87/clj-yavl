goog.provide('clj_yavl.webapp.ui_schema');
clj_yavl.webapp.ui_schema.get_fields = (function clj_yavl$webapp$ui_schema$get_fields(data_schema){
var schema = malli.core.schema.cljs$core$IFn$_invoke$arity$1(data_schema);
var t = malli.core.type.cljs$core$IFn$_invoke$arity$1(schema);
var map_schema = (cljs.core.truth_((function (){var fexpr__29676 = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"sequential","sequential",-1082983960),null,new cljs.core.Keyword(null,"vector","vector",1902966158),null,new cljs.core.Keyword(null,"list","list",765357683),null,new cljs.core.Keyword(null,"set","set",304602554),null], null), null);
return (fexpr__29676.cljs$core$IFn$_invoke$arity$1 ? fexpr__29676.cljs$core$IFn$_invoke$arity$1(t) : fexpr__29676.call(null,t));
})())?((cljs.core.seq(malli.core.children.cljs$core$IFn$_invoke$arity$1(schema)))?(function (){var child = cljs.core.first(malli.core.children.cljs$core$IFn$_invoke$arity$1(schema));
if(malli.core.schema_QMARK_(child)){
return child;
} else {
try{return malli.core.schema.cljs$core$IFn$_invoke$arity$1(child);
}catch (e29681){if((e29681 instanceof Error)){
var _ = e29681;
return null;
} else {
throw e29681;

}
}}
})():null):schema);
if(cljs.core.truth_((function (){var and__5023__auto__ = map_schema;
if(cljs.core.truth_(and__5023__auto__)){
return cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(malli.core.type.cljs$core$IFn$_invoke$arity$1(map_schema),new cljs.core.Keyword(null,"map","map",1371690461));
} else {
return and__5023__auto__;
}
})())){
var children = malli.core.children.cljs$core$IFn$_invoke$arity$1(map_schema);
return cljs.core.mapv.cljs$core$IFn$_invoke$arity$2((function (child){
if(cljs.core.vector_QMARK_(child)){
return cljs.core.name(cljs.core.first(child));
} else {
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(child);
}
}),children);
} else {
return cljs.core.PersistentVector.EMPTY;
}
});
clj_yavl.webapp.ui_schema.extract_as_fields = (function clj_yavl$webapp$ui_schema$extract_as_fields(transform){
var as = new cljs.core.Keyword(null,"as","as",1148689641).cljs$core$IFn$_invoke$arity$1(transform);
if(typeof as === 'string'){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [as], null);
} else {
if(cljs.core.vector_QMARK_(as)){
return as;
} else {
return cljs.core.PersistentVector.EMPTY;

}
}
});
clj_yavl.webapp.ui_schema.get_transform_fields = (function clj_yavl$webapp$ui_schema$get_transform_fields(opts){
var transforms = cljs.core.concat.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword(null,"transform","transform",1381301764).cljs$core$IFn$_invoke$arity$1(opts),((cljs.core.vector_QMARK_(new cljs.core.Keyword(null,"calculate","calculate",-1224644403).cljs$core$IFn$_invoke$arity$1(opts)))?new cljs.core.Keyword(null,"calculate","calculate",-1224644403).cljs$core$IFn$_invoke$arity$1(opts):new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"calculate","calculate",-1224644403).cljs$core$IFn$_invoke$arity$1(opts)], null)));
return cljs.core.reduce.cljs$core$IFn$_invoke$arity$3((function (acc,t){
if(cljs.core.truth_(t)){
return cljs.core.into.cljs$core$IFn$_invoke$arity$2(acc,clj_yavl.webapp.ui_schema.extract_as_fields(t));
} else {
return acc;
}
}),cljs.core.PersistentVector.EMPTY,transforms);
});
clj_yavl.webapp.ui_schema.field_select = (function clj_yavl$webapp$ui_schema$field_select(fields){
return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"field","field",-1302436500),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"select","select",1147833503),new cljs.core.Keyword(null,"options","options",99638489),fields], null);
});
clj_yavl.webapp.ui_schema.type_select = (function clj_yavl$webapp$ui_schema$type_select(current_type){
return new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"select","select",1147833503),new cljs.core.Keyword(null,"options","options",99638489),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, ["quantitative","nominal","temporal","ordinal"], null),new cljs.core.Keyword(null,"default","default",-1987822328),(function (){var or__5025__auto__ = current_type;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return "nominal";
}
})()], null);
});
clj_yavl.webapp.ui_schema.encoding_def = (function clj_yavl$webapp$ui_schema$encoding_def(fields,current_field_opts){
return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"field","field",-1302436500),clj_yavl.webapp.ui_schema.field_select(fields),new cljs.core.Keyword(null,"type","type",1174270348),clj_yavl.webapp.ui_schema.type_select(cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_field_opts,new cljs.core.Keyword(null,"type","type",1174270348))),new cljs.core.Keyword(null,"title","title",636505583),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"title","title",636505583),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"text-input","text-input",-1937260843)], null)], null);
});
clj_yavl.webapp.ui_schema.presets = new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"xyplot","xyplot",-1505772843),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"args","args",1315556576),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"x","x",2099068185),new cljs.core.Keyword(null,"y","y",-1757859776),new cljs.core.Keyword(null,"mark","mark",-373816345),new cljs.core.Keyword(null,"color","color",1011675173),new cljs.core.Keyword(null,"size","size",1098693007)], null),new cljs.core.Keyword(null,"def","def",-1043430536),(function (fields,current_opts){
return new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword(null,"x","x",2099068185),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"x","x",2099068185))),new cljs.core.Keyword(null,"y","y",-1757859776),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"y","y",-1757859776))),new cljs.core.Keyword(null,"mark","mark",-373816345),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"select","select",1147833503),new cljs.core.Keyword(null,"options","options",99638489),new cljs.core.PersistentVector(null, 8, 5, cljs.core.PersistentVector.EMPTY_NODE, ["point","line","area","bar","circle","square","tick","rect"], null)], null)], null),new cljs.core.Keyword(null,"color","color",1011675173),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"color","color",1011675173))),new cljs.core.Keyword(null,"size","size",1098693007),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"size","size",1098693007)))], null);
})], null),new cljs.core.Keyword(null,"pie","pie",1530441672),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"args","args",1315556576),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"category","category",-593092832),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"inner-radius","inner-radius",-681823510)], null),new cljs.core.Keyword(null,"def","def",-1043430536),(function (fields,current_opts){
return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"category","category",-593092832),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"category","category",-593092832))),new cljs.core.Keyword(null,"value","value",305978217),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"value","value",305978217))),new cljs.core.Keyword(null,"inner-radius","inner-radius",-681823510),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"number-input","number-input",-1816352688)], null)], null)], null);
})], null),new cljs.core.Keyword(null,"bar","bar",-1386246584),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"args","args",1315556576),new cljs.core.PersistentVector(null, 6, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"x","x",2099068185),new cljs.core.Keyword(null,"y","y",-1757859776),new cljs.core.Keyword(null,"color","color",1011675173),new cljs.core.Keyword(null,"group","group",582596132),new cljs.core.Keyword(null,"grouped?","grouped?",531080948),new cljs.core.Keyword(null,"orientation","orientation",623557579)], null),new cljs.core.Keyword(null,"def","def",-1043430536),(function (fields,current_opts){
return new cljs.core.PersistentArrayMap(null, 6, [new cljs.core.Keyword(null,"x","x",2099068185),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"x","x",2099068185))),new cljs.core.Keyword(null,"y","y",-1757859776),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"y","y",-1757859776))),new cljs.core.Keyword(null,"color","color",1011675173),clj_yavl.webapp.ui_schema.encoding_def(fields,cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,new cljs.core.Keyword(null,"color","color",1011675173))),new cljs.core.Keyword(null,"group","group",582596132),clj_yavl.webapp.ui_schema.field_select(fields),new cljs.core.Keyword(null,"grouped?","grouped?",531080948),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"boolean","boolean",-1919418404)], null)], null),new cljs.core.Keyword(null,"orientation","orientation",623557579),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"select","select",1147833503),new cljs.core.Keyword(null,"options","options",99638489),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"vertical","vertical",718696748),new cljs.core.Keyword(null,"horizontal","horizontal",2062109475)], null)], null)], null)], null);
})], null)], null);
clj_yavl.webapp.ui_schema.common_args = new cljs.core.PersistentVector(null, 6, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"title","title",636505583),new cljs.core.Keyword(null,"width","width",-384071477),new cljs.core.Keyword(null,"height","height",1025178622),new cljs.core.Keyword(null,"facet","facet",-801327574),new cljs.core.Keyword(null,"repeat","repeat",832692087),new cljs.core.Keyword(null,"transform","transform",1381301764)], null);
clj_yavl.webapp.ui_schema.common_def = (function clj_yavl$webapp$ui_schema$common_def(fields){
return new cljs.core.PersistentArrayMap(null, 6, [new cljs.core.Keyword(null,"title","title",636505583),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"text-input","text-input",-1937260843)], null)], null),new cljs.core.Keyword(null,"width","width",-384071477),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"number-input","number-input",-1816352688)], null)], null),new cljs.core.Keyword(null,"height","height",1025178622),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"number-input","number-input",-1816352688)], null)], null),new cljs.core.Keyword(null,"facet","facet",-801327574),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"field","field",-1302436500),clj_yavl.webapp.ui_schema.field_select(fields),new cljs.core.Keyword(null,"columns","columns",1998437288),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"columns","columns",1998437288),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"number-input","number-input",-1816352688)], null)], null),new cljs.core.Keyword(null,"repeat","repeat",832692087),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"row","row",-570139521),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"row","row",-570139521),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"multi-select","multi-select",-1298511287),new cljs.core.Keyword(null,"options","options",99638489),fields], null),new cljs.core.Keyword(null,"column","column",2078222095),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"column","column",2078222095),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"multi-select","multi-select",-1298511287),new cljs.core.Keyword(null,"options","options",99638489),fields], null)], null),new cljs.core.Keyword(null,"transform","transform",1381301764),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"property","property",-1114278232),new cljs.core.Keyword(null,"value","value",305978217),new cljs.core.Keyword(null,"type","type",1174270348),new cljs.core.Keyword(null,"json-editor","json-editor",-1682231471)], null)], null)], null);
});
clj_yavl.webapp.ui_schema.generate_ui_schema = (function clj_yavl$webapp$ui_schema$generate_ui_schema(var_args){
var args__5755__auto__ = [];
var len__5749__auto___29798 = arguments.length;
var i__5750__auto___29799 = (0);
while(true){
if((i__5750__auto___29799 < len__5749__auto___29798)){
args__5755__auto__.push((arguments[i__5750__auto___29799]));

var G__29800 = (i__5750__auto___29799 + (1));
i__5750__auto___29799 = G__29800;
continue;
} else {
}
break;
}

var argseq__5756__auto__ = ((((2) < args__5755__auto__.length))?(new cljs.core.IndexedSeq(args__5755__auto__.slice((2)),(0),null)):null);
return clj_yavl.webapp.ui_schema.generate_ui_schema.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),(arguments[(1)]),argseq__5756__auto__);
});

(clj_yavl.webapp.ui_schema.generate_ui_schema.cljs$core$IFn$_invoke$arity$variadic = (function (preset_key,data_schema,p__29728){
var vec__29729 = p__29728;
var current_opts = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29729,(0),null);
var schema_fields = clj_yavl.webapp.ui_schema.get_fields(data_schema);
var transform_fields = clj_yavl.webapp.ui_schema.get_transform_fields(current_opts);
var all_fields = cljs.core.distinct.cljs$core$IFn$_invoke$arity$1(cljs.core.concat.cljs$core$IFn$_invoke$arity$2(schema_fields,transform_fields));
var preset = cljs.core.get.cljs$core$IFn$_invoke$arity$2(clj_yavl.webapp.ui_schema.presets,preset_key);
var preset_def = (function (){var fexpr__29737 = new cljs.core.Keyword(null,"def","def",-1043430536).cljs$core$IFn$_invoke$arity$1(preset);
return (fexpr__29737.cljs$core$IFn$_invoke$arity$2 ? fexpr__29737.cljs$core$IFn$_invoke$arity$2(all_fields,current_opts) : fexpr__29737.call(null,all_fields,current_opts));
})();
var common = clj_yavl.webapp.ui_schema.common_def(all_fields);
return cljs.core.vec(cljs.core.concat.cljs$core$IFn$_invoke$arity$2((function (){var iter__5503__auto__ = (function clj_yavl$webapp$ui_schema$iter__29743(s__29744){
return (new cljs.core.LazySeq(null,(function (){
var s__29744__$1 = s__29744;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__29744__$1);
if(temp__5825__auto__){
var s__29744__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__29744__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__29744__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__29746 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__29745 = (0);
while(true){
if((i__29745 < size__5502__auto__)){
var arg = cljs.core._nth(c__5501__auto__,i__29745);
cljs.core.chunk_append(b__29746,(function (){var arg_opts = cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,arg);
return new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"scope","scope",-439358418),new cljs.core.Keyword(null,"preset","preset",777387345),new cljs.core.Keyword(null,"arg","arg",-1747261837),arg,new cljs.core.Keyword(null,"main","main",-2117802661),cljs.core.update.cljs$core$IFn$_invoke$arity$3(cljs.core.update.cljs$core$IFn$_invoke$arity$5(cljs.core.get.cljs$core$IFn$_invoke$arity$2(preset_def,arg),new cljs.core.Keyword(null,"field","field",-1302436500),cljs.core.assoc,new cljs.core.Keyword(null,"current-val","current-val",1732593126),cljs.core.get.cljs$core$IFn$_invoke$arity$2(arg_opts,new cljs.core.Keyword(null,"field","field",-1302436500))),new cljs.core.Keyword(null,"type","type",1174270348),((function (i__29745,arg_opts,arg,c__5501__auto__,size__5502__auto__,b__29746,s__29744__$2,temp__5825__auto__,schema_fields,transform_fields,all_fields,preset,preset_def,common,vec__29729,current_opts){
return (function (type_map){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(type_map,new cljs.core.Keyword(null,"current-type","current-type",666114333),cljs.core.get.cljs$core$IFn$_invoke$arity$2(arg_opts,new cljs.core.Keyword(null,"type","type",1174270348)));
});})(i__29745,arg_opts,arg,c__5501__auto__,size__5502__auto__,b__29746,s__29744__$2,temp__5825__auto__,schema_fields,transform_fields,all_fields,preset,preset_def,common,vec__29729,current_opts))
),new cljs.core.Keyword(null,"advanced","advanced",-451287892),cljs.core.PersistentArrayMap.EMPTY], null);
})());

var G__29801 = (i__29745 + (1));
i__29745 = G__29801;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__29746),clj_yavl$webapp$ui_schema$iter__29743(cljs.core.chunk_rest(s__29744__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__29746),null);
}
} else {
var arg = cljs.core.first(s__29744__$2);
return cljs.core.cons((function (){var arg_opts = cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,arg);
return new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"scope","scope",-439358418),new cljs.core.Keyword(null,"preset","preset",777387345),new cljs.core.Keyword(null,"arg","arg",-1747261837),arg,new cljs.core.Keyword(null,"main","main",-2117802661),cljs.core.update.cljs$core$IFn$_invoke$arity$3(cljs.core.update.cljs$core$IFn$_invoke$arity$5(cljs.core.get.cljs$core$IFn$_invoke$arity$2(preset_def,arg),new cljs.core.Keyword(null,"field","field",-1302436500),cljs.core.assoc,new cljs.core.Keyword(null,"current-val","current-val",1732593126),cljs.core.get.cljs$core$IFn$_invoke$arity$2(arg_opts,new cljs.core.Keyword(null,"field","field",-1302436500))),new cljs.core.Keyword(null,"type","type",1174270348),((function (arg_opts,arg,s__29744__$2,temp__5825__auto__,schema_fields,transform_fields,all_fields,preset,preset_def,common,vec__29729,current_opts){
return (function (type_map){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(type_map,new cljs.core.Keyword(null,"current-type","current-type",666114333),cljs.core.get.cljs$core$IFn$_invoke$arity$2(arg_opts,new cljs.core.Keyword(null,"type","type",1174270348)));
});})(arg_opts,arg,s__29744__$2,temp__5825__auto__,schema_fields,transform_fields,all_fields,preset,preset_def,common,vec__29729,current_opts))
),new cljs.core.Keyword(null,"advanced","advanced",-451287892),cljs.core.PersistentArrayMap.EMPTY], null);
})(),clj_yavl$webapp$ui_schema$iter__29743(cljs.core.rest(s__29744__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(new cljs.core.Keyword(null,"args","args",1315556576).cljs$core$IFn$_invoke$arity$1(preset));
})(),(function (){var iter__5503__auto__ = (function clj_yavl$webapp$ui_schema$iter__29756(s__29757){
return (new cljs.core.LazySeq(null,(function (){
var s__29757__$1 = s__29757;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__29757__$1);
if(temp__5825__auto__){
var s__29757__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__29757__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__29757__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__29759 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__29758 = (0);
while(true){
if((i__29758 < size__5502__auto__)){
var arg = cljs.core._nth(c__5501__auto__,i__29758);
cljs.core.chunk_append(b__29759,(function (){var arg_opts = cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,arg);
return new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"scope","scope",-439358418),new cljs.core.Keyword(null,"common","common",-1822281391),new cljs.core.Keyword(null,"arg","arg",-1747261837),arg,new cljs.core.Keyword(null,"main","main",-2117802661),cljs.core.update.cljs$core$IFn$_invoke$arity$3(cljs.core.update.cljs$core$IFn$_invoke$arity$5(cljs.core.get.cljs$core$IFn$_invoke$arity$2(common,arg),new cljs.core.Keyword(null,"field","field",-1302436500),cljs.core.assoc,new cljs.core.Keyword(null,"current-val","current-val",1732593126),cljs.core.get.cljs$core$IFn$_invoke$arity$2(arg_opts,new cljs.core.Keyword(null,"field","field",-1302436500))),new cljs.core.Keyword(null,"type","type",1174270348),((function (i__29758,arg_opts,arg,c__5501__auto__,size__5502__auto__,b__29759,s__29757__$2,temp__5825__auto__,schema_fields,transform_fields,all_fields,preset,preset_def,common,vec__29729,current_opts){
return (function (type_map){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(type_map,new cljs.core.Keyword(null,"current-type","current-type",666114333),cljs.core.get.cljs$core$IFn$_invoke$arity$2(arg_opts,new cljs.core.Keyword(null,"type","type",1174270348)));
});})(i__29758,arg_opts,arg,c__5501__auto__,size__5502__auto__,b__29759,s__29757__$2,temp__5825__auto__,schema_fields,transform_fields,all_fields,preset,preset_def,common,vec__29729,current_opts))
),new cljs.core.Keyword(null,"advanced","advanced",-451287892),cljs.core.PersistentArrayMap.EMPTY], null);
})());

var G__29802 = (i__29758 + (1));
i__29758 = G__29802;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__29759),clj_yavl$webapp$ui_schema$iter__29756(cljs.core.chunk_rest(s__29757__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__29759),null);
}
} else {
var arg = cljs.core.first(s__29757__$2);
return cljs.core.cons((function (){var arg_opts = cljs.core.get.cljs$core$IFn$_invoke$arity$2(current_opts,arg);
return new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"scope","scope",-439358418),new cljs.core.Keyword(null,"common","common",-1822281391),new cljs.core.Keyword(null,"arg","arg",-1747261837),arg,new cljs.core.Keyword(null,"main","main",-2117802661),cljs.core.update.cljs$core$IFn$_invoke$arity$3(cljs.core.update.cljs$core$IFn$_invoke$arity$5(cljs.core.get.cljs$core$IFn$_invoke$arity$2(common,arg),new cljs.core.Keyword(null,"field","field",-1302436500),cljs.core.assoc,new cljs.core.Keyword(null,"current-val","current-val",1732593126),cljs.core.get.cljs$core$IFn$_invoke$arity$2(arg_opts,new cljs.core.Keyword(null,"field","field",-1302436500))),new cljs.core.Keyword(null,"type","type",1174270348),((function (arg_opts,arg,s__29757__$2,temp__5825__auto__,schema_fields,transform_fields,all_fields,preset,preset_def,common,vec__29729,current_opts){
return (function (type_map){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(type_map,new cljs.core.Keyword(null,"current-type","current-type",666114333),cljs.core.get.cljs$core$IFn$_invoke$arity$2(arg_opts,new cljs.core.Keyword(null,"type","type",1174270348)));
});})(arg_opts,arg,s__29757__$2,temp__5825__auto__,schema_fields,transform_fields,all_fields,preset,preset_def,common,vec__29729,current_opts))
),new cljs.core.Keyword(null,"advanced","advanced",-451287892),cljs.core.PersistentArrayMap.EMPTY], null);
})(),clj_yavl$webapp$ui_schema$iter__29756(cljs.core.rest(s__29757__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(clj_yavl.webapp.ui_schema.common_args);
})()));
}));

(clj_yavl.webapp.ui_schema.generate_ui_schema.cljs$lang$maxFixedArity = (2));

/** @this {Function} */
(clj_yavl.webapp.ui_schema.generate_ui_schema.cljs$lang$applyTo = (function (seq29716){
var G__29717 = cljs.core.first(seq29716);
var seq29716__$1 = cljs.core.next(seq29716);
var G__29718 = cljs.core.first(seq29716__$1);
var seq29716__$2 = cljs.core.next(seq29716__$1);
var self__5734__auto__ = this;
return self__5734__auto__.cljs$core$IFn$_invoke$arity$variadic(G__29717,G__29718,seq29716__$2);
}));


//# sourceMappingURL=clj_yavl.webapp.ui_schema.js.map
