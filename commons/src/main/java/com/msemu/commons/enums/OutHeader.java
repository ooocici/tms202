/*
 * MIT License
 *
 * Copyright (c) 2018 msemu
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.msemu.commons.enums;

import com.msemu.commons.network.packets.IHeader;

/**
 * Created by Weber on 2018/3/29.
 */

public enum OutHeader implements IHeader {
    LP_CheckPasswordResult,
    LP_WorldInformation,
    LP_LatestConnectedWorld,
    LP_RecommendWorldMessage,
    LP_SetPhysicalWorldID,
    LP_SelectWorldResult,
    LP_SelectCharacterResult,
    LP_AccountInfoResult,
    LP_CheckDuplicatedIDResult,
    LP_CreateNewCharacterResult,
    LP_DeleteCharacterResult,
    LP_MigrateCommand,
    LP_AliveReq,
    LP_AuthenCodeChanged,
    LP_CheckSPWExistResult,
    LP_AlbaRequestResult,
    LP_RequestSetGender,
    LP_SetGenderResult,
    LP_HACKSHIELD_REQUEST,
    LP_FORCED_CHANGE_CHAR_NAME,
    LP_FORCED_CHANGE_CHAR_NAME_NOTICE,
    LP_WorldStatus,
    LP_LoginBackground,
    LP_ShowMapleStory,
    LP_ChangeSPWResult,
    LP_CheckSPWResult,
    LP_SetBackEffect,
    LP_CHANGE_BACKGROUND,
    LP_SetMapObjectVisible,
    LP_RESET_SCREEN,
    LP_InventoryOperation,
    LP_InventoryGrow,
    LP_StatChanged,
    LP_TemporaryStatSet,
    LP_TemporaryStatReset,
    LP_ForcedStatSet,
    LP_ForcedStatReset,
    LP_ChangeSkillRecordResult,
    LP_ChangeStealMemoryResult,
    LP_MobDropMesoPickup,
    LP_UserDamageOnFallingCheck,
    LP_ResultStealSkillList,
    LP_ExclRequest,
    LP_GivePopularityResult,
    LP_Message,
    LP_MemoResult,
    LP_MapTransferResult,
    LP_AntiMacroResult,
    LP_AntiMacroBombResult,
    LP_ClaimResult,
    LP_SetClaimSvrAvailableTime,
    LP_ClaimSvrStatusChanged,
    LP_SetTamingMobInfo,
    LP_QuestClear,
    LP_EntrustedShopCheckResult,
    LP_SkillLearnItemResult,
    LP_SkillResetItemResult,
    LP_AbilityResetItemResult,
    LP_ExpConsumeResetItemResult,
    LP_ExpItemGetResult,
    LP_CharSlotIncItemResult,
    LP_CharRenameItemResult,
    LP_GatherItemResult,
    LP_SortItemResult,
    LP_CharacterInfo,
    LP_PartyResult,
    LP_PartyMemberCandidateResult,
    LP_UrusPartyMemberCandidateResult,
    LP_PartyCandidateResult,
    LP_UrusPartyResult,
    LP_ExpeditionNoti,
    LP_FriendResult,
    LP_GuildRequest,
    LP_GuildResult,
    LP_AllianceResult,
    LP_TownPortal,
    LP_MECH_PORTAL,
    LP_BroadcastMsg,
    LP_AswanTimeTableState,
    LP_IncubatorResult,
    LP_IncubatorHotItemResult,
    LP_ShopScannerResult,
    LP_ShopLinkResult,
    LP_MarriageRequest,
    LP_MarriageResult,
    LP_WeddingGiftResult,
    LP_MarriedPartnerMapTransfer,
    LP_CashPetFoodResult,
    LP_CashPetSkillSettingResult,
    LP_CashLookChangeResult,
    LP_SetWeekEventMessage,
    LP_SetPotionDiscountRate,
    LP_BridleMobCatchFail,
    LP_ImitatedNPCResult,
    LP_ImitatedNPCData,
    LP_LimitedNPCDisableInfo,
    LP_MonsterBookSetCard,
    LP_MonsterBookSetCover,
    LP_HourChanged,
    LP_MiniMapOnOff,
    LP_ConsultAuthkeyUpdate,
    LP_ClassCompetitionAuthkeyUpdate,
    LP_WebBoardAuthkeyUpdate,
    LP_SessionValue,
    LP_PartyValue,
    LP_FieldValue,
    LP_BonusExpRateChanged,
    LP_FamilyChartResult,
    LP_FamilyInfoResult,
    LP_FamilyResult,
    LP_FamilyJoinRequest,
    LP_FamilyJoinRequestResult,
    LP_FamilyJoinAccepted,
    LP_FamilyPrivilegeList,
    LP_FamilyFamousPointIncResult,
    LP_FamilyNotifyLoginOrLogout,
    LP_FamilySetPrivilege,
    LP_FamilySummonRequest,
    LP_NotifyLevelUp,
    LP_NotifyWedding,
    LP_NotifyJobChange,
    LP_SetBuyEquipExt,
    LP_SetPassenserRequest,
    LP_ScriptProgressMessageBySoul,
    LP_ScriptProgressMessage,
    LP_ScriptProgressItemMessage,
    LP_SetStaticScreenMessage,
    LP_OffStaticScreenMessage,
    LP_WeatherEffectNotice,
    LP_WeatherEffectNoticeY,
    LP_ProgressMessageFont,
    LP_DataCRCCheckFailed,
    LP_ShowSlotMessage,
    LP_WildHunterInfo,
    LP_ZeroInfo,
    LP_ZeroWP,
    LP_OpenUICreatePremiumAdventurer,
    LP_ResultInstanceTable,
    LP_ItemPotChange,
    LP_ItemCoolTimeChange,
    LP_SetAdDisplayInfo,
    LP_SetSonOfLinkedSkillResult,
    LP_DojangRanking,
    LP_UPDATE_INNER_ABILITY,
    LP_ResultSetStealSkill,
    LP_INNER_ABILITY_MSG,
    LP_StartNavigationRequest,
    LP_FuncKeySetByScript,
    LP_CharacterPotentialSet,
    LP_CharacterPotentialReset,
    LP_CharacterHonorExp,
    LP_AswanStateInfo,
    LP_AswanResult,
    LP_ReadyForRespawn,
    LP_CharacterHonorGift,
    LP_CrossHunterCompleteResult,
    LP_CrossHunterShopResult,
    LP_UserUseNaviFlyingResult,
    LP_MapleStyleResult,
    LP_SetMaplePoint,
    LP_DressUpInfoModified,
    LP_ResetOnStateForOnOffSkill,
    LP_SetOffStateForOnOffSkill,
    LP_IssueReloginCookie,
    LP_EvolvingResult,
    LP_ActionBarResult,
    LP_GuildSearchResult,
    LP_CheckProcess,
    LP_AvatarMegaphoneRes,
    LP_AvatarMegaphoneUpdateMessage,
    LP_AvatarMegaphoneClearMessage,
    LP_RequestEventList,
    LP_LikePoint,
    LP_EventNameTagInfo,
    LP_JobFreeChangeResult,
    LP_CashShopPreviewInfo,
    LP_PendantSlotIncResult,
    LP_BossArenaMatchSucess,
    LP_BossArenaMatchFail,
    LP_BossArenaMatchRequestDone,
    LP_EliteMobWorldMapNotice,
    LP_EquipmentEnchantDisplay,
    LP_TopTowerRankResult,
    LP_FriendTowerRankResult,
    LP_TowerResultUIOpen,
    LP_ReturnToTitle,
    LP_ReturnToCharacterSelect,
    LP_FlameWizardFlameWalkEffect,
    LP_FlameWizardFlareBlink,
    LP_NAME_CHANGE,
    LP_SELECT_SLEIGH,
    LP_PAM_SONG,
    LP_MAPLE_FEED_AUTHEN,
    LP_QUICK_PAIR_RESULT,
    LP_GIFTS_BALL,
    LP_DRAGON_BALL,
    LP_TREASURE_BOX,
    LP_GM_POLICE,
    LP_NEW_YEAR_CARD,
    LP_RANDOM_MORPH,
    LP_DISPOSITION_TEXT,
    LP_CHAIR_EXP_MSG,
    LP_AUTO_CC_MSG,
    LP_REWARD,
    LP_PUZZLE_INFO,
    LP_SHIMMER_CUBE_RESPONSE,
    LP_CHANGE_DAMAGE_SKIN_RESPONSE,
    LP_SAVE_DAMAGE_SKIN_RESPONSE,
    LP_REMOVE_DAMAGE_SKIN_RESPONSE,
    LP_MacroSysDataInit,
    LP_SetField,
    LP_SetFarmField,
    LP_MTS_OPEN,
    LP_SetCashShop,
    LP_SetCashShopInfo,
    LP_TransferFieldReqIgnored,
    LP_TransferChannelReqIgnored,
    LP_TransferPvpReqIgnored,
    LP_FieldSpecificData,
    LP_GroupMessage,
    LP_FieldUniverseMessage,
    LP_Whisper,
    LP_MobSummonItemUseResult,
    LP_FieldEffect,
    LP_BlowWeather,
    LP_PlayJukeBox,
    LP_AdminResult,
    LP_AdminLog,
    LP_Quiz,
    LP_Desc,
    LP_Clock,
    LP_CONTIMOVE,
    LP_ContiState,
    LP_SetQuestClear,
    LP_DestroyClock,
    LP_ShowArenaResult,
    LP_StalkResult,
    LP_MassacreIncGauge,
    LP_MassacreResult,
    LP_QuickslotMappedInit,
    LP_FootHoldMove,
    LP_CorrectFootHoldMove,
    LP_PvPStatusResult,
    LP_InGameCurNodeEventEnd,
    LP_CreateForceAtom,
    LP_SetAchieveRate,
    LP_SetQuickMoveInfo,
    LP_ObtacleAtomCreate,
    LP_UserEnterField,
    LP_UserLeaveField,
    LP_UserChat,
    LP_UserADBoard,
    LP_UserMiniRoomBalloon,
    LP_UserConsumeItemEffect,
    LP_UserItemUpgradeEffect,
    LP_SHOW_ENCHANTER_EFFECT,
    LP_SHOW_SOULSCROLL_EFFECT,
    LP_ShowItemReleaseEffect,
    LP_SHOW_POTENTIAL_EXPANSION,
    LP_SHOW_POTENTIAL_RESET,
    LP_SHOW_BONUS_POTENTIAL_RESET,
    LP_SHOW_FIREWORKS_EFFECT,
    LP_SHOW_NEBULITE_EFFECT,
    LP_SHOW_FUSION_EFFECT,
    LP_UserHitByUser,
    LP_UserDotByUser,
    LP_UserResetAllDot,
    LP_UserDamageByUser,
    LP_UserTeslaTriangle,
    LP_SUMMON_TEAM,
    LP_UserFollowCharacter,
    LP_UserShowPQReward,
    LP_UserSetOneTimeAction,
    LP_UserMakingSkillResult,
    LP_UserMakingMeisterSkillEff,
    LP_UserGatherResult,
    LP_UserHitByCounter,
    LP_PyramidLethalAttack,
    LP_UserMixerResult,
    LP_UserWaitQueueReponse,
    LP_UserSetDamageSkin,
    LP_UserSetDamageSkin_Premium,
    LP_UserSitResult,
    LP_FamiliarOperation,
    LP_EFFECT_SWITCH_RESPONSE,
    LP_PetActivated,
    LP_PetMove,
    LP_PetActionSpeak,
    LP_PetNameChanged,
    LP_PetLoadExceptionList,
    LP_PetHueChanged,
    LP_PetSizeChange,
    LP_PetModified,
    LP_PetActionCommand,
    LP_DragonEnterField,
    LP_DragonMove,
    LP_DragonLeaveField,
    LP_AndroidEnterField,
    LP_AndroidMove,
    LP_AndroidActionSet,
    LP_AndroidModified,
    LP_AndroidLeaveField,
    LP_FoxManEnterField,
    LP_FoxManExclResult,
    LP_FoxManShowChangeEffect,
    LP_FoxManModified,
    LP_FoxManLeaveField,
    LP_SkillPetMove,
    LP_SkillPetAction,
    LP_SkillPetState,
    LP_SkillPetTransferField,
    LP_UserMove,
    LP_UserMeleeAttack,
    LP_UserShootAttack,
    LP_UserMagicAttack,
    LP_UserBodyAttack,
    LP_UserSkillPrepare,
    LP_UserMovingShootAttackPrepare,
    LP_UserSkillCancel,
    LP_UserHit,
    LP_UserEmotion,
    LP_AndroidEmotion,
    LP_UserSetActiveEffectItem,
    LP_UserSetActiveNickItem,
    LP_UserSetDefaultWingItem,
    LP_UserSetActivePortableChair,
    LP_UserAvatarModified,
    LP_UserEffectRemote,
    LP_UserTemporaryStatSet,
    LP_UserTemporaryStatReset,
    LP_UserHP,
    LP_UserGuildNameChanged,
    LP_UserGuildMarkChanged,
    LP_UserPvPTeamChanged,
    LP_GatherActionSet,
    LP_UpdatePvPHPTag,
    LP_DestroyGrenade,
    LP_ZeroTag,
    LP_SetMoveGrenade,
    LP_ThrowGrenade,
    LP_UserEmotionLocal,
    LP_AndroidEmotionLocal,
    LP_UserEffectLocal,
    LP_UserTeleport,
    LP_MesoGive_Succeeded,
    LP_MesoGive_Failed,
    LP_UserQuestResult,
    LP_NotifyHPDecByField,
    LP_UserPetSkillChanged,
    LP_UserBalloonMsg,
    LP_PlayEventSound,
    LP_PlayMinigameSound,
    LP_UserMakerResult,
    LP_UserOpenUI,
    LP_UserCloseUI,
    LP_UserOpenUIWithOption,
    LP_SetDirectionMode,
    LP_SetInGameDirectionMode,
    LP_SetStandAloneMode,
    LP_UserHireTutor,
    LP_UserTutorMsg,
    LP_UserHireTutorById,
    LP_UserSetPartner,
    LP_UserSetPartnerAction,
    LP_UserSetPartnerForceFlip,
    LP_UserSwitchRP,
    LP_ModCombo,
    LP_IncComboByComboRecharge,
    LP_UserNoticeMsg,
    LP_UserChatMsg,
    LP_UserBuffzoneEffect,
    LP_UserTimeBombAttack,
    LP_UserExplosionAttack,
    LP_UserPassiveMove,
    LP_UserFollowCharacterFailed,
    LP_CreateNewCharacterResult_PremiumAdventurer,
    LP_GatherRequestResult,
    LP_RuneStoneUseAck,
    LP_UserBagItemUseResult,
    LP_RandomTeleportKey,
    LP_SetGagePoint,
    LP_UserInGameDirectionEvent,
    LP_MedalReissueResult,
    LP_UserPlayMovieClip,
    LP_UserPlayMovieClipURL,
    LP_IncJudgementStack,
    LP_IncCharmByCashPRMsg,
    LP_SetBuffProtector,
    LP_ChangeLarknessStack,
    LP_DetonateBomb,
    LP_AggroRankInfo,
    LP_DeathCountInfo,
    LP_IndividualDeathCountInfo,
    LP_UserFlipTheCoinEnabled,
    LP_OpenUIOnDead,
    LP_ExpiredNotice,
    LP_UserSitOnTimeCapsule,
    LP_UserFinalAttackRequest,
    LP_UserSetGun,
    LP_UserSetAmmo,
    LP_UserCreateGun,
    LP_UserClearGun,
    LP_MirrorDungeonRecord,
    LP_UserOpenURL,
    LP_ZeroCombatRecovery,
    LP_MirrorStudyUIOpen,
    LP_MirrorReadingUIOpen,
    LP_ZeroLevelUpAlram,
    LP_IsUniverse,
    LP_DoActiveEventSkillByScript,
    LP_RuneStoneSkillAck,
    LP_ResetRuneStoneAction,
    LP_PlayAmbientSound,
    LP_StopAmbientSound,
    LP_SETP_GIFT_ID,
    LP_BossPartyCheckDone,
    LP_FreeLookChangeUIOpen,
    LP_FreeLookChangeSuccess,
    LP_GrayBackground,
    LP_SETP_COIN,
    LP_KAISER_QUICK_KEY,
    LP_IMPERIAL_BODY_DESTORY,
    LP_UIWindowTW,
    LP_OpenBingo,
    LP_CameraSwitch,
    LP_UserSetFieldFloating,
    LP_AddPopupSay,
    LP_RemovePopupSay,
    LP_JaguarSkill,
    LP_ActionLayerRelmove,
    LP_SendClientResolution,
    LP_UserBonusAttackRequest,
    LP_UserRandAreaAttackRequest,
    LP_JaguarActive,
    LP_SetSlownDown,
    LP_HAYATO_JIAN_QI,
    LP_SkillCooltimeSet,
    LP_SummonedEnterField,
    LP_SummonedLeaveField,
    LP_SummonedMove,
    LP_SummonedAttack,
    LP_SummonedAttackPvP,
    LP_SummonedSetReference,
    LP_SummonedSkill,
    LP_SummonedSkillPvP,
    LP_SummonedHPTagUpdate,
    LP_SummonedAssistAttackRequest,
    LP_SummonedAttackActive,
    LP_MobEnterField,
    LP_MobLeaveField,
    LP_MobChangeController,
    LP_MobMove,
    LP_MobCtrlAck,
    LP_MobStatSet,
    LP_MobStatReset,
    LP_MobSuspendReset,
    LP_MobAffected,
    LP_MobDamaged,
    LP_MobSpecialEffectBySkill,
    LP_MobCrcKeyChanged,
    LP_MobHPIndicator,
    LP_MobCatchEffect,
    LP_MobEffectByItem,
    LP_MobSpeaking,
    LP_MobMessaging,
    LP_MobSkillDelay,
    LP_MobRequestResultEscortInfo,
    LP_MobEscortStopEndPermmision,
    LP_MobEscortStopByScript,
    LP_MobEscortStopSay,
    LP_MobEscortReturnBefore,
    LP_MobNextAttack,
    LP_MobAttackedByMob,
    LP_MinionEnterField,
    LP_MinionLeaveField,
    LP_MinionChangeController,
    LP_MinionGenBeyondSplit,
    LP_NpcEnterField,
    LP_NpcLeaveField,
    LP_NpcChangeController,
    LP_NpcMove,
    LP_NpcUpdateLimitedInfo,
    LP_NpcCharacterBaseAction,
    LP_NpcSpecialAction,
    LP_NpcSetScript,
    LP_EmployeeEnterField,
    LP_EmployeeLeaveField,
    LP_UPDATE_HIRED_MERCHANT,
    LP_CHANGE_HIRED_MERCHANT_NAME,
    LP_DropEnterField,
    LP_DropLeaveField,
    LP_CreateMessgaeBoxFailed,
    LP_MessageBoxEnterField,
    LP_MessageBoxLeaveField,
    LP_AffectedAreaCreated,
    LP_MobSkillInstalledFire,
    LP_AffectedAreaRemoved,
    LP_TownPortalCreated,
    LP_TownPortalRemoved,
    LP_OpenGateCreated,
    LP_OpenGateClose,
    LP_OpenGateRemoved,
    LP_ReactorChangeState,
    LP_ReactorMove,
    LP_ReactorEnterField,
    LP_ReactorStateReset,
    LP_ReactorOwnerInfo,
    LP_ReactorRemove,
    LP_ReactorLeaveField,
    LP_DecomposerEnterField,
    LP_DecomposerLeaveField,
    LP_SnowBallState,
    LP_SnowBallHit,
    LP_SnowBallMsg,
    LP_SnowBallTouch,
    LP_CoconutHit,
    LP_CoconutScore,
    LP_HealerMove,
    LP_PulleyStateChange,
    LP_MCarnivalEnter,
    LP_MCarnivalPersonalCP,
    LP_MCarnivalTeamCScore,
    LP_MCarnivalSpellCooltime,
    LP_MCarnivalResultSuccess,
    LP_MCarnivalResultFail,
    LP_MCarnivalDeath,
    LP_MCarnivalMemberOut,
    LP_MCarnivalGameResult,
    LP_MCarnivalUpdateRankInfo,
    LP_ArenaScore,
    LP_BattlefieldEnter,
    LP_BattlefieldScore,
    LP_BattlefieldTeamChanged,
    LP_WitchtowerScore,
    LP_BossSummonTimer,
    LP_PVPFieldEnter,
    LP_PVPTeamChange,
    LP_PVPModeChange,
    LP_PVPStateChange,
    LP_PVPUpdateCount,
    LP_PVPModeResult,
    LP_PVPUpdateTeamInfo,
    LP_PVPUpdateRankInfo,
    LP_PVPTeamScore,
    LP_PVPReviveMessage,
    LP_PVPScreenEffect,
    LP_PVPIceKnightHPChange,
    LP_RuneStoneClearAndAllRegister,
    LP_RuneStoneDisappear,
    LP_RuneStoneAppear,
    LP_CHAOS_ZAKUM_SHRINE,
    LP_HORNTAIL_SHRINE,
    LP_CS_MESO_UPDATE,
    LP_CS_COLLOCATTON,
    LP_CAPTURE_FLAGS,
    LP_CAPTURE_POSITION,
    LP_CAPTURE_RESET,
    LP_ZakumTimer,
    LP_CreatePsychicLock,
    LP_RecreatePathPsychicLcok,
    LP_ReleasePsychicLock,
    LP_ReleasePsychicLockMob,
    LP_CreatePsychicArea,
    LP_ReleasePsychicArea,
    LP_ScriptMessage,
    LP_OpenShopDlg,
    LP_ShopResult,
    LP_AdminShopResult,
    LP_AdminShopCommodity,
    LP_TrunkResult,
    LP_StoreBankGetAllResult,
    LP_StoreBankResult,
    LP_RPSGame,
    LP_Messenger,
    LP_MiniRoom,
    LP_Tournament,
    LP_TournamentMatchTable,
    LP_TournamentSetPrize,
    LP_TournamentNoticeUEW,
    LP_TournamentAvatarInfo,
    LP_WeddingProgress,
    LP_WeddingCremonyEnd,
    LP_Parcel,
    LP_CashShopChargeParamResult,
    LP_CashShopQueryCashResult,
    LP_CashShopCashItemResult,
    LP_CashShopPurchaseExpChanged,
    LP_CashCoodinaionResult,
    LP_EventUIData,
    LP_EventUIAck,
    LP_GhostPaintsPointUpdate,
    LP_UserTimerInfo,
    LP_ContentsMap,
    LP_UrusShop,
    LP_FuncKeyMappedInit,
    LP_PetConsumeItemInit,
    LP_PetConsumeMPItemInit,
    LP_PET_AUTO_CURE,
    LP_CheckSPWOnCreateNewCharacterResult,
    LP_GoldHammerResult,
    LP_PlatinumHammerResult,
    LP_EgoEquipGaugeCompleteReturn,
    LP_EgoEquipCreateUpgradeItemCostInfo,
    LP_EgoEquipCheckUpgradeItemResult,
    LP_InheritanceInfo,
    LP_InheritanceComplete,
    LP_FIELDATTACKOBJ_CREATE,
    LP_FIELDATTACKOBJ_REMOVE_BYLIST,
    LP_FIELDATTACKOBJ_SETATTACK,
    LP_DamageSkinSaveResult,
    LP_StrengthenUI,
    LP_LEVEL_UI,
    LP_DAY_OF_CHRONOSPHERE,
    LP_ERROR_CHRONOSPHERE,
    LP_BINGO_CARD,
    LP_BINGO_BALL_CALL,
    LP_BINGO_RESPONSE,
    LP_BINGO_RANKING,
    LP_BINGO_UNK,
    LP_BINGO_RESULT,
    LP_BINGO_MARK,
    LP_BINGO_UI,
    LP_UNKNOWN,
    LP_AUTH_RESPONSE,
    LP_GUEST_ID_LOGIN,
    LP_SEND_LINK,
    LP_PIN_OPERATION,
    LP_PIN_ASSIGNED,
    LP_ALL_CHARLIST,
    LP_RELOG_RESPONSE,
    LP_REGISTER_PIC_RESPONSE,
    LP_EXTRA_CHAR_INFO,
    LP_SPECIAL_CREATION,
    LP_FULL_CLIENT_DOWNLOAD,
    LP_BOOK_INFO,
    LP_REPORT_RESULT,
    LP_TRADE_LIMIT,
    LP_UPDATE_GENDER,
    LP_BBS_OPERATION,
    LP_CODEX_INFO_RESPONSE,
    LP_ECHO_MESSAGE,
    LP_BOOK_STATS,
    LP_UPDATE_CODEX,
    LP_CARD_DROPS,
    LP_FAMILIAR_INFO,
    LP_POTION_BONUS,
    LP_MAPLE_TV_MSG,
    LP_POPUP2,
    LP_CANCEL_NAME_CHANGE,
    LP_CANCEL_WORLD_TRANSFER,
    LP_CLOSE_HIRED_MERCHANT,
    LP_CANCEL_NAME_CHANGE_2,
    LP_GM_STORY_BOARD,
    LP_FIND_FRIEND,
    LP_VISITOR,
    LP_PINKBEAN_CHOCO,
    LP_EQUIP_STOLEN_SKILL,
    LP_INNER_ABILITY_RESET_MSG,
    LP_CASSANDRAS_COLLECTION,
    LP_SetObjectState,
    LP_POPUP,
    LP_YOUR_INFORMATION,
    LP_CANDY_RANKING,
    LP_ATTENDANCE,
    LP_RANDOM_RESPONSE,
    LP_MAGIC_WHEEL,
    LP_MOVE_ENV,
    LP_UPDATE_ENV,
    LP_CHATTEXT_1,
    LP_SPAWN_PET_2,
    LP_SPAWN_FAMILIAR,
    LP_MOVE_FAMILIAR,
    LP_TOUCH_FAMILIAR,
    LP_ATTACK_FAMILIAR,
    LP_RENAME_FAMILIAR,
    LP_SPAWN_FAMILIAR_2,
    LP_UPDATE_FAMILIAR,
    LP_R_MESOBAG_SUCCESS,
    LP_R_MESOBAG_FAILURE,
    LP_MAP_FADE,
    LP_MAP_FADE_FORCE,
    LP_RANDOM_EMOTION,
    LP_RADIO_SCHEDULE,
    LP_OPEN_SKILL_GUIDE,
    LP_AP_SP_EVENT,
    LP_QUEST_GUIDE_NPC,
    LP_REGISTER_FAMILIAR,
    LP_FAMILIAR_MESSAGE,
    LP_SHOW_MAP_NAME,
    LP_CAKE_VS_PIE,
    LP_MoveScreenX,
    LP_MOVE_SCREEN_DOWN,
    LP_CAKE_PIE_INSTRUMENTS,
    LP_SEALED_BOX,
    LP_MONSTER_PROPERTIES,
    LP_CYGNUS_ATTACK,
    LP_MONSTER_RESIST,
    LP_TELE_MONSTER,
    LP_SHOW_MAGNET,
    LP_NPC_TOGGLE_VISIBLE,
    LP_INITIAL_QUIZ,
    LP_RED_LEAF_HIGH,
    LP_LOGOUT_GIFT,
    LP_CS_CHARGE_CASH,
    LP_GIFT_RESULT,
    LP_CHANGE_NAME_CHECK,
    LP_CHANGE_NAME_RESPONSE,
    LP_CASH_SHOP_UPDATE,
    LP_GACHAPON_STAMPS,
    LP_FREE_CASH_ITEM,
    LP_CS_SURPRISE,
    LP_XMAS_SURPRISE,
    LP_ONE_A_DAY,
    LP_NX_SPEND_GIFT,
    LP_RECEIVE_GIFT,
    LP_RANDOM_CHECK,
    LP_START_TV,
    LP_REMOVE_TV,
    LP_ENABLE_TV,
    LP_GM_ERROR,
    LP_ALIEN_SOCKET_CREATOR,
    LP_BATTLE_RECORD_DAMAGE_INFO,
    LP_CALCULATE_REQUEST_RESULT,
    LP_BOOSTER_PACK,
    LP_BOOSTER_FAMILIAR,
    LP_BLOCK_PORTAL,
    LP_NPC_CONFIRM,
    LP_RSA_KEY,
    LP_BUFF_BAR,
    LP_GAME_POLL_REPLY,
    LP_GAME_POLL_QUESTION,
    LP_ENGLISH_QUIZ,
    LP_FISHING_BOARD_UPDATE,
    LP_BOAT_EFFECT,
    LP_FISHING_CAUGHT,
    LP_SIDEKICK_OPERATION,
    LP_FARM_PACKET1,
    LP_FARM_ITEM_PURCHASED,
    LP_FARM_ITEM_GAIN,
    LP_HARVEST_WARU,
    LP_FARM_MONSTER_GAIN,
    LP_FARM_INFO,
    LP_FARM_MONSTER_INFO,
    LP_FARM_QUEST_DATA,
    LP_FARM_QUEST_INFO,
    LP_FARM_MESSAGE,
    LP_UPDATE_MONSTER,
    LP_AESTHETIC_POINT,
    LP_UPDATE_WARU,
    LP_FARM_EXP,
    LP_FARM_PACKET4,
    LP_QUEST_ALERT,
    LP_FARM_PACKET8,
    LP_FARM_FRIENDS_BUDDY_REQUEST,
    LP_FARM_FRIENDS,
    LP_FARM_USER_INFO,
    LP_FARM_AVATAR,
    LP_FRIEND_INFO,
    LP_FARM_RANKING,
    LP_SPAWN_FARM_MONSTER1,
    LP_SPAWN_FARM_MONSTER2,
    LP_RENAME_MONSTER,
    LP_REDIRECTOR_COMMAND,
    LP_VMatrixUpdate,
    LP_VCoreGemstoneDialog,
    LP_VCoreDecomeposeResultDialog,
    LP_VMatrixEnhanceResultDialog,
    LP_VMatrixCraftResultDialog,
    LP_VCoreExpired,;

    private short value;

    public static OutHeader getOutHeaderByOp(int op) {
        for (OutHeader outHeader : OutHeader.values()) {
            if (outHeader.getValue() == op) {
                return outHeader;
            }
        }
        return null;
    }

    @Override
    public short getValue() {
        return value;
    }

    @Override
    public void setValue(short value) {
        this.value = value;
    }

    public boolean ignoreDebug() {
        switch (this.name()) {
            case "LP_MobMove":
            case "LP_MobEnterField":
            case "LP_MobChangeController":
            case "LP_MobCtrlAck":
            case "LP_UserChatMsg":
            case "LP_StatChanged":
            case "LP_UserMeleeAttack":
            case "LP_MobLeaveField":
            case "LP_UserMove":
            case "LP_UserChat":
            case "LP_DropEnterField":
            case "LP_Message":
            case "LP_ResultInstanceTable":
            case "LP_NpcEnterField":
            case "LP_NpcChangeController":
            case "LP_InventoryOperation":
            case "LP_DropLeaveField":
                return true;
            default:
                return false;
        }
    }
}
