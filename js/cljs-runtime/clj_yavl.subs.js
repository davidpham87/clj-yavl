goog.provide('clj_yavl.subs');
clj_yavl.subs.unit_spec_ids = (function clj_yavl$subs$unit_spec_ids(db,_){
return cljs.core.keys(cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null)));
});
clj_yavl.subs.unit_spec = (function clj_yavl$subs$unit_spec(db,p__31194){
var vec__31195 = p__31194;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31195,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31195,(1),null);
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id], null));
});
clj_yavl.subs.all_unit_specs = (function clj_yavl$subs$all_unit_specs(db,_){
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null));
});
clj_yavl.subs.compiled_unit_spec_fn = (function clj_yavl$subs$compiled_unit_spec_fn(spec,_){
if(cljs.core.truth_(spec)){
var map__31198 = spec;
var map__31198__$1 = cljs.core.__destructure_map(map__31198);
var type = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__31198__$1,new cljs.core.Keyword(null,"type","type",1174270348));
var input = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__31198__$1,new cljs.core.Keyword(null,"input","input",556931961));
try{return clj_yavl.presets.unit_spec.cljs$core$IFn$_invoke$arity$1(cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(input,new cljs.core.Keyword(null,"type","type",1174270348),type));
}catch (e31200){var e = e31200;
return new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"error","error",-978969032),["Error compiling spec: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(e)].join('')], null);
}} else {
return null;
}
});
clj_yavl.subs.user_input_root = (function clj_yavl$subs$user_input_root(db,_){
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
});
clj_yavl.subs.config_input = (function clj_yavl$subs$config_input(root){
return new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(root);
});
clj_yavl.subs.config_mode = (function clj_yavl$subs$config_mode(root){
return new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(root);
});
clj_yavl.subs.parsed_config = (function clj_yavl$subs$parsed_config(p__31218,_){
var vec__31219 = p__31218;
var input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31219,(0),null);
var mode = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31219,(1),null);
try{if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570))){
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(input,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
} else {
return clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(input);
}
}catch (e31222){var ___$1 = e31222;
return null;
}});
clj_yavl.subs.top_level_prop = (function clj_yavl$subs$top_level_prop(config,p__31228){
var vec__31230 = p__31228;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31230,(0),null);
var prop_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31230,(1),null);
return cljs.core.get.cljs$core$IFn$_invoke$arity$2(config,prop_key);
});
clj_yavl.subs.ds_db = (function clj_yavl$subs$ds_db(db,_){
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null));
});
clj_yavl.subs.mark = (function clj_yavl$subs$mark(ds_db,_){
if(cljs.core.truth_(ds_db)){
var m = clj_yavl.db.pull(ds_db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("mark","type","mark/type",1170405465),new cljs.core.Keyword("mark","def","mark/def",-1042842565)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null));
var root = clj_yavl.db.pull(ds_db,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword("vl","mark","vl/mark",-373754579),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("mark","type","mark/type",1170405465),new cljs.core.Keyword("mark","def","mark/def",-1042842565)], null)], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null));
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(root,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","mark","vl/mark",-373754579),new cljs.core.Keyword("mark","type","mark/type",1170405465)], null));
} else {
return null;
}
});
clj_yavl.subs.encoding = (function clj_yavl$subs$encoding(ds_db,_){
if(cljs.core.truth_(ds_db)){
var root = clj_yavl.db.pull(ds_db,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword("vl","encoding","vl/encoding",1728582698),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword("encoding","channels","encoding/channels",-578464551),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("channel","name","channel/name",-1177043666),new cljs.core.Keyword("channel","field","channel/field",107679349),new cljs.core.Keyword("channel","type","channel/type",973816463),new cljs.core.Keyword("channel","def","channel/def",-1379727759)], null)], null)], null)], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null));
return cljs.core.into.cljs$core$IFn$_invoke$arity$2(cljs.core.PersistentArrayMap.EMPTY,cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (c){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("channel","name","channel/name",-1177043666).cljs$core$IFn$_invoke$arity$1(c),cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword("channel","def","channel/def",-1379727759).cljs$core$IFn$_invoke$arity$1(c),cljs.core.select_keys(c,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("channel","field","channel/field",107679349),new cljs.core.Keyword("channel","type","channel/type",973816463)], null))], 0))], null);
}),cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(root,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","encoding","vl/encoding",1728582698),new cljs.core.Keyword("encoding","channels","encoding/channels",-578464551)], null))));
} else {
return null;
}
});
clj_yavl.subs.tooltip = (function clj_yavl$subs$tooltip(ds_db,_){
if(cljs.core.truth_(ds_db)){
return new cljs.core.Keyword("vl","tooltip","vl/tooltip",-1809678764).cljs$core$IFn$_invoke$arity$1(clj_yavl.db.pull(ds_db,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","tooltip","vl/tooltip",-1809678764)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null)));
} else {
return null;
}
});
rf.reg_sub(new cljs.core.Keyword("clj-yavl.subs","dataset-url-input","clj-yavl.subs/dataset-url-input",2129631621),(function (db,_){
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$3(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-url-input","dataset-url-input",-505073218)], null),"");
}));

//# sourceMappingURL=clj_yavl.subs.js.map
