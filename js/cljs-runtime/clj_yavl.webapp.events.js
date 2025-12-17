goog.provide('clj_yavl.webapp.events');
var module$node_modules$papaparse$papaparse_min=shadow.js.require("module$node_modules$papaparse$papaparse_min", {});
clj_yavl.webapp.events.default_config_json = "{\n  \"$schema\": \"https://vega.github.io/schema/vega-lite/v5.json\",\n  \"mark\": \"bar\",\n  \"encoding\": {\n    \"x\": {\"field\": \"col1\", \"type\": \"ordinal\"},\n    \"y\": {\"field\": \"col2\", \"type\": \"quantitative\"}\n  }\n}";
clj_yavl.webapp.events.init_default_state = (function clj_yavl$webapp$events$init_default_state(ds_db){
return new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.PersistentArrayMap(null, 4, [new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"saved-configs","saved-configs",1634320315),cljs.core.PersistentArrayMap.EMPTY,new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword("clj-yavl.webapp.core","data-input","clj-yavl.webapp.core/data-input",1892315512),"",new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242),clj_yavl.webapp.events.default_config_json,new cljs.core.Keyword("clj-yavl.webapp.core","config-mode","clj-yavl.webapp.core/config-mode",-633336151),new cljs.core.Keyword(null,"json","json",1279968570),new cljs.core.Keyword("clj-yavl.webapp.core","active-config-name","clj-yavl.webapp.core/active-config-name",-1141565125),null,new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647),ds_db], null)], null),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"preset-key","preset-key",-1148349698),new cljs.core.Keyword(null,"xyplot","xyplot",-1505772843),new cljs.core.Keyword(null,"opts","opts",155075701),cljs.core.PersistentArrayMap.EMPTY], null),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),cljs.core.PersistentArrayMap.EMPTY,new cljs.core.Keyword(null,"dataset-list","dataset-list",683219302),cljs.core.PersistentVector.EMPTY], null),new cljs.core.Keyword("clj-yavl.webapp.core","vega-lite","clj-yavl.webapp.core/vega-lite",-403239022),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword("clj-yavl.webapp.core","format","clj-yavl.webapp.core/format",-541080402),new cljs.core.Keyword(null,"csv","csv",-1164440893),new cljs.core.Keyword("clj-yavl.webapp.core","structure","clj-yavl.webapp.core/structure",-1904456841),new cljs.core.Keyword(null,"columnar","columnar",-1122999701),new cljs.core.Keyword("clj-yavl.webapp.core","parsed-data","clj-yavl.webapp.core/parsed-data",-292710752),null,new cljs.core.Keyword("clj-yavl.webapp.core","inferred-schema","clj-yavl.webapp.core/inferred-schema",252548413),null,new cljs.core.Keyword("clj-yavl.webapp.core","active-left-tab","clj-yavl.webapp.core/active-left-tab",-790503339),new cljs.core.Keyword(null,"config","config",994861415)], null)], null);
});
clj_yavl.webapp.events.initialize_db = (function clj_yavl$webapp$events$initialize_db(db,_){
var ds_conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
var default_config = clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(clj_yavl.webapp.events.default_config_json,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
var ___$1 = clj_yavl.db.transact(ds_conn,clj_yavl.db.config__GT_tx_data("default",default_config));
var ds_db = cljs.core.deref(ds_conn);
if(cljs.core.empty_QMARK_(db)){
return clj_yavl.webapp.events.init_default_state(ds_db);
} else {
var G__29683 = db;
var G__29683__$1 = ((cljs.core.not(cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null))))?cljs.core.assoc_in(G__29683,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null),cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(clj_yavl.webapp.events.init_default_state(ds_db),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770)], null))):G__29683);
var G__29683__$2 = ((cljs.core.not(cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835)], null))))?cljs.core.assoc_in(G__29683__$1,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835)], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"preset-key","preset-key",-1148349698),new cljs.core.Keyword(null,"xyplot","xyplot",-1505772843),new cljs.core.Keyword(null,"opts","opts",155075701),cljs.core.PersistentArrayMap.EMPTY], null)):G__29683__$1);
var G__29683__$3 = ((cljs.core.not(new cljs.core.Keyword("clj-yavl.webapp.core","vega-lite","clj-yavl.webapp.core/vega-lite",-403239022).cljs$core$IFn$_invoke$arity$1(db)))?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(G__29683__$2,new cljs.core.Keyword("clj-yavl.webapp.core","vega-lite","clj-yavl.webapp.core/vega-lite",-403239022),new cljs.core.PersistentArrayMap(null, 5, [new cljs.core.Keyword("clj-yavl.webapp.core","format","clj-yavl.webapp.core/format",-541080402),new cljs.core.Keyword(null,"csv","csv",-1164440893),new cljs.core.Keyword("clj-yavl.webapp.core","structure","clj-yavl.webapp.core/structure",-1904456841),new cljs.core.Keyword(null,"columnar","columnar",-1122999701),new cljs.core.Keyword("clj-yavl.webapp.core","parsed-data","clj-yavl.webapp.core/parsed-data",-292710752),null,new cljs.core.Keyword("clj-yavl.webapp.core","inferred-schema","clj-yavl.webapp.core/inferred-schema",252548413),null,new cljs.core.Keyword("clj-yavl.webapp.core","active-left-tab","clj-yavl.webapp.core/active-left-tab",-790503339),new cljs.core.Keyword(null,"config","config",994861415)], null)):G__29683__$2);
var G__29683__$4 = ((cljs.core.not(cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null))))?cljs.core.assoc_in(G__29683__$3,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null),cljs.core.PersistentArrayMap.EMPTY):G__29683__$3);
if(cljs.core.not(cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-list","dataset-list",683219302)], null)))){
return cljs.core.assoc_in(G__29683__$4,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-list","dataset-list",683219302)], null),cljs.core.PersistentVector.EMPTY);
} else {
return G__29683__$4;
}
}
});
clj_yavl.webapp.events.sync_config_BANG_ = (function clj_yavl$webapp$events$sync_config_BANG_(db){
var opts = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835),new cljs.core.Keyword(null,"opts","opts",155075701)], null));
var preset_key = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835),new cljs.core.Keyword(null,"preset-key","preset-key",-1148349698)], null));
var schema = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.core","vega-lite","clj-yavl.webapp.core/vega-lite",-403239022),new cljs.core.Keyword("clj-yavl.webapp.core","inferred-schema","clj-yavl.webapp.core/inferred-schema",252548413)], null));
var spec = clj_yavl.presets.unit_spec.cljs$core$IFn$_invoke$arity$1(cljs.core.assoc.cljs$core$IFn$_invoke$arity$variadic(opts,new cljs.core.Keyword(null,"type","type",1174270348),preset_key,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([new cljs.core.Keyword(null,"data-schema","data-schema",981553358),schema], 0)));
var json_str = clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(spec,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null));
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242)], null),json_str);
});
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","set-ui-preset","clj-yavl.webapp.events/set-ui-preset",-407641133),(function (db,p__29685){
var vec__29686 = p__29685;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29686,(0),null);
var preset = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29686,(1),null);
return clj_yavl.webapp.events.sync_config_BANG_(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835),new cljs.core.Keyword(null,"preset-key","preset-key",-1148349698)], null),preset));
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","update-ui-option","clj-yavl.webapp.events/update-ui-option",-1198388941),(function (db,p__29694){
var vec__29695 = p__29694;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29695,(0),null);
var arg = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29695,(1),null);
var prop = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29695,(2),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29695,(3),null);
return clj_yavl.webapp.events.sync_config_BANG_(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835),new cljs.core.Keyword(null,"opts","opts",155075701),arg,prop], null),value));
}));
if((typeof clj_yavl !== 'undefined') && (typeof clj_yavl.webapp !== 'undefined') && (typeof clj_yavl.webapp.events !== 'undefined') && (typeof clj_yavl.webapp.events.debug_atom !== 'undefined')){
} else {
clj_yavl.webapp.events.debug_atom = cljs.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
}
clj_yavl.webapp.events.entry_def__GT_type = (function clj_yavl$webapp$events$entry_def__GT_type(x){
var entry_type = cljs.core.last(x);
var field_type = malli.core.type.cljs$core$IFn$_invoke$arity$1(entry_type);
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(field_type,new cljs.core.Keyword(null,"maybe","maybe",-314397560))){
return malli.core.type.cljs$core$IFn$_invoke$arity$1(cljs.core.first(malli.core.children.cljs$core$IFn$_invoke$arity$1(entry_type)));
} else {
return field_type;
}
});
clj_yavl.webapp.events.get_vega_type = (function clj_yavl$webapp$events$get_vega_type(m_type){
var G__29702 = m_type;
var G__29702__$1 = (((G__29702 instanceof cljs.core.Keyword))?G__29702.fqn:null);
switch (G__29702__$1) {
case "int":
return "quantitative";

break;
case "double":
return "quantitative";

break;
case "string":
return "nominal";

break;
case "boolean":
return "nominal";

break;
case "inst":
return "temporal";

break;
case "enum":
return "nominal";

break;
default:
return "nominal";

}
});
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","update-field-selection","clj-yavl.webapp.events/update-field-selection",710299709),(function (db,p__29704){
var vec__29705 = p__29704;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29705,(0),null);
var arg = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29705,(1),null);
var prop = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29705,(2),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29705,(3),null);
var schema = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.core","vega-lite","clj-yavl.webapp.core/vega-lite",-403239022),new cljs.core.Keyword("clj-yavl.webapp.core","inferred-schema","clj-yavl.webapp.core/inferred-schema",252548413)], null));
var m_type = (cljs.core.truth_(schema)?(function (){var field_spec = cljs.core.first(cljs.core.filter.cljs$core$IFn$_invoke$arity$2((function (p1__29703_SHARP_){
return cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.name(cljs.core.first(p1__29703_SHARP_)),value);
}),malli.core.children.cljs$core$IFn$_invoke$arity$1(malli.core.schema.cljs$core$IFn$_invoke$arity$1(schema))));
cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(clj_yavl.webapp.events.debug_atom,cljs.core.assoc,new cljs.core.Keyword(null,"field-spec","field-spec",-736426112),field_spec);

return clj_yavl.webapp.events.entry_def__GT_type(field_spec);
})():null);
var vega_type = clj_yavl.webapp.events.get_vega_type(m_type);
return clj_yavl.webapp.events.sync_config_BANG_(cljs.core.assoc_in(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835),new cljs.core.Keyword(null,"opts","opts",155075701),arg,prop], null),value),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"ui-builder","ui-builder",1158231835),new cljs.core.Keyword(null,"opts","opts",155075701),arg,new cljs.core.Keyword(null,"type","type",1174270348)], null),vega_type));
}));
clj_yavl.webapp.events.init_unit_spec = (function clj_yavl$webapp$events$init_unit_spec(db,p__29708){
var vec__29709 = p__29708;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29709,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29709,(1),null);
var type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29709,(2),null);
var initial_input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29709,(3),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"type","type",1174270348),type,new cljs.core.Keyword(null,"input","input",556931961),(function (){var or__5025__auto__ = initial_input;
if(cljs.core.truth_(or__5025__auto__)){
return or__5025__auto__;
} else {
return cljs.core.PersistentArrayMap.EMPTY;
}
})()], null));
});
clj_yavl.webapp.events.remove_unit_spec = (function clj_yavl$webapp$events$remove_unit_spec(db,p__29712){
var vec__29713 = p__29712;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29713,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29713,(1),null);
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$4(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085)], null),cljs.core.dissoc,id);
});
clj_yavl.webapp.events.update_unit_spec_input = (function clj_yavl$webapp$events$update_unit_spec_input(db,p__29719){
var vec__29720 = p__29719;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29720,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29720,(1),null);
var field = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29720,(2),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29720,(3),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id,new cljs.core.Keyword(null,"input","input",556931961),field], null),value);
});
clj_yavl.webapp.events.set_unit_spec_input = (function clj_yavl$webapp$events$set_unit_spec_input(db,p__29723){
var vec__29724 = p__29723;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29724,(0),null);
var id = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29724,(1),null);
var input = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29724,(2),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"unit-specs","unit-specs",-530655085),id,new cljs.core.Keyword(null,"input","input",556931961)], null),input);
});
clj_yavl.webapp.events.parse_input = (function clj_yavl$webapp$events$parse_input(val,mode){
try{if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570))){
return clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(val,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null));
} else {
return clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(val);
}
}catch (e29727){var _ = e29727;
return null;
}});
clj_yavl.webapp.events.update_ds_with_config = (function clj_yavl$webapp$events$update_ds_with_config(db,config){
return cljs.core.update_in.cljs$core$IFn$_invoke$arity$3(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647)], null),(function (old_db){
var conn = clj_yavl.db.init_db.cljs$core$IFn$_invoke$arity$0();
clj_yavl.db.transact(conn,clj_yavl.db.config__GT_tx_data("default",config));

return cljs.core.deref(conn);
}));
});
clj_yavl.webapp.events.set_config_input = (function clj_yavl$webapp$events$set_config_input(db,p__29732){
var vec__29733 = p__29732;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29733,(0),null);
var val = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29733,(1),null);
var mode = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-mode","clj-yavl.webapp.core/config-mode",-633336151)], null));
var parsed = clj_yavl.webapp.events.parse_input(val,mode);
var G__29736 = cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242)], null),val);
if(cljs.core.truth_(parsed)){
return clj_yavl.webapp.events.update_ds_with_config(G__29736,parsed);
} else {
return G__29736;
}
});
clj_yavl.webapp.events.convert_input = (function clj_yavl$webapp$events$convert_input(input,current_mode,new_mode){
if(((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(current_mode,new cljs.core.Keyword(null,"json","json",1279968570))) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new_mode,new cljs.core.Keyword(null,"edn","edn",1317840885))))){
try{var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__29739_29847 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__29740_29848 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__29741_29849 = true;
var _STAR_print_fn_STAR__temp_val__29742_29850 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__29741_29849);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__29742_29850);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(clj_yavl.io.read_json_str.cljs$core$IFn$_invoke$arity$2(input,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"key-fn","key-fn",-636154479),cljs.core.keyword], null)));
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__29740_29848);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__29739_29847);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
}catch (e29738){var _ = e29738;
return input;
}} else {
if(((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(current_mode,new cljs.core.Keyword(null,"edn","edn",1317840885))) && (cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(new_mode,new cljs.core.Keyword(null,"json","json",1279968570))))){
try{return clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(input),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null));
}catch (e29747){var _ = e29747;
return input;
}} else {
return input;

}
}
});
clj_yavl.webapp.events.set_config_mode = (function clj_yavl$webapp$events$set_config_mode(db,p__29748){
var vec__29749 = p__29748;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29749,(0),null);
var new_mode = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29749,(1),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var current_mode = new cljs.core.Keyword("clj-yavl.webapp.core","config-mode","clj-yavl.webapp.core/config-mode",-633336151).cljs$core$IFn$_invoke$arity$1(user_input);
var current_input = new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242).cljs$core$IFn$_invoke$arity$1(user_input);
var new_input = clj_yavl.webapp.events.convert_input(current_input,current_mode,new_mode);
return cljs.core.assoc_in(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-mode","clj-yavl.webapp.core/config-mode",-633336151)], null),new_mode),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242)], null),new_input);
});
clj_yavl.webapp.events.set_top_level_prop = (function clj_yavl$webapp$events$set_top_level_prop(db,p__29752){
var vec__29753 = p__29752;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29753,(0),null);
var prop_key = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29753,(1),null);
var value = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29753,(2),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var mode = new cljs.core.Keyword("clj-yavl.webapp.core","config-mode","clj-yavl.webapp.core/config-mode",-633336151).cljs$core$IFn$_invoke$arity$1(user_input);
var input = new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242).cljs$core$IFn$_invoke$arity$1(user_input);
try{var parsed = clj_yavl.webapp.events.parse_input(input,mode);
var updated = cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(parsed,prop_key,value);
var new_input = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(updated,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null)):(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__29761_29855 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__29762_29856 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__29763_29857 = true;
var _STAR_print_fn_STAR__temp_val__29764_29858 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__29763_29857);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__29764_29858);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(updated);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__29762_29856);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__29761_29855);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})());
return clj_yavl.webapp.events.update_ds_with_config(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242)], null),new_input),updated);
}catch (e29760){var ___$1 = e29760;
return db;
}});
/**
 * Helper to update text config from DS.
 */
clj_yavl.webapp.events.sync_config_from_db = (function clj_yavl$webapp$events$sync_config_from_db(db){
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647)], null));
var config = clj_yavl.db.pull_config(ds_db,"default");
var mode = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-mode","clj-yavl.webapp.core/config-mode",-633336151)], null));
var new_input = ((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(config,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null)):(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__29765_29865 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__29766_29866 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__29767_29867 = true;
var _STAR_print_fn_STAR__temp_val__29768_29868 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__29767_29867);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__29768_29868);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(config);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__29766_29866);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__29765_29865);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})());
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242)], null),new_input);
});
clj_yavl.webapp.events.update_mark = (function clj_yavl$webapp$events$update_mark(db,p__29769){
var vec__29770 = p__29769;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29770,(0),null);
var mark_type = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29770,(1),null);
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647)], null));
var mark_eid = cljs.core.ffirst(clj_yavl.db.q(new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"find","find",496279456),new cljs.core.Symbol(null,"?e","?e",-1194391683,null),new cljs.core.Keyword(null,"where","where",-2044795965),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","mark","vl/mark",-373754579),new cljs.core.Symbol(null,"?e","?e",-1194391683,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null)], null),ds_db));
var tx_data = (cljs.core.truth_(mark_eid)?new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),mark_eid,new cljs.core.Keyword("mark","type","mark/type",1170405465),mark_type], null)], null):(function (){var new_mark_id = (-1);
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.Keyword("vl","mark","vl/mark",-373754579),new_mark_id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_mark_id,new cljs.core.Keyword("mark","type","mark/type",1170405465),mark_type], null)], null);
})());
var new_ds_db = clj_yavl.db.with$(ds_db,tx_data);
return clj_yavl.webapp.events.sync_config_from_db(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647)], null),new_ds_db));
});
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","set-dataset-url-input","clj-yavl.webapp.events/set-dataset-url-input",-1466262365),(function (db,p__29773){
var vec__29774 = p__29773;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29774,(0),null);
var val = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29774,(1),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-url-input","dataset-url-input",-505073218)], null),val);
}));
re_frame.core.reg_event_fx.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset","clj-yavl.webapp.events/fetch-dataset",-1322722237),(function (p__29777,p__29778){
var map__29779 = p__29777;
var map__29779__$1 = cljs.core.__destructure_map(map__29779);
var db = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29779__$1,new cljs.core.Keyword(null,"db","db",993250759));
var vec__29780 = p__29778;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29780,(0),null);
var url = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29780,(1),null);
return new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword("promise","fetch","promise/fetch",-566993641),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"url","url",276297046),url,new cljs.core.Keyword(null,"on-success","on-success",1786904109),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-success","clj-yavl.webapp.events/fetch-dataset-success",846326135)], null),new cljs.core.Keyword(null,"on-failure","on-failure",842888245),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-failure","clj-yavl.webapp.events/fetch-dataset-failure",-1446539724)], null)], null)], null);
}));
clj_yavl.webapp.events.process_fetched_data = (function clj_yavl$webapp$events$process_fetched_data(parsed,data,mode){
var updated = (cljs.core.truth_(parsed)?cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(parsed,new cljs.core.Keyword(null,"data","data",-232669377),new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"values","values",372645556),data], null)):null);
var inferred_schema = ((((cljs.core.seq(data)) && (cljs.core.map_QMARK_(cljs.core.first(data)))))?(function (){var result = bb_web_ds_tools.components.malli.infer_schema.cljs$core$IFn$_invoke$arity$1(data);
if(cljs.core.truth_(new cljs.core.Keyword(null,"success","success",1890645906).cljs$core$IFn$_invoke$arity$1(result))){
return clojure.edn.read_string.cljs$core$IFn$_invoke$arity$1(new cljs.core.Keyword(null,"schema-str","schema-str",-1744815373).cljs$core$IFn$_invoke$arity$1(result));
} else {
return null;
}
})():null);
var new_input = (cljs.core.truth_(updated)?((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(mode,new cljs.core.Keyword(null,"json","json",1279968570)))?clj_yavl.io.write_json_str.cljs$core$IFn$_invoke$arity$2(updated,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"indent","indent",-148200125),(2)], null)):(function (){var sb__5670__auto__ = (new goog.string.StringBuffer());
var _STAR_print_newline_STAR__orig_val__29783_29874 = cljs.core._STAR_print_newline_STAR_;
var _STAR_print_fn_STAR__orig_val__29784_29875 = cljs.core._STAR_print_fn_STAR_;
var _STAR_print_newline_STAR__temp_val__29785_29876 = true;
var _STAR_print_fn_STAR__temp_val__29786_29877 = (function (x__5671__auto__){
return sb__5670__auto__.append(x__5671__auto__);
});
(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__temp_val__29785_29876);

(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__temp_val__29786_29877);

try{cljs.pprint.pprint.cljs$core$IFn$_invoke$arity$1(updated);
}finally {(cljs.core._STAR_print_fn_STAR_ = _STAR_print_fn_STAR__orig_val__29784_29875);

(cljs.core._STAR_print_newline_STAR_ = _STAR_print_newline_STAR__orig_val__29783_29874);
}
return cljs.core.str.cljs$core$IFn$_invoke$arity$1(sb__5670__auto__);
})()):null);
return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"new-input","new-input",15064960),new_input,new cljs.core.Keyword(null,"inferred-schema","inferred-schema",1558411545),inferred_schema,new cljs.core.Keyword(null,"updated","updated",-1627192056),updated], null);
});
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-success","clj-yavl.webapp.events/fetch-dataset-success",846326135),(function (db,p__29787){
var vec__29788 = p__29787;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29788,(0),null);
var data = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29788,(1),null);
var user_input = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328)], null));
var mode = new cljs.core.Keyword("clj-yavl.webapp.core","config-mode","clj-yavl.webapp.core/config-mode",-633336151).cljs$core$IFn$_invoke$arity$1(user_input);
var input = new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242).cljs$core$IFn$_invoke$arity$1(user_input);
var parsed = clj_yavl.webapp.events.parse_input(input,mode);
var map__29791 = clj_yavl.webapp.events.process_fetched_data(parsed,data,mode);
var map__29791__$1 = cljs.core.__destructure_map(map__29791);
var new_input = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29791__$1,new cljs.core.Keyword(null,"new-input","new-input",15064960));
var inferred_schema = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29791__$1,new cljs.core.Keyword(null,"inferred-schema","inferred-schema",1558411545));
var updated = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29791__$1,new cljs.core.Keyword(null,"updated","updated",-1627192056));
if(cljs.core.truth_(new_input)){
return clj_yavl.webapp.events.update_ds_with_config(cljs.core.assoc_in(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","config-input","clj-yavl.webapp.core/config-input",1834324242)], null),new_input),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.core","vega-lite","clj-yavl.webapp.core/vega-lite",-403239022),new cljs.core.Keyword("clj-yavl.webapp.core","inferred-schema","clj-yavl.webapp.core/inferred-schema",252548413)], null),inferred_schema),updated);
} else {
return db;
}
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-failure","clj-yavl.webapp.events/fetch-dataset-failure",-1446539724),(function (db,p__29792){
var vec__29793 = p__29792;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29793,(0),null);
var err = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29793,(1),null);
console.error("Failed to fetch dataset:",err);

return db;
}));
re_frame.core.reg_fx(new cljs.core.Keyword("promise","fetch","promise/fetch",-566993641),(function (p__29796){
var map__29797 = p__29796;
var map__29797__$1 = cljs.core.__destructure_map(map__29797);
var url = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29797__$1,new cljs.core.Keyword(null,"url","url",276297046));
var on_success = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29797__$1,new cljs.core.Keyword(null,"on-success","on-success",1786904109));
var on_failure = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29797__$1,new cljs.core.Keyword(null,"on-failure","on-failure",842888245));
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
clj_yavl.webapp.events.create_channel_tx = (function clj_yavl$webapp$events$create_channel_tx(ds_db,channel,field){
var channel_eid = cljs.core.ffirst(clj_yavl.db.q.cljs$core$IFn$_invoke$arity$variadic(new cljs.core.PersistentVector(null, 10, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"find","find",496279456),new cljs.core.Symbol(null,"?c","?c",870679775,null),new cljs.core.Keyword(null,"in","in",-1531184865),new cljs.core.Symbol(null,"$","$",-1580747756,null),new cljs.core.Symbol(null,"?channel-name","?channel-name",-1729442583,null),new cljs.core.Keyword(null,"where","where",-2044795965),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","encoding","vl/encoding",1728582698),new cljs.core.Symbol(null,"?enc","?enc",523306083,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?enc","?enc",523306083,null),new cljs.core.Keyword("encoding","channels","encoding/channels",-578464551),new cljs.core.Symbol(null,"?c","?c",870679775,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?c","?c",870679775,null),new cljs.core.Keyword("channel","name","channel/name",-1177043666),new cljs.core.Symbol(null,"?channel-name","?channel-name",-1729442583,null)], null)], null),ds_db,cljs.core.prim_seq.cljs$core$IFn$_invoke$arity$2([cljs.core.name(channel)], 0)));
if(cljs.core.truth_(channel_eid)){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),channel_eid,new cljs.core.Keyword("channel","field","channel/field",107679349),field], null)], null);
} else {
var enc_eid = cljs.core.ffirst(clj_yavl.db.q(new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"find","find",496279456),new cljs.core.Symbol(null,"?e","?e",-1194391683,null),new cljs.core.Keyword(null,"where","where",-2044795965),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","encoding","vl/encoding",1728582698),new cljs.core.Symbol(null,"?e","?e",-1194391683,null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Symbol(null,"?root","?root",892945137,null),new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null)], null),ds_db));
var new_chan_id = (-1);
if(cljs.core.truth_(enc_eid)){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),enc_eid,new cljs.core.Keyword("encoding","channels","encoding/channels",-578464551),new_chan_id], null),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_chan_id,new cljs.core.Keyword("channel","name","channel/name",-1177043666),cljs.core.name(channel),new cljs.core.Keyword("channel","field","channel/field",107679349),field], null)], null);
} else {
var new_enc_id = (-2);
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.Keyword("vl","encoding","vl/encoding",1728582698),new_enc_id], null),new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_enc_id,new cljs.core.Keyword("encoding","channels","encoding/channels",-578464551),new_chan_id], null),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword("db","id","db/id",-1388397098),new_chan_id,new cljs.core.Keyword("channel","name","channel/name",-1177043666),cljs.core.name(channel),new cljs.core.Keyword("channel","field","channel/field",107679349),field], null)], null);
}
}
});
clj_yavl.webapp.events.update_channel_field = (function clj_yavl$webapp$events$update_channel_field(db,p__29803){
var vec__29804 = p__29803;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29804,(0),null);
var channel = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29804,(1),null);
var field = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29804,(2),null);
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647)], null));
var tx_data = clj_yavl.webapp.events.create_channel_tx(ds_db,channel,field);
var new_ds_db = clj_yavl.db.with$(ds_db,tx_data);
return clj_yavl.webapp.events.sync_config_from_db(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647)], null),new_ds_db));
});
clj_yavl.webapp.events.update_tooltip = (function clj_yavl$webapp$events$update_tooltip(db,p__29807){
var vec__29808 = p__29807;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29808,(0),null);
var tooltip_def = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29808,(1),null);
var ds_db = cljs.core.get_in.cljs$core$IFn$_invoke$arity$2(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647)], null));
var tx_data = new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword("db","id","db/id",-1388397098),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("vl","id","vl/id",-1388397698),"default"], null),new cljs.core.Keyword("vl","tooltip","vl/tooltip",-1809678764),tooltip_def], null)], null);
var new_ds_db = clj_yavl.db.with$(ds_db,tx_data);
return clj_yavl.webapp.events.sync_config_from_db(cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"vega-lite","vega-lite",-650304770),new cljs.core.Keyword(null,"default","default",-1987822328),new cljs.core.Keyword("clj-yavl.webapp.core","ds-db","clj-yavl.webapp.core/ds-db",4672647)], null),new_ds_db));
});
re_frame.core.reg_event_fx.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-list","clj-yavl.webapp.events/fetch-dataset-list",-683606731),(function (p__29811,_){
var map__29812 = p__29811;
var map__29812__$1 = cljs.core.__destructure_map(map__29812);
var db = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__29812__$1,new cljs.core.Keyword(null,"db","db",993250759));
return new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword("promise","fetch","promise/fetch",-566993641),new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"url","url",276297046),"https://cdn.jsdelivr.net/npm/vega-datasets/datapackage.json",new cljs.core.Keyword(null,"on-success","on-success",1786904109),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-list-success","clj-yavl.webapp.events/fetch-dataset-list-success",1457281253)], null),new cljs.core.Keyword(null,"on-failure","on-failure",842888245),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-list-failure","clj-yavl.webapp.events/fetch-dataset-list-failure",-1020611076)], null)], null)], null);
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-list-success","clj-yavl.webapp.events/fetch-dataset-list-success",1457281253),(function (db,p__29813){
var vec__29814 = p__29813;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29814,(0),null);
var datapackage = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29814,(1),null);
return cljs.core.assoc_in(db,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"user-input","user-input",-504242422),new cljs.core.Keyword(null,"dataset-list","dataset-list",683219302)], null),new cljs.core.Keyword(null,"resources","resources",1632806811).cljs$core$IFn$_invoke$arity$1(datapackage));
}));
re_frame.core.reg_event_db.cljs$core$IFn$_invoke$arity$2(new cljs.core.Keyword("clj-yavl.webapp.events","fetch-dataset-list-failure","clj-yavl.webapp.events/fetch-dataset-list-failure",-1020611076),(function (db,p__29817){
var vec__29818 = p__29817;
var _ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29818,(0),null);
var err = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__29818,(1),null);
console.error("Failed to fetch dataset list:",err);

return db;
}));

//# sourceMappingURL=clj_yavl.webapp.events.js.map
