goog.provide('clj_yavl.core');
clj_yavl.core.default_config_json = "{\n  \"$schema\": \"https://vega.github.io/schema/vega-lite/v5.json\",\n  \"mark\": \"bar\",\n  \"encoding\": {\n    \"x\": {\"field\": \"col1\", \"type\": \"ordinal\"},\n    \"y\": {\"field\": \"col2\", \"type\": \"quantitative\"}\n  }\n}";
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.core","initialize","clj-yavl.core/initialize",-983833994),(function (db,_){
var user_input_exists_QMARK_ = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null));
var component_state_exists_QMARK_ = new cljs.core.Keyword("clj-yavl.core","vega-lite","clj-yavl.core/vega-lite",943809627).cljs$core$IFn$_invoke$arity$1(db);
var unit_specs_exists_QMARK_ = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null));
var G__26707 = db;
var G__26707__$1 = ((cljs.core.not(user_input_exists_QMARK_))?cljs.core.assoc_in(G__26707,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"saved-configs","saved-configs",1634320315),cljs.core.PersistentArrayMap.EMPTY,new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword("clj-yavl.core","data-input","clj-yavl.core/data-input",611355071),"",new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655),clj_yavl.core.default_config_json,new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340),new cljs.core.Keyword(null,"json","json",1279968570),new cljs.core.Keyword("clj-yavl.core","active-config-name","clj-yavl.core/active-config-name",-1939900428),null], null)], null)):G__26707);
var G__26707__$2 = ((cljs.core.not(component_state_exists_QMARK_))?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__26707__$1,new cljs.core.Keyword("clj-yavl.core","vega-lite","clj-yavl.core/vega-lite",943809627),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword("clj-yavl.core","format","clj-yavl.core/format",1360929541),new cljs.core.Keyword(null,"csv","csv",-1164440893),new cljs.core.Keyword("clj-yavl.core","structure","clj-yavl.core/structure",-30773006),new cljs.core.Keyword(null,"columnar","columnar",-1122999701),new cljs.core.Keyword("clj-yavl.core","parsed-data","clj-yavl.core/parsed-data",-1560578265),null,new cljs.core.Keyword("clj-yavl.core","inferred-schema","clj-yavl.core/inferred-schema",-1109150020),null,new cljs.core.Keyword("clj-yavl.core","active-left-tab","clj-yavl.core/active-left-tab",1685289502),new cljs.core.Keyword(null,"config","config",994861415)], null)):G__26707__$1);
if(cljs.core.not(unit_specs_exists_QMARK_)){
return cljs.core.assoc_in(G__26707__$2,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null),cljs.core.PersistentArrayMap.EMPTY);
} else {
return G__26707__$2;
}
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.core","init-unit-spec","clj-yavl.core/init-unit-spec",1162580207),(function (db,p__26709){
var vec__26710 = p__26709;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26710,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26710,(1),null);
var type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26710,(2),null);
var initial_input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26710,(3),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"type","type",1174270348),type,new cljs.core.Keyword(null,"input","input",556931961),(function (){var or__5025__auto__ = initial_input;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return cljs.core.PersistentArrayMap.EMPTY;
}
})()], null));
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.core","remove-unit-spec","clj-yavl.core/remove-unit-spec",1592748458),(function (db,p__26713){
var vec__26714 = p__26713;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26714,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26714,(1),null);
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$4(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null),cljs.core.dissoc,id);
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.core","update-unit-spec-input","clj-yavl.core/update-unit-spec-input",-399356259),(function (db,p__26717){
var vec__26718 = p__26717;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26718,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26718,(1),null);
var field = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26718,(2),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26718,(3),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id,new cljs.core.Keyword(null,"input","input",556931961),field], null),value);
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.core","set-unit-spec-input","clj-yavl.core/set-unit-spec-input",-1334878341),(function (db,p__26722){
var vec__26723 = p__26722;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26723,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26723,(1),null);
var input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26723,(2),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id,new cljs.core.Keyword(null,"input","input",556931961)], null),input);
}));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword("clj-yavl.core","unit-spec-ids","clj-yavl.core/unit-spec-ids",-421205412),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([(function (db,_){
return cljs.core.keys(cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null)));
})], 0));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword("clj-yavl.core","unit-spec","clj-yavl.core/unit-spec",1025140806),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([(function (db,p__26726){
var vec__26727 = p__26726;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26727,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26727,(1),null);
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id], null));
})], 0));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword("clj-yavl.core","all-unit-specs","clj-yavl.core/all-unit-specs",-934631024),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([(function (db,_){
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null));
})], 0));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword("clj-yavl.core","compiled-unit-spec","clj-yavl.core/compiled-unit-spec",1828988733),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([(function (p__26730){
var vec__26731 = p__26730;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26731,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26731,(1),null);
return re_frame.core.subscribe.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","unit-spec","clj-yavl.core/unit-spec",1025140806),id], null));
}),(function (spec,_){
if(cljs.core.truth_(spec)){
var map__26734 = spec;
var map__26734__$1 = cljs.core.__destructure_map(map__26734);
var type = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26734__$1,new cljs.core.Keyword(null,"type","type",1174270348));
var input = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__26734__$1,new cljs.core.Keyword(null,"input","input",556931961));
try{return clj_yavl.presets.unit_spec.cljs$core$IFn$_invoke$arity$1(cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(input,new cljs.core.Keyword(null,"type","type",1174270348),type));
}catch (e26736){var e = e26736;
return new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"error","error",-978969032),["Error compiling spec: ",cljs.core.str.cljs$core$IFn$_invoke$arity$1(e)].join('')], null);
}} else {
return null;
}
})], 0));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword("clj-yavl.core","user-input-root","clj-yavl.core/user-input-root",-1219968985),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([(function (db,_){
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
})], 0));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"<-","<-",760412998),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","user-input-root","clj-yavl.core/user-input-root",-1219968985)], null),(function (root){
return new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(root);
})], 0));
re_frame.core.reg_sub.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340),cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"<-","<-",760412998),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","user-input-root","clj-yavl.core/user-input-root",-1219968985)], null),(function (root){
return new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(root);
})], 0));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.core","set-config-input","clj-yavl.core/set-config-input",-1452929027),(function (db,p__26737){
var vec__26738 = p__26737;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26738,(0),null);
var val = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26738,(1),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),val);
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.core","set-config-mode","clj-yavl.core/set-config-mode",1485068687),(function (db,p__26741){
var vec__26742 = p__26741;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26742,(0),null);
var new_mode = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__26742,(1),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var current_mode = new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340).cljs$core$IFn$_invoke$arity$1(user_input);
var current_input = new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655).cljs$core$IFn$_invoke$arity$1(user_input);
var new_input = ((((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(current_mode,new cljs.core.Keyword(null,"json","json",1279968570))) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new_mode,new cljs.core.Keyword(null,"edn","edn",1317840885)))))?(function (){try{var obj = JSON.parse(current_input);
var edn_data = cljs.core.js__GT_clj.cljs$core$IFn$_invoke$arity$variadic(obj,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"keywordize-keys","keywordize-keys",1310784252),true], 0));
var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__26747_26761 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__26748_26762 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__26749_26763 = true;
var _STAR_print_fn_STAR__temp_val__26750_26764 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__26749_26763);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__26750_26764);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(edn_data);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__26748_26762);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__26747_26761);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
}catch (e26746){if((e26746 instanceof Error)){
var ___$1 = e26746;
return current_input;
} else {
throw e26746;

}
}})():((((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(current_mode,new cljs.core.Keyword(null,"edn","edn",1317840885))) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new_mode,new cljs.core.Keyword(null,"json","json",1279968570)))))?(function (){try{var edn_data = clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(current_input);
var obj = cljs.core.clj__GT_js(edn_data);
return JSON.stringify(obj,null,(2));
}catch (e26752){if((e26752 instanceof Error)){
var ___$1 = e26752;
return current_input;
} else {
throw e26752;

}
}})():current_input
));
return cljs.core.assoc_in(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340)], null),new_mode),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null),new_input);
}));
clj_yavl.core.main_view = (function clj_yavl$core$main_view(){
var config_input = cljs.core.deref(re_frame.core.subscribe.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","config-input","clj-yavl.core/config-input",1110176655)], null)));
var config_mode = cljs.core.deref(re_frame.core.subscribe.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","config-mode","clj-yavl.core/config-mode",-1919291340)], null)));
return new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"flex h-screen w-screen overflow-hidden"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"w-1/2 h-full border-r border-gray-700 flex flex-col bg-[#1e1e1e]"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"flex items-center justify-between p-2 bg-[#2d2d2d] border-b border-gray-700 text-gray-300"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"span","span",1394872991),"Vega-Lite Configuration"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"flex space-x-2 text-xs"], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"label","label",1718410804),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"cursor-pointer flex items-center space-x-1"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"input","input",556931961),new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"type","type",1174270348),"radio",new cljs.core.Keyword(null,"name","name",1843675177),"mode",new cljs.core.Keyword(null,"checked","checked",-50955819),cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(config_mode,new cljs.core.Keyword(null,"json","json",1279968570)),new cljs.core.Keyword(null,"on-change","on-change",-732046149),(function (){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","set-config-mode","clj-yavl.core/set-config-mode",1485068687),new cljs.core.Keyword(null,"json","json",1279968570)], null));
})], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"span","span",1394872991),"JSON"], null)], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"label","label",1718410804),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"cursor-pointer flex items-center space-x-1"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"input","input",556931961),new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"type","type",1174270348),"radio",new cljs.core.Keyword(null,"name","name",1843675177),"mode",new cljs.core.Keyword(null,"checked","checked",-50955819),cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(config_mode,new cljs.core.Keyword(null,"edn","edn",1317840885)),new cljs.core.Keyword(null,"on-change","on-change",-732046149),(function (){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","set-config-mode","clj-yavl.core/set-config-mode",1485068687),new cljs.core.Keyword(null,"edn","edn",1317840885)], null));
})], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"span","span",1394872991),"EDN"], null)], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"flex-grow relative"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bb_web_ds_tools.components.editor.monaco_editor,new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"value","value",305978217),config_input,new cljs.core.Keyword(null,"language","language",-1591107564),((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(config_mode,new cljs.core.Keyword(null,"json","json",1279968570)))?"json":"clojure"),new cljs.core.Keyword(null,"options","options",99638489),new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"fontSize","fontSize",919623033),(15),new cljs.core.Keyword(null,"fontFamily","fontFamily",1493518353),"monospace",new cljs.core.Keyword(null,"rulers","rulers",756731282),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [(80)], null),new cljs.core.Keyword(null,"minimap","minimap",-1428643929),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"enabled","enabled",1195909756),false], null)], null),new cljs.core.Keyword(null,"on-change","on-change",-732046149),(function (p1__26753_SHARP_){
return re_frame.core.dispatch(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","set-config-input","clj-yavl.core/set-config-input",-1452929027),p1__26753_SHARP_], null));
})], null)], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"div","div",1057191632),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"class","class",-2030961996),"w-1/2 h-full bg-white"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"iframe","iframe",884422026),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"src","src",-1651076051),"http://localhost:5678",new cljs.core.Keyword(null,"class","class",-2030961996),"w-full h-full border-none"], null)], null)], null)], null);
});
if((typeof clj_yavl !== 'undefined') && (typeof clj_yavl.core !== 'undefined') && (typeof clj_yavl.core.react_root !== 'undefined')){
} else {
clj_yavl.core.react_root = reagent.dom.client.create_root.cljs$core$IFn$_invoke$arity$1(document.getElementById("app"));
}
clj_yavl.core.run = (function clj_yavl$core$run(){
return reagent.dom.client.render.cljs$core$IFn$_invoke$arity$2(clj_yavl.core.react_root,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [clj_yavl.core.main_view], null));
});
clj_yavl.core.init = (function clj_yavl$core$init(){
re_frame.core.dispatch_sync(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.core","initialize","clj-yavl.core/initialize",-983833994)], null));

return clj_yavl.core.run();
});
goog.exportSymbol('clj_yavl.core.init', clj_yavl.core.init);

//# sourceMappingURL=clj_yavl.core.js.map
