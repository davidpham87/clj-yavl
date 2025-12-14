goog.provide('clj_yavl.events');
var module$node_modules$papaparse$papaparse_min=shadow.js.require("module$node_modules$papaparse$papaparse_min", {});
clj_yavl.events.default_config_json = "{\n  \"$schema\": \"https://vega.github.io/schema/vega-lite/v5.json\",\n  \"mark\": \"bar\",\n  \"encoding\": {\n    \"x\": {\"field\": \"col1\", \"type\": \"ordinal\"},\n    \"y\": {\"field\": \"col2\", \"type\": \"quantitative\"}\n  }\n}";
clj_yavl.events.initialize_db = (function clj_yavl$events$initialize_db(db,_){
var user_input_exists_QMARK_ = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null));
var component_state_exists_QMARK_ = new cljs.core.Keyword("clj-yavl.core","vega-lite","clj-yavl.core/vega-lite",943809627).cljs$core$IFn$_invoke$arity$1(db);
var unit_specs_exists_QMARK_ = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null));
var dataset_list_exists_QMARK_ = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-list","dataset-list",683219302)], null));
var ds_conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
var default_config = clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(clj_yavl.events.default_config_json,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
var ___$1 = clj_yavl.db.transact(ds_conn,clj_yavl.db.config__GT_tx_data("default",default_config));
var ds_db = cljs.core.deref(ds_conn);
var G__28459 = db;
var G__28459__$1 = ((cljs.core.not(user_input_exists_QMARK_))?cljs.core.assoc_in(G__28459,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"saved-configs","saved-configs",1634320315),cljs.core.PersistentArrayMap.EMPTY,new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword("clj-yavl.core","data-input","clj-yavl.core/data-input",611355071),"",new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655),clj_yavl.events.default_config_json,new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340),new cljs.core.Keyword(null,"json","json",1279968570),new cljs.core.Keyword("clj-yavl.core","active-config-name","clj-yavl.core/active-config-name",-1939900428),null,new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866),ds_db], null)], null)):G__28459);
var G__28459__$2 = ((cljs.core.not(component_state_exists_QMARK_))?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__28459__$1,new cljs.core.Keyword("clj-yavl.core","vega-lite","clj-yavl.core/vega-lite",943809627),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword("clj-yavl.core","format","clj-yavl.core/format",1360929541),new cljs.core.Keyword(null,"csv","csv",-1164440893),new cljs.core.Keyword("clj-yavl.core","structure","clj-yavl.core/structure",-30773006),new cljs.core.Keyword(null,"columnar","columnar",-1122999701),new cljs.core.Keyword("clj-yavl.core","parsed-data","clj-yavl.core/parsed-data",-1560578265),null,new cljs.core.Keyword("clj-yavl.core","inferred-schema","clj-yavl.core/inferred-schema",-1109150020),null,new cljs.core.Keyword("clj-yavl.core","active-left-tab","clj-yavl.core/active-left-tab",1685289502),new cljs.core.Keyword(null,"config","config",994861415)], null)):G__28459__$1);
var G__28459__$3 = ((cljs.core.not(unit_specs_exists_QMARK_))?cljs.core.assoc_in(G__28459__$2,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null),cljs.core.PersistentArrayMap.EMPTY):G__28459__$2);
if(cljs.core.not(dataset_list_exists_QMARK_)){
return cljs.core.assoc_in(G__28459__$3,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-list","dataset-list",683219302)], null),cljs.core.PersistentVector.EMPTY);
} else {
return G__28459__$3;
}
});
clj_yavl.events.init_unit_spec = (function clj_yavl$events$init_unit_spec(db,p__28460){
var vec__28461 = p__28460;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28461,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28461,(1),null);
var type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28461,(2),null);
var initial_input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28461,(3),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"type","type",1174270348),type,new cljs.core.Keyword(null,"input","input",556931961),(function (){var or__5025__auto__ = initial_input;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return cljs.core.PersistentArrayMap.EMPTY;
}
})()], null));
});
clj_yavl.events.remove_unit_spec = (function clj_yavl$events$remove_unit_spec(db,p__28464){
var vec__28465 = p__28464;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28465,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28465,(1),null);
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$4(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null),cljs.core.dissoc,id);
});
clj_yavl.events.update_unit_spec_input = (function clj_yavl$events$update_unit_spec_input(db,p__28468){
var vec__28469 = p__28468;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28469,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28469,(1),null);
var field = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28469,(2),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28469,(3),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id,new cljs.core.Keyword(null,"input","input",556931961),field], null),value);
});
clj_yavl.events.set_unit_spec_input = (function clj_yavl$events$set_unit_spec_input(db,p__28472){
var vec__28473 = p__28472;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28473,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28473,(1),null);
var input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28473,(2),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id,new cljs.core.Keyword(null,"input","input",556931961)], null),input);
});
clj_yavl.events.set_config_input = (function clj_yavl$events$set_config_input(db,p__28476){
var vec__28477 = p__28476;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28477,(0),null);
var val = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28477,(1),null);
var mode = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340)], null));
var parsed = (function (){try{if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570))){
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(val,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
} else {
return clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(val);
}
}catch (e28480){var ___$1 = e28480;
return null;
}})();
var G__28481 = cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),val);
if(cljs.core.truth_(parsed)){
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$3(G__28481,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),(function (old_db){
var conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
clj_yavl.db.transact(conn,clj_yavl.db.config__GT_tx_data("default",parsed));

return cljs.core.deref(conn);
}));
} else {
return G__28481;
}
});
clj_yavl.events.set_config_mode = (function clj_yavl$events$set_config_mode(db,p__28482){
var vec__28483 = p__28482;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28483,(0),null);
var new_mode = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28483,(1),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var current_mode = new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(user_input);
var current_input = new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(user_input);
var new_input = ((((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(current_mode,new cljs.core.Keyword(null,"json","json",1279968570))) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new_mode,new cljs.core.Keyword(null,"edn","edn",1317840885)))))?(function (){try{var obj = clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(current_input,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
var edn_data = obj;
var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__28487_28552 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__28488_28553 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__28489_28554 = true;
var _STAR_print_fn_STAR__temp_val__28490_28555 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__28489_28554);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__28490_28555);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(edn_data);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__28488_28553);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__28487_28552);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
}catch (e28486){var ___$1 = e28486;
return current_input;
}})():((((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(current_mode,new cljs.core.Keyword(null,"edn","edn",1317840885))) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new_mode,new cljs.core.Keyword(null,"json","json",1279968570)))))?(function (){try{var edn_data = clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(current_input);
return clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(edn_data,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null));
}catch (e28491){var ___$1 = e28491;
return current_input;
}})():current_input
));
return cljs.core.assoc_in(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340)], null),new_mode),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input);
});
clj_yavl.events.set_top_level_prop = (function clj_yavl$events$set_top_level_prop(db,p__28492){
var vec__28493 = p__28492;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28493,(0),null);
var prop_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28493,(1),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28493,(2),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var mode = new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(user_input);
var input = new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(user_input);
try{var parsed = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(input,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null)):clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(input));
var updated = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(parsed,prop_key,value);
var new_input = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(updated,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null)):(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__28497_28556 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__28498_28557 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__28499_28558 = true;
var _STAR_print_fn_STAR__temp_val__28500_28559 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__28499_28558);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__28500_28559);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(updated);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__28498_28557);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__28497_28556);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})());
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$3(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),(function (___$1){
var conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
clj_yavl.db.transact(conn,clj_yavl.db.config__GT_tx_data("default",updated));

return cljs.core.deref(conn);
}));
}catch (e28496){var ___$1 = e28496;
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
var _STAR_print_newline_STAR__orig_val__28501_28560 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__28502_28561 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__28503_28562 = true;
var _STAR_print_fn_STAR__temp_val__28504_28563 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__28503_28562);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__28504_28563);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(config);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__28502_28561);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__28501_28560);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})());
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input);
});
clj_yavl.events.update_mark = (function clj_yavl$events$update_mark(db,p__28505){
var vec__28506 = p__28505;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28506,(0),null);
var mark_type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28506,(1),null);
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null));
var mark_eid = cljs.core.ffirst(clj_yavl.db.q(new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"find","find",496279456),new cljs.core.Symbol(null,"?e","?e",-1194391683,null),new cljs.core.Keyword(null,"where","where",-2044795965),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","mark","vl/mark",-373754579),new cljs.core.Symbol(null,"?e","?e",-1194391683,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null)], null),ds_db));
var tx_data = (cljs.core.truth_(mark_eid)?new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),mark_eid,new cljs.core.Keyword("mark","type","mark/type",1170405465),mark_type], null)], null):(function (){var new_mark_id = (-1);
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.Keyword("vl","mark","vl/mark",-373754579),new_mark_id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_mark_id,new cljs.core.Keyword("mark","type","mark/type",1170405465),mark_type], null)], null);
})());
var new_ds_db = clj_yavl.db.with$(ds_db,tx_data);
return clj_yavl.events.sync_config_from_db(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),new_ds_db));
});
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","set-dataset-url-input","clj-yavl.events/set-dataset-url-input",-1979763890),(function (db,p__28509){
var vec__28510 = p__28509;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28510,(0),null);
var val = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28510,(1),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-url-input","dataset-url-input",-505073218)], null),val);
}));
re_frame.core.reg_event_fx.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset","clj-yavl.events/fetch-dataset",-896793732),(function (p__28513,p__28514){
var map__28515 = p__28513;
var map__28515__$1 = cljs.core.__destructure_map(map__28515);
var db = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__28515__$1,new cljs.core.Keyword(null,"db","db",993250759));
var vec__28516 = p__28514;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28516,(0),null);
var url = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28516,(1),null);
return new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword("promise","fetch","promise/fetch",-566993641),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"url","url",276297046),url,new cljs.core.Keyword(null,"on-success","on-success",1786904109),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.events","fetch-dataset-success","clj-yavl.events/fetch-dataset-success",1402343088)], null),new cljs.core.Keyword(null,"on-failure","on-failure",842888245),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.events","fetch-dataset-failure","clj-yavl.events/fetch-dataset-failure",-962316695)], null)], null)], null);
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset-success","clj-yavl.events/fetch-dataset-success",1402343088),(function (db,p__28519){
var vec__28520 = p__28519;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28520,(0),null);
var data = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28520,(1),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var mode = new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(user_input);
var input = new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(user_input);
var parsed = (function (){try{if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570))){
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(input,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
} else {
return clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(input);
}
}catch (e28523){var ___$1 = e28523;
return null;
}})();
var updated = (cljs.core.truth_(parsed)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(parsed,new cljs.core.Keyword(null,"data","data",-232669377),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"values","values",372645556),data], null)):null);
var inferred_schema = ((((cljs.core.seq(data)) && (cljs.core.map_QMARK_(cljs.core.first(data)))))?clj_yavl.infer.infer_schema(data):null);
var new_input = (cljs.core.truth_(updated)?((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(updated,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null)):(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__28524_28574 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__28525_28575 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__28526_28576 = true;
var _STAR_print_fn_STAR__temp_val__28527_28577 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__28526_28576);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__28527_28577);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(updated);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__28525_28575);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__28524_28574);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})()):null);
if(cljs.core.truth_(new_input)){
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$3(cljs.core.assoc_in(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","vega-lite","clj-yavl.core/vega-lite",943809627),new cljs.core.Keyword("clj-yavl.core","inferred-schema","clj-yavl.core/inferred-schema",-1109150020)], null),inferred_schema),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),(function (___$1){
var conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
clj_yavl.db.transact(conn,clj_yavl.db.config__GT_tx_data("default",updated));

return cljs.core.deref(conn);
}));
} else {
return db;
}
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset-failure","clj-yavl.events/fetch-dataset-failure",-962316695),(function (db,p__28528){
var vec__28529 = p__28528;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28529,(0),null);
var err = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28529,(1),null);
console.error("Failed to fetch dataset:",err);

return db;
}));
re_frame.core.reg_fx(new cljs.core.Keyword("promise","fetch","promise/fetch",-566993641),(function (p__28532){
var map__28533 = p__28532;
var map__28533__$1 = cljs.core.__destructure_map(map__28533);
var url = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__28533__$1,new cljs.core.Keyword(null,"url","url",276297046));
var on_success = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__28533__$1,new cljs.core.Keyword(null,"on-success","on-success",1786904109));
var on_failure = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__28533__$1,new cljs.core.Keyword(null,"on-failure","on-failure",842888245));
var is_csv = ((clojure.string.ends_with_QMARK_(clojure.string.lower_case(url),".csv")) || (clojure.string.starts_with_QMARK_(url,"csv:")));
return fetch(url).then((function (resp){
if(cljs.core.truth_(resp.ok)){
if(is_csv){
return resp.text();
} else {
return resp.json();
}
} else {
return Promise.reject(["Error: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(resp.statusText)].join(''));
}
})).then((function (result){
if(is_csv){
var parsed = module$node_modules$papaparse$papaparse_min.parse(result,({"header": true, "dynamicTyping": true}));
return re_frame.core.dispatch(cljs.core.conj.cljs$core$IFn$_invoke$arity$2(on_success,cljs.core.js__GT_clj.cljs$core$IFn$_invoke$arity$variadic(parsed.data,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"keywordize-keys","keywordize-keys",1310784252),true], 0))));
} else {
return re_frame.core.dispatch(cljs.core.conj.cljs$core$IFn$_invoke$arity$2(on_success,cljs.core.js__GT_clj.cljs$core$IFn$_invoke$arity$variadic(result,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"keywordize-keys","keywordize-keys",1310784252),true], 0))));
}
})).catch((function (err){
return re_frame.core.dispatch(cljs.core.conj.cljs$core$IFn$_invoke$arity$2(on_failure,err));
}));
}));
clj_yavl.events.update_channel_field = (function clj_yavl$events$update_channel_field(db,p__28534){
var vec__28535 = p__28534;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28535,(0),null);
var channel = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28535,(1),null);
var field = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28535,(2),null);
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
clj_yavl.events.update_tooltip = (function clj_yavl$events$update_tooltip(db,p__28538){
var vec__28539 = p__28538;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28539,(0),null);
var tooltip_def = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28539,(1),null);
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null));
var tx_data = new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.Keyword("vl","tooltip","vl/tooltip",-1809678764),tooltip_def], null)], null);
var new_ds_db = clj_yavl.db.with$(ds_db,tx_data);
return clj_yavl.events.sync_config_from_db(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","ds-db","clj-yavl.core/ds-db",-1126598866)], null),new_ds_db));
});
re_frame.core.reg_event_fx.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset-list","clj-yavl.events/fetch-dataset-list",-102456322),(function (p__28542,_){
var map__28543 = p__28542;
var map__28543__$1 = cljs.core.__destructure_map(map__28543);
var db = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__28543__$1,new cljs.core.Keyword(null,"db","db",993250759));
return new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword("promise","fetch","promise/fetch",-566993641),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"url","url",276297046),"https://cdn.jsdelivr.net/npm/vega-datasets/datapackage.json",new cljs.core.Keyword(null,"on-success","on-success",1786904109),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.events","fetch-dataset-list-success","clj-yavl.events/fetch-dataset-list-success",2050007072)], null),new cljs.core.Keyword(null,"on-failure","on-failure",842888245),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.events","fetch-dataset-list-failure","clj-yavl.events/fetch-dataset-list-failure",-1546174671)], null)], null)], null);
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset-list-success","clj-yavl.events/fetch-dataset-list-success",2050007072),(function (db,p__28544){
var vec__28545 = p__28544;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28545,(0),null);
var datapackage = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28545,(1),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-list","dataset-list",683219302)], null),new cljs.core.Keyword(null,"resources","resources",1632806811).cljs$core$IFn$_invoke$arity$1(datapackage));
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.events","fetch-dataset-list-failure","clj-yavl.events/fetch-dataset-list-failure",-1546174671),(function (db,p__28548){
var vec__28549 = p__28548;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28549,(0),null);
var err = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__28549,(1),null);
console.error("Failed to fetch dataset list:",err);

return db;
}));

//# sourceMappingURL=clj_yavl.events.js.map
