package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProsalirus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProsalirus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hipsend_r1;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Rightupperjawslopefront_r1;
    private final AdvancedModelRenderer Rightupperjawslopebase_r1;
    private final AdvancedModelRenderer Leftupperjawslopefront_r1;
    private final AdvancedModelRenderer Leftupperjawslopebase_r1;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Headbase_r1;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Lefteye_r1;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Righteye_r1;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Rightupperjawslopefront_r2;
    private final AdvancedModelRenderer Rightlowerjawslopebase_r1;
    private final AdvancedModelRenderer Leftlowerjawslopefront_r1;
    private final AdvancedModelRenderer Leftlowerjawslopebase_r1;
    private final AdvancedModelRenderer Tongue;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Throatback_r1;
    private final AdvancedModelRenderer Leftarm1;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Leftarm3;
    private final AdvancedModelRenderer Rightarm1;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Rightarm3;
    private final AdvancedModelRenderer Belly;
    private final AdvancedModelRenderer Leftleg1;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Leftleg3;
    private final AdvancedModelRenderer Leftleg4;
    private final AdvancedModelRenderer Rightleg1;
    private final AdvancedModelRenderer Rightleg2;
    private final AdvancedModelRenderer Rightleg3;
    private final AdvancedModelRenderer Rightleg4;

    private ModelAnimator animator;

    public ModelProsalirus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 23.75F, -2.0F);
        this.setRotateAngle(Hips, -0.1309F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 10, 8, -1.5F, -1.9F, 0.05F, 3, 1, 4, 0.0F, false));

        this.Hipsend_r1 = new AdvancedModelRenderer(this);
        this.Hipsend_r1.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Hips.addChild(Hipsend_r1);
        this.setRotateAngle(Hipsend_r1, -0.1658F, 0.0F, 0.0F);
        this.Hipsend_r1.cubeList.add(new ModelBox(Hipsend_r1, 7, 13, -1.0F, -1.75F, -4.5F, 2, 1, 4, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.5F, 1.0F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 6, -1.5F, -2.0F, -3.5F, 3, 2, 4, -0.01F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -1.0F, -2.55F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, -0.1309F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 15, 13, -2.0F, -0.85F, -2.2F, 4, 2, 2, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.1F, -2.25F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 16, 17, -1.0F, -0.5F, -2.45F, 2, 1, 3, 0.01F, false));

        this.Rightupperjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Rightupperjawslopefront_r1.setRotationPoint(-1.0F, 0.5F, -2.45F);
        this.Head.addChild(Rightupperjawslopefront_r1);
        this.setRotateAngle(Rightupperjawslopefront_r1, 0.0F, -0.48F, 0.0F);
        this.Rightupperjawslopefront_r1.cubeList.add(new ModelBox(Rightupperjawslopefront_r1, 6, 23, -0.025F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Rightupperjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Rightupperjawslopebase_r1.setRotationPoint(-1.0F, 0.5F, -2.45F);
        this.Head.addChild(Rightupperjawslopebase_r1);
        this.setRotateAngle(Rightupperjawslopebase_r1, 0.0F, -0.0436F, 0.0F);
        this.Rightupperjawslopebase_r1.cubeList.add(new ModelBox(Rightupperjawslopebase_r1, 17, 24, -0.875F, -1.0F, 1.8F, 2, 1, 1, -0.01F, false));

        this.Leftupperjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Leftupperjawslopefront_r1.setRotationPoint(1.0F, 0.5F, -2.45F);
        this.Head.addChild(Leftupperjawslopefront_r1);
        this.setRotateAngle(Leftupperjawslopefront_r1, 0.0F, 0.48F, 0.0F);
        this.Leftupperjawslopefront_r1.cubeList.add(new ModelBox(Leftupperjawslopefront_r1, 6, 23, -1.975F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.Leftupperjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Leftupperjawslopebase_r1.setRotationPoint(1.0F, 0.5F, -2.45F);
        this.Head.addChild(Leftupperjawslopebase_r1);
        this.setRotateAngle(Leftupperjawslopebase_r1, 0.0F, 0.0436F, 0.0F);
        this.Leftupperjawslopebase_r1.cubeList.add(new ModelBox(Leftupperjawslopebase_r1, 17, 24, -1.125F, -1.0F, 1.8F, 2, 1, 1, -0.01F, true));

        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, -0.5F, -2.45F);
        this.Head.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.4363F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 12, 23, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.Headbase_r1 = new AdvancedModelRenderer(this);
        this.Headbase_r1.setRotationPoint(0.0F, -0.9F, -1.55F);
        this.Head.addChild(Headbase_r1);
        this.setRotateAngle(Headbase_r1, -0.0436F, 0.0F, 0.0F);
        this.Headbase_r1.cubeList.add(new ModelBox(Headbase_r1, 23, 17, -1.0F, -0.025F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(1.0F, -0.85F, -1.45F);
        this.Head.addChild(Lefteye);


        this.Lefteye_r1 = new AdvancedModelRenderer(this);
        this.Lefteye_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Lefteye.addChild(Lefteye_r1);
        this.setRotateAngle(Lefteye_r1, -0.0436F, 0.3491F, -0.2182F);
        this.Lefteye_r1.cubeList.add(new ModelBox(Lefteye_r1, 0, 0, -0.725F, -0.05F, -0.25F, 1, 1, 1, 0.0F, true));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(-1.0F, -0.85F, -1.45F);
        this.Head.addChild(Righteye);


        this.Righteye_r1 = new AdvancedModelRenderer(this);
        this.Righteye_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Righteye.addChild(Righteye_r1);
        this.setRotateAngle(Righteye_r1, -0.0436F, -0.3491F, 0.2182F);
        this.Righteye_r1.cubeList.add(new ModelBox(Righteye_r1, 0, 0, -0.275F, -0.05F, -0.25F, 1, 1, 1, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.55F, -0.15F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.0873F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 0, 16, -1.0F, -0.45F, -2.25F, 2, 1, 3, -0.015F, false));

        this.Rightupperjawslopefront_r2 = new AdvancedModelRenderer(this);
        this.Rightupperjawslopefront_r2.setRotationPoint(-1.0F, 0.55F, -2.25F);
        this.Lowerjaw.addChild(Rightupperjawslopefront_r2);
        this.setRotateAngle(Rightupperjawslopefront_r2, 0.0F, -0.48F, 0.0F);
        this.Rightupperjawslopefront_r2.cubeList.add(new ModelBox(Rightupperjawslopefront_r2, 22, 0, -0.025F, -1.0F, 0.0F, 2, 1, 2, -0.02F, false));

        this.Rightlowerjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Rightlowerjawslopebase_r1.setRotationPoint(-1.0F, 0.55F, -2.25F);
        this.Lowerjaw.addChild(Rightlowerjawslopebase_r1);
        this.setRotateAngle(Rightlowerjawslopebase_r1, 0.0F, -0.0436F, 0.0F);
        this.Rightlowerjawslopebase_r1.cubeList.add(new ModelBox(Rightlowerjawslopebase_r1, 24, 11, -0.875F, -1.0F, 1.775F, 2, 1, 1, -0.03F, false));

        this.Leftlowerjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Leftlowerjawslopefront_r1.setRotationPoint(1.0F, 0.55F, -2.25F);
        this.Lowerjaw.addChild(Leftlowerjawslopefront_r1);
        this.setRotateAngle(Leftlowerjawslopefront_r1, 0.0F, 0.48F, 0.0F);
        this.Leftlowerjawslopefront_r1.cubeList.add(new ModelBox(Leftlowerjawslopefront_r1, 22, 0, -1.975F, -1.0F, 0.0F, 2, 1, 2, -0.02F, true));

        this.Leftlowerjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Leftlowerjawslopebase_r1.setRotationPoint(1.0F, 0.55F, -2.25F);
        this.Lowerjaw.addChild(Leftlowerjawslopebase_r1);
        this.setRotateAngle(Leftlowerjawslopebase_r1, 0.0F, 0.0436F, 0.0F);
        this.Leftlowerjawslopebase_r1.cubeList.add(new ModelBox(Leftlowerjawslopebase_r1, 24, 11, -1.125F, -1.0F, 1.775F, 2, 1, 1, -0.03F, true));

        this.Tongue = new AdvancedModelRenderer(this);
        this.Tongue.setRotationPoint(0.0F, -0.15F, 0.2F);
        this.Lowerjaw.addChild(Tongue);
        this.Tongue.cubeList.add(new ModelBox(Tongue, 23, 23, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 0.625F, -1.25F);
        this.Lowerjaw.addChild(Throat);
        this.setRotateAngle(Throat, -0.2793F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 17, 21, -1.0F, -1.025F, -0.25F, 2, 1, 2, -0.01F, false));

        this.Throatback_r1 = new AdvancedModelRenderer(this);
        this.Throatback_r1.setRotationPoint(0.0F, -0.025F, 1.75F);
        this.Throat.addChild(Throatback_r1);
        this.setRotateAngle(Throatback_r1, 0.5236F, 0.0F, 0.0F);
        this.Throatback_r1.cubeList.add(new ModelBox(Throatback_r1, 0, 22, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Leftarm1 = new AdvancedModelRenderer(this);
        this.Leftarm1.setRotationPoint(1.5F, -0.6F, -2.95F);
        this.Body.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.0262F, -0.6109F, 0.2793F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 24, 3, -0.5F, -0.5F, -1.0F, 3, 1, 1, 0.01F, true));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(2.5F, 0.0F, -0.5F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, 0.0F, 1.5708F, -0.2182F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 0, 25, -0.25F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.Leftarm3 = new AdvancedModelRenderer(this);
        this.Leftarm3.setRotationPoint(1.75F, 0.25F, 0.25F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.1309F, 0.4363F, 0.0436F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 17, 6, -1.0F, 0.0F, -1.6F, 3, 0, 3, 0.0F, true));
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 15, 3, -1.0F, 0.05F, -1.6F, 3, 0, 3, 0.0F, true));

        this.Rightarm1 = new AdvancedModelRenderer(this);
        this.Rightarm1.setRotationPoint(-1.5F, -0.6F, -2.95F);
        this.Body.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.0262F, 0.6109F, -0.2793F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 24, 3, -2.5F, -0.5F, -1.0F, 3, 1, 1, 0.01F, false));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(-2.5F, 0.0F, -0.5F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, 0.0F, -1.5708F, 0.2182F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 0, 25, -1.75F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

        this.Rightarm3 = new AdvancedModelRenderer(this);
        this.Rightarm3.setRotationPoint(-1.75F, 0.25F, 0.25F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.1309F, -0.4363F, -0.0436F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 17, 6, -2.0F, 0.0F, -1.6F, 3, 0, 3, 0.0F, false));
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 15, 3, -2.0F, 0.05F, -1.6F, 3, 0, 3, 0.0F, false));

        this.Belly = new AdvancedModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.Body.addChild(Belly);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 0, -2.0F, -1.5F, -0.5F, 4, 2, 4, 0.01F, false));

        this.Leftleg1 = new AdvancedModelRenderer(this);
        this.Leftleg1.setRotationPoint(1.0F, -0.75F, 3.6F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, 0.0F, 0.829F, 0.1134F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 0, 20, -0.75F, -1.0F, -0.35F, 4, 1, 1, 0.0F, true));
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 9, 21, -0.75F, -1.0F, -1.0F, 4, 1, 1, 0.01F, true));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(3.1F, 0.05F, -0.15F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.0436F, -2.0508F, 0.0F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 10, 6, -0.5F, -1.0F, 0.0F, 4, 1, 1, -0.01F, true));
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 20, 9, -0.5F, -1.0F, -0.5F, 4, 1, 1, 0.0F, true));

        this.Leftleg3 = new AdvancedModelRenderer(this);
        this.Leftleg3.setRotationPoint(3.5F, 0.025F, 0.4F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, 0.1309F, 1.9635F, -0.0349F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 10, 18, 0.0F, -1.0F, -0.5F, 3, 1, 1, -0.02F, true));
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 23, 21, 0.0F, -1.0F, -1.0F, 3, 1, 1, -0.01F, true));

        this.Leftleg4 = new AdvancedModelRenderer(this);
        this.Leftleg4.setRotationPoint(3.0F, -0.25F, 0.0F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.0F, 0.2618F, -0.0175F);
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 0, 13, -1.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 11, 0, -1.0F, 0.1F, -1.5F, 4, 0, 3, 0.0F, true));

        this.Rightleg1 = new AdvancedModelRenderer(this);
        this.Rightleg1.setRotationPoint(-1.0F, -0.75F, 3.6F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, 0.0F, -0.829F, -0.1134F);
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 0, 20, -3.25F, -1.0F, -0.35F, 4, 1, 1, 0.0F, false));
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 9, 21, -3.25F, -1.0F, -1.0F, 4, 1, 1, 0.01F, false));

        this.Rightleg2 = new AdvancedModelRenderer(this);
        this.Rightleg2.setRotationPoint(-3.1F, 0.05F, -0.15F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 0.0436F, 2.0508F, 0.0F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 10, 6, -3.5F, -1.0F, 0.0F, 4, 1, 1, -0.01F, false));
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 20, 9, -3.5F, -1.0F, -0.5F, 4, 1, 1, 0.0F, false));

        this.Rightleg3 = new AdvancedModelRenderer(this);
        this.Rightleg3.setRotationPoint(-3.5F, 0.025F, 0.4F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, 0.1309F, -1.9635F, 0.0349F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 10, 18, -3.0F, -1.0F, -0.5F, 3, 1, 1, -0.02F, false));
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 23, 21, -3.0F, -1.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.Rightleg4 = new AdvancedModelRenderer(this);
        this.Rightleg4.setRotationPoint(-3.0F, -0.25F, 0.0F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.0F, -0.2618F, 0.0175F);
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 0, 13, -3.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 11, 0, -3.0F, 0.1F, -1.5F, 4, 0, 3, 0.0F, false));
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
        this.Tongue.offsetZ = -0.005F;
        this.Hips.offsetY = 0.066F;
        this.Hips.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -2.2F;
        this.Hips.offsetX = 0.2F;
        this.Hips.rotateAngleY = (float)Math.toRadians(200);
        this.Hips.rotateAngleX = (float)Math.toRadians(48);
        this.Hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.Hips.scaleChildren = true;
        float scaler = 6.0F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.6F, 3.8F, -0.2F);
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


        EntityPrehistoricFloraProsalirus entitySilesaurus = (EntityPrehistoricFloraProsalirus) e;
        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

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
        EntityPrehistoricFloraProsalirus ee = (EntityPrehistoricFloraProsalirus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.JUMP_ANIMATION && ee.isWalking && ee.onGround) {
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
        } else if (ee.getAnimation() == ee.JUMP_ANIMATION) {
            animJump(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

        if(ee.getAnimation() != ee.ROAR_ANIMATION) {
            this.Belly.setScale((float)1,(float)1,(float)1);
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProsalirus entity = (EntityPrehistoricFloraProsalirus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-10), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4.11883 + (((tickAnim - 0) / 5) * (4.38789-(4.11883)));
            yy = 115.3637 + (((tickAnim - 0) / 5) * (102.86137-(115.3637)));
            zz = 4.09069 + (((tickAnim - 0) / 5) * (4.39996-(4.09069)));
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
            xx = 3.88632 + (((tickAnim - 32) / 3) * (3.55593-(3.88632)));
            yy = 50.3195 + (((tickAnim - 32) / 3) * (82.8694-(50.3195)));
            zz = 7.9408 + (((tickAnim - 32) / 3) * (5.8311-(7.9408)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 3.55593 + (((tickAnim - 35) / 5) * (4.11883-(3.55593)));
            yy = 82.8694 + (((tickAnim - 35) / 5) * (115.3637-(82.8694)));
            zz = 5.8311 + (((tickAnim - 35) / 5) * (4.09069-(5.8311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 0) / 5) * (0-(5)));
            yy = -87.5 + (((tickAnim - 0) / 5) * (-90-(-87.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-5-(0)));
            yy = -90 + (((tickAnim - 5) / 5) * (-12.5-(-90)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 10) / 5) * (0-(-5)));
            yy = -12.5 + (((tickAnim - 10) / 5) * (20-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 5) * (-32.5-(20)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -32.5 + (((tickAnim - 20) / 5) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-13.89476-(0)));
            yy = -32.5 + (((tickAnim - 25) / 5) * (-42.80468-(-32.5)));
            zz = 0 + (((tickAnim - 25) / 5) * (-14.11351-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -13.89476 + (((tickAnim - 30) / 5) * (-2.28888-(-13.89476)));
            yy = -42.80468 + (((tickAnim - 30) / 5) * (-75.04995-(-42.80468)));
            zz = -14.11351 + (((tickAnim - 30) / 5) * (-3.38905-(-14.11351)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.28888 + (((tickAnim - 35) / 5) * (5-(-2.28888)));
            yy = -75.04995 + (((tickAnim - 35) / 5) * (-87.5-(-75.04995)));
            zz = -3.38905 + (((tickAnim - 35) / 5) * (0-(-3.38905)));
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
            xx = -29.05275 + (((tickAnim - 10) / 5) * (111.59527-(-29.05275)));
            yy = 26.91279 + (((tickAnim - 10) / 5) * (12.2991-(26.91279)));
            zz = 9.19372 + (((tickAnim - 10) / 5) * (-111.0043-(9.19372)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 111.59527 + (((tickAnim - 15) / 5) * (-21.58948-(111.59527)));
            yy = 12.2991 + (((tickAnim - 15) / 5) * (15.96195-(12.2991)));
            zz = -111.0043 + (((tickAnim - 15) / 5) * (20.80651-(-111.0043)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -21.58948 + (((tickAnim - 20) / 5) * (-44.05275-(-21.58948)));
            yy = 15.96195 + (((tickAnim - 20) / 5) * (9.41279-(15.96195)));
            zz = 20.80651 + (((tickAnim - 20) / 5) * (46.69372-(20.80651)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -44.05275 + (((tickAnim - 25) / 5) * (-16.55275-(-44.05275)));
            yy = 9.41279 + (((tickAnim - 25) / 5) * (51.91279-(9.41279)));
            zz = 46.69372 + (((tickAnim - 25) / 5) * (11.69372-(46.69372)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -16.55275 + (((tickAnim - 30) / 5) * (-11.55275-(-16.55275)));
            yy = 51.91279 + (((tickAnim - 30) / 5) * (94.41279-(51.91279)));
            zz = 11.69372 + (((tickAnim - 30) / 5) * (9.19372-(11.69372)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -11.55275 + (((tickAnim - 35) / 5) * (-11.55275-(-11.55275)));
            yy = 94.41279 + (((tickAnim - 35) / 5) * (69.41279-(94.41279)));
            zz = 9.19372 + (((tickAnim - 35) / 5) * (9.19372-(9.19372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -6.96072 + (((tickAnim - 0) / 5) * (1.7329-(-6.96072)));
            yy = -54.61005 + (((tickAnim - 0) / 5) * (-12.42612-(-54.61005)));
            zz = 6.74718 + (((tickAnim - 0) / 5) * (-0.63439-(6.74718)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.7329 + (((tickAnim - 5) / 5) * (1.95834-(1.7329)));
            yy = -12.42612 + (((tickAnim - 5) / 5) * (-39.92098-(-12.42612)));
            zz = -0.63439 + (((tickAnim - 5) / 5) * (-1.0267-(-0.63439)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.95834 + (((tickAnim - 10) / 5) * (3.24288-(1.95834)));
            yy = -39.92098 + (((tickAnim - 10) / 5) * (-62.39977-(-39.92098)));
            zz = -1.0267 + (((tickAnim - 10) / 5) * (-2.64418-(-1.0267)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.24288 + (((tickAnim - 15) / 5) * (0-(3.24288)));
            yy = -62.39977 + (((tickAnim - 15) / 5) * (0-(-62.39977)));
            zz = -2.64418 + (((tickAnim - 15) / 5) * (5-(-2.64418)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-0.78795-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-17.48281-(0)));
            zz = 5 + (((tickAnim - 20) / 5) * (7.62116-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -0.78795 + (((tickAnim - 25) / 2) * (-1.54904-(-0.78795)));
            yy = -17.48281 + (((tickAnim - 25) / 2) * (-27.43821-(-17.48281)));
            zz = 7.62116 + (((tickAnim - 25) / 2) * (10.24474-(7.62116)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -1.54904 + (((tickAnim - 27) / 3) * (4.71969-(-1.54904)));
            yy = -27.43821 + (((tickAnim - 27) / 3) * (-47.41602-(-27.43821)));
            zz = 10.24474 + (((tickAnim - 27) / 3) * (-1.40438-(10.24474)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 4.71969 + (((tickAnim - 30) / 5) * (2.78873-(4.71969)));
            yy = -47.41602 + (((tickAnim - 30) / 5) * (-57.40665-(-47.41602)));
            zz = -1.40438 + (((tickAnim - 30) / 5) * (-2.11976-(-1.40438)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.78873 + (((tickAnim - 35) / 5) * (-6.96072-(2.78873)));
            yy = -57.40665 + (((tickAnim - 35) / 5) * (-54.61005-(-57.40665)));
            zz = -2.11976 + (((tickAnim - 35) / 5) * (6.74718-(-2.11976)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-1), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*5), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-10), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*3), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (7.5-(0)));
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
            xx = -13.28435 + (((tickAnim - 35) / 5) * (0-(-13.28435)));
            yy = -14.87384 + (((tickAnim - 35) / 5) * (0-(-14.87384)));
            zz = 30.1171 + (((tickAnim - 35) / 5) * (0-(30.1171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




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
            yy = 70 + (((tickAnim - 20) / 5) * (27.4976-(70)));
            zz = 15 + (((tickAnim - 20) / 5) * (10.0119-(15)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.60943 + (((tickAnim - 25) / 5) * (-2.6229-(-2.60943)));
            yy = 27.4976 + (((tickAnim - 25) / 5) * (4.99768-(27.4976)));
            zz = 10.0119 + (((tickAnim - 25) / 5) * (-2.44087-(10.0119)));
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
            xx = -13.28435 + (((tickAnim - 15) / 5) * (0-(-13.28435)));
            yy = 14.87384 + (((tickAnim - 15) / 5) * (0-(14.87384)));
            zz = -30.1171 + (((tickAnim - 15) / 5) * (0-(-30.1171)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-7.5-(0)));
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
            xx = 3.88632 + (((tickAnim - 12) / 3) * (3.55593-(3.88632)));
            yy = -50.3195 + (((tickAnim - 12) / 3) * (-82.8694-(-50.3195)));
            zz = -7.9408 + (((tickAnim - 12) / 3) * (-5.8311-(-7.9408)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.55593 + (((tickAnim - 15) / 5) * (4.11883-(3.55593)));
            yy = -82.8694 + (((tickAnim - 15) / 5) * (-115.3637-(-82.8694)));
            zz = -5.8311 + (((tickAnim - 15) / 5) * (-4.09069-(-5.8311)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 4.11883 + (((tickAnim - 20) / 5) * (4.38789-(4.11883)));
            yy = -115.3637 + (((tickAnim - 20) / 5) * (-102.86137-(-115.3637)));
            zz = -4.09069 + (((tickAnim - 20) / 5) * (-4.39996-(-4.09069)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 32.5 + (((tickAnim - 0) / 5) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-13.89476-(0)));
            yy = 32.5 + (((tickAnim - 5) / 5) * (42.80468-(32.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (14.11351-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.89476 + (((tickAnim - 10) / 5) * (-2.28888-(-13.89476)));
            yy = 42.80468 + (((tickAnim - 10) / 5) * (75.04995-(42.80468)));
            zz = 14.11351 + (((tickAnim - 10) / 5) * (3.38905-(14.11351)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.28888 + (((tickAnim - 15) / 5) * (5-(-2.28888)));
            yy = 75.04995 + (((tickAnim - 15) / 5) * (87.5-(75.04995)));
            zz = 3.38905 + (((tickAnim - 15) / 5) * (0-(3.38905)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 20) / 5) * (0-(5)));
            yy = 87.5 + (((tickAnim - 20) / 5) * (90-(87.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-5-(0)));
            yy = 90 + (((tickAnim - 25) / 5) * (12.5-(90)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 30) / 5) * (0-(-5)));
            yy = 12.5 + (((tickAnim - 30) / 5) * (-20-(12.5)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -20 + (((tickAnim - 35) / 5) * (32.5-(-20)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -21.58948 + (((tickAnim - 0) / 5) * (-44.05275-(-21.58948)));
            yy = -15.96195 + (((tickAnim - 0) / 5) * (-9.41279-(-15.96195)));
            zz = -20.80651 + (((tickAnim - 0) / 5) * (-46.69372-(-20.80651)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -44.05275 + (((tickAnim - 5) / 5) * (-16.55275-(-44.05275)));
            yy = -9.41279 + (((tickAnim - 5) / 5) * (-51.91279-(-9.41279)));
            zz = -46.69372 + (((tickAnim - 5) / 5) * (-11.69372-(-46.69372)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -16.55275 + (((tickAnim - 10) / 5) * (-11.55275-(-16.55275)));
            yy = -51.91279 + (((tickAnim - 10) / 5) * (-94.41279-(-51.91279)));
            zz = -11.69372 + (((tickAnim - 10) / 5) * (-9.19372-(-11.69372)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.55275 + (((tickAnim - 15) / 5) * (-11.55275-(-11.55275)));
            yy = -94.41279 + (((tickAnim - 15) / 5) * (-69.41279-(-94.41279)));
            zz = -9.19372 + (((tickAnim - 15) / 5) * (-9.19372-(-9.19372)));
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
            xx = -29.05275 + (((tickAnim - 30) / 5) * (111.59527-(-29.05275)));
            yy = -26.91279 + (((tickAnim - 30) / 5) * (-12.2991-(-26.91279)));
            zz = -9.19372 + (((tickAnim - 30) / 5) * (111.0043-(-9.19372)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 111.59527 + (((tickAnim - 35) / 5) * (-21.58948-(111.59527)));
            yy = -12.2991 + (((tickAnim - 35) / 5) * (-15.96195-(-12.2991)));
            zz = 111.0043 + (((tickAnim - 35) / 5) * (-20.80651-(111.0043)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.78795-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (17.48281-(0)));
            zz = -5 + (((tickAnim - 0) / 5) * (-7.62116-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.78795 + (((tickAnim - 5) / 2) * (-1.54904-(-0.78795)));
            yy = 17.48281 + (((tickAnim - 5) / 2) * (27.43821-(17.48281)));
            zz = -7.62116 + (((tickAnim - 5) / 2) * (-10.24474-(-7.62116)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.54904 + (((tickAnim - 7) / 3) * (4.71969-(-1.54904)));
            yy = 27.43821 + (((tickAnim - 7) / 3) * (47.41602-(27.43821)));
            zz = -10.24474 + (((tickAnim - 7) / 3) * (1.40438-(-10.24474)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 4.71969 + (((tickAnim - 10) / 5) * (2.78873-(4.71969)));
            yy = 47.41602 + (((tickAnim - 10) / 5) * (57.40665-(47.41602)));
            zz = 1.40438 + (((tickAnim - 10) / 5) * (2.11976-(1.40438)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.78873 + (((tickAnim - 15) / 5) * (-6.96072-(2.78873)));
            yy = 57.40665 + (((tickAnim - 15) / 5) * (54.61005-(57.40665)));
            zz = 2.11976 + (((tickAnim - 15) / 5) * (-6.74718-(2.11976)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -6.96072 + (((tickAnim - 20) / 5) * (1.7329-(-6.96072)));
            yy = 54.61005 + (((tickAnim - 20) / 5) * (12.42612-(54.61005)));
            zz = -6.74718 + (((tickAnim - 20) / 5) * (0.63439-(-6.74718)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.7329 + (((tickAnim - 25) / 5) * (1.95834-(1.7329)));
            yy = 12.42612 + (((tickAnim - 25) / 5) * (39.92098-(12.42612)));
            zz = 0.63439 + (((tickAnim - 25) / 5) * (1.0267-(0.63439)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.95834 + (((tickAnim - 30) / 5) * (3.24288-(1.95834)));
            yy = 39.92098 + (((tickAnim - 30) / 5) * (62.39977-(39.92098)));
            zz = 1.0267 + (((tickAnim - 30) / 5) * (2.64418-(1.0267)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 3.24288 + (((tickAnim - 35) / 5) * (0-(3.24288)));
            yy = 62.39977 + (((tickAnim - 35) / 5) * (0-(62.39977)));
            zz = 2.64418 + (((tickAnim - 35) / 5) * (-5-(2.64418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProsalirus entity = (EntityPrehistoricFloraProsalirus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66))*1), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.66+60))*-10), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66-120))*-0.25);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66-30))*0.5);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4.11883 + (((tickAnim - 0) / 2) * (4.38789-(4.11883)));
            yy = 115.3637 + (((tickAnim - 0) / 2) * (102.86137-(115.3637)));
            zz = 4.09069 + (((tickAnim - 0) / 2) * (4.39996-(4.09069)));
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
            xx = 3.88632 + (((tickAnim - 11) / 1) * (3.55593-(3.88632)));
            yy = 50.3195 + (((tickAnim - 11) / 1) * (82.8694-(50.3195)));
            zz = 7.9408 + (((tickAnim - 11) / 1) * (5.8311-(7.9408)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 3.55593 + (((tickAnim - 12) / 1) * (4.11883-(3.55593)));
            yy = 82.8694 + (((tickAnim - 12) / 1) * (115.3637-(82.8694)));
            zz = 5.8311 + (((tickAnim - 12) / 1) * (4.09069-(5.8311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 5 + (((tickAnim - 0) / 2) * (0-(5)));
            yy = -87.5 + (((tickAnim - 0) / 2) * (-90-(-87.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-5-(0)));
            yy = -90 + (((tickAnim - 2) / 1) * (-12.5-(-90)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            yy = -12.5 + (((tickAnim - 3) / 2) * (20-(-12.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 5) / 2) * (-32.5-(20)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -32.5 + (((tickAnim - 7) / 1) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-13.89476-(0)));
            yy = -32.5 + (((tickAnim - 8) / 2) * (-42.80468-(-32.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (-14.11351-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -13.89476 + (((tickAnim - 10) / 2) * (-2.28888-(-13.89476)));
            yy = -42.80468 + (((tickAnim - 10) / 2) * (-75.04995-(-42.80468)));
            zz = -14.11351 + (((tickAnim - 10) / 2) * (-3.38905-(-14.11351)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -2.28888 + (((tickAnim - 12) / 1) * (5-(-2.28888)));
            yy = -75.04995 + (((tickAnim - 12) / 1) * (-87.5-(-75.04995)));
            zz = -3.38905 + (((tickAnim - 12) / 1) * (0-(-3.38905)));
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
            xx = -29.05275 + (((tickAnim - 3) / 2) * (111.59527-(-29.05275)));
            yy = 26.91279 + (((tickAnim - 3) / 2) * (12.2991-(26.91279)));
            zz = 9.19372 + (((tickAnim - 3) / 2) * (-111.0043-(9.19372)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 111.59527 + (((tickAnim - 5) / 2) * (-21.58948-(111.59527)));
            yy = 12.2991 + (((tickAnim - 5) / 2) * (15.96195-(12.2991)));
            zz = -111.0043 + (((tickAnim - 5) / 2) * (20.80651-(-111.0043)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -21.58948 + (((tickAnim - 7) / 1) * (-44.05275-(-21.58948)));
            yy = 15.96195 + (((tickAnim - 7) / 1) * (9.41279-(15.96195)));
            zz = 20.80651 + (((tickAnim - 7) / 1) * (46.69372-(20.80651)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -44.05275 + (((tickAnim - 8) / 2) * (-16.55275-(-44.05275)));
            yy = 9.41279 + (((tickAnim - 8) / 2) * (51.91279-(9.41279)));
            zz = 46.69372 + (((tickAnim - 8) / 2) * (11.69372-(46.69372)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -16.55275 + (((tickAnim - 10) / 2) * (-11.55275-(-16.55275)));
            yy = 51.91279 + (((tickAnim - 10) / 2) * (94.41279-(51.91279)));
            zz = 11.69372 + (((tickAnim - 10) / 2) * (9.19372-(11.69372)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -11.55275 + (((tickAnim - 12) / 1) * (-11.55275-(-11.55275)));
            yy = 94.41279 + (((tickAnim - 12) / 1) * (69.41279-(94.41279)));
            zz = 9.19372 + (((tickAnim - 12) / 1) * (9.19372-(9.19372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -6.96072 + (((tickAnim - 0) / 2) * (1.7329-(-6.96072)));
            yy = -54.61005 + (((tickAnim - 0) / 2) * (-12.42612-(-54.61005)));
            zz = 6.74718 + (((tickAnim - 0) / 2) * (-0.63439-(6.74718)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.7329 + (((tickAnim - 2) / 1) * (1.95834-(1.7329)));
            yy = -12.42612 + (((tickAnim - 2) / 1) * (-39.92098-(-12.42612)));
            zz = -0.63439 + (((tickAnim - 2) / 1) * (-1.0267-(-0.63439)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.95834 + (((tickAnim - 3) / 2) * (3.24288-(1.95834)));
            yy = -39.92098 + (((tickAnim - 3) / 2) * (-62.39977-(-39.92098)));
            zz = -1.0267 + (((tickAnim - 3) / 2) * (-2.64418-(-1.0267)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.24288 + (((tickAnim - 5) / 2) * (0-(3.24288)));
            yy = -62.39977 + (((tickAnim - 5) / 2) * (0-(-62.39977)));
            zz = -2.64418 + (((tickAnim - 5) / 2) * (5-(-2.64418)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-0.78795-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (-17.48281-(0)));
            zz = 5 + (((tickAnim - 7) / 1) * (7.62116-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.78795 + (((tickAnim - 8) / 1) * (-1.54904-(-0.78795)));
            yy = -17.48281 + (((tickAnim - 8) / 1) * (-27.43821-(-17.48281)));
            zz = 7.62116 + (((tickAnim - 8) / 1) * (10.24474-(7.62116)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -1.54904 + (((tickAnim - 9) / 1) * (4.71969-(-1.54904)));
            yy = -27.43821 + (((tickAnim - 9) / 1) * (-47.41602-(-27.43821)));
            zz = 10.24474 + (((tickAnim - 9) / 1) * (-1.40438-(10.24474)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 4.71969 + (((tickAnim - 10) / 2) * (2.78873-(4.71969)));
            yy = -47.41602 + (((tickAnim - 10) / 2) * (-57.40665-(-47.41602)));
            zz = -1.40438 + (((tickAnim - 10) / 2) * (-2.11976-(-1.40438)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 2.78873 + (((tickAnim - 12) / 1) * (-6.96072-(2.78873)));
            yy = -57.40665 + (((tickAnim - 12) / 1) * (-54.61005-(-57.40665)));
            zz = -2.11976 + (((tickAnim - 12) / 1) * (6.74718-(-2.11976)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66-90))*-1), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.66-60))*5), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.66-30))*3));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.66-90))*-10), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.66+60))*3), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));



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
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (7.5-(0)));
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
            xx = -13.28435 + (((tickAnim - 12) / 1) * (0-(-13.28435)));
            yy = -14.87384 + (((tickAnim - 12) / 1) * (0-(-14.87384)));
            zz = 30.1171 + (((tickAnim - 12) / 1) * (0-(30.1171)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




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
            yy = 70 + (((tickAnim - 7) / 1) * (27.4976-(70)));
            zz = 15 + (((tickAnim - 7) / 1) * (10.0119-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.60943 + (((tickAnim - 8) / 2) * (-2.6229-(-2.60943)));
            yy = 27.4976 + (((tickAnim - 8) / 2) * (4.99768-(27.4976)));
            zz = 10.0119 + (((tickAnim - 8) / 2) * (-2.44087-(10.0119)));
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
            xx = -13.28435 + (((tickAnim - 5) / 2) * (0-(-13.28435)));
            yy = 14.87384 + (((tickAnim - 5) / 2) * (0-(14.87384)));
            zz = -30.1171 + (((tickAnim - 5) / 2) * (0-(-30.1171)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-7.5-(0)));
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
            xx = 3.88632 + (((tickAnim - 4) / 1) * (3.55593-(3.88632)));
            yy = -50.3195 + (((tickAnim - 4) / 1) * (-82.8694-(-50.3195)));
            zz = -7.9408 + (((tickAnim - 4) / 1) * (-5.8311-(-7.9408)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.55593 + (((tickAnim - 5) / 2) * (4.11883-(3.55593)));
            yy = -82.8694 + (((tickAnim - 5) / 2) * (-115.3637-(-82.8694)));
            zz = -5.8311 + (((tickAnim - 5) / 2) * (-4.09069-(-5.8311)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 4.11883 + (((tickAnim - 7) / 1) * (4.38789-(4.11883)));
            yy = -115.3637 + (((tickAnim - 7) / 1) * (-102.86137-(-115.3637)));
            zz = -4.09069 + (((tickAnim - 7) / 1) * (-4.39996-(-4.09069)));
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
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 32.5 + (((tickAnim - 0) / 2) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-13.89476-(0)));
            yy = 32.5 + (((tickAnim - 2) / 1) * (42.80468-(32.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (14.11351-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.89476 + (((tickAnim - 3) / 2) * (-2.28888-(-13.89476)));
            yy = 42.80468 + (((tickAnim - 3) / 2) * (75.04995-(42.80468)));
            zz = 14.11351 + (((tickAnim - 3) / 2) * (3.38905-(14.11351)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.28888 + (((tickAnim - 5) / 2) * (5-(-2.28888)));
            yy = 75.04995 + (((tickAnim - 5) / 2) * (87.5-(75.04995)));
            zz = 3.38905 + (((tickAnim - 5) / 2) * (0-(3.38905)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 7) / 1) * (0-(5)));
            yy = 87.5 + (((tickAnim - 7) / 1) * (90-(87.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-5-(0)));
            yy = 90 + (((tickAnim - 8) / 2) * (12.5-(90)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 10) / 2) * (0-(-5)));
            yy = 12.5 + (((tickAnim - 10) / 2) * (-20-(12.5)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -20 + (((tickAnim - 12) / 1) * (32.5-(-20)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -21.58948 + (((tickAnim - 0) / 2) * (-44.05275-(-21.58948)));
            yy = -15.96195 + (((tickAnim - 0) / 2) * (-9.41279-(-15.96195)));
            zz = -20.80651 + (((tickAnim - 0) / 2) * (-46.69372-(-20.80651)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -44.05275 + (((tickAnim - 2) / 1) * (-16.55275-(-44.05275)));
            yy = -9.41279 + (((tickAnim - 2) / 1) * (-51.91279-(-9.41279)));
            zz = -46.69372 + (((tickAnim - 2) / 1) * (-11.69372-(-46.69372)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.55275 + (((tickAnim - 3) / 2) * (-11.55275-(-16.55275)));
            yy = -51.91279 + (((tickAnim - 3) / 2) * (-94.41279-(-51.91279)));
            zz = -11.69372 + (((tickAnim - 3) / 2) * (-9.19372-(-11.69372)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -11.55275 + (((tickAnim - 5) / 2) * (-11.55275-(-11.55275)));
            yy = -94.41279 + (((tickAnim - 5) / 2) * (-69.41279-(-94.41279)));
            zz = -9.19372 + (((tickAnim - 5) / 2) * (-9.19372-(-9.19372)));
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
            xx = -29.05275 + (((tickAnim - 10) / 2) * (111.59527-(-29.05275)));
            yy = -26.91279 + (((tickAnim - 10) / 2) * (-12.2991-(-26.91279)));
            zz = -9.19372 + (((tickAnim - 10) / 2) * (111.0043-(-9.19372)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 111.59527 + (((tickAnim - 12) / 1) * (-21.58948-(111.59527)));
            yy = -12.2991 + (((tickAnim - 12) / 1) * (-15.96195-(-12.2991)));
            zz = 111.0043 + (((tickAnim - 12) / 1) * (-20.80651-(111.0043)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.78795-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (17.48281-(0)));
            zz = -5 + (((tickAnim - 0) / 2) * (-7.62116-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.78795 + (((tickAnim - 2) / 1) * (-1.54904-(-0.78795)));
            yy = 17.48281 + (((tickAnim - 2) / 1) * (27.43821-(17.48281)));
            zz = -7.62116 + (((tickAnim - 2) / 1) * (-10.24474-(-7.62116)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -1.54904 + (((tickAnim - 3) / 0) * (4.71969-(-1.54904)));
            yy = 27.43821 + (((tickAnim - 3) / 0) * (47.41602-(27.43821)));
            zz = -10.24474 + (((tickAnim - 3) / 0) * (1.40438-(-10.24474)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 4.71969 + (((tickAnim - 3) / 2) * (2.78873-(4.71969)));
            yy = 47.41602 + (((tickAnim - 3) / 2) * (57.40665-(47.41602)));
            zz = 1.40438 + (((tickAnim - 3) / 2) * (2.11976-(1.40438)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.78873 + (((tickAnim - 5) / 2) * (-6.96072-(2.78873)));
            yy = 57.40665 + (((tickAnim - 5) / 2) * (54.61005-(57.40665)));
            zz = 2.11976 + (((tickAnim - 5) / 2) * (-6.74718-(2.11976)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -6.96072 + (((tickAnim - 7) / 1) * (1.7329-(-6.96072)));
            yy = 54.61005 + (((tickAnim - 7) / 1) * (12.42612-(54.61005)));
            zz = -6.74718 + (((tickAnim - 7) / 1) * (0.63439-(-6.74718)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.7329 + (((tickAnim - 8) / 2) * (1.95834-(1.7329)));
            yy = 12.42612 + (((tickAnim - 8) / 2) * (39.92098-(12.42612)));
            zz = 0.63439 + (((tickAnim - 8) / 2) * (1.0267-(0.63439)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 1.95834 + (((tickAnim - 10) / 2) * (3.24288-(1.95834)));
            yy = 39.92098 + (((tickAnim - 10) / 2) * (62.39977-(39.92098)));
            zz = 1.0267 + (((tickAnim - 10) / 2) * (2.64418-(1.0267)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 3.24288 + (((tickAnim - 12) / 1) * (0-(3.24288)));
            yy = 62.39977 + (((tickAnim - 12) / 1) * (0-(62.39977)));
            zz = 2.64418 + (((tickAnim - 12) / 1) * (-5-(2.64418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProsalirus entity = (EntityPrehistoricFloraProsalirus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10), Rightleg1.rotateAngleY + (float) Math.toRadians(80+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*50), Rightleg1.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-10));


        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(0), Rightleg2.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*70), Rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*30), Rightleg3.rotateAngleY + (float) Math.toRadians(60+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*70), Rightleg3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*10));


        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(0), Rightleg4.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*30), Rightleg4.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*30));


        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-3), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.25);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-4);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-3));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*3), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-3), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(77.5), Rightarm1.rotateAngleY + (float) Math.toRadians(35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120))*-5), Rightarm1.rotateAngleZ + (float) Math.toRadians(-25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*5));
        this.Rightarm1.rotationPointX = this.Rightarm1.rotationPointX + (float)(-0.5);
        this.Rightarm1.rotationPointY = this.Rightarm1.rotationPointY - (float)(0.5);
        this.Rightarm1.rotationPointZ = this.Rightarm1.rotationPointZ + (float)(-1.5);


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(5), Rightarm2.rotateAngleY + (float) Math.toRadians(65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), Rightarm2.rotateAngleZ + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*5));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(-10), Rightarm3.rotateAngleY + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5), Rightarm3.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5));


        this.setRotateAngle(Belly, Belly.rotateAngleX + (float) Math.toRadians(0), Belly.rotateAngleY + (float) Math.toRadians(0), Belly.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3));
        this.Belly.rotationPointX = this.Belly.rotationPointX + (float)(0);
        this.Belly.rotationPointY = this.Belly.rotationPointY - (float)(0);
        this.Belly.rotationPointZ = this.Belly.rotationPointZ + (float)(-0.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.1);


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(77.5), Leftarm1.rotateAngleY + (float) Math.toRadians(-35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120))*5), Leftarm1.rotateAngleZ + (float) Math.toRadians(25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-5));
        this.Leftarm1.rotationPointX = this.Leftarm1.rotationPointX + (float)(0.5);
        this.Leftarm1.rotationPointY = this.Leftarm1.rotationPointY - (float)(0.5);
        this.Leftarm1.rotationPointZ = this.Leftarm1.rotationPointZ + (float)(-1.5);


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(5), Leftarm2.rotateAngleY + (float) Math.toRadians(-65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*5), Leftarm2.rotateAngleZ + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-5));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(-10), Leftarm3.rotateAngleY + (float) Math.toRadians(-45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-5), Leftarm3.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-5));


        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10), Leftleg1.rotateAngleY + (float) Math.toRadians(-80+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-50), Leftleg1.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10));


        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(0), Leftleg2.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*-70), Leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*30), Leftleg3.rotateAngleY + (float) Math.toRadians(-70+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-70), Leftleg3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-10));


        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(0), Leftleg4.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-30), Leftleg4.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-30));


    }
    public void animCroak(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProsalirus entity = (EntityPrehistoricFloraProsalirus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11 + (((tickAnim - 10) / 10) * (0-(-11)));
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
            xx = 1 + (((tickAnim - 0) / 10) * (1.5-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1.67-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 10) / 10) * (1-(1.5)));
            yy = 1.67 + (((tickAnim - 10) / 10) * (1-(1.67)));
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
            yy = -0.1 + (((tickAnim - 0) / 10) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Belly.rotationPointX = this.Belly.rotationPointX + (float)(xx);
        this.Belly.rotationPointY = this.Belly.rotationPointY - (float)(yy);
        this.Belly.rotationPointZ = this.Belly.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
            yy = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
            zz = 1.2 + (((tickAnim - 0) / 10) * (1-(1.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
            yy = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
            zz = 1 + (((tickAnim - 10) / 10) * (1.2-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Belly.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animJump(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProsalirus entity = (EntityPrehistoricFloraProsalirus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20 + (((tickAnim - 5) / 5) * (20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100 + (((tickAnim - 5) / 5) * (100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 10) / 8) * (0-(20)));
            yy = 100 + (((tickAnim - 10) / 8) * (0-(100)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-80 + (((tickAnim - 5) / 5) * (-80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-80)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -80 + (((tickAnim - 10) / 8) * (0-(-80)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*120-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*120 + (((tickAnim - 5) / 5) * (120-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*120)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 120 + (((tickAnim - 10) / 8) * (0-(120)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-20 + (((tickAnim - 5) / 5) * (-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-20)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 10) / 8) * (0-(-20)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 1) * (-1.11-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -1.11 + (((tickAnim - 1) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-30-(-1.11)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-30 + (((tickAnim - 5) / 5) * (-3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-30)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*20 + (((tickAnim - 10) / 5) * (57.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+100))*35-(-3.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 57.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+100))*35 + (((tickAnim - 15) / 3) * (0-(57.155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+100))*35)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 1) / 2) * (0.485-(0.475)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.485 + (((tickAnim - 3) / 2) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*10-(0.485)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*10 + (((tickAnim - 5) / 5) * (9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*10)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20 + (((tickAnim - 10) / 5) * (5.07-(9.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*20)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 5.07 + (((tickAnim - 15) / 3) * (0-(5.07)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*20)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 5) / 5) * (-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 10) / 8) * (0-(-10)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+60))*10 + (((tickAnim - 5) / 5) * (10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+60))*10)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 10) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10 + (((tickAnim - 5) / 5) * (10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*40 + (((tickAnim - 5) / 5) * (40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*40)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10 + (((tickAnim - 5) / 5) * (10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 10) / 5) * (2.06864-(10)));
            yy = 40 + (((tickAnim - 10) / 5) * (-36.49981-(40)));
            zz = 10 + (((tickAnim - 10) / 5) * (1.2821-(10)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.06864 + (((tickAnim - 15) / 3) * (0-(2.06864)));
            yy = -36.49981 + (((tickAnim - 15) / 3) * (0-(-36.49981)));
            zz = 1.2821 + (((tickAnim - 15) / 3) * (0-(1.2821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100 + (((tickAnim - 5) / 5) * (100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*100)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 100 + (((tickAnim - 10) / 8) * (0-(100)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*30 + (((tickAnim - 5) / 5) * (30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*30)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 30 + (((tickAnim - 10) / 8) * (0-(30)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*20 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*20)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10 + (((tickAnim - 5) / 5) * (10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-40 + (((tickAnim - 5) / 5) * (-40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-40)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-10 + (((tickAnim - 5) / 5) * (-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 10) / 5) * (2.06864-(10)));
            yy = -40 + (((tickAnim - 10) / 5) * (36.49981-(-40)));
            zz = -10 + (((tickAnim - 10) / 5) * (1.2821-(-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.06864 + (((tickAnim - 15) / 3) * (0-(2.06864)));
            yy = 36.49981 + (((tickAnim - 15) / 3) * (0-(36.49981)));
            zz = 1.2821 + (((tickAnim - 15) / 3) * (0-(1.2821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100 + (((tickAnim - 5) / 5) * (-100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -100 + (((tickAnim - 10) / 8) * (0-(-100)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*30)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-30 + (((tickAnim - 5) / 5) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-30)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -30 + (((tickAnim - 10) / 8) * (0-(-30)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20 + (((tickAnim - 5) / 5) * (20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100 + (((tickAnim - 5) / 5) * (-100-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-100)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 10) / 8) * (0-(20)));
            yy = -100 + (((tickAnim - 10) / 8) * (0-(-100)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*80 + (((tickAnim - 5) / 5) * (80-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*80)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 80 + (((tickAnim - 10) / 8) * (0-(80)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-120-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-120 + (((tickAnim - 5) / 5) * (-120-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*-120)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -120 + (((tickAnim - 10) / 8) * (0-(-120)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-50)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*20 + (((tickAnim - 5) / 5) * (20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-30))*20)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 8) * (0-(20)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animTongue(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProsalirus entity = (EntityPrehistoricFloraProsalirus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 5) / 7) * (10-(10)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 12) / 8) * (0-(10)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




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
            yy = 0 + (((tickAnim - 5) / 3) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 4) * (0-(-0.25)));
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
            yy = 1 + (((tickAnim - 5) / 3) * (0.5-(1)));
            zz = 1 + (((tickAnim - 5) / 3) * (3-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 8) / 4) * (1-(1)));
            yy = 0.5 + (((tickAnim - 8) / 4) * (1-(0.5)));
            zz = 3 + (((tickAnim - 8) / 4) * (1-(3)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Tongue.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 5) / 5) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 10) / 5) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animBlink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProsalirus entity = (EntityPrehistoricFloraProsalirus) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (12.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 12.5 + (((tickAnim - 8) / 6) * (0-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefteye, Lefteye.rotateAngleX + (float) Math.toRadians(xx), Lefteye.rotateAngleY + (float) Math.toRadians(yy), Lefteye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 8) / 6) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 8) * (-12.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = -12.5 + (((tickAnim - 8) / 6) * (0-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righteye, Righteye.rotateAngleX + (float) Math.toRadians(xx), Righteye.rotateAngleY + (float) Math.toRadians(yy), Righteye.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 8) / 6) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
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
        EntityPrehistoricFloraProsalirus e = (EntityPrehistoricFloraProsalirus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
    }
}
