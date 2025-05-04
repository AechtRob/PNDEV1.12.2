package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTriadobatrachus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTriadobatrachus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hipsfrontslope_r1;
    private final AdvancedModelRenderer Hipsbaseslope_r1;
    private final AdvancedModelRenderer Hipsbase_r1;
    private final AdvancedModelRenderer bellyhip;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Bodyslope_r1;
    private final AdvancedModelRenderer bellyfront;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Rightupperjawslopebase_r1;
    private final AdvancedModelRenderer Rightupperjawslopefront_r1;
    private final AdvancedModelRenderer Leftupperjawslopebase_r1;
    private final AdvancedModelRenderer Leftupperjawslopefront_r1;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Headmiddleupper_r1;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Rightlowerjawslopefront_r1;
    private final AdvancedModelRenderer Rightlowerjawslopebase_r1;
    private final AdvancedModelRenderer Leftlowerjawslopebase_r1;
    private final AdvancedModelRenderer Leftlowerjawslopebase_r2;
    private final AdvancedModelRenderer Tongue;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Throatback_r1;
    private final AdvancedModelRenderer Leftarm1;
    private final AdvancedModelRenderer Leftupperarm_r1;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Leftlowerarm_r1;
    private final AdvancedModelRenderer Leftarm3;
    private final AdvancedModelRenderer Rightarm1;
    private final AdvancedModelRenderer Rightupperarm_r1;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Rightlowerarm_r1;
    private final AdvancedModelRenderer Rightarm3;
    private final AdvancedModelRenderer Leftleg1;
    private final AdvancedModelRenderer Leftthigh_r1;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Leftshin_r1;
    private final AdvancedModelRenderer Leftleg3;
    private final AdvancedModelRenderer Rightleg1;
    private final AdvancedModelRenderer Rightthigh_r1;
    private final AdvancedModelRenderer Rightleg2;
    private final AdvancedModelRenderer Rightshin_r1;
    private final AdvancedModelRenderer Rightleg3;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail_r1;

    private ModelAnimator animator;

    public ModelTriadobatrachus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 22.525F, 2.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 12, 19, -1.99F, -1.5F, 2.9F, 4, 3, 1, 0.0F, false));

        this.Hipsfrontslope_r1 = new AdvancedModelRenderer(this);
        this.Hipsfrontslope_r1.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.Hips.addChild(Hipsfrontslope_r1);
        this.setRotateAngle(Hipsfrontslope_r1, -0.0349F, 0.0F, 0.0F);
        this.Hipsfrontslope_r1.cubeList.add(new ModelBox(Hipsfrontslope_r1, 0, 14, -1.49F, -0.2255F, 0.003F, 3, 1, 4, 0.0F, false));

        this.Hipsbaseslope_r1 = new AdvancedModelRenderer(this);
        this.Hipsbaseslope_r1.setRotationPoint(0.0F, -1.5F, 4.0F);
        this.Hips.addChild(Hipsbaseslope_r1);
        this.setRotateAngle(Hipsbaseslope_r1, 0.3927F, 0.0F, 0.0F);
        this.Hipsbaseslope_r1.cubeList.add(new ModelBox(Hipsbaseslope_r1, 26, 6, -1.0F, 1.65F, -1.25F, 2, 1, 1, 0.0F, false));

        this.Hipsbase_r1 = new AdvancedModelRenderer(this);
        this.Hipsbase_r1.setRotationPoint(0.0F, -1.5F, 4.0F);
        this.Hips.addChild(Hipsbase_r1);
        this.setRotateAngle(Hipsbase_r1, -0.3927F, 0.0F, 0.0F);
        this.Hipsbase_r1.cubeList.add(new ModelBox(Hipsbase_r1, 0, 23, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.bellyhip = new AdvancedModelRenderer(this);
        this.bellyhip.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Hips.addChild(bellyhip);
        this.bellyhip.cubeList.add(new ModelBox(bellyhip, 0, 8, -2.49F, -1.5F, -1.1F, 5, 3, 3, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.5F, 0.35F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, -0.0436F, 0.0F, 0.0F);


        this.Bodyslope_r1 = new AdvancedModelRenderer(this);
        this.Bodyslope_r1.setRotationPoint(-0.5F, -1.0F, -5.0F);
        this.Body.addChild(Bodyslope_r1);
        this.setRotateAngle(Bodyslope_r1, -0.0349F, 0.0F, 0.0F);
        this.Bodyslope_r1.cubeList.add(new ModelBox(Bodyslope_r1, 11, 9, -1.0F, -0.4F, 0.0F, 3, 1, 5, 0.0F, false));

        this.bellyfront = new AdvancedModelRenderer(this);
        this.bellyfront.setRotationPoint(-0.5F, 0.0F, -5.0F);
        this.Body.addChild(bellyfront);
        this.bellyfront.cubeList.add(new ModelBox(bellyfront, 0, 0, -2.0F, -1.0F, 0.0F, 5, 3, 5, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.25F, -4.75F);
        this.Body.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 17, 5, -1.49F, -0.5267F, -2.9027F, 3, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 29, -1.0F, -0.5067F, -3.6527F, 2, 1, 1, 0.0F, false));

        this.Rightupperjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Rightupperjawslopebase_r1.setRotationPoint(-1.0F, 4.0F, -3.5F);
        this.Head.addChild(Rightupperjawslopebase_r1);
        this.setRotateAngle(Rightupperjawslopebase_r1, 0.0F, 1.3963F, 0.0F);
        this.Rightupperjawslopebase_r1.cubeList.add(new ModelBox(Rightupperjawslopebase_r1, 22, 24, -3.5065F, -4.5167F, -1.2522F, 2, 1, 2, 0.0F, false));

        this.Rightupperjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Rightupperjawslopefront_r1.setRotationPoint(-1.0F, 4.0F, -3.5F);
        this.Head.addChild(Rightupperjawslopefront_r1);
        this.setRotateAngle(Rightupperjawslopefront_r1, 0.0F, 0.7854F, 0.0F);
        this.Rightupperjawslopefront_r1.cubeList.add(new ModelBox(Rightupperjawslopefront_r1, 28, 23, -1.9124F, -4.4967F, -0.1251F, 2, 1, 1, 0.0F, false));

        this.Leftupperjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Leftupperjawslopebase_r1.setRotationPoint(1.0F, 4.0F, -3.5F);
        this.Head.addChild(Leftupperjawslopebase_r1);
        this.setRotateAngle(Leftupperjawslopebase_r1, 0.0F, -1.3963F, 0.0F);
        this.Leftupperjawslopebase_r1.cubeList.add(new ModelBox(Leftupperjawslopebase_r1, 10, 23, 1.5065F, -4.5167F, -1.2522F, 2, 1, 2, 0.0F, false));

        this.Leftupperjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Leftupperjawslopefront_r1.setRotationPoint(1.0F, 4.0F, -3.5F);
        this.Head.addChild(Leftupperjawslopefront_r1);
        this.setRotateAngle(Leftupperjawslopefront_r1, 0.0F, -0.7854F, 0.0F);
        this.Leftupperjawslopefront_r1.cubeList.add(new ModelBox(Leftupperjawslopefront_r1, 22, 27, -0.0876F, -4.4967F, -0.1251F, 2, 1, 1, 0.0F, false));

        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, 4.0F, -3.5F);
        this.Head.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.6109F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 27, 28, -1.0F, -3.7619F, 2.4305F, 2, 1, 1, 0.0F, false));

        this.Headmiddleupper_r1 = new AdvancedModelRenderer(this);
        this.Headmiddleupper_r1.setRotationPoint(0.0F, 4.0F, -3.5F);
        this.Head.addChild(Headmiddleupper_r1);
        this.setRotateAngle(Headmiddleupper_r1, 0.0436F, 0.0F, 0.0F);
        this.Headmiddleupper_r1.cubeList.add(new ModelBox(Headmiddleupper_r1, 19, 3, -1.5F, -5.01F, 0.85F, 3, 1, 1, 0.0F, false));
        this.Headmiddleupper_r1.cubeList.add(new ModelBox(Headmiddleupper_r1, 19, 0, -2.0F, -5.01F, 1.85F, 4, 1, 2, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(0.85F, -1.175F, -1.5F);
        this.Head.addChild(Lefteye);
        this.setRotateAngle(Lefteye, 0.0F, 0.48F, -0.4363F);
        this.Lefteye.cubeList.add(new ModelBox(Lefteye, 8, 23, 0.0692F, 0.003F, -0.6361F, 1, 1, 1, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(-0.85F, -1.175F, -1.5F);
        this.Head.addChild(Righteye);
        this.setRotateAngle(Righteye, 0.0F, -0.48F, 0.4363F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 20, 24, -1.0692F, 0.003F, -0.6361F, 1, 1, 1, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.5F, -0.25F);
        this.Head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 0, 19, -1.49F, -0.4667F, -2.6427F, 3, 1, 3, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 29, 8, -1.0F, -0.4867F, -3.3027F, 2, 1, 1, 0.0F, false));

        this.Rightlowerjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Rightlowerjawslopefront_r1.setRotationPoint(-1.0F, 4.0F, -3.25F);
        this.Lowerjaw.addChild(Rightlowerjawslopefront_r1);
        this.setRotateAngle(Rightlowerjawslopefront_r1, 0.0F, 0.7854F, 0.0F);
        this.Rightlowerjawslopefront_r1.cubeList.add(new ModelBox(Rightlowerjawslopefront_r1, 29, 0, -1.9124F, -4.4967F, -0.0251F, 2, 1, 1, 0.0F, false));

        this.Rightlowerjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Rightlowerjawslopebase_r1.setRotationPoint(-1.0F, 4.0F, -3.25F);
        this.Lowerjaw.addChild(Rightlowerjawslopebase_r1);
        this.setRotateAngle(Rightlowerjawslopebase_r1, 0.0F, 1.3963F, 0.0F);
        this.Rightlowerjawslopebase_r1.cubeList.add(new ModelBox(Rightlowerjawslopebase_r1, 25, 13, -3.4965F, -4.5167F, -1.1022F, 2, 1, 2, 0.0F, false));

        this.Leftlowerjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Leftlowerjawslopebase_r1.setRotationPoint(1.0F, 4.0F, -3.25F);
        this.Lowerjaw.addChild(Leftlowerjawslopebase_r1);
        this.setRotateAngle(Leftlowerjawslopebase_r1, 0.0F, -0.7854F, 0.0F);
        this.Leftlowerjawslopebase_r1.cubeList.add(new ModelBox(Leftlowerjawslopebase_r1, 29, 10, -0.0876F, -4.4967F, -0.0251F, 2, 1, 1, 0.0F, false));

        this.Leftlowerjawslopebase_r2 = new AdvancedModelRenderer(this);
        this.Leftlowerjawslopebase_r2.setRotationPoint(1.0F, 4.0F, -3.25F);
        this.Lowerjaw.addChild(Leftlowerjawslopebase_r2);
        this.setRotateAngle(Leftlowerjawslopebase_r2, 0.0F, -1.3963F, 0.0F);
        this.Leftlowerjawslopebase_r2.cubeList.add(new ModelBox(Leftlowerjawslopebase_r2, 26, 3, 1.4965F, -4.5167F, -1.1022F, 2, 1, 2, 0.0F, false));

        this.Tongue = new AdvancedModelRenderer(this);
        this.Tongue.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.Lowerjaw.addChild(Tongue);
        this.Tongue.cubeList.add(new ModelBox(Tongue, 0, 47, -0.5F, -0.25F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 0.5F, -3.25F);
        this.Lowerjaw.addChild(Throat);


        this.Throatback_r1 = new AdvancedModelRenderer(this);
        this.Throatback_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Throat.addChild(Throatback_r1);
        this.setRotateAngle(Throatback_r1, -0.2618F, 0.0F, 0.0F);
        this.Throatback_r1.cubeList.add(new ModelBox(Throatback_r1, 14, 15, -2.0F, -0.9867F, 0.9473F, 4, 1, 3, 0.0F, false));
        this.Throatback_r1.cubeList.add(new ModelBox(Throatback_r1, 0, 27, -1.0F, -0.9867F, -0.0527F, 2, 1, 1, 0.0F, false));

        this.Leftarm1 = new AdvancedModelRenderer(this);
        this.Leftarm1.setRotationPoint(2.5F, 0.75F, -4.0F);
        this.Body.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.0F, -0.8727F, 0.3054F);


        this.Leftupperarm_r1 = new AdvancedModelRenderer(this);
        this.Leftupperarm_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Leftarm1.addChild(Leftupperarm_r1);
        this.setRotateAngle(Leftupperarm_r1, 0.0F, 0.0F, -1.5708F);
        this.Leftupperarm_r1.cubeList.add(new ModelBox(Leftupperarm_r1, 5, 30, -0.25F, -0.5F, -0.5F, 1, 2, 1, 0.01F, true));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(1.5F, 0.25F, 0.0F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, 0.0F, 1.7453F, 0.0F);


        this.Leftlowerarm_r1 = new AdvancedModelRenderer(this);
        this.Leftlowerarm_r1.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.Leftarm2.addChild(Leftlowerarm_r1);
        this.setRotateAngle(Leftlowerarm_r1, 0.0F, 0.0F, -1.5708F);
        this.Leftlowerarm_r1.cubeList.add(new ModelBox(Leftlowerarm_r1, 22, 29, 0.0F, -0.6F, -0.5F, 1, 2, 1, 0.0F, true));

        this.Leftarm3 = new AdvancedModelRenderer(this);
        this.Leftarm3.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.2618F, 0.0F, 0.0F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, -2, 32, 0.0F, 0.025F, -1.5F, 2, 0, 3, 0.0F, true));
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, -3, 38, 0.0F, 0.075F, -1.5F, 2, 0, 3, 0.0F, true));

        this.Rightarm1 = new AdvancedModelRenderer(this);
        this.Rightarm1.setRotationPoint(-2.5F, 0.75F, -4.0F);
        this.Body.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.0F, 0.8727F, -0.3054F);


        this.Rightupperarm_r1 = new AdvancedModelRenderer(this);
        this.Rightupperarm_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Rightarm1.addChild(Rightupperarm_r1);
        this.setRotateAngle(Rightupperarm_r1, 0.0F, 0.0F, 1.5708F);
        this.Rightupperarm_r1.cubeList.add(new ModelBox(Rightupperarm_r1, 5, 30, -0.75F, -0.5F, -0.5F, 1, 2, 1, 0.01F, false));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(-1.5F, 0.25F, 0.0F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, 0.0F, -1.7453F, 0.0F);


        this.Rightlowerarm_r1 = new AdvancedModelRenderer(this);
        this.Rightlowerarm_r1.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.Rightarm2.addChild(Rightlowerarm_r1);
        this.setRotateAngle(Rightlowerarm_r1, 0.0F, 0.0F, 1.5708F);
        this.Rightlowerarm_r1.cubeList.add(new ModelBox(Rightlowerarm_r1, 22, 29, -1.0F, -0.6F, -0.5F, 1, 2, 1, 0.0F, false));

        this.Rightarm3 = new AdvancedModelRenderer(this);
        this.Rightarm3.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.2618F, 0.0F, 0.0F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, -2, 32, -2.0F, 0.025F, -1.5F, 2, 0, 3, 0.0F, false));
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, -3, 38, -2.0F, 0.075F, -1.5F, 2, 0, 3, 0.0F, false));

        this.Leftleg1 = new AdvancedModelRenderer(this);
        this.Leftleg1.setRotationPoint(1.0F, 0.25F, 4.5F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.2269F, 0.6545F, 0.0436F);


        this.Leftthigh_r1 = new AdvancedModelRenderer(this);
        this.Leftthigh_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Leftleg1.addChild(Leftthigh_r1);
        this.setRotateAngle(Leftthigh_r1, 0.0F, 0.0F, -1.5708F);
        this.Leftthigh_r1.cubeList.add(new ModelBox(Leftthigh_r1, 16, 24, -0.5F, -0.5F, -1.0F, 1, 3, 2, 0.0F, true));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(3.0F, 0.1F, 0.0F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, -0.1745F, -1.6144F, 0.0F);


        this.Leftshin_r1 = new AdvancedModelRenderer(this);
        this.Leftshin_r1.setRotationPoint(0.5F, 0.0F, 0.5F);
        this.Leftleg2.addChild(Leftshin_r1);
        this.setRotateAngle(Leftshin_r1, 0.0F, 0.0F, -1.5708F);
        this.Leftshin_r1.cubeList.add(new ModelBox(Leftshin_r1, 0, 0, -0.5F, -0.5F, -1.0F, 1, 3, 1, -0.01F, true));

        this.Leftleg3 = new AdvancedModelRenderer(this);
        this.Leftleg3.setRotationPoint(3.0F, 0.25F, 0.0F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.1309F, 2.2689F, -0.3927F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, -3, 35, 0.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, true));
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, -3, 42, 0.0F, 0.05F, -1.0F, 4, 0, 3, 0.0F, true));

        this.Rightleg1 = new AdvancedModelRenderer(this);
        this.Rightleg1.setRotationPoint(-1.0F, 0.25F, 4.5F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.2269F, -0.6545F, -0.0436F);


        this.Rightthigh_r1 = new AdvancedModelRenderer(this);
        this.Rightthigh_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Rightleg1.addChild(Rightthigh_r1);
        this.setRotateAngle(Rightthigh_r1, 0.0F, 0.0F, 1.5708F);
        this.Rightthigh_r1.cubeList.add(new ModelBox(Rightthigh_r1, 16, 24, -0.5F, -0.5F, -1.0F, 1, 3, 2, 0.0F, false));

        this.Rightleg2 = new AdvancedModelRenderer(this);
        this.Rightleg2.setRotationPoint(-3.0F, 0.1F, 0.0F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, -0.1745F, 1.6144F, 0.0F);


        this.Rightshin_r1 = new AdvancedModelRenderer(this);
        this.Rightshin_r1.setRotationPoint(-0.5F, 0.0F, 0.5F);
        this.Rightleg2.addChild(Rightshin_r1);
        this.setRotateAngle(Rightshin_r1, 0.0F, 0.0F, 1.5708F);
        this.Rightshin_r1.cubeList.add(new ModelBox(Rightshin_r1, 0, 0, -0.5F, -0.5F, -1.0F, 1, 3, 1, -0.01F, false));

        this.Rightleg3 = new AdvancedModelRenderer(this);
        this.Rightleg3.setRotationPoint(-3.0F, 0.25F, 0.0F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.1309F, -2.2689F, 0.3927F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, -3, 35, -4.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, false));
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, -3, 42, -4.0F, 0.05F, -1.0F, 4, 0, 3, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.25F, 5.65F);
        this.Hips.addChild(Tail);


        this.Tail_r1 = new AdvancedModelRenderer(this);
        this.Tail_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail.addChild(Tail_r1);
        this.setRotateAngle(Tail_r1, -0.3927F, 0.0F, 0.0F);
        this.Tail_r1.cubeList.add(new ModelBox(Tail_r1, 10, 15, -0.5F, -0.5234F, -0.0028F, 1, 1, 2, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hips, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Head, -0.5F, 0.1F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(Tongue, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.3F, 0.0F, 0.0F);
        this.Tongue.offsetZ = -0.005F;
        this.Hips.offsetY = 0.066F;
        this.Hips.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -1.4F;
        this.Hips.offsetX = -0.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(0);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 3.2F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.2F, 3.8F, -0.1F);
        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, Head);

        AdvancedModelRenderer[] Tail = {this.Tail};

        EntityPrehistoricFloraTriadobatrachus entitySilesaurus = (EntityPrehistoricFloraTriadobatrachus) e;
        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTriadobatrachus ee = (EntityPrehistoricFloraTriadobatrachus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animTongue(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animCroak(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBlink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTriadobatrachus entity = (EntityPrehistoricFloraTriadobatrachus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-10), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-1), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*5), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-10), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*3), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.6229 + (((tickAnim - 0) / 5) * (-2.6229-(-2.6229)));
            yy = -22.50232 + (((tickAnim - 0) / 5) * (-25.00232-(-22.50232)));
            zz = -9.94087 + (((tickAnim - 0) / 5) * (-9.94087-(-9.94087)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.6229 + (((tickAnim - 5) / 5) * (17.3771-(-2.6229)));
            yy = -25.00232 + (((tickAnim - 5) / 5) * (-10.00232-(-25.00232)));
            zz = -9.94087 + (((tickAnim - 5) / 5) * (-24.94087-(-9.94087)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 17.3771 + (((tickAnim - 10) / 5) * (7.3771-(17.3771)));
            yy = -10.00232 + (((tickAnim - 10) / 5) * (14.99768-(-10.00232)));
            zz = -24.94087 + (((tickAnim - 10) / 5) * (-24.94087-(-24.94087)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.3771 + (((tickAnim - 15) / 5) * (17.5-(7.3771)));
            yy = 14.99768 + (((tickAnim - 15) / 5) * (70-(14.99768)));
            zz = -24.94087 + (((tickAnim - 15) / 5) * (15-(-24.94087)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 20) / 5) * (-2.60943-(17.5)));
            yy = 70 + (((tickAnim - 20) / 5) * (27.49763-(70)));
            zz = 15 + (((tickAnim - 20) / 5) * (10.01192-(15)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.60943 + (((tickAnim - 25) / 5) * (-2.6229-(-2.60943)));
            yy = 27.49763 + (((tickAnim - 25) / 5) * (4.99768-(27.49763)));
            zz = 10.01192 + (((tickAnim - 25) / 5) * (-2.44087-(10.01192)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -2.6229 + (((tickAnim - 30) / 5) * (-2.6229-(-2.6229)));
            yy = 4.99768 + (((tickAnim - 30) / 5) * (-10.00232-(4.99768)));
            zz = -2.44087 + (((tickAnim - 30) / 5) * (-2.44087-(-2.44087)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.6229 + (((tickAnim - 35) / 5) * (-2.6229-(-2.6229)));
            yy = -10.00232 + (((tickAnim - 35) / 5) * (-22.50232-(-10.00232)));
            zz = -2.44087 + (((tickAnim - 35) / 5) * (-9.94087-(-2.44087)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 0) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 5) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 10) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 15) / 5) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 35) / 5) * (-0.5-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm1.rotationPointX = this.Leftarm1.rotationPointX + (float)(xx);
        this.Leftarm1.rotationPointY = this.Leftarm1.rotationPointY - (float)(yy);
        this.Leftarm1.rotationPointZ = this.Leftarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 0) / 3) * (22.5-(45)));
            yy = -32.53834 + (((tickAnim - 0) / 3) * (-41.29-(-32.53834)));
            zz = 55 + (((tickAnim - 0) / 3) * (31.25-(55)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22.5 + (((tickAnim - 3) / 2) * (0-(22.5)));
            yy = -41.29 + (((tickAnim - 3) / 2) * (-60.03834-(-41.29)));
            zz = 31.25 + (((tickAnim - 3) / 2) * (12.5-(31.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-22.5-(0)));
            yy = -60.03834 + (((tickAnim - 5) / 5) * (-62.53834-(-60.03834)));
            zz = 12.5 + (((tickAnim - 5) / 5) * (10-(12.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 10) / 5) * (-22.5-(-22.5)));
            yy = -62.53834 + (((tickAnim - 10) / 5) * (-35.03834-(-62.53834)));
            zz = 10 + (((tickAnim - 10) / 5) * (10-(10)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 15) / 5) * (-3.16293-(-22.5)));
            yy = -35.03834 + (((tickAnim - 15) / 5) * (-74.28587-(-35.03834)));
            zz = 10 + (((tickAnim - 15) / 5) * (-9.71104-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.16293 + (((tickAnim - 20) / 5) * (-3.34402-(-3.16293)));
            yy = -74.28587 + (((tickAnim - 20) / 5) * (-46.37968-(-74.28587)));
            zz = -9.71104 + (((tickAnim - 20) / 5) * (-3.42928-(-9.71104)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.34402 + (((tickAnim - 25) / 5) * (7.5-(-3.34402)));
            yy = -46.37968 + (((tickAnim - 25) / 5) * (-27.53834-(-46.37968)));
            zz = -3.42928 + (((tickAnim - 25) / 5) * (7.5-(-3.42928)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 30) / 5) * (5-(7.5)));
            yy = -27.53834 + (((tickAnim - 30) / 5) * (-27.53834-(-27.53834)));
            zz = 7.5 + (((tickAnim - 30) / 5) * (5-(7.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 35) / 5) * (45-(5)));
            yy = -27.53834 + (((tickAnim - 35) / 5) * (-32.53834-(-27.53834)));
            zz = 5 + (((tickAnim - 35) / 5) * (55-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.28435 + (((tickAnim - 0) / 3) * (-3.28-(-3.28435)));
            yy = 22.37384 + (((tickAnim - 0) / 3) * (11.12-(22.37384)));
            zz = -15.1171 + (((tickAnim - 0) / 3) * (-16.37-(-15.1171)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.28 + (((tickAnim - 3) / 2) * (-3.28435-(-3.28)));
            yy = 11.12 + (((tickAnim - 3) / 2) * (-0.12616-(11.12)));
            zz = -16.37 + (((tickAnim - 3) / 2) * (-12.6171-(-16.37)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.28435 + (((tickAnim - 5) / 5) * (-13.28435-(-3.28435)));
            yy = -0.12616 + (((tickAnim - 5) / 5) * (14.87384-(-0.12616)));
            zz = -12.6171 + (((tickAnim - 5) / 5) * (-30.1171-(-12.6171)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.28435 + (((tickAnim - 10) / 5) * (-13.28435-(-13.28435)));
            yy = 14.87384 + (((tickAnim - 10) / 5) * (14.87384-(14.87384)));
            zz = -30.1171 + (((tickAnim - 10) / 5) * (-30.1171-(-30.1171)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.28435 + (((tickAnim - 15) / 5) * (-10-(-13.28435)));
            yy = 14.87384 + (((tickAnim - 15) / 5) * (0-(14.87384)));
            zz = -30.1171 + (((tickAnim - 15) / 5) * (-20-(-30.1171)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 20) / 5) * (0-(-10)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -20 + (((tickAnim - 20) / 5) * (-7.5-(-20)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-3.28435-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (7.37384-(0)));
            zz = -7.5 + (((tickAnim - 25) / 5) * (-7.6171-(-7.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -3.28435 + (((tickAnim - 30) / 5) * (-3.28435-(-3.28435)));
            yy = 7.37384 + (((tickAnim - 30) / 5) * (29.87384-(7.37384)));
            zz = -7.6171 + (((tickAnim - 30) / 5) * (-15.1171-(-7.6171)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -3.28435 + (((tickAnim - 35) / 5) * (-3.28435-(-3.28435)));
            yy = 29.87384 + (((tickAnim - 35) / 5) * (22.37384-(29.87384)));
            zz = -15.1171 + (((tickAnim - 35) / 5) * (-15.1171-(-15.1171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.5 + (((tickAnim - 0) / 5) * (-2.60943-(17.5)));
            yy = -70 + (((tickAnim - 0) / 5) * (-27.49763-(-70)));
            zz = -15 + (((tickAnim - 0) / 5) * (-10.01192-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -2.60943 + (((tickAnim - 5) / 5) * (-2.6229-(-2.60943)));
            yy = -27.49763 + (((tickAnim - 5) / 5) * (-4.99768-(-27.49763)));
            zz = -10.01192 + (((tickAnim - 5) / 5) * (2.44087-(-10.01192)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.6229 + (((tickAnim - 10) / 5) * (-2.6229-(-2.6229)));
            yy = -4.99768 + (((tickAnim - 10) / 5) * (10.00232-(-4.99768)));
            zz = 2.44087 + (((tickAnim - 10) / 5) * (2.44087-(2.44087)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.6229 + (((tickAnim - 15) / 5) * (-2.6229-(-2.6229)));
            yy = 10.00232 + (((tickAnim - 15) / 5) * (22.50232-(10.00232)));
            zz = 2.44087 + (((tickAnim - 15) / 5) * (9.94087-(2.44087)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.6229 + (((tickAnim - 20) / 5) * (-2.6229-(-2.6229)));
            yy = 22.50232 + (((tickAnim - 20) / 5) * (25.00232-(22.50232)));
            zz = 9.94087 + (((tickAnim - 20) / 5) * (9.94087-(9.94087)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.6229 + (((tickAnim - 25) / 5) * (17.3771-(-2.6229)));
            yy = 25.00232 + (((tickAnim - 25) / 5) * (10.00232-(25.00232)));
            zz = 9.94087 + (((tickAnim - 25) / 5) * (24.94087-(9.94087)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 17.3771 + (((tickAnim - 30) / 5) * (7.3771-(17.3771)));
            yy = 10.00232 + (((tickAnim - 30) / 5) * (-14.99768-(10.00232)));
            zz = 24.94087 + (((tickAnim - 30) / 5) * (24.94087-(24.94087)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7.3771 + (((tickAnim - 35) / 5) * (17.5-(7.3771)));
            yy = -14.99768 + (((tickAnim - 35) / 5) * (-70-(-14.99768)));
            zz = 24.94087 + (((tickAnim - 35) / 5) * (-15-(24.94087)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 15) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 20) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 25) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 30) / 5) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 35) / 5) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm1.rotationPointX = this.Rightarm1.rotationPointX + (float)(xx);
        this.Rightarm1.rotationPointY = this.Rightarm1.rotationPointY - (float)(yy);
        this.Rightarm1.rotationPointZ = this.Rightarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.16293 + (((tickAnim - 0) / 5) * (-3.34402-(-3.16293)));
            yy = 74.28587 + (((tickAnim - 0) / 5) * (46.37968-(74.28587)));
            zz = 9.71104 + (((tickAnim - 0) / 5) * (3.42928-(9.71104)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.34402 + (((tickAnim - 5) / 5) * (7.5-(-3.34402)));
            yy = 46.37968 + (((tickAnim - 5) / 5) * (27.53834-(46.37968)));
            zz = 3.42928 + (((tickAnim - 5) / 5) * (-7.5-(3.42928)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 10) / 5) * (5-(7.5)));
            yy = 27.53834 + (((tickAnim - 10) / 5) * (27.53834-(27.53834)));
            zz = -7.5 + (((tickAnim - 10) / 5) * (-5-(-7.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 15) / 5) * (45-(5)));
            yy = 27.53834 + (((tickAnim - 15) / 5) * (32.53834-(27.53834)));
            zz = -5 + (((tickAnim - 15) / 5) * (-55-(-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 45 + (((tickAnim - 20) / 3) * (22.5-(45)));
            yy = 32.53834 + (((tickAnim - 20) / 3) * (41.29-(32.53834)));
            zz = -55 + (((tickAnim - 20) / 3) * (-31.25-(-55)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 22.5 + (((tickAnim - 23) / 2) * (0-(22.5)));
            yy = 41.29 + (((tickAnim - 23) / 2) * (60.03834-(41.29)));
            zz = -31.25 + (((tickAnim - 23) / 2) * (-12.5-(-31.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-22.5-(0)));
            yy = 60.03834 + (((tickAnim - 25) / 5) * (62.53834-(60.03834)));
            zz = -12.5 + (((tickAnim - 25) / 5) * (-10-(-12.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -22.5 + (((tickAnim - 30) / 5) * (-22.5-(-22.5)));
            yy = 62.53834 + (((tickAnim - 30) / 5) * (35.03834-(62.53834)));
            zz = -10 + (((tickAnim - 30) / 5) * (-10-(-10)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 35) / 5) * (-3.16293-(-22.5)));
            yy = 35.03834 + (((tickAnim - 35) / 5) * (74.28587-(35.03834)));
            zz = -10 + (((tickAnim - 35) / 5) * (9.71104-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 0) / 5) * (0-(-10)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 20 + (((tickAnim - 0) / 5) * (7.5-(20)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-3.28435-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-7.37384-(0)));
            zz = 7.5 + (((tickAnim - 5) / 5) * (7.6171-(7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.28435 + (((tickAnim - 10) / 5) * (-3.28435-(-3.28435)));
            yy = -7.37384 + (((tickAnim - 10) / 5) * (-29.87384-(-7.37384)));
            zz = 7.6171 + (((tickAnim - 10) / 5) * (15.1171-(7.6171)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.28435 + (((tickAnim - 15) / 5) * (-3.28435-(-3.28435)));
            yy = -29.87384 + (((tickAnim - 15) / 5) * (-22.37384-(-29.87384)));
            zz = 15.1171 + (((tickAnim - 15) / 5) * (15.1171-(15.1171)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -3.28435 + (((tickAnim - 20) / 3) * (-3.28-(-3.28435)));
            yy = -22.37384 + (((tickAnim - 20) / 3) * (-11.12-(-22.37384)));
            zz = 15.1171 + (((tickAnim - 20) / 3) * (16.37-(15.1171)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -3.28 + (((tickAnim - 23) / 2) * (-3.28435-(-3.28)));
            yy = -11.12 + (((tickAnim - 23) / 2) * (0.12616-(-11.12)));
            zz = 16.37 + (((tickAnim - 23) / 2) * (12.6171-(16.37)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.28435 + (((tickAnim - 25) / 5) * (-13.28435-(-3.28435)));
            yy = 0.12616 + (((tickAnim - 25) / 5) * (-14.87384-(0.12616)));
            zz = 12.6171 + (((tickAnim - 25) / 5) * (30.1171-(12.6171)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -13.28435 + (((tickAnim - 30) / 5) * (-13.28435-(-13.28435)));
            yy = -14.87384 + (((tickAnim - 30) / 5) * (-14.87384-(-14.87384)));
            zz = 30.1171 + (((tickAnim - 30) / 5) * (30.1171-(30.1171)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -13.28435 + (((tickAnim - 35) / 5) * (-10-(-13.28435)));
            yy = -14.87384 + (((tickAnim - 35) / 5) * (0-(-14.87384)));
            zz = 30.1171 + (((tickAnim - 35) / 5) * (20-(30.1171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.79151-(0)));
            yy = 10 + (((tickAnim - 0) / 5) * (-15.53573-(10)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.47366-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.79151 + (((tickAnim - 5) / 5) * (3.36162-(-4.79151)));
            yy = -15.53573 + (((tickAnim - 5) / 5) * (-37.87424-(-15.53573)));
            zz = -5.47366 + (((tickAnim - 5) / 5) * (-5.18783-(-5.47366)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.36162 + (((tickAnim - 10) / 2) * (3.88632-(3.36162)));
            yy = -37.87424 + (((tickAnim - 10) / 2) * (-50.3195-(-37.87424)));
            zz = -5.18783 + (((tickAnim - 10) / 2) * (-7.9408-(-5.18783)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 3.88632 + (((tickAnim - 12) / 3) * (8.55593-(3.88632)));
            yy = -50.3195 + (((tickAnim - 12) / 3) * (-75.3694-(-50.3195)));
            zz = -7.9408 + (((tickAnim - 12) / 3) * (-0.8311-(-7.9408)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 8.55593 + (((tickAnim - 15) / 5) * (4.11883-(8.55593)));
            yy = -75.3694 + (((tickAnim - 15) / 5) * (-87.8637-(-75.3694)));
            zz = -0.8311 + (((tickAnim - 15) / 5) * (23.40931-(-0.8311)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.11883 + (((tickAnim - 20) / 5) * (4.38789-(4.11883)));
            yy = -87.8637 + (((tickAnim - 20) / 5) * (-102.86137-(-87.8637)));
            zz = 23.40931 + (((tickAnim - 20) / 5) * (-4.39996-(23.40931)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.38789 + (((tickAnim - 25) / 5) * (5.78673-(4.38789)));
            yy = -102.86137 + (((tickAnim - 25) / 5) * (-72.21784-(-102.86137)));
            zz = -4.39996 + (((tickAnim - 25) / 5) * (-16.80273-(-4.39996)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 5.78673 + (((tickAnim - 30) / 5) * (-2.01352-(5.78673)));
            yy = -72.21784 + (((tickAnim - 30) / 5) * (-3.84373-(-72.21784)));
            zz = -16.80273 + (((tickAnim - 30) / 5) * (-22.08714-(-16.80273)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.01352 + (((tickAnim - 35) / 5) * (0-(-2.01352)));
            yy = -3.84373 + (((tickAnim - 35) / 5) * (10-(-3.84373)));
            zz = -22.08714 + (((tickAnim - 35) / 5) * (0-(-22.08714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (17.5-(12.5)));
            yy = 32.5 + (((tickAnim - 0) / 5) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 5) / 5) * (8.60524-(17.5)));
            yy = 32.5 + (((tickAnim - 5) / 5) * (42.80468-(32.5)));
            zz = 7.5 + (((tickAnim - 5) / 5) * (14.11351-(7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 8.60524 + (((tickAnim - 10) / 5) * (5.21112-(8.60524)));
            yy = 42.80468 + (((tickAnim - 10) / 5) * (80.04995-(42.80468)));
            zz = 14.11351 + (((tickAnim - 10) / 5) * (10.88905-(14.11351)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5.21112 + (((tickAnim - 15) / 5) * (5-(5.21112)));
            yy = 80.04995 + (((tickAnim - 15) / 5) * (72.5-(80.04995)));
            zz = 10.88905 + (((tickAnim - 15) / 5) * (0-(10.88905)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 20) / 5) * (0-(5)));
            yy = 72.5 + (((tickAnim - 20) / 5) * (90-(72.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-5-(0)));
            yy = 90 + (((tickAnim - 25) / 5) * (12.5-(90)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 30) / 5) * (0-(-5)));
            yy = 12.5 + (((tickAnim - 30) / 5) * (25-(12.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (12.5-(0)));
            yy = 25 + (((tickAnim - 35) / 5) * (32.5-(25)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -14.08948 + (((tickAnim - 0) / 5) * (-14.08948-(-14.08948)));
            yy = -15.96195 + (((tickAnim - 0) / 5) * (-33.46195-(-15.96195)));
            zz = -5.80651 + (((tickAnim - 0) / 5) * (-15.80651-(-5.80651)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -14.08948 + (((tickAnim - 5) / 5) * (-16.55275-(-14.08948)));
            yy = -33.46195 + (((tickAnim - 5) / 5) * (-51.91279-(-33.46195)));
            zz = -15.80651 + (((tickAnim - 5) / 5) * (-11.69372-(-15.80651)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -16.55275 + (((tickAnim - 10) / 5) * (10.94725-(-16.55275)));
            yy = -51.91279 + (((tickAnim - 10) / 5) * (-94.41279-(-51.91279)));
            zz = -11.69372 + (((tickAnim - 10) / 5) * (8.30628-(-11.69372)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 10.94725 + (((tickAnim - 15) / 5) * (-11.55275-(10.94725)));
            yy = -94.41279 + (((tickAnim - 15) / 5) * (-69.41279-(-94.41279)));
            zz = 8.30628 + (((tickAnim - 15) / 5) * (-9.19372-(8.30628)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -11.55275 + (((tickAnim - 20) / 5) * (-11.55275-(-11.55275)));
            yy = -69.41279 + (((tickAnim - 20) / 5) * (-64.41279-(-69.41279)));
            zz = -9.19372 + (((tickAnim - 20) / 5) * (-9.19372-(-9.19372)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -11.55275 + (((tickAnim - 25) / 5) * (-29.05275-(-11.55275)));
            yy = -64.41279 + (((tickAnim - 25) / 5) * (-26.91279-(-64.41279)));
            zz = -9.19372 + (((tickAnim - 25) / 5) * (-9.19372-(-9.19372)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -29.05275 + (((tickAnim - 30) / 5) * (-14.05275-(-29.05275)));
            yy = -26.91279 + (((tickAnim - 30) / 5) * (-54.41279-(-26.91279)));
            zz = -9.19372 + (((tickAnim - 30) / 5) * (10.80628-(-9.19372)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -14.05275 + (((tickAnim - 35) / 5) * (-14.08948-(-14.05275)));
            yy = -54.41279 + (((tickAnim - 35) / 5) * (-15.96195-(-54.41279)));
            zz = 10.80628 + (((tickAnim - 35) / 5) * (-5.80651-(10.80628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4.11883 + (((tickAnim - 0) / 5) * (4.38789-(4.11883)));
            yy = 87.8637 + (((tickAnim - 0) / 5) * (102.86137-(87.8637)));
            zz = -23.40931 + (((tickAnim - 0) / 5) * (4.39996-(-23.40931)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.38789 + (((tickAnim - 5) / 5) * (5.78673-(4.38789)));
            yy = 102.86137 + (((tickAnim - 5) / 5) * (72.21784-(102.86137)));
            zz = 4.39996 + (((tickAnim - 5) / 5) * (16.80273-(4.39996)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5.78673 + (((tickAnim - 10) / 5) * (-2.01352-(5.78673)));
            yy = 72.21784 + (((tickAnim - 10) / 5) * (3.84373-(72.21784)));
            zz = 16.80273 + (((tickAnim - 10) / 5) * (22.08714-(16.80273)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.01352 + (((tickAnim - 15) / 5) * (0-(-2.01352)));
            yy = 3.84373 + (((tickAnim - 15) / 5) * (-10-(3.84373)));
            zz = 22.08714 + (((tickAnim - 15) / 5) * (0-(22.08714)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-4.79151-(0)));
            yy = -10 + (((tickAnim - 20) / 5) * (15.53573-(-10)));
            zz = 0 + (((tickAnim - 20) / 5) * (5.47366-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -4.79151 + (((tickAnim - 25) / 5) * (3.36162-(-4.79151)));
            yy = 15.53573 + (((tickAnim - 25) / 5) * (37.87424-(15.53573)));
            zz = 5.47366 + (((tickAnim - 25) / 5) * (5.18783-(5.47366)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 3.36162 + (((tickAnim - 30) / 2) * (3.88632-(3.36162)));
            yy = 37.87424 + (((tickAnim - 30) / 2) * (50.3195-(37.87424)));
            zz = 5.18783 + (((tickAnim - 30) / 2) * (7.9408-(5.18783)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 3.88632 + (((tickAnim - 32) / 3) * (8.55593-(3.88632)));
            yy = 50.3195 + (((tickAnim - 32) / 3) * (75.3694-(50.3195)));
            zz = 7.9408 + (((tickAnim - 32) / 3) * (0.8311-(7.9408)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 8.55593 + (((tickAnim - 35) / 5) * (4.11883-(8.55593)));
            yy = 75.3694 + (((tickAnim - 35) / 5) * (87.8637-(75.3694)));
            zz = 0.8311 + (((tickAnim - 35) / 5) * (-23.40931-(0.8311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 0) / 5) * (0-(5)));
            yy = -72.5 + (((tickAnim - 0) / 5) * (-90-(-72.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-5-(0)));
            yy = -90 + (((tickAnim - 5) / 5) * (-12.5-(-90)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 10) / 5) * (0-(-5)));
            yy = -12.5 + (((tickAnim - 10) / 5) * (-25-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (12.5-(0)));
            yy = -25 + (((tickAnim - 15) / 5) * (-32.5-(-25)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.5 + (((tickAnim - 20) / 5) * (17.5-(12.5)));
            yy = -32.5 + (((tickAnim - 20) / 5) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (-7.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 25) / 5) * (8.60524-(17.5)));
            yy = -32.5 + (((tickAnim - 25) / 5) * (-42.80468-(-32.5)));
            zz = -7.5 + (((tickAnim - 25) / 5) * (-14.11351-(-7.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 8.60524 + (((tickAnim - 30) / 5) * (5.21112-(8.60524)));
            yy = -42.80468 + (((tickAnim - 30) / 5) * (-80.04995-(-42.80468)));
            zz = -14.11351 + (((tickAnim - 30) / 5) * (-10.88905-(-14.11351)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5.21112 + (((tickAnim - 35) / 5) * (5-(5.21112)));
            yy = -80.04995 + (((tickAnim - 35) / 5) * (-72.5-(-80.04995)));
            zz = -10.88905 + (((tickAnim - 35) / 5) * (0-(-10.88905)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -11.55275 + (((tickAnim - 0) / 5) * (-11.55275-(-11.55275)));
            yy = 69.41279 + (((tickAnim - 0) / 5) * (64.41279-(69.41279)));
            zz = 9.19372 + (((tickAnim - 0) / 5) * (9.19372-(9.19372)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -11.55275 + (((tickAnim - 5) / 5) * (-29.05275-(-11.55275)));
            yy = 64.41279 + (((tickAnim - 5) / 5) * (26.91279-(64.41279)));
            zz = 9.19372 + (((tickAnim - 5) / 5) * (9.19372-(9.19372)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -29.05275 + (((tickAnim - 10) / 5) * (-14.05275-(-29.05275)));
            yy = 26.91279 + (((tickAnim - 10) / 5) * (54.41279-(26.91279)));
            zz = 9.19372 + (((tickAnim - 10) / 5) * (-10.80628-(9.19372)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -14.05275 + (((tickAnim - 15) / 5) * (-14.08948-(-14.05275)));
            yy = 54.41279 + (((tickAnim - 15) / 5) * (15.96195-(54.41279)));
            zz = -10.80628 + (((tickAnim - 15) / 5) * (5.80651-(-10.80628)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14.08948 + (((tickAnim - 20) / 5) * (-14.08948-(-14.08948)));
            yy = 15.96195 + (((tickAnim - 20) / 5) * (33.46195-(15.96195)));
            zz = 5.80651 + (((tickAnim - 20) / 5) * (15.80651-(5.80651)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -14.08948 + (((tickAnim - 25) / 5) * (-16.55275-(-14.08948)));
            yy = 33.46195 + (((tickAnim - 25) / 5) * (51.91279-(33.46195)));
            zz = 15.80651 + (((tickAnim - 25) / 5) * (11.69372-(15.80651)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -16.55275 + (((tickAnim - 30) / 5) * (10.94725-(-16.55275)));
            yy = 51.91279 + (((tickAnim - 30) / 5) * (94.41279-(51.91279)));
            zz = 11.69372 + (((tickAnim - 30) / 5) * (-8.30628-(11.69372)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10.94725 + (((tickAnim - 35) / 5) * (-11.55275-(10.94725)));
            yy = 94.41279 + (((tickAnim - 35) / 5) * (69.41279-(94.41279)));
            zz = -8.30628 + (((tickAnim - 35) / 5) * (9.19372-(-8.30628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTriadobatrachus entity = (EntityPrehistoricFloraTriadobatrachus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-3), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.25);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2);
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10), Rightleg1.rotateAngleY + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+10))*50), Rightleg1.rotateAngleZ + (float) Math.toRadians(5));
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-10), Rightleg2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*80), Rightleg2.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-10));
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-30), Rightleg3.rotateAngleY + (float) Math.toRadians(50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*-70), Rightleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10), Leftleg1.rotateAngleY + (float) Math.toRadians(-60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+10))*-50), Leftleg1.rotateAngleZ + (float) Math.toRadians(-5));
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-10), Leftleg2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-80), Leftleg2.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10));
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-30), Leftleg3.rotateAngleY + (float) Math.toRadians(-50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*70), Leftleg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-3));
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-3), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(60), Rightarm1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*15), Rightarm1.rotateAngleZ + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*5));
        this.Rightarm1.rotationPointX = this.Rightarm1.rotationPointX + (float)(0);
        this.Rightarm1.rotationPointY = this.Rightarm1.rotationPointY - (float)(0);
        this.Rightarm1.rotationPointZ = this.Rightarm1.rotationPointZ + (float)(-1.5);
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(0), Rightarm2.rotateAngleY + (float) Math.toRadians(90+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120))*-10), Rightarm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-10));
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(-20), Rightarm3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5), Rightarm3.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*10));
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(60), Leftarm1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-15), Leftarm1.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-5));
        this.Leftarm1.rotationPointX = this.Leftarm1.rotationPointX + (float)(0);
        this.Leftarm1.rotationPointY = this.Leftarm1.rotationPointY - (float)(0);
        this.Leftarm1.rotationPointZ = this.Leftarm1.rotationPointZ + (float)(-1.5);
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(0), Leftarm2.rotateAngleY + (float) Math.toRadians(-90+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120))*10), Leftarm2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*10));
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(-20), Leftarm3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-5), Leftarm3.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-10));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*3), Tail.rotateAngleY + (float) Math.toRadians(0), Tail.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTriadobatrachus entity = (EntityPrehistoricFloraTriadobatrachus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66))*1), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.66+60))*-10), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66-120))*-0.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66))*0.5);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66-90))*-1), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.66-60))*5), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.66-30))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.66-90))*-10), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66+60))*3), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.6229 + (((tickAnim - 0) / 2) * (-2.6229-(-2.6229)));
            yy = -22.50232 + (((tickAnim - 0) / 2) * (-25.00232-(-22.50232)));
            zz = -9.94087 + (((tickAnim - 0) / 2) * (-9.94087-(-9.94087)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.6229 + (((tickAnim - 2) / 1) * (17.3771-(-2.6229)));
            yy = -25.00232 + (((tickAnim - 2) / 1) * (-10.00232-(-25.00232)));
            zz = -9.94087 + (((tickAnim - 2) / 1) * (-24.94087-(-9.94087)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.3771 + (((tickAnim - 3) / 2) * (7.3771-(17.3771)));
            yy = -10.00232 + (((tickAnim - 3) / 2) * (14.99768-(-10.00232)));
            zz = -24.94087 + (((tickAnim - 3) / 2) * (-24.94087-(-24.94087)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7.3771 + (((tickAnim - 5) / 2) * (17.5-(7.3771)));
            yy = 14.99768 + (((tickAnim - 5) / 2) * (70-(14.99768)));
            zz = -24.94087 + (((tickAnim - 5) / 2) * (15-(-24.94087)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 7) / 1) * (-2.60943-(17.5)));
            yy = 70 + (((tickAnim - 7) / 1) * (27.49763-(70)));
            zz = 15 + (((tickAnim - 7) / 1) * (10.01192-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.60943 + (((tickAnim - 8) / 2) * (-2.6229-(-2.60943)));
            yy = 27.49763 + (((tickAnim - 8) / 2) * (4.99768-(27.49763)));
            zz = 10.01192 + (((tickAnim - 8) / 2) * (-2.44087-(10.01192)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -2.6229 + (((tickAnim - 10) / 2) * (-2.6229-(-2.6229)));
            yy = 4.99768 + (((tickAnim - 10) / 2) * (-10.00232-(4.99768)));
            zz = -2.44087 + (((tickAnim - 10) / 2) * (-2.44087-(-2.44087)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.6229 + (((tickAnim - 12) / 1) * (-2.6229-(-2.6229)));
            yy = -10.00232 + (((tickAnim - 12) / 1) * (-22.50232-(-10.00232)));
            zz = -2.44087 + (((tickAnim - 12) / 1) * (-9.94087-(-2.44087)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -0.5 + (((tickAnim - 0) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -0.5 + (((tickAnim - 2) / 1) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.5 + (((tickAnim - 3) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -0.5 + (((tickAnim - 5) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -0.5 + (((tickAnim - 12) / 1) * (-0.5-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm1.rotationPointX = this.Leftarm1.rotationPointX + (float)(xx);
        this.Leftarm1.rotationPointY = this.Leftarm1.rotationPointY - (float)(yy);
        this.Leftarm1.rotationPointZ = this.Leftarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 45 + (((tickAnim - 0) / 1) * (22.5-(45)));
            yy = -32.53834 + (((tickAnim - 0) / 1) * (-41.29-(-32.53834)));
            zz = 55 + (((tickAnim - 0) / 1) * (31.25-(55)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 22.5 + (((tickAnim - 1) / 1) * (0-(22.5)));
            yy = -41.29 + (((tickAnim - 1) / 1) * (-60.03834-(-41.29)));
            zz = 31.25 + (((tickAnim - 1) / 1) * (12.5-(31.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-22.5-(0)));
            yy = -60.03834 + (((tickAnim - 2) / 1) * (-62.53834-(-60.03834)));
            zz = 12.5 + (((tickAnim - 2) / 1) * (10-(12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-22.5-(-22.5)));
            yy = -62.53834 + (((tickAnim - 3) / 2) * (-35.03834-(-62.53834)));
            zz = 10 + (((tickAnim - 3) / 2) * (10-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -22.5 + (((tickAnim - 5) / 2) * (-3.16293-(-22.5)));
            yy = -35.03834 + (((tickAnim - 5) / 2) * (-74.28587-(-35.03834)));
            zz = 10 + (((tickAnim - 5) / 2) * (-9.71104-(10)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -3.16293 + (((tickAnim - 7) / 1) * (-3.34402-(-3.16293)));
            yy = -74.28587 + (((tickAnim - 7) / 1) * (-46.37968-(-74.28587)));
            zz = -9.71104 + (((tickAnim - 7) / 1) * (-3.42928-(-9.71104)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.34402 + (((tickAnim - 8) / 2) * (7.5-(-3.34402)));
            yy = -46.37968 + (((tickAnim - 8) / 2) * (-27.53834-(-46.37968)));
            zz = -3.42928 + (((tickAnim - 8) / 2) * (7.5-(-3.42928)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 7.5 + (((tickAnim - 10) / 2) * (5-(7.5)));
            yy = -27.53834 + (((tickAnim - 10) / 2) * (-27.53834-(-27.53834)));
            zz = 7.5 + (((tickAnim - 10) / 2) * (5-(7.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 12) / 1) * (45-(5)));
            yy = -27.53834 + (((tickAnim - 12) / 1) * (-32.53834-(-27.53834)));
            zz = 5 + (((tickAnim - 12) / 1) * (55-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.28435 + (((tickAnim - 0) / 1) * (-3.28-(-3.28435)));
            yy = 22.37384 + (((tickAnim - 0) / 1) * (11.12-(22.37384)));
            zz = -15.1171 + (((tickAnim - 0) / 1) * (-16.37-(-15.1171)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -3.28 + (((tickAnim - 1) / 1) * (-3.28435-(-3.28)));
            yy = 11.12 + (((tickAnim - 1) / 1) * (-0.12616-(11.12)));
            zz = -16.37 + (((tickAnim - 1) / 1) * (-12.6171-(-16.37)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -3.28435 + (((tickAnim - 2) / 1) * (-13.28435-(-3.28435)));
            yy = -0.12616 + (((tickAnim - 2) / 1) * (14.87384-(-0.12616)));
            zz = -12.6171 + (((tickAnim - 2) / 1) * (-30.1171-(-12.6171)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.28435 + (((tickAnim - 3) / 2) * (-13.28435-(-13.28435)));
            yy = 14.87384 + (((tickAnim - 3) / 2) * (14.87384-(14.87384)));
            zz = -30.1171 + (((tickAnim - 3) / 2) * (-30.1171-(-30.1171)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -13.28435 + (((tickAnim - 5) / 2) * (-10-(-13.28435)));
            yy = 14.87384 + (((tickAnim - 5) / 2) * (0-(14.87384)));
            zz = -30.1171 + (((tickAnim - 5) / 2) * (-20-(-30.1171)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 7) / 1) * (0-(-10)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -20 + (((tickAnim - 7) / 1) * (-7.5-(-20)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-3.28435-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (7.37384-(0)));
            zz = -7.5 + (((tickAnim - 8) / 2) * (-7.6171-(-7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -3.28435 + (((tickAnim - 10) / 2) * (-3.28435-(-3.28435)));
            yy = 7.37384 + (((tickAnim - 10) / 2) * (29.87384-(7.37384)));
            zz = -7.6171 + (((tickAnim - 10) / 2) * (-15.1171-(-7.6171)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -3.28435 + (((tickAnim - 12) / 1) * (-3.28435-(-3.28435)));
            yy = 29.87384 + (((tickAnim - 12) / 1) * (22.37384-(29.87384)));
            zz = -15.1171 + (((tickAnim - 12) / 1) * (-15.1171-(-15.1171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.5 + (((tickAnim - 0) / 2) * (-2.60943-(17.5)));
            yy = -70 + (((tickAnim - 0) / 2) * (-27.49763-(-70)));
            zz = -15 + (((tickAnim - 0) / 2) * (-10.01192-(-15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.60943 + (((tickAnim - 2) / 1) * (-2.6229-(-2.60943)));
            yy = -27.49763 + (((tickAnim - 2) / 1) * (-4.99768-(-27.49763)));
            zz = -10.01192 + (((tickAnim - 2) / 1) * (2.44087-(-10.01192)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.6229 + (((tickAnim - 3) / 2) * (-2.6229-(-2.6229)));
            yy = -4.99768 + (((tickAnim - 3) / 2) * (10.00232-(-4.99768)));
            zz = 2.44087 + (((tickAnim - 3) / 2) * (2.44087-(2.44087)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.6229 + (((tickAnim - 5) / 2) * (-2.6229-(-2.6229)));
            yy = 10.00232 + (((tickAnim - 5) / 2) * (22.50232-(10.00232)));
            zz = 2.44087 + (((tickAnim - 5) / 2) * (9.94087-(2.44087)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -2.6229 + (((tickAnim - 7) / 1) * (-2.6229-(-2.6229)));
            yy = 22.50232 + (((tickAnim - 7) / 1) * (25.00232-(22.50232)));
            zz = 9.94087 + (((tickAnim - 7) / 1) * (9.94087-(9.94087)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.6229 + (((tickAnim - 8) / 2) * (17.3771-(-2.6229)));
            yy = 25.00232 + (((tickAnim - 8) / 2) * (10.00232-(25.00232)));
            zz = 9.94087 + (((tickAnim - 8) / 2) * (24.94087-(9.94087)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 17.3771 + (((tickAnim - 10) / 2) * (7.3771-(17.3771)));
            yy = 10.00232 + (((tickAnim - 10) / 2) * (-14.99768-(10.00232)));
            zz = 24.94087 + (((tickAnim - 10) / 2) * (24.94087-(24.94087)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 7.3771 + (((tickAnim - 12) / 1) * (17.5-(7.3771)));
            yy = -14.99768 + (((tickAnim - 12) / 1) * (-70-(-14.99768)));
            zz = 24.94087 + (((tickAnim - 12) / 1) * (-15-(24.94087)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -0.5 + (((tickAnim - 5) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -0.5 + (((tickAnim - 7) / 1) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -0.5 + (((tickAnim - 8) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = -0.5 + (((tickAnim - 10) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -0.5 + (((tickAnim - 12) / 1) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm1.rotationPointX = this.Rightarm1.rotationPointX + (float)(xx);
        this.Rightarm1.rotationPointY = this.Rightarm1.rotationPointY - (float)(yy);
        this.Rightarm1.rotationPointZ = this.Rightarm1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -3.16293 + (((tickAnim - 0) / 2) * (-3.34402-(-3.16293)));
            yy = 74.28587 + (((tickAnim - 0) / 2) * (46.37968-(74.28587)));
            zz = 9.71104 + (((tickAnim - 0) / 2) * (3.42928-(9.71104)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -3.34402 + (((tickAnim - 2) / 1) * (7.5-(-3.34402)));
            yy = 46.37968 + (((tickAnim - 2) / 1) * (27.53834-(46.37968)));
            zz = 3.42928 + (((tickAnim - 2) / 1) * (-7.5-(3.42928)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 3) / 2) * (5-(7.5)));
            yy = 27.53834 + (((tickAnim - 3) / 2) * (27.53834-(27.53834)));
            zz = -7.5 + (((tickAnim - 3) / 2) * (-5-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 5) / 2) * (45-(5)));
            yy = 27.53834 + (((tickAnim - 5) / 2) * (32.53834-(27.53834)));
            zz = -5 + (((tickAnim - 5) / 2) * (-55-(-5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 45 + (((tickAnim - 7) / 1) * (22.5-(45)));
            yy = 32.53834 + (((tickAnim - 7) / 1) * (41.29-(32.53834)));
            zz = -55 + (((tickAnim - 7) / 1) * (-31.25-(-55)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 8) / 0) * (0-(22.5)));
            yy = 41.29 + (((tickAnim - 8) / 0) * (60.03834-(41.29)));
            zz = -31.25 + (((tickAnim - 8) / 0) * (-12.5-(-31.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-22.5-(0)));
            yy = 60.03834 + (((tickAnim - 8) / 2) * (62.53834-(60.03834)));
            zz = -12.5 + (((tickAnim - 8) / 2) * (-10-(-12.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -22.5 + (((tickAnim - 10) / 2) * (-22.5-(-22.5)));
            yy = 62.53834 + (((tickAnim - 10) / 2) * (35.03834-(62.53834)));
            zz = -10 + (((tickAnim - 10) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -22.5 + (((tickAnim - 12) / 1) * (-3.16293-(-22.5)));
            yy = 35.03834 + (((tickAnim - 12) / 1) * (74.28587-(35.03834)));
            zz = -10 + (((tickAnim - 12) / 1) * (9.71104-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 0) / 2) * (0-(-10)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 20 + (((tickAnim - 0) / 2) * (7.5-(20)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-3.28435-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-7.37384-(0)));
            zz = 7.5 + (((tickAnim - 2) / 1) * (7.6171-(7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -3.28435 + (((tickAnim - 3) / 2) * (-3.28435-(-3.28435)));
            yy = -7.37384 + (((tickAnim - 3) / 2) * (-29.87384-(-7.37384)));
            zz = 7.6171 + (((tickAnim - 3) / 2) * (15.1171-(7.6171)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -3.28435 + (((tickAnim - 5) / 2) * (-3.28435-(-3.28435)));
            yy = -29.87384 + (((tickAnim - 5) / 2) * (-22.37384-(-29.87384)));
            zz = 15.1171 + (((tickAnim - 5) / 2) * (15.1171-(15.1171)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -3.28435 + (((tickAnim - 7) / 1) * (-3.28-(-3.28435)));
            yy = -22.37384 + (((tickAnim - 7) / 1) * (-11.12-(-22.37384)));
            zz = 15.1171 + (((tickAnim - 7) / 1) * (16.37-(15.1171)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -3.28 + (((tickAnim - 8) / 0) * (-3.28435-(-3.28)));
            yy = -11.12 + (((tickAnim - 8) / 0) * (0.12616-(-11.12)));
            zz = 16.37 + (((tickAnim - 8) / 0) * (12.6171-(16.37)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -3.28435 + (((tickAnim - 8) / 2) * (-13.28435-(-3.28435)));
            yy = 0.12616 + (((tickAnim - 8) / 2) * (-14.87384-(0.12616)));
            zz = 12.6171 + (((tickAnim - 8) / 2) * (30.1171-(12.6171)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -13.28435 + (((tickAnim - 10) / 2) * (-13.28435-(-13.28435)));
            yy = -14.87384 + (((tickAnim - 10) / 2) * (-14.87384-(-14.87384)));
            zz = 30.1171 + (((tickAnim - 10) / 2) * (30.1171-(30.1171)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -13.28435 + (((tickAnim - 12) / 1) * (-10-(-13.28435)));
            yy = -14.87384 + (((tickAnim - 12) / 1) * (0-(-14.87384)));
            zz = 30.1171 + (((tickAnim - 12) / 1) * (20-(30.1171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-4.79151-(0)));
            yy = 10 + (((tickAnim - 0) / 2) * (-15.53573-(10)));
            zz = 0 + (((tickAnim - 0) / 2) * (-5.47366-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -4.79151 + (((tickAnim - 2) / 1) * (3.36162-(-4.79151)));
            yy = -15.53573 + (((tickAnim - 2) / 1) * (-37.87424-(-15.53573)));
            zz = -5.47366 + (((tickAnim - 2) / 1) * (-5.18783-(-5.47366)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 3.36162 + (((tickAnim - 3) / 1) * (3.88632-(3.36162)));
            yy = -37.87424 + (((tickAnim - 3) / 1) * (-50.3195-(-37.87424)));
            zz = -5.18783 + (((tickAnim - 3) / 1) * (-7.9408-(-5.18783)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 3.88632 + (((tickAnim - 4) / 1) * (8.55593-(3.88632)));
            yy = -50.3195 + (((tickAnim - 4) / 1) * (-75.3694-(-50.3195)));
            zz = -7.9408 + (((tickAnim - 4) / 1) * (-0.8311-(-7.9408)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 8.55593 + (((tickAnim - 5) / 2) * (4.11883-(8.55593)));
            yy = -75.3694 + (((tickAnim - 5) / 2) * (-87.8637-(-75.3694)));
            zz = -0.8311 + (((tickAnim - 5) / 2) * (23.40931-(-0.8311)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 4.11883 + (((tickAnim - 7) / 1) * (4.38789-(4.11883)));
            yy = -87.8637 + (((tickAnim - 7) / 1) * (-102.86137-(-87.8637)));
            zz = 23.40931 + (((tickAnim - 7) / 1) * (-4.39996-(23.40931)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.38789 + (((tickAnim - 8) / 2) * (5.78673-(4.38789)));
            yy = -102.86137 + (((tickAnim - 8) / 2) * (-72.21784-(-102.86137)));
            zz = -4.39996 + (((tickAnim - 8) / 2) * (-16.80273-(-4.39996)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 5.78673 + (((tickAnim - 10) / 2) * (-2.01352-(5.78673)));
            yy = -72.21784 + (((tickAnim - 10) / 2) * (-3.84373-(-72.21784)));
            zz = -16.80273 + (((tickAnim - 10) / 2) * (-22.08714-(-16.80273)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.01352 + (((tickAnim - 12) / 1) * (0-(-2.01352)));
            yy = -3.84373 + (((tickAnim - 12) / 1) * (10-(-3.84373)));
            zz = -22.08714 + (((tickAnim - 12) / 1) * (0-(-22.08714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 12.5 + (((tickAnim - 0) / 2) * (17.5-(12.5)));
            yy = 32.5 + (((tickAnim - 0) / 2) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (7.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 2) / 1) * (8.60524-(17.5)));
            yy = 32.5 + (((tickAnim - 2) / 1) * (42.80468-(32.5)));
            zz = 7.5 + (((tickAnim - 2) / 1) * (14.11351-(7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.60524 + (((tickAnim - 3) / 2) * (5.21112-(8.60524)));
            yy = 42.80468 + (((tickAnim - 3) / 2) * (80.04995-(42.80468)));
            zz = 14.11351 + (((tickAnim - 3) / 2) * (10.88905-(14.11351)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 5.21112 + (((tickAnim - 5) / 2) * (5-(5.21112)));
            yy = 80.04995 + (((tickAnim - 5) / 2) * (72.5-(80.04995)));
            zz = 10.88905 + (((tickAnim - 5) / 2) * (0-(10.88905)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 7) / 1) * (0-(5)));
            yy = 72.5 + (((tickAnim - 7) / 1) * (90-(72.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
            yy = 90 + (((tickAnim - 8) / 2) * (12.5-(90)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 10) / 2) * (0-(-5)));
            yy = 12.5 + (((tickAnim - 10) / 2) * (25-(12.5)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (12.5-(0)));
            yy = 25 + (((tickAnim - 12) / 1) * (32.5-(25)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -14.08948 + (((tickAnim - 0) / 2) * (-14.08948-(-14.08948)));
            yy = -15.96195 + (((tickAnim - 0) / 2) * (-33.46195-(-15.96195)));
            zz = -5.80651 + (((tickAnim - 0) / 2) * (-15.80651-(-5.80651)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -14.08948 + (((tickAnim - 2) / 1) * (-16.55275-(-14.08948)));
            yy = -33.46195 + (((tickAnim - 2) / 1) * (-51.91279-(-33.46195)));
            zz = -15.80651 + (((tickAnim - 2) / 1) * (-11.69372-(-15.80651)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.55275 + (((tickAnim - 3) / 2) * (10.94725-(-16.55275)));
            yy = -51.91279 + (((tickAnim - 3) / 2) * (-94.41279-(-51.91279)));
            zz = -11.69372 + (((tickAnim - 3) / 2) * (8.30628-(-11.69372)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 10.94725 + (((tickAnim - 5) / 2) * (-11.55275-(10.94725)));
            yy = -94.41279 + (((tickAnim - 5) / 2) * (-69.41279-(-94.41279)));
            zz = 8.30628 + (((tickAnim - 5) / 2) * (-9.19372-(8.30628)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -11.55275 + (((tickAnim - 7) / 1) * (-11.55275-(-11.55275)));
            yy = -69.41279 + (((tickAnim - 7) / 1) * (-64.41279-(-69.41279)));
            zz = -9.19372 + (((tickAnim - 7) / 1) * (-9.19372-(-9.19372)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.55275 + (((tickAnim - 8) / 2) * (-29.05275-(-11.55275)));
            yy = -64.41279 + (((tickAnim - 8) / 2) * (-26.91279-(-64.41279)));
            zz = -9.19372 + (((tickAnim - 8) / 2) * (-9.19372-(-9.19372)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -29.05275 + (((tickAnim - 10) / 2) * (-14.05275-(-29.05275)));
            yy = -26.91279 + (((tickAnim - 10) / 2) * (-54.41279-(-26.91279)));
            zz = -9.19372 + (((tickAnim - 10) / 2) * (10.80628-(-9.19372)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -14.05275 + (((tickAnim - 12) / 1) * (-14.08948-(-14.05275)));
            yy = -54.41279 + (((tickAnim - 12) / 1) * (-15.96195-(-54.41279)));
            zz = 10.80628 + (((tickAnim - 12) / 1) * (-5.80651-(10.80628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4.11883 + (((tickAnim - 0) / 2) * (4.38789-(4.11883)));
            yy = 87.8637 + (((tickAnim - 0) / 2) * (102.86137-(87.8637)));
            zz = -23.40931 + (((tickAnim - 0) / 2) * (4.39996-(-23.40931)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 4.38789 + (((tickAnim - 2) / 1) * (5.78673-(4.38789)));
            yy = 102.86137 + (((tickAnim - 2) / 1) * (72.21784-(102.86137)));
            zz = 4.39996 + (((tickAnim - 2) / 1) * (16.80273-(4.39996)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.78673 + (((tickAnim - 3) / 2) * (-2.01352-(5.78673)));
            yy = 72.21784 + (((tickAnim - 3) / 2) * (3.84373-(72.21784)));
            zz = 16.80273 + (((tickAnim - 3) / 2) * (22.08714-(16.80273)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.01352 + (((tickAnim - 5) / 2) * (0-(-2.01352)));
            yy = 3.84373 + (((tickAnim - 5) / 2) * (-10-(3.84373)));
            zz = 22.08714 + (((tickAnim - 5) / 2) * (0-(22.08714)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-4.79151-(0)));
            yy = -10 + (((tickAnim - 7) / 1) * (15.53573-(-10)));
            zz = 0 + (((tickAnim - 7) / 1) * (5.47366-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.79151 + (((tickAnim - 8) / 2) * (3.36162-(-4.79151)));
            yy = 15.53573 + (((tickAnim - 8) / 2) * (37.87424-(15.53573)));
            zz = 5.47366 + (((tickAnim - 8) / 2) * (5.18783-(5.47366)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 3.36162 + (((tickAnim - 10) / 1) * (3.88632-(3.36162)));
            yy = 37.87424 + (((tickAnim - 10) / 1) * (50.3195-(37.87424)));
            zz = 5.18783 + (((tickAnim - 10) / 1) * (7.9408-(5.18783)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 3.88632 + (((tickAnim - 11) / 1) * (8.55593-(3.88632)));
            yy = 50.3195 + (((tickAnim - 11) / 1) * (75.3694-(50.3195)));
            zz = 7.9408 + (((tickAnim - 11) / 1) * (0.8311-(7.9408)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 8.55593 + (((tickAnim - 12) / 1) * (4.11883-(8.55593)));
            yy = 75.3694 + (((tickAnim - 12) / 1) * (87.8637-(75.3694)));
            zz = 0.8311 + (((tickAnim - 12) / 1) * (-23.40931-(0.8311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 5 + (((tickAnim - 0) / 2) * (0-(5)));
            yy = -72.5 + (((tickAnim - 0) / 2) * (-90-(-72.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-5-(0)));
            yy = -90 + (((tickAnim - 2) / 1) * (-12.5-(-90)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            yy = -12.5 + (((tickAnim - 3) / 2) * (-25-(-12.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (12.5-(0)));
            yy = -25 + (((tickAnim - 5) / 2) * (-32.5-(-25)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 7) / 1) * (17.5-(12.5)));
            yy = -32.5 + (((tickAnim - 7) / 1) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (-7.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 8) / 2) * (8.60524-(17.5)));
            yy = -32.5 + (((tickAnim - 8) / 2) * (-42.80468-(-32.5)));
            zz = -7.5 + (((tickAnim - 8) / 2) * (-14.11351-(-7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 8.60524 + (((tickAnim - 10) / 2) * (5.21112-(8.60524)));
            yy = -42.80468 + (((tickAnim - 10) / 2) * (-80.04995-(-42.80468)));
            zz = -14.11351 + (((tickAnim - 10) / 2) * (-10.88905-(-14.11351)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 5.21112 + (((tickAnim - 12) / 1) * (5-(5.21112)));
            yy = -80.04995 + (((tickAnim - 12) / 1) * (-72.5-(-80.04995)));
            zz = -10.88905 + (((tickAnim - 12) / 1) * (0-(-10.88905)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -11.55275 + (((tickAnim - 0) / 2) * (-11.55275-(-11.55275)));
            yy = 69.41279 + (((tickAnim - 0) / 2) * (64.41279-(69.41279)));
            zz = 9.19372 + (((tickAnim - 0) / 2) * (9.19372-(9.19372)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -11.55275 + (((tickAnim - 2) / 1) * (-29.05275-(-11.55275)));
            yy = 64.41279 + (((tickAnim - 2) / 1) * (26.91279-(64.41279)));
            zz = 9.19372 + (((tickAnim - 2) / 1) * (9.19372-(9.19372)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -29.05275 + (((tickAnim - 3) / 2) * (-14.05275-(-29.05275)));
            yy = 26.91279 + (((tickAnim - 3) / 2) * (54.41279-(26.91279)));
            zz = 9.19372 + (((tickAnim - 3) / 2) * (-10.80628-(9.19372)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -14.05275 + (((tickAnim - 5) / 2) * (-14.08948-(-14.05275)));
            yy = 54.41279 + (((tickAnim - 5) / 2) * (15.96195-(54.41279)));
            zz = -10.80628 + (((tickAnim - 5) / 2) * (5.80651-(-10.80628)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -14.08948 + (((tickAnim - 7) / 1) * (-14.08948-(-14.08948)));
            yy = 15.96195 + (((tickAnim - 7) / 1) * (33.46195-(15.96195)));
            zz = 5.80651 + (((tickAnim - 7) / 1) * (15.80651-(5.80651)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -14.08948 + (((tickAnim - 8) / 2) * (-16.55275-(-14.08948)));
            yy = 33.46195 + (((tickAnim - 8) / 2) * (51.91279-(33.46195)));
            zz = 15.80651 + (((tickAnim - 8) / 2) * (11.69372-(15.80651)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -16.55275 + (((tickAnim - 10) / 2) * (10.94725-(-16.55275)));
            yy = 51.91279 + (((tickAnim - 10) / 2) * (94.41279-(51.91279)));
            zz = 11.69372 + (((tickAnim - 10) / 2) * (-8.30628-(11.69372)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 10.94725 + (((tickAnim - 12) / 1) * (-11.55275-(10.94725)));
            yy = 94.41279 + (((tickAnim - 12) / 1) * (69.41279-(94.41279)));
            zz = -8.30628 + (((tickAnim - 12) / 1) * (9.19372-(-8.30628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animTongue(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTriadobatrachus entity = (EntityPrehistoricFloraTriadobatrachus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (40-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 5) / 5) * (40-(40)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40 + (((tickAnim - 10) / 5) * (0-(40)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -27.5 + (((tickAnim - 8) / 4) * (-20-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -20 + (((tickAnim - 12) / 3) * (0-(-20)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tongue, Tongue.rotateAngleX + (float) Math.toRadians(xx), Tongue.rotateAngleY + (float) Math.toRadians(yy), Tongue.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 4) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tongue.rotationPointX = this.Tongue.rotationPointX + (float)(xx);
        this.Tongue.rotationPointY = this.Tongue.rotationPointY - (float)(yy);
        this.Tongue.rotationPointZ = this.Tongue.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 5) * (1-(1)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 5) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 5) / 3) * (0.7-(1)));
            zz = 1 + (((tickAnim - 5) / 3) * (3-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 8) / 4) * (1-(1)));
            yy = 0.7 + (((tickAnim - 8) / 4) * (1-(0.7)));
            zz = 3 + (((tickAnim - 8) / 4) * (1-(3)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tongue.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animCroak(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTriadobatrachus entity = (EntityPrehistoricFloraTriadobatrachus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 10) / 10) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1.1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1.2-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 10) / 10) * (1-(1.1)));
            yy = 1.2 + (((tickAnim - 10) / 10) * (1-(1.2)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 10) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.bellyfront.rotationPointX = this.bellyfront.rotationPointX + (float)(xx);
        this.bellyfront.rotationPointY = this.bellyfront.rotationPointY - (float)(yy);
        this.bellyfront.rotationPointZ = this.bellyfront.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
            yy = 1.1 + (((tickAnim - 0) / 10) * (1-(1.1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
            yy = 1 + (((tickAnim - 10) / 10) * (1.1-(1)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.bellyfront.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 10) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.bellyhip.rotationPointX = this.bellyhip.rotationPointX + (float)(xx);
        this.bellyhip.rotationPointY = this.bellyhip.rotationPointY - (float)(yy);
        this.bellyhip.rotationPointZ = this.bellyhip.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
            yy = 1.1 + (((tickAnim - 0) / 10) * (1-(1.1)));
            zz = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
            yy = 1 + (((tickAnim - 10) / 10) * (1.1-(1)));
            zz = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.bellyhip.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animBlink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTriadobatrachus entity = (EntityPrehistoricFloraTriadobatrachus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (30-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 30 + (((tickAnim - 8) / 7) * (0-(30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefteye, Lefteye.rotateAngleX + (float) Math.toRadians(xx), Lefteye.rotateAngleY + (float) Math.toRadians(yy), Lefteye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 7) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Lefteye.rotationPointX = this.Lefteye.rotationPointX + (float)(xx);
        this.Lefteye.rotationPointY = this.Lefteye.rotationPointY - (float)(yy);
        this.Lefteye.rotationPointZ = this.Lefteye.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-30-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -30 + (((tickAnim - 8) / 7) * (0-(-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteye, Righteye.rotateAngleX + (float) Math.toRadians(xx), Righteye.rotateAngleY + (float) Math.toRadians(yy), Righteye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 8) / 7) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righteye.rotationPointX = this.Righteye.rotationPointX + (float)(xx);
        this.Righteye.rotationPointY = this.Righteye.rotationPointY - (float)(yy);
        this.Righteye.rotationPointZ = this.Righteye.rotationPointZ + (float)(zz);


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTriadobatrachus e = (EntityPrehistoricFloraTriadobatrachus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
    }
}
