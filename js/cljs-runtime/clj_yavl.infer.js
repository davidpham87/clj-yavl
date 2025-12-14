goog.provide('clj_yavl.infer');
clj_yavl.infer.infer_type = (function clj_yavl$infer$infer_type(value){
if(cljs.core.integer_QMARK_(value)){
return new cljs.core.Keyword(null,"int","int",-1741416922);
} else {
if(typeof value === 'number'){
return new cljs.core.Keyword(null,"double","double",884886883);
} else {
if(cljs.core.boolean_QMARK_(value)){
return new cljs.core.Keyword(null,"boolean","boolean",-1919418404);
} else {
if(typeof value === 'string'){
return new cljs.core.Keyword(null,"string","string",-1989541586);
} else {
if(cljs.core.inst_QMARK_(value)){
return new cljs.core.Keyword(null,"inst","inst",645962501);
} else {
return new cljs.core.Keyword(null,"any","any",1705907423);

}
}
}
}
}
});
/**
 * Infers a Malli schema from a list of data maps.
 * Uses the first 10 items to determine keys and types, prioritizing more specific types.
 */
clj_yavl.infer.infer_schema = (function clj_yavl$infer$infer_schema(data){
if(cljs.core.seq(data)){
var sample = cljs.core.take.cljs$core$IFn$_invoke$arity$2((10),data);
var keys_set = cljs.core.into.cljs$core$IFn$_invoke$arity$2(cljs.core.PersistentHashSet.EMPTY,cljs.core.mapcat.cljs$core$IFn$_invoke$arity$variadic(cljs.core.keys,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([sample], 0)));
var props = (function (){var iter__5503__auto__ = (function clj_yavl$infer$infer_schema_$_iter__28439(s__28440){
return (new cljs.core.LazySeq(null,(function (){
var s__28440__$1 = s__28440;
while(true){
var temp__5825__auto__ = cljs.core.seq(s__28440__$1);
if(temp__5825__auto__){
var s__28440__$2 = temp__5825__auto__;
if(cljs.core.chunked_seq_QMARK_(s__28440__$2)){
var c__5501__auto__ = cljs.core.chunk_first(s__28440__$2);
var size__5502__auto__ = cljs.core.count(c__5501__auto__);
var b__28442 = cljs.core.chunk_buffer(size__5502__auto__);
if((function (){var i__28441 = (0);
while(true){
if((i__28441 < size__5502__auto__)){
var k = cljs.core._nth(c__5501__auto__,i__28441);
cljs.core.chunk_append(b__28442,(function (){var values = cljs.core.keep.cljs$core$IFn$_invoke$arity$2(((function (i__28441,k,c__5501__auto__,size__5502__auto__,b__28442,s__28440__$2,temp__5825__auto__,sample,keys_set){
return (function (p1__28438_SHARP_){
return cljs.core.get.cljs$core$IFn$_invoke$arity$2(p1__28438_SHARP_,k);
});})(i__28441,k,c__5501__auto__,size__5502__auto__,b__28442,s__28440__$2,temp__5825__auto__,sample,keys_set))
,sample);
var types = cljs.core.into.cljs$core$IFn$_invoke$arity$2(cljs.core.PersistentHashSet.EMPTY,cljs.core.map.cljs$core$IFn$_invoke$arity$2(clj_yavl.infer.infer_type,values));
var final_type = ((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"string","string",-1989541586)))?new cljs.core.Keyword(null,"string","string",-1989541586):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"any","any",1705907423)))?new cljs.core.Keyword(null,"any","any",1705907423):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"double","double",884886883)))?new cljs.core.Keyword(null,"double","double",884886883):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"int","int",-1741416922)))?new cljs.core.Keyword(null,"int","int",-1741416922):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"inst","inst",645962501)))?new cljs.core.Keyword(null,"inst","inst",645962501):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"boolean","boolean",-1919418404)))?new cljs.core.Keyword(null,"boolean","boolean",-1919418404):new cljs.core.Keyword(null,"any","any",1705907423)
))))));
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [k,final_type], null);
})());

var G__28458 = (i__28441 + (1));
i__28441 = G__28458;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__28442),clj_yavl$infer$infer_schema_$_iter__28439(cljs.core.chunk_rest(s__28440__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__28442),null);
}
} else {
var k = cljs.core.first(s__28440__$2);
return cljs.core.cons((function (){var values = cljs.core.keep.cljs$core$IFn$_invoke$arity$2(((function (k,s__28440__$2,temp__5825__auto__,sample,keys_set){
return (function (p1__28438_SHARP_){
return cljs.core.get.cljs$core$IFn$_invoke$arity$2(p1__28438_SHARP_,k);
});})(k,s__28440__$2,temp__5825__auto__,sample,keys_set))
,sample);
var types = cljs.core.into.cljs$core$IFn$_invoke$arity$2(cljs.core.PersistentHashSet.EMPTY,cljs.core.map.cljs$core$IFn$_invoke$arity$2(clj_yavl.infer.infer_type,values));
var final_type = ((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"string","string",-1989541586)))?new cljs.core.Keyword(null,"string","string",-1989541586):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"any","any",1705907423)))?new cljs.core.Keyword(null,"any","any",1705907423):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"double","double",884886883)))?new cljs.core.Keyword(null,"double","double",884886883):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"int","int",-1741416922)))?new cljs.core.Keyword(null,"int","int",-1741416922):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"inst","inst",645962501)))?new cljs.core.Keyword(null,"inst","inst",645962501):((cljs.core.contains_QMARK_(types,new cljs.core.Keyword(null,"boolean","boolean",-1919418404)))?new cljs.core.Keyword(null,"boolean","boolean",-1919418404):new cljs.core.Keyword(null,"any","any",1705907423)
))))));
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [k,final_type], null);
})(),clj_yavl$infer$infer_schema_$_iter__28439(cljs.core.rest(s__28440__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__5503__auto__(keys_set);
})();
return cljs.core.into.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"map","map",1371690461)], null),props);
} else {
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"map","map",1371690461)], null);
}
});

//# sourceMappingURL=clj_yavl.infer.js.map
