package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTiarajudens;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTiarajudens extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Bodymiddle;
    private final AdvancedModelRendererExtended Bodyfront;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Upperjaw1;
    private final AdvancedModelRendererExtended Upperjaw2;
    private final AdvancedModelRendererExtended Upperlip;
    private final AdvancedModelRendererExtended Upperteeth;
    private final AdvancedModelRendererExtended Lefttusk;
    private final AdvancedModelRendererExtended Lefttuskend;
    private final AdvancedModelRendererExtended Righttusk;
    private final AdvancedModelRendererExtended Righttuskend;
    private final AdvancedModelRendererExtended Headslope;
    private final AdvancedModelRendererExtended Lowerjaw1;
    private final AdvancedModelRendererExtended Lowerjaw2;
    private final AdvancedModelRendererExtended Lowerjaw3;
    private final AdvancedModelRendererExtended Lowerjaw4;
    private final AdvancedModelRendererExtended Lowerjaw5;
    private final AdvancedModelRendererExtended Lowerlip;
    private final AdvancedModelRendererExtended Lowerteeth;
    private final AdvancedModelRendererExtended Jawparting;
    private final AdvancedModelRendererExtended Leftupperarm;
    private final AdvancedModelRendererExtended Leftlowerarm;
    private final AdvancedModelRendererExtended Leftfrontfoot;
    private final AdvancedModelRendererExtended Rightupperarm;
    private final AdvancedModelRendererExtended Rightlowerarm;
    private final AdvancedModelRendererExtended Rightfrontfoot;
    private final AdvancedModelRendererExtended Tail1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Leftthigh;
    private final AdvancedModelRendererExtended Leftshin;
    private final AdvancedModelRendererExtended Lefthindfoot;
    private final AdvancedModelRendererExtended Rightthigh;
    private final AdvancedModelRendererExtended Rightshin;
    private final AdvancedModelRendererExtended Righthindfoot;

    private ModelAnimator animator;

    public ModelTiarajudens() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.Leftshin = new AdvancedModelRendererExtended(this, 35, 73);
        this.Leftshin.setRotationPoint(0.5F, 6.0F, -0.2F);
        this.Leftshin.func_78790_a(-1.5F, -0.5F, -1.5F, 3, 7, 4, 0.0F);
        this.setRotateAngle(this.Leftshin, 0.33964106F, 0.0F, 0.16982053F);
        this.Leftfrontfoot = new AdvancedModelRendererExtended(this, 64, 72);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Leftfrontfoot.func_78790_a(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(this.Leftfrontfoot, 0.042411502F, 0.0F, 0.0F);
        this.Rightupperarm = new AdvancedModelRendererExtended(this, 29, 30);
        this.Rightupperarm.setRotationPoint(-3.0F, 6.1F, -5.5F);
        this.Rightupperarm.func_78790_a(-2.5F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(this.Rightupperarm, 0.2972296F, 0.0F, 0.33964106F);
        this.Upperjaw2 = new AdvancedModelRendererExtended(this, 48, 6);
        this.Upperjaw2.setRotationPoint(0.01F, 0.0F, -2.0F);
        this.Upperjaw2.func_78790_a(-2.5F, 0.0F, -2.0F, 5, 5, 2, 0.0F);
        this.setRotateAngle(this.Upperjaw2, 0.10611602F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRendererExtended(this, 48, 56);
        this.Tail1.setRotationPoint(0.0F, 0.4F, 5.3F);
        this.Tail1.func_78790_a(-2.5F, -1.0F, -0.5F, 5, 6, 4, 0.0F);
        this.setRotateAngle(this.Tail1, -0.042411502F, 0.0F, 0.0F);
        this.Lefttusk = new AdvancedModelRendererExtended(this, 11, 0);
        this.Lefttusk.setRotationPoint(2.15F, 5.75F, -2.45F);
        this.Lefttusk.func_78790_a(-0.5F, -2.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.Lefttusk, -0.55187315F, 0.0F, -0.084823005F);
        this.Rightshin = new AdvancedModelRendererExtended(this, 33, 54);
        this.Rightshin.setRotationPoint(-0.5F, 6.0F, -0.2F);
        this.Rightshin.func_78790_a(-1.5F, -0.5F, -1.5F, 3, 7, 4, 0.0F);
        this.setRotateAngle(this.Rightshin, 0.33964106F, 0.0F, -0.16982053F);
        this.Leftthigh = new AdvancedModelRendererExtended(this, 45, 86);
        this.Leftthigh.setRotationPoint(3.5F, 3.5F, 2.5F);
        this.Leftthigh.func_78790_a(-1.5F, -1.0F, -2.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(this.Leftthigh, -0.12740904F, 0.0F, -0.16982053F);
        this.Upperjaw1 = new AdvancedModelRendererExtended(this, 23, 8);
        this.Upperjaw1.setRotationPoint(0.0F, -2.4F, -5.8F);
        this.Upperjaw1.func_78790_a(-2.5F, 0.0F, -2.0F, 5, 5, 2, 0.0F);
        this.setRotateAngle(this.Upperjaw1, 0.4033456F, 0.0F, 0.0F);
        this.Lowerjaw5 = new AdvancedModelRendererExtended(this, 63, 26);
        this.Lowerjaw5.setRotationPoint(0.03F, 0.0F, 0.0F);
        this.Lowerjaw5.func_78790_a(-2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(this.Lowerjaw5, 0.40701076F, 0.0F, 0.0F);
        this.Leftlowerarm = new AdvancedModelRendererExtended(this, 20, 16);
        this.Leftlowerarm.setRotationPoint(0.5F, 5.0F, 0.0F);
        this.Leftlowerarm.func_78790_a(-1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(this.Leftlowerarm, -0.38205257F, 0.10611602F, 0.31834805F);
        this.Tail2 = new AdvancedModelRendererExtended(this, 50, 47);
        this.Tail2.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.Tail2.func_78790_a(-2.0F, -1.0F, 0.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(this.Tail2, -0.2972296F, 0.0F, 0.0F);
        this.Rightfrontfoot = new AdvancedModelRendererExtended(this, 48, 67);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.53F, 0.3F);
        this.Rightfrontfoot.func_78790_a(-2.5F, 0.0F, -4.0F, 5, 2, 5, 0.0F);
        this.setRotateAngle(this.Rightfrontfoot, 0.042411502F, 0.0F, 0.0F);
        this.Bodymiddle = new AdvancedModelRendererExtended(this, 0, 78);
        this.Bodymiddle.setRotationPoint(0.0F, 0.3F, -2.5F);
        this.Bodymiddle.func_78790_a(-5.0F, -1.5F, -8.5F, 10, 12, 9, 0.0F);
        this.setRotateAngle(this.Bodymiddle, 0.14852752F, 0.0F, 0.0F);
        this.Lowerjaw2 = new AdvancedModelRendererExtended(this, 46, 30);
        this.Lowerjaw2.setRotationPoint(0.0F, -0.2F, -4.5F);
        this.Lowerjaw2.func_78790_a(-2.5F, 0.0F, -2.0F, 5, 2, 3, 0.0F);
        this.setRotateAngle(this.Lowerjaw2, 0.5307546F, 0.0F, 0.0F);
        this.Hips = new AdvancedModelRendererExtended(this, 0, 57);
        this.Hips.setRotationPoint(0.0F, 7.1F, 7.0F);
        this.Hips.func_78790_a(-4.0F, -1.0F, -3.0F, 8, 11, 9, 0.0F);
        this.setRotateAngle(this.Hips, -0.19111355F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRendererExtended(this, 0, 18);
        this.Neck.setRotationPoint(0.0F, 0.6F, -7.5F);
        this.Neck.func_78790_a(-2.5F, -1.5F, -7.0F, 5, 8, 9, 0.0F);
        this.setRotateAngle(this.Neck, -0.10611602F, 0.0F, 0.0F);
        this.Leftupperarm = new AdvancedModelRendererExtended(this, 33, 42);
        this.Leftupperarm.setRotationPoint(3.0F, 6.1F, -5.5F);
        this.Leftupperarm.func_78790_a(-1.5F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(this.Leftupperarm, 0.2972296F, 0.0F, -0.33964106F);
        this.Headslope = new AdvancedModelRendererExtended(this, 63, 9);
        this.Headslope.setRotationPoint(-0.01F, 0.0F, 0.0F);
        this.Headslope.func_78790_a(-2.5F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(this.Headslope, -0.50946164F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRendererExtended(this, 49, 38);
        this.Tail3.setRotationPoint(0.0F, -0.4F, 3.5F);
        this.Tail3.func_78790_a(-1.5F, -0.5F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(this.Tail3, -0.4033456F, 0.0F, 0.0F);
        this.Tail4 = new AdvancedModelRendererExtended(this, 59, 32);
        this.Tail4.setRotationPoint(0.0F, 0.1F, 4.5F);
        this.Tail4.func_78790_a(-1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(this.Tail4, 0.10611602F, 0.0F, 0.0F);
        this.Righthindfoot = new AdvancedModelRendererExtended(this, 59, 80);
        this.Righthindfoot.setRotationPoint(0.0F, 5.5F, 0.4F);
        this.Righthindfoot.func_78790_a(-2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(this.Righthindfoot, -0.021293018F, 0.0F, 0.0F);
        this.Upperteeth = new AdvancedModelRendererExtended(this, 72, 32);
        this.Upperteeth.setRotationPoint(0.0F, 0.75F, -4.3F);
        this.Upperteeth.func_78790_a(-1.5F, 0.0F, 0.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(this.Upperteeth, 0.33964106F, 0.0F, 0.0F);
        this.Upperlip = new AdvancedModelRendererExtended(this, 34, 1);
        this.Upperlip.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Upperlip.func_78790_a(-2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(this.Upperlip, 0.8066912F, 0.0F, 0.0F);
        this.Lowerjaw3 = new AdvancedModelRendererExtended(this, 19, 2);
        this.Lowerjaw3.setRotationPoint(-0.01F, 2.0F, -1.7F);
        this.Lowerjaw3.func_78790_a(-2.5F, -2.0F, -2.0F, 5, 2, 2, 0.0F);
        this.setRotateAngle(this.Lowerjaw3, -0.6792821F, 0.0F, 0.0F);
        this.Lowerjaw1 = new AdvancedModelRendererExtended(this, 46, 22);
        this.Lowerjaw1.setRotationPoint(0.0F, 3.0F, -0.8F);
        this.Lowerjaw1.func_78790_a(-3.0F, 0.0F, -4.0F, 6, 3, 4, 0.0F);
        this.Rightthigh = new AdvancedModelRendererExtended(this, 67, 58);
        this.Rightthigh.setRotationPoint(-3.5F, 3.5F, 2.5F);
        this.Rightthigh.func_78790_a(-2.5F, -1.0F, -2.0F, 4, 8, 5, 0.0F);
        this.setRotateAngle(this.Rightthigh, -0.12740904F, 0.0F, 0.16982053F);
        this.Rightlowerarm = new AdvancedModelRendererExtended(this, 33, 19);
        this.Rightlowerarm.setRotationPoint(-0.5F, 5.0F, 0.0F);
        this.Rightlowerarm.func_78790_a(-1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(this.Rightlowerarm, -0.38205257F, -0.10611602F, -0.31834805F);
        this.Jawparting = new AdvancedModelRendererExtended(this, 43, 14);
        this.Jawparting.setRotationPoint(0.01F, 0.0F, -3.7F);
        this.Jawparting.func_78790_a(-2.5F, -4.0F, 0.0F, 5, 4, 3, 0.0F);
        this.setRotateAngle(this.Jawparting, -0.4033456F, 0.0F, 0.0F);
        this.Lefthindfoot = new AdvancedModelRendererExtended(this, 64, 90);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.5F, 0.4F);
        this.Lefthindfoot.func_78790_a(-2.5F, 0.0F, -4.0F, 5, 2, 6, 0.0F);
        this.setRotateAngle(this.Lefthindfoot, -0.021293018F, 0.0F, 0.0F);
        this.Lowerjaw4 = new AdvancedModelRendererExtended(this, 55, 0);
        this.Lowerjaw4.setRotationPoint(-0.01F, 0.4F, -2.9F);
        this.Lowerjaw4.func_78790_a(-2.0F, -2.0F, -2.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(this.Lowerjaw4, -0.42446408F, 0.0F, 0.0F);
        this.Lowerteeth = new AdvancedModelRendererExtended(this, 64, 17);
        this.Lowerteeth.setRotationPoint(0.0F, 1.1F, -2.75F);
        this.Lowerteeth.func_78790_a(-1.5F, -2.0F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(this.Lowerteeth, -0.10611602F, 0.0F, 0.0F);
        this.Lowerlip = new AdvancedModelRendererExtended(this, 62, 0);
        this.Lowerlip.setRotationPoint(0.01F, -2.2F, -1.8F);
        this.Lowerlip.func_78790_a(-2.0F, 0.0F, -3.0F, 4, 2, 6, 0.0F);
        this.setRotateAngle(this.Lowerlip, -0.084823005F, 0.0F, 0.0F);
        this.Righttusk = new AdvancedModelRendererExtended(this, 1, 0);
        this.Righttusk.setRotationPoint(-2.15F, 5.75F, -2.65F);
        this.Righttusk.func_78790_a(-0.5F, -2.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.Righttusk, -0.57316613F, 0.0F, 0.084823005F);
        this.Righttuskend = new AdvancedModelRendererExtended(this, 6, 0);
        this.Righttuskend.setRotationPoint(-0.01F, 1.45F, 0.01F);
        this.Righttuskend.func_78790_a(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.Righttuskend, 0.10611602F, 0.0F, 0.0F);
        this.Bodyfront = new AdvancedModelRendererExtended(this, 0, 36);
        this.Bodyfront.setRotationPoint(0.0F, 0.1F, -7.5F);
        this.Bodyfront.func_78790_a(-4.0F, -1.5F, -8.0F, 8, 12, 8, 0.0F);
        this.setRotateAngle(this.Bodyfront, 0.10611602F, 0.0F, 0.0F);
        this.Head = new AdvancedModelRendererExtended(this, 0, 6);
        this.Head.setRotationPoint(0.01F, 0.2F, -5.3F);
        this.Head.func_78790_a(-3.0F, -2.0F, -5.0F, 6, 5, 5, 0.0F);
        this.setRotateAngle(this.Head, 0.19111355F, 0.0F, 0.0F);
        this.Lefttuskend = new AdvancedModelRendererExtended(this, 16, 0);
        this.Lefttuskend.setRotationPoint(0.01F, 1.45F, 0.01F);
        this.Lefttuskend.func_78790_a(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.Lefttuskend, 0.10611602F, 0.0F, 0.0F);
        this.Leftthigh.addChild(this.Leftshin);
        this.Leftlowerarm.addChild(this.Leftfrontfoot);
        this.Bodyfront.addChild(this.Rightupperarm);
        this.Upperjaw1.addChild(this.Upperjaw2);
        this.Hips.addChild(this.Tail1);
        this.Upperjaw2.addChild(this.Lefttusk);
        this.Rightthigh.addChild(this.Rightshin);
        this.Hips.addChild(this.Leftthigh);
        this.Head.addChild(this.Upperjaw1);
        this.Lowerjaw4.addChild(this.Lowerjaw5);
        this.Leftupperarm.addChild(this.Leftlowerarm);
        this.Tail1.addChild(this.Tail2);
        this.Rightlowerarm.addChild(this.Rightfrontfoot);
        this.Hips.addChild(this.Bodymiddle);
        this.Lowerjaw1.addChild(this.Lowerjaw2);
        this.Bodyfront.addChild(this.Neck);
        this.Bodyfront.addChild(this.Leftupperarm);
        this.Upperjaw1.addChild(this.Headslope);
        this.Tail2.addChild(this.Tail3);
        this.Tail3.addChild(this.Tail4);
        this.Rightshin.addChild(this.Righthindfoot);
        this.Upperlip.addChild(this.Upperteeth);
        this.Upperjaw2.addChild(this.Upperlip);
        this.Lowerjaw2.addChild(this.Lowerjaw3);
        this.Head.addChild(this.Lowerjaw1);
        this.Hips.addChild(this.Rightthigh);
        this.Rightupperarm.addChild(this.Rightlowerarm);
        this.Lowerjaw1.addChild(this.Jawparting);
        this.Leftshin.addChild(this.Lefthindfoot);
        this.Lowerjaw3.addChild(this.Lowerjaw4);
        this.Lowerlip.addChild(this.Lowerteeth);
        this.Lowerjaw3.addChild(this.Lowerlip);
        this.Upperjaw2.addChild(this.Righttusk);
        this.Righttusk.addChild(this.Righttuskend);
        this.Bodymiddle.addChild(this.Bodyfront);
        this.Neck.addChild(this.Head);
        this.Lefttusk.addChild(this.Lefttuskend);
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Lowerjaw1.rotateAngleX = (float) Math.toRadians(40);
        this.Head.rotateAngleY = (float) Math.toRadians(-17);
        this.Neck.rotateAngleY = (float) Math.toRadians(-24.8);
        this.Neck.rotateAngleX = (float) Math.toRadians(-14.4);
        this.Hips.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -0.4F;
        this.Hips.offsetX = -0.4F;
        this.Hips.offsetZ = 2.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(0);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 1.0F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.1F, 4.3F, -0.2F);
        this.Lowerjaw1.rotateAngleX = (float) Math.toRadians(40);
        this.Head.rotateAngleY = (float) Math.toRadians(-17);
        this.Neck.rotateAngleY = (float) Math.toRadians(-24.8);
        this.Neck.rotateAngleX = (float) Math.toRadians(-14.4);
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
        //this.Hips.offsetY = 0.90F;

        EntityPrehistoricFloraTiarajudens Tiarajudens = (EntityPrehistoricFloraTiarajudens) e;
        float masterSpeed = Tiarajudens.getTravelSpeed();

        this.faceTarget(f3, f4, 6, Neck);
        this.faceTarget(f3, f4, 6, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail1, this.Tail2, this.Tail3};

        // || (Tiarajudens.moveStrafing == 0 && Tiarajudens.moveVertical == 0 && Tiarajudens.moveForward == 0)

        if (Tiarajudens.getAnimation() == Tiarajudens.LAY_ANIMATION) {
            this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Tiarajudens.getIsMoving()) { //Not moving
            if (Tiarajudens.getAnimation() != Tiarajudens.DRINK_ANIMATION) {
                this.swing(Neck, 0.06F, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
                this.walk(Neck, 0.06F * 2F, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
            }
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.225F;
        if (Tiarajudens.getIsFast()) {
            speed = speed * 2;
        }

        this.Leftupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.Rightupperarm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.Leftthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.Rightthigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(Leftupperarm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(Rightupperarm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(Leftthigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(Rightthigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(Leftupperarm, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(Rightupperarm, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(Leftthigh, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(Rightthigh, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(Leftlowerarm, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(Rightlowerarm, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(Leftshin, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(Rightshin, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(Leftlowerarm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(Rightlowerarm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(Leftshin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(Rightshin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(Leftfrontfoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(Rightfrontfoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(Lefthindfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(Righthindfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Hips, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(Hips, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(Bodymiddle, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(Bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(Bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(Neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(Neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Hips.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTiarajudens ee = (EntityPrehistoricFloraTiarajudens) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running

                } else { //Walking

                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animDig(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDig(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTiarajudens entity = (EntityPrehistoricFloraTiarajudens) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 30 + (((tickAnim - 10) / 20) * (30-(30)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30 + (((tickAnim - 30) / 10) * (0-(30)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-15-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -15 + (((tickAnim - 17) / 2) * (10-(-15)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 10 + (((tickAnim - 19) / 5) * (-15-(10)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -15 + (((tickAnim - 24) / 3) * (10-(-15)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 27) / 13) * (0-(10)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (-15-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15 + (((tickAnim - 19) / 3) * (10-(-15)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 10 + (((tickAnim - 22) / 5) * (-15-(10)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -15 + (((tickAnim - 27) / 2) * (10-(-15)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 29) / 11) * (0-(10)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 10) / 20) * (-10-(-10)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 30) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -40 + (((tickAnim - 10) / 20) * (-40-(-40)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -40 + (((tickAnim - 30) / 10) * (0-(-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 18 + (((tickAnim - 10) / 20) * (18-(18)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18 + (((tickAnim - 30) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 10) / 20) * (-10-(-10)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 30) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -40 + (((tickAnim - 10) / 20) * (-40-(-40)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -40 + (((tickAnim - 30) / 10) * (0-(-40)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 18 + (((tickAnim - 10) / 20) * (18-(18)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18 + (((tickAnim - 30) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTiarajudens e = (EntityPrehistoricFloraTiarajudens) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Neck, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.Tail1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Tail2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
