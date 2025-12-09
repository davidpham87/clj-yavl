goog.provide('clj_yavl.events');
clj_yavl.events.default_config_json = "{\n  \"$schema\": \"https://vega.github.io/schema/vega-lite/v5.json\",\n  \"mark\": \"bar\",\n  \"encoding\": {\n    \"x\": {\"field\": \"col1\", \"type\": \"ordinal\"},\n    \"y\": {\"field\": \"col2\", \"type\": \"quantitative\"}\n  }\n}";
clj_yavl.events.initialize_db = (function clj_yavl$events$initialize_db(db,_){
var user_input_exists_QMARK_ = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null));
var component_state_exists_QMARK_ = new cljs.core.Keyword("clj-yavl.core","vega-lite","clj-yavl.core/vega-lite",943809627).cljs$core$IFn$_invoke$arity$1(db);
var unit_specs_exists_QMARK_ = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null));
var ds_conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
var default_config = clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(clj_yavl.events.default_config_json,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
var ___$1 = clj_yavl.db.transact(ds_conn,clj_yavl.db.config__GT_tx_data("default",default_config));
var ds_db = cljs.core.deref(ds_conn);
var G__31212 = db;
var G__31212__$1 = ((cljs.core.not(user_input_exists_QMARK_))?cljs.core.assoc_in(G__31212,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"saved-configs","saved-configs",1634320315),cljs.core.PersistentArrayMap.EMPTY,new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword("clj-yavl.core","data-input","clj-yavl.core/data-input",611355071),"",new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655),clj_yavl.events.default_config_json,new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340),new cljs.core.Keyword(null,"json","json",1279968570),new cljs.core.Keyword("clj-yavl.core","active-config-name","clj-yavl.core/active-config-name",-1939900428),null,new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866),ds_db], null)], null)):G__31212);
var G__31212__$2 = ((cljs.core.not(component_state_exists_QMARK_))?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__31212__$1,new cljs.core.Keyword("clj-yavl.core","vega-lite","clj-yavl.core/vega-lite",943809627),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword("clj-yavl.core","format","clj-yavl.core/format",1360929541),new cljs.core.Keyword(null,"csv","csv",-1164440893),new cljs.core.Keyword("clj-yavl.core","structure","clj-yavl.core/structure",-30773006),new cljs.core.Keyword(null,"columnar","columnar",-1122999701),new cljs.core.Keyword("clj-yavl.core","parsed-data","clj-yavl.core/parsed-data",-1560578265),null,new cljs.core.Keyword("clj-yavl.core","inferred-schema","clj-yavl.core/inferred-schema",-1109150020),null,new cljs.core.Keyword("clj-yavl.core","active-left-tab","clj-yavl.core/active-left-tab",1685289502),new cljs.core.Keyword(null,"config","config",994861415)], null)):G__31212__$1);
if(cljs.core.not(unit_specs_exists_QMARK_)){
return cljs.core.assoc_in(G__31212__$2,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null),cljs.core.PersistentArrayMap.EMPTY);
} else {
return G__31212__$2;
}
});
clj_yavl.events.init_unit_spec = (function clj_yavl$events$init_unit_spec(db,p__31219){
var vec__31220 = p__31219;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31220,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31220,(1),null);
var type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31220,(2),null);
var initial_input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31220,(3),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"type","type",1174270348),type,new cljs.core.Keyword(null,"input","input",556931961),(function (){var or__5025__auto__ = initial_input;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return cljs.core.PersistentArrayMap.EMPTY;
}
})()], null));
});
clj_yavl.events.remove_unit_spec = (function clj_yavl$events$remove_unit_spec(db,p__31223){
var vec__31224 = p__31223;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31224,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31224,(1),null);
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$4(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null),cljs.core.dissoc,id);
});
clj_yavl.events.update_unit_spec_input = (function clj_yavl$events$update_unit_spec_input(db,p__31227){
var vec__31234 = p__31227;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31234,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31234,(1),null);
var field = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31234,(2),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31234,(3),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id,new cljs.core.Keyword(null,"input","input",556931961),field], null),value);
});
clj_yavl.events.set_unit_spec_input = (function clj_yavl$events$set_unit_spec_input(db,p__31237){
var vec__31238 = p__31237;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31238,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31238,(1),null);
var input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31238,(2),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id,new cljs.core.Keyword(null,"input","input",556931961)], null),input);
});
clj_yavl.events.set_config_input = (function clj_yavl$events$set_config_input(db,p__31241){
var vec__31242 = p__31241;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31242,(0),null);
var val = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31242,(1),null);
var mode = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340)], null));
var parsed = (function (){try{if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570))){
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(val,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
} else {
return clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(val);
}
}catch (e31248){var ___$1 = e31248;
return null;
}})();
var G__31249 = cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),val);
if(cljs.core.truth_(parsed)){
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$3(G__31249,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),(function (old_db){
var conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
clj_yavl.db.transact(conn,clj_yavl.db.config__GT_tx_data("default",parsed));

return cljs.core.deref(conn);
}));
} else {
return G__31249;
}
});
clj_yavl.events.set_config_mode = (function clj_yavl$events$set_config_mode(db,p__31250){
var vec__31251 = p__31250;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31251,(0),null);
var new_mode = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31251,(1),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var current_mode = new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(user_input);
var current_input = new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(user_input);
var new_input = ((((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(current_mode,new cljs.core.Keyword(null,"json","json",1279968570))) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new_mode,new cljs.core.Keyword(null,"edn","edn",1317840885)))))?(function (){try{var obj = clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(current_input,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
var edn_data = obj;
var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__31255_31310 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__31256_31311 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__31257_31312 = true;
var _STAR_print_fn_STAR__temp_val__31258_31313 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__31257_31312);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__31258_31313);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(edn_data);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__31256_31311);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__31255_31310);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
}catch (e31254){var ___$1 = e31254;
return current_input;
}})():((((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(current_mode,new cljs.core.Keyword(null,"edn","edn",1317840885))) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new_mode,new cljs.core.Keyword(null,"json","json",1279968570)))))?(function (){try{var edn_data = clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(current_input);
return clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(edn_data,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null));
}catch (e31259){var ___$1 = e31259;
return current_input;
}})():current_input
));
return cljs.core.assoc_in(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340)], null),new_mode),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input);
});
clj_yavl.events.set_top_level_prop = (function clj_yavl$events$set_top_level_prop(db,p__31260){
var vec__31261 = p__31260;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31261,(0),null);
var prop_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31261,(1),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31261,(2),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var mode = new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(user_input);
var input = new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(user_input);
try{var parsed = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(input,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null)):clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(input));
var updated = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(parsed,prop_key,value);
var new_input = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(updated,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null)):(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__31265_31314 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__31266_31315 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__31267_31316 = true;
var _STAR_print_fn_STAR__temp_val__31268_31317 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__31267_31316);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__31268_31317);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(updated);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__31266_31315);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__31265_31314);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})());
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$3(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),(function (___$1){
var conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
clj_yavl.db.transact(conn,clj_yavl.db.config__GT_tx_data("default",updated));

return cljs.core.deref(conn);
}));
}catch (e31264){var ___$1 = e31264;
return db;
}});
/**
 * Helper to update text config from DS.
 */
clj_yavl.events.sync_config_from_db = (function clj_yavl$events$sync_config_from_db(db){
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null));
var config = clj_yavl.db.pull_config(ds_db,"default");
var mode = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340)], null));
var new_input = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(config,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null)):(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__31269_31318 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__31270_31319 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__31271_31320 = true;
var _STAR_print_fn_STAR__temp_val__31272_31321 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__31271_31320);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__31272_31321);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(config);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__31270_31319);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__31269_31318);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})());
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input);
});
clj_yavl.events.update_mark = (function clj_yavl$events$update_mark(db,p__31273){
var vec__31274 = p__31273;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31274,(0),null);
var mark_type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31274,(1),null);
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null));
var mark_eid = cljs.core.ffirst(clj_yavl.db.q(new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"find","find",496279456),new cljs.core.Symbol(null,"?e","?e",-1194391683,null),new cljs.core.Keyword(null,"where","where",-2044795965),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","mark","vl/mark",-373754579),new cljs.core.Symbol(null,"?e","?e",-1194391683,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null)], null),ds_db));
var tx_data = (cljs.core.truth_(mark_eid)?new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),mark_eid,new cljs.core.Keyword("mark","type","mark/type",1170405465),mark_type], null)], null):(function (){var new_mark_id = (-1);
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.Keyword("vl","mark","vl/mark",-373754579),new_mark_id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_mark_id,new cljs.core.Keyword("mark","type","mark/type",1170405465),mark_type], null)], null);
})());
var new_ds_db = clj_yavl.db.with$(ds_db,tx_data);
return clj_yavl.events.sync_config_from_db(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),new_ds_db));
});
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","set-dataset-url-input","clj-yavl.events/set-dataset-url-input",-1979763890),(function (db,p__31277){
var vec__31278 = p__31277;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31278,(0),null);
var val = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31278,(1),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-url-input","dataset-url-input",-505073218)], null),val);
}));
re_frame.core.reg_event_fx.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset","clj-yavl.events/fetch-dataset",-896793732),(function (p__31281,p__31282){
var map__31283 = p__31281;
var map__31283__$1 = cljs.core.__destructure_map(map__31283);
var db = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__31283__$1,new cljs.core.Keyword(null,"db","db",993250759));
var vec__31284 = p__31282;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31284,(0),null);
var url = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31284,(1),null);
return new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword("promise","fetch","promise/fetch",-566993641),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"url","url",276297046),url,new cljs.core.Keyword(null,"on-success","on-success",1786904109),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.events","fetch-dataset-success","clj-yavl.events/fetch-dataset-success",1402343088)], null),new cljs.core.Keyword(null,"on-failure","on-failure",842888245),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.events","fetch-dataset-failure","clj-yavl.events/fetch-dataset-failure",-962316695)], null)], null)], null);
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset-success","clj-yavl.events/fetch-dataset-success",1402343088),(function (db,p__31287){
var vec__31288 = p__31287;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31288,(0),null);
var data = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31288,(1),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var mode = new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(user_input);
var input = new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(user_input);
var parsed = (function (){try{if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570))){
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(input,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
} else {
return clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(input);
}
}catch (e31291){var ___$1 = e31291;
return null;
}})();
var updated = (cljs.core.truth_(parsed)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(parsed,new cljs.core.Keyword(null,"data","data",-232669377),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"values","values",372645556),data], null)):null);
var new_input = (cljs.core.truth_(updated)?((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(updated,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null)):(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__31292_31322 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__31293_31323 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__31294_31324 = true;
var _STAR_print_fn_STAR__temp_val__31295_31325 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__31294_31324);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__31295_31325);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(updated);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__31293_31323);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__31292_31322);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})()):null);
if(cljs.core.truth_(new_input)){
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$3(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),(function (___$1){
var conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
clj_yavl.db.transact(conn,clj_yavl.db.config__GT_tx_data("default",updated));

return cljs.core.deref(conn);
}));
} else {
return db;
}
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset-failure","clj-yavl.events/fetch-dataset-failure",-962316695),(function (db,p__31296){
var vec__31297 = p__31296;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31297,(0),null);
var err = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31297,(1),null);
console.error("Failed to fetch dataset:",err);

return db;
}));
re_frame.core.reg_fx(new cljs.core.Keyword("promise","fetch","promise/fetch",-566993641),(function (p__31300){
var map__31301 = p__31300;
var map__31301__$1 = cljs.core.__destructure_map(map__31301);
var url = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__31301__$1,new cljs.core.Keyword(null,"url","url",276297046));
var on_success = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__31301__$1,new cljs.core.Keyword(null,"on-success","on-success",1786904109));
var on_failure = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__31301__$1,new cljs.core.Keyword(null,"on-failure","on-failure",842888245));
return fetch(url).then((function (resp){
if(cljs.core.truth_(resp.ok)){
return resp.json();
} else {
return Promise.reject(["Error: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(resp.statusText)].join(''));
}
})).then((function (json){
return re_frame.core.dispatch(cljs.core.conj.cljs$core$IFn$_invoke$arity$2(on_success,cljs.core.js__GT_clj.cljs$core$IFn$_invoke$arity$variadic(json,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"keywordize-keys","keywordize-keys",1310784252),true], 0))));
})).catch((function (err){
return re_frame.core.dispatch(cljs.core.conj.cljs$core$IFn$_invoke$arity$2(on_failure,err));
}));
}));
clj_yavl.events.update_channel_field = (function clj_yavl$events$update_channel_field(db,p__31302){
var vec__31303 = p__31302;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31303,(0),null);
var channel = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31303,(1),null);
var field = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31303,(2),null);
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null));
var channel_eid = cljs.core.ffirst(clj_yavl.db.q.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.PersistentVector(null, 10, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"find","find",496279456),new cljs.core.Symbol(null,"?c","?c",870679775,null),new cljs.core.Keyword(null,"in","in",-1531184865),new cljs.core.Symbol(null,"$","$",-1580747756,null),new cljs.core.Symbol(null,"?channel-name","?channel-name",-1729442583,null),new cljs.core.Keyword(null,"where","where",-2044795965),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","encoding","vl/encoding",1728582698),new cljs.core.Symbol(null,"?enc","?enc",523306083,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?enc","?enc",523306083,null),new cljs.core.Keyword("encoding","channels","encoding/channels",-578464551),new cljs.core.Symbol(null,"?c","?c",870679775,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?c","?c",870679775,null),new cljs.core.Keyword("channel","name","channel/name",-1177043666),new cljs.core.Symbol(null,"?channel-name","?channel-name",-1729442583,null)], null)], null),ds_db,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.name(channel)], 0)));
var tx_data = (cljs.core.truth_(channel_eid)?new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),channel_eid,new cljs.core.Keyword("channel","field","channel/field",107679349),field], null)], null):(function (){var enc_eid = cljs.core.ffirst(clj_yavl.db.q(new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"find","find",496279456),new cljs.core.Symbol(null,"?e","?e",-1194391683,null),new cljs.core.Keyword(null,"where","where",-2044795965),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","encoding","vl/encoding",1728582698),new cljs.core.Symbol(null,"?e","?e",-1194391683,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null)], null),ds_db));
var new_chan_id = (-1);
if(cljs.core.truth_(enc_eid)){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),enc_eid,new cljs.core.Keyword("encoding","channels","encoding/channels",-578464551),new_chan_id], null),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_chan_id,new cljs.core.Keyword("channel","name","channel/name",-1177043666),cljs.core.name(channel),new cljs.core.Keyword("channel","field","channel/field",107679349),field], null)], null);
} else {
var new_enc_id = (-2);
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.Keyword("vl","encoding","vl/encoding",1728582698),new_enc_id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_enc_id,new cljs.core.Keyword("encoding","channels","encoding/channels",-578464551),new_chan_id], null),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_chan_id,new cljs.core.Keyword("channel","name","channel/name",-1177043666),cljs.core.name(channel),new cljs.core.Keyword("channel","field","channel/field",107679349),field], null)], null);
}
})());
var new_ds_db = clj_yavl.db.with$(ds_db,tx_data);
return clj_yavl.events.sync_config_from_db(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),new_ds_db));
});
clj_yavl.events.update_tooltip = (function clj_yavl$events$update_tooltip(db,p__31306){
var vec__31307 = p__31306;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31307,(0),null);
var tooltip_def = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__31307,(1),null);
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null));
var tx_data = new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.Keyword("vl","tooltip","vl/tooltip",-1809678764),tooltip_def], null)], null);
var new_ds_db = clj_yavl.db.with$(ds_db,tx_data);
return clj_yavl.events.sync_config_from_db(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),new_ds_db));
});

//# sourceMappingURL=clj_yavl.events.js.map
