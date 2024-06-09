package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIchthyostega;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelIchthyostega extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodyfront_r1;
    private final AdvancedModelRenderer bodyfront2;
    private final AdvancedModelRenderer neck_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer head_r2;
    private final AdvancedModelRenderer upperjaw1;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer lowerjaw1;
    private final AdvancedModelRenderer lowerjaw2_r1;
    private final AdvancedModelRenderer lowerjaw2;
    private final AdvancedModelRenderer lowerjaw5_r1;
    private final AdvancedModelRenderer lowerjaw4_r1;
    private final AdvancedModelRenderer lowerjaw4_r2;
    private final AdvancedModelRenderer lowerjaw4_r3;
    private final AdvancedModelRenderer underjaw;
    private final AdvancedModelRenderer underjaw_r1;
    private final AdvancedModelRenderer gumsright;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer handL;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer handR;
    private final AdvancedModelRenderer bodyrear;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2_r1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer footR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer footL;

    private ModelAnimator animator;

    public ModelIchthyostega() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 18.8F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -3.75F, -3.5F, 7, 9, 7, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, -0.2F, -2.0F);
        this.body.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 16, -4.0F, -3.25F, -6.0F, 8, 8, 6, 0.0F, false));

        this.bodyfront_r1 = new AdvancedModelRenderer(this);
        this.bodyfront_r1.setRotationPoint(0.0F, 4.7F, -7.0F);
        this.bodyfront.addChild(bodyfront_r1);
        this.setRotateAngle(bodyfront_r1, -0.0873F, 0.0F, 0.0F);
        this.bodyfront_r1.cubeList.add(new ModelBox(bodyfront_r1, 38, 11, -3.5F, -0.95F, 0.0F, 7, 1, 7, -0.01F, false));

        this.bodyfront2 = new AdvancedModelRenderer(this);
        this.bodyfront2.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.bodyfront.addChild(bodyfront2);
        this.bodyfront2.cubeList.add(new ModelBox(bodyfront2, 28, 0, -4.5F, -2.5F, -3.0F, 9, 7, 4, 0.0F, false));

        this.neck_r1 = new AdvancedModelRenderer(this);
        this.neck_r1.setRotationPoint(0.0F, 4.5F, -4.05F);
        this.bodyfront2.addChild(neck_r1);
        this.setRotateAngle(neck_r1, -0.0873F, 0.0F, 0.0F);
        this.neck_r1.cubeList.add(new ModelBox(neck_r1, 50, 0, -4.0F, -0.5F, 1.05F, 8, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.bodyfront2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 43, 19, -2.5F, -2.3F, -5.4F, 5, 3, 5, 0.01F, false));

        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(1.5F, 24.7F, -10.0F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.0F, 0.3054F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 28, 16, -0.5F, -24.55F, 0.1F, 0, 1, 7, 0.0F, true));
        this.head_r1.cubeList.add(new ModelBox(head_r1, 36, 28, -2.0F, -26.0F, 0.0F, 2, 2, 10, 0.0F, true));

        this.head_r2 = new AdvancedModelRenderer(this);
        this.head_r2.setRotationPoint(-1.5F, 24.7F, -10.0F);
        this.head.addChild(head_r2);
        this.setRotateAngle(head_r2, 0.0F, -0.3054F, 0.0F);
        this.head_r2.cubeList.add(new ModelBox(head_r2, 28, 16, 0.5F, -24.55F, 0.1F, 0, 1, 7, 0.0F, false));
        this.head_r2.cubeList.add(new ModelBox(head_r2, 36, 28, 0.0F, -26.005F, 0.0F, 2, 2, 10, 0.0F, false));

        this.upperjaw1 = new AdvancedModelRenderer(this);
        this.upperjaw1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.head.addChild(upperjaw1);
        this.upperjaw1.cubeList.add(new ModelBox(upperjaw1, 0, 52, -1.5F, -1.3F, -5.0063F, 3, 2, 5, -0.01F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.4F, 0.4F);
        this.upperjaw1.addChild(snout);
        this.setRotateAngle(snout, 0.1852F, 0.0F, -0.0035F);
        this.snout.cubeList.add(new ModelBox(snout, 54, 4, -1.5F, -2.6994F, -4.9065F, 3, 1, 5, 0.0F, false));

        this.lowerjaw1 = new AdvancedModelRenderer(this);
        this.lowerjaw1.setRotationPoint(0.0F, 0.7F, 0.1F);
        this.head.addChild(lowerjaw1);
        this.lowerjaw1.cubeList.add(new ModelBox(lowerjaw1, 27, 51, -1.5F, -0.015F, -5.025F, 3, 2, 6, 0.01F, false));

        this.lowerjaw2_r1 = new AdvancedModelRenderer(this);
        this.lowerjaw2_r1.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.lowerjaw1.addChild(lowerjaw2_r1);
        this.setRotateAngle(lowerjaw2_r1, -0.4363F, 0.0F, 0.0F);
        this.lowerjaw2_r1.cubeList.add(new ModelBox(lowerjaw2_r1, 13, 50, -2.5F, -2.0F, 0.0F, 5, 2, 5, 0.0F, false));

        this.lowerjaw2 = new AdvancedModelRenderer(this);
        this.lowerjaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.lowerjaw1.addChild(lowerjaw2);
        this.lowerjaw2.cubeList.add(new ModelBox(lowerjaw2, 52, 40, -1.505F, 0.0F, -4.9F, 3, 1, 5, 0.0F, false));
        this.lowerjaw2.cubeList.add(new ModelBox(lowerjaw2, 0, 0, -1.505F, -0.6F, -4.65F, 3, 1, 0, 0.0F, false));

        this.lowerjaw5_r1 = new AdvancedModelRenderer(this);
        this.lowerjaw5_r1.setRotationPoint(1.5F, 1.0F, -4.9F);
        this.lowerjaw2.addChild(lowerjaw5_r1);
        this.setRotateAngle(lowerjaw5_r1, -0.096F, 0.2618F, 0.0F);
        this.lowerjaw5_r1.cubeList.add(new ModelBox(lowerjaw5_r1, 22, 11, -2.995F, -1.0F, 0.0F, 3, 1, 10, 0.0F, true));

        this.lowerjaw4_r1 = new AdvancedModelRenderer(this);
        this.lowerjaw4_r1.setRotationPoint(1.5F, 1.0F, -4.9F);
        this.lowerjaw2.addChild(lowerjaw4_r1);
        this.setRotateAngle(lowerjaw4_r1, 0.0F, 0.2618F, 0.0F);
        this.lowerjaw4_r1.cubeList.add(new ModelBox(lowerjaw4_r1, 0, 30, -2.995F, -1.01F, 0.0F, 3, 1, 10, 0.01F, true));
        this.lowerjaw4_r1.cubeList.add(new ModelBox(lowerjaw4_r1, 14, 35, -0.245F, -1.4F, 1.25F, 0, 1, 6, 0.0F, true));

        this.lowerjaw4_r2 = new AdvancedModelRenderer(this);
        this.lowerjaw4_r2.setRotationPoint(-1.5F, 1.0F, -4.9F);
        this.lowerjaw2.addChild(lowerjaw4_r2);
        this.setRotateAngle(lowerjaw4_r2, -0.096F, -0.2618F, 0.0F);
        this.lowerjaw4_r2.cubeList.add(new ModelBox(lowerjaw4_r2, 22, 11, -0.005F, -1.0F, 0.0F, 3, 1, 10, 0.0F, false));

        this.lowerjaw4_r3 = new AdvancedModelRenderer(this);
        this.lowerjaw4_r3.setRotationPoint(-1.5F, 1.0F, -4.9F);
        this.lowerjaw2.addChild(lowerjaw4_r3);
        this.setRotateAngle(lowerjaw4_r3, 0.0F, -0.2618F, 0.0F);
        this.lowerjaw4_r3.cubeList.add(new ModelBox(lowerjaw4_r3, 14, 35, 0.245F, -1.4F, 1.25F, 0, 1, 6, 0.0F, false));
        this.lowerjaw4_r3.cubeList.add(new ModelBox(lowerjaw4_r3, 0, 30, -0.005F, -1.0F, 0.0F, 3, 1, 10, 0.01F, false));

        this.underjaw = new AdvancedModelRenderer(this);
        this.underjaw.setRotationPoint(0.0F, 0.5F, -2.7F);
        this.lowerjaw2.addChild(underjaw);
        this.setRotateAngle(underjaw, -0.2037F, 0.0F, 0.0F);


        this.underjaw_r1 = new AdvancedModelRenderer(this);
        this.underjaw_r1.setRotationPoint(0.0F, 0.925F, -2.05F);
        this.underjaw.addChild(underjaw_r1);
        this.setRotateAngle(underjaw_r1, 0.0087F, 0.0F, 0.0F);
        this.underjaw_r1.cubeList.add(new ModelBox(underjaw_r1, 52, 52, -1.5F, -0.975F, 0.0F, 3, 1, 5, -0.01F, false));

        this.gumsright = new AdvancedModelRenderer(this);
        this.gumsright.setRotationPoint(-3.0F, -0.5F, -1.4F);
        this.lowerjaw1.addChild(gumsright);
        this.setRotateAngle(gumsright, -0.3752F, 0.0F, 0.0F);
        this.gumsright.cubeList.add(new ModelBox(gumsright, 39, 51, 0.0F, -1.1F, -1.2F, 6, 3, 3, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(3.75F, 3.5F, -1.25F);
        this.bodyfront2.addChild(armL);
        this.setRotateAngle(armL, 0.0F, -0.3491F, 0.4276F);
        this.armL.cubeList.add(new ModelBox(armL, 58, 19, 0.0F, -1.0F, -1.5F, 3, 2, 3, 0.0F, true));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, 0.829F, 0.1309F);
        this.armL2.cubeList.add(new ModelBox(armL2, 21, 0, 0.0F, -0.75F, -1.0F, 3, 1, 2, 0.0F, true));

        this.handL = new AdvancedModelRenderer(this);
        this.handL.setRotationPoint(2.5F, 0.0F, 0.25F);
        this.armL2.addChild(handL);
        this.setRotateAngle(handL, 0.2793F, 0.3927F, -0.384F);
        this.handL.cubeList.add(new ModelBox(handL, 59, 10, 0.0F, -0.5F, -1.75F, 3, 1, 3, 0.0F, true));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-3.75F, 3.0F, -7.25F);
        this.bodyfront.addChild(armR);
        this.setRotateAngle(armR, 0.0F, 0.3491F, -0.4276F);
        this.armR.cubeList.add(new ModelBox(armR, 58, 19, -3.0F, -1.0F, -1.5F, 3, 2, 3, 0.0F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, -0.829F, -0.1309F);
        this.armR2.cubeList.add(new ModelBox(armR2, 21, 0, -3.0F, -0.75F, -1.0F, 3, 1, 2, 0.0F, false));

        this.handR = new AdvancedModelRenderer(this);
        this.handR.setRotationPoint(-2.5F, 0.0F, 0.25F);
        this.armR2.addChild(handR);
        this.setRotateAngle(handR, 0.2793F, -0.3927F, 0.384F);
        this.handR.cubeList.add(new ModelBox(handR, 59, 10, -3.0F, -0.5F, -1.75F, 3, 1, 3, 0.0F, false));

        this.bodyrear = new AdvancedModelRenderer(this);
        this.bodyrear.setRotationPoint(0.0F, -0.2F, 2.0F);
        this.body.addChild(bodyrear);
        this.setRotateAngle(bodyrear, -0.0873F, 0.0F, 0.0F);
        this.bodyrear.cubeList.add(new ModelBox(bodyrear, 22, 24, -3.0F, -3.45F, 0.0F, 6, 8, 6, 0.0F, false));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.bodyrear.addChild(tailbase);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 0, 41, -2.5F, -2.5F, 0.0F, 5, 7, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 2.6F);
        this.tailbase.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 19, 38, -2.0F, -2.5F, 0.0F, 4, 5, 7, 0.0F, false));

        this.tail2_r1 = new AdvancedModelRenderer(this);
        this.tail2_r1.setRotationPoint(0.0F, 2.45F, 6.95F);
        this.tail1.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, 0.3054F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 50, 27, -1.5F, -1.95F, -5.95F, 3, 2, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 40, -1.0F, -2.0F, 0.0F, 2, 4, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 15, 0.0F, -3.0F, 0.0F, 0, 1, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0611F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 11, 57, -0.5F, -1.25F, 0.0F, 1, 3, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 11, -0.01F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 40, 57, -0.5F, -0.75F, 0.0F, 1, 2, 5, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 34, 33, 0.0F, -1.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-2.0F, 1.75F, 5.75F);
        this.bodyrear.addChild(legR);
        this.setRotateAngle(legR, 0.6545F, 0.6109F, -0.3927F);
        this.legR.cubeList.add(new ModelBox(legR, 18, 57, -2.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.55F, 0.0F, 0.25F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.2182F, 0.5672F, -0.1309F);
        this.legR2.cubeList.add(new ModelBox(legR2, 47, 58, -2.3F, -0.5F, -1.75F, 3, 1, 3, 0.0F, false));

        this.footR = new AdvancedModelRenderer(this);
        this.footR.setRotationPoint(-2.3F, 0.0F, 0.0F);
        this.legR2.addChild(footR);
        this.setRotateAngle(footR, 0.0436F, 0.1745F, -0.3054F);
        this.footR.cubeList.add(new ModelBox(footR, 55, 47, -4.0F, -0.5F, -2.25F, 4, 1, 4, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(2.0F, 1.75F, 5.75F);
        this.bodyrear.addChild(legL);
        this.setRotateAngle(legL, 0.6545F, -0.6109F, 0.3927F);
        this.legL.cubeList.add(new ModelBox(legL, 18, 57, -0.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.55F, 0.0F, 0.25F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.2182F, -0.5672F, 0.1309F);
        this.legL2.cubeList.add(new ModelBox(legL2, 47, 58, -0.7F, -0.5F, -1.75F, 3, 1, 3, 0.0F, true));

        this.footL = new AdvancedModelRenderer(this);
        this.footL.setRotationPoint(2.3F, 0.0F, 0.0F);
        this.legL2.addChild(footL);
        this.setRotateAngle(footL, 0.0436F, -0.1745F, 0.3054F);
        this.footL.cubeList.add(new ModelBox(footL, 55, 47, 0.0F, -0.5F, -2.25F, 4, 1, 4, 0.0F, true));

//        this.setRotateAngle(legR, (float)Math.toRadians(7.147), (float)Math.toRadians(30.854), (float)Math.toRadians(0.8007));
//        this.setRotateAngle(legR2, (float)Math.toRadians(0), (float)Math.toRadians(0), (float)Math.toRadians(0));
//        this.setRotateAngle(footR, (float)Math.toRadians(0), (float)Math.toRadians(0), (float)Math.toRadians(0));
//
//        this.setRotateAngle(legL, (float)Math.toRadians(4.2736), (float)Math.toRadians(-30.9347), (float)Math.toRadians(3.5947));
//        this.setRotateAngle(legL2, (float)Math.toRadians(0), (float)Math.toRadians(0), (float)Math.toRadians(0));
//        this.setRotateAngle(footL, (float)Math.toRadians(0), (float)Math.toRadians(0), (float)Math.toRadians(0));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.lowerjaw1.rotateAngleX = (float) Math.toRadians(13);
        this.root.offsetZ = -0.2F;
        this.root.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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

        EntityPrehistoricFloraIchthyostega Ichthyostega = (EntityPrehistoricFloraIchthyostega) e;

        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tailbase, this.tail1, this.tail2};
        AdvancedModelRenderer[] LegsL = {this.legL, this.legL2, this.footL};
        AdvancedModelRenderer[] LegsR = {this.legR, this.legR2, this.footR};
        Ichthyostega.tailBuffer.applyChainSwingBuffer(Tail);
        Ichthyostega.tailBuffer.applyChainSwingBuffer(LegsL);
        Ichthyostega.tailBuffer.applyChainSwingBuffer(LegsR);

        if (!Ichthyostega.isReallyInWater()) {
            //Land

            if (f3 == 0.0F || !Ichthyostega.getIsMoving()) {
                return;
            }
            
        }
        else {
            //In water
            
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraIchthyostega ee = (EntityPrehistoricFloraIchthyostega) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (!ee.getIsMoving()) {
                //Repose the legs to the start position of the walk cycle anim:
                this.setRotateAngle(this.legR, this.legR.rotateAngleX + (float) Math.toRadians(7.14704), this.legR.rotateAngleY + (float) Math.toRadians(30.85399), this.legR.rotateAngleZ + (float) Math.toRadians(0.80074));
                this.setRotateAngle(this.legL, this.legL.rotateAngleX + (float) Math.toRadians(4.2736), this.legL.rotateAngleY - (float) Math.toRadians(30.9347), this.legL.rotateAngleZ + (float) Math.toRadians(3.59468));

                return;
            }
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            //Swimming pose:

//            if (!ee.getIsMoving()) { //static in water
//                //Repose the feet to the start position of the swim cycle anim:
//                //Not needed for this swim - the static pose is fine
//
//                return;
//            }

            //moving in water
            animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            return;
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIchthyostega entity = (EntityPrehistoricFloraIchthyostega) entitylivingbaseIn;

        int animCycle = 26;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5D + (((tickAnim - 0D) / 4D) * (2.29D-(-5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = -1D + (((tickAnim - 0D) / 4D) * (1D-(-1D)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 2.29D + (((tickAnim - 4D) / 3D) * (0D-(2.29D)));
            yy = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
            zz = 1D + (((tickAnim - 4D) / 3D) * (0D-(1D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 18D) / 8D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 8D) * (-1D-(0D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0.3D + (((tickAnim - 0D) / 7D) * (0D-(0.3D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 8D) * (0.3D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 8D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3D + (((tickAnim - 0D) / 3D) * (-1.17D-(3D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -1.17D + (((tickAnim - 3D) / 4D) * (0D-(-1.17D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 7D) / 19D) * (3D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 19D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 19D) * (0D-(0D)));
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.78D + (((tickAnim - 0D) / 3D) * (-1.38929D-(2.78D)));
            yy = -0.03D + (((tickAnim - 0D) / 3D) * (-0.09622D-(-0.03D)));
            zz = 0.5D + (((tickAnim - 0D) / 3D) * (-0.99405D-(0.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -1.38929D + (((tickAnim - 3D) / 4D) * (0D-(-1.38929D)));
            yy = -0.09622D + (((tickAnim - 3D) / 4D) * (0D-(-0.09622D)));
            zz = -0.99405D + (((tickAnim - 3D) / 4D) * (0D-(-0.99405D)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 7D) / 9D) * (-1.17041D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 9D) * (-0.0039D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 9D) * (0.23953D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = -1.17041D + (((tickAnim - 16D) / 10D) * (2.78D-(-1.17041D)));
            yy = -0.0039D + (((tickAnim - 16D) / 10D) * (-0.03D-(-0.0039D)));
            zz = 0.23953D + (((tickAnim - 16D) / 10D) * (0.5D-(0.23953D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -21.97837D + (((tickAnim - 0D) / 2D) * (17.36806D-(-21.97837D)));
            yy = 17.83396D + (((tickAnim - 0D) / 2D) * (38.59497D-(17.83396D)));
            zz = -21.482D + (((tickAnim - 0D) / 2D) * (20.88699D-(-21.482D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.36806D + (((tickAnim - 2D) / 1D) * (-9.95572D-(17.36806D)));
            yy = 38.59497D + (((tickAnim - 2D) / 1D) * (41.62094D-(38.59497D)));
            zz = 20.88699D + (((tickAnim - 2D) / 1D) * (-11.00926D-(20.88699D)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -9.95572D + (((tickAnim - 3D) / 10D) * (11.37907D-(-9.95572D)));
            yy = 41.62094D + (((tickAnim - 3D) / 10D) * (-12.52226D-(41.62094D)));
            zz = -11.00926D + (((tickAnim - 3D) / 10D) * (41.95907D-(-11.00926D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.37907D + (((tickAnim - 13D) / 5D) * (18.46859D-(11.37907D)));
            yy = -12.52226D + (((tickAnim - 13D) / 5D) * (-50.09759D-(-12.52226D)));
            zz = 41.95907D + (((tickAnim - 13D) / 5D) * (8.3893D-(41.95907D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 18.46859D + (((tickAnim - 18D) / 4D) * (8.98301D-(18.46859D)));
            yy = -50.09759D + (((tickAnim - 18D) / 4D) * (-6.76868D-(-50.09759D)));
            zz = 8.3893D + (((tickAnim - 18D) / 4D) * (-10.27664D-(8.3893D)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 8.98301D + (((tickAnim - 22D) / 4D) * (-21.97837D-(8.98301D)));
            yy = -6.76868D + (((tickAnim - 22D) / 4D) * (17.83396D-(-6.76868D)));
            zz = -10.27664D + (((tickAnim - 22D) / 4D) * (-21.482D-(-10.27664D)));
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = -27.5D + (((tickAnim - 0D) / 3D) * (31.56D-(-27.5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = 31.56D + (((tickAnim - 3D) / 4D) * (47.5D-(31.56D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
            yy = 47.5D + (((tickAnim - 7D) / 5D) * (43.99D-(47.5D)));
            zz = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = 43.99D + (((tickAnim - 12D) / 6D) * (9.57D-(43.99D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 18D) / 4D) * (0D-(0D)));
            yy = 9.57D + (((tickAnim - 18D) / 4D) * (-47.71D-(9.57D)));
            zz = 0D + (((tickAnim - 18D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
            yy = -47.71D + (((tickAnim - 22D) / 4D) * (-27.5D-(-47.71D)));
            zz = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 40.10967D + (((tickAnim - 0D) / 1D) * (11.19209D-(40.10967D)));
            yy = -14.81426D + (((tickAnim - 0D) / 1D) * (-10.01891D-(-14.81426D)));
            zz = -41.42344D + (((tickAnim - 0D) / 1D) * (-16.44955D-(-41.42344D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 11.19209D + (((tickAnim - 1D) / 1D) * (8.7315D-(11.19209D)));
            yy = -10.01891D + (((tickAnim - 1D) / 1D) * (5.42498D-(-10.01891D)));
            zz = -16.44955D + (((tickAnim - 1D) / 1D) * (-7.65489D-(-16.44955D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.7315D + (((tickAnim - 2D) / 1D) * (-20.73701D-(8.7315D)));
            yy = 5.42498D + (((tickAnim - 2D) / 1D) * (21.98008D-(5.42498D)));
            zz = -7.65489D + (((tickAnim - 2D) / 1D) * (8.94869D-(-7.65489D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20.73701D + (((tickAnim - 3D) / 2D) * (-33.95971D-(-20.73701D)));
            yy = 21.98008D + (((tickAnim - 3D) / 2D) * (32.05145D-(21.98008D)));
            zz = 8.94869D + (((tickAnim - 3D) / 2D) * (0.69388D-(8.94869D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -33.95971D + (((tickAnim - 5D) / 2D) * (-37.49233D-(-33.95971D)));
            yy = 32.05145D + (((tickAnim - 5D) / 2D) * (34.27265D-(32.05145D)));
            zz = 0.69388D + (((tickAnim - 5D) / 2D) * (-1.15966D-(0.69388D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -37.49233D + (((tickAnim - 7D) / 3D) * (-12.48D-(-37.49233D)));
            yy = 34.27265D + (((tickAnim - 7D) / 3D) * (33.17D-(34.27265D)));
            zz = -1.15966D + (((tickAnim - 7D) / 3D) * (-10.11D-(-1.15966D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12.48D + (((tickAnim - 10D) / 3D) * (-18.87335D-(-12.48D)));
            yy = 33.17D + (((tickAnim - 10D) / 3D) * (21.01865D-(33.17D)));
            zz = -10.11D + (((tickAnim - 10D) / 3D) * (6.61156D-(-10.11D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.87335D + (((tickAnim - 13D) / 2D) * (-27.73118D-(-18.87335D)));
            yy = 21.01865D + (((tickAnim - 13D) / 2D) * (12.11703D-(21.01865D)));
            zz = 6.61156D + (((tickAnim - 13D) / 2D) * (12.57194D-(6.61156D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -27.73118D + (((tickAnim - 15D) / 3D) * (-11.72596D-(-27.73118D)));
            yy = 12.11703D + (((tickAnim - 15D) / 3D) * (24.3532D-(12.11703D)));
            zz = 12.57194D + (((tickAnim - 15D) / 3D) * (2.35387D-(12.57194D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -11.72596D + (((tickAnim - 18D) / 1D) * (6.57714D-(-11.72596D)));
            yy = 24.3532D + (((tickAnim - 18D) / 1D) * (-4.84087D-(24.3532D)));
            zz = 2.35387D + (((tickAnim - 18D) / 1D) * (-4.02218D-(2.35387D)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 6.57714D + (((tickAnim - 19D) / 3D) * (30.70439D-(6.57714D)));
            yy = -4.84087D + (((tickAnim - 19D) / 3D) * (2.95616D-(-4.84087D)));
            zz = -4.02218D + (((tickAnim - 19D) / 3D) * (-25.71465D-(-4.02218D)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 30.70439D + (((tickAnim - 22D) / 1D) * (36.32871D-(30.70439D)));
            yy = 2.95616D + (((tickAnim - 22D) / 1D) * (-5.30938D-(2.95616D)));
            zz = -25.71465D + (((tickAnim - 22D) / 1D) * (-35.52517D-(-25.71465D)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 36.32871D + (((tickAnim - 23D) / 3D) * (40.10967D-(36.32871D)));
            yy = -5.30938D + (((tickAnim - 23D) / 3D) * (-14.81426D-(-5.30938D)));
            zz = -35.52517D + (((tickAnim - 23D) / 3D) * (-41.42344D-(-35.52517D)));
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.55511D + (((tickAnim - 0D) / 1D) * (3.61D-(6.55511D)));
            yy = -0.49952D + (((tickAnim - 0D) / 1D) * (0D-(-0.49952D)));
            zz = -0.02181D + (((tickAnim - 0D) / 1D) * (0D-(-0.02181D)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 3.61D + (((tickAnim - 1D) / 6D) * (0D-(3.61D)));
            yy = 0D + (((tickAnim - 1D) / 6D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 1D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 7D) / 11D) * (-1.15993D-(0D)));
            yy = 1D + (((tickAnim - 7D) / 11D) * (0.27992D-(1D)));
            zz = 0D + (((tickAnim - 7D) / 11D) * (-0.01431D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -1.15993D + (((tickAnim - 18D) / 8D) * (6.55511D-(-1.15993D)));
            yy = 0.27992D + (((tickAnim - 18D) / 8D) * (-0.49952D-(0.27992D)));
            zz = -0.01431D + (((tickAnim - 18D) / 8D) * (-0.02181D-(-0.01431D)));
        }
        this.setRotateAngle(bodyrear, bodyrear.rotateAngleX + (float) Math.toRadians(xx), bodyrear.rotateAngleY + (float) Math.toRadians(yy), bodyrear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.54D + (((tickAnim - 0D) / 2D) * (-0.39036D-(0.54D)));
            yy = 0.17D + (((tickAnim - 0D) / 2D) * (2.49993D-(0.17D)));
            zz = -0.05D + (((tickAnim - 0D) / 2D) * (-0.027D-(-0.05D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.39036D + (((tickAnim - 2D) / 3D) * (-6.29659D-(-0.39036D)));
            yy = 2.49993D + (((tickAnim - 2D) / 3D) * (0.66132D-(2.49993D)));
            zz = -0.027D + (((tickAnim - 2D) / 3D) * (-0.18044D-(-0.027D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -6.29659D + (((tickAnim - 5D) / 2D) * (0D-(-6.29659D)));
            yy = 0.66132D + (((tickAnim - 5D) / 2D) * (1D-(0.66132D)));
            zz = -0.18044D + (((tickAnim - 5D) / 2D) * (0D-(-0.18044D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 7D) / 11D) * (3.603D-(0D)));
            yy = 1D + (((tickAnim - 7D) / 11D) * (0.47508D-(1D)));
            zz = 0D + (((tickAnim - 7D) / 11D) * (-0.07301D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 3.603D + (((tickAnim - 18D) / 3D) * (2.09624D-(3.603D)));
            yy = 0.47508D + (((tickAnim - 18D) / 3D) * (0.31356D-(0.47508D)));
            zz = -0.07301D + (((tickAnim - 18D) / 3D) * (-0.09548D-(-0.07301D)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 2.09624D + (((tickAnim - 21D) / 5D) * (0.54D-(2.09624D)));
            yy = 0.31356D + (((tickAnim - 21D) / 5D) * (0.17D-(0.31356D)));
            zz = -0.09548D + (((tickAnim - 21D) / 5D) * (-0.05D-(-0.09548D)));
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.99965D + (((tickAnim - 0D) / 3D) * (1.10631D-(-4.99965D)));
            yy = -0.97057D + (((tickAnim - 0D) / 3D) * (2.49424D-(-0.97057D)));
            zz = 0.3365D + (((tickAnim - 0D) / 3D) * (-0.16971D-(0.3365D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 1.10631D + (((tickAnim - 3D) / 4D) * (0D-(1.10631D)));
            yy = 2.49424D + (((tickAnim - 3D) / 4D) * (1D-(2.49424D)));
            zz = -0.16971D + (((tickAnim - 3D) / 4D) * (0D-(-0.16971D)));
        }
        else if (tickAnim >= 7 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 7D) / 19D) * (-4.99965D-(0D)));
            yy = 1D + (((tickAnim - 7D) / 19D) * (-0.97057D-(1D)));
            zz = 0D + (((tickAnim - 7D) / 19D) * (0.3365D-(0D)));
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.49962D + (((tickAnim - 0D) / 3D) * (3.5013D-(2.49962D)));
            yy = -0.99905D + (((tickAnim - 0D) / 3D) * (2.65018D-(-0.99905D)));
            zz = 0.04362D + (((tickAnim - 0D) / 3D) * (-2.34019D-(0.04362D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 3.5013D + (((tickAnim - 3D) / 4D) * (0D-(3.5013D)));
            yy = 2.65018D + (((tickAnim - 3D) / 4D) * (1D-(2.65018D)));
            zz = -2.34019D + (((tickAnim - 3D) / 4D) * (0D-(-2.34019D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 7D) / 11D) * (1.41403D-(0D)));
            yy = 1D + (((tickAnim - 7D) / 11D) * (2.36934D-(1D)));
            zz = 0D + (((tickAnim - 7D) / 11D) * (0.08633D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 1.41403D + (((tickAnim - 18D) / 4D) * (1.98484D-(1.41403D)));
            yy = 2.36934D + (((tickAnim - 18D) / 4D) * (0.59916D-(2.36934D)));
            zz = 0.08633D + (((tickAnim - 18D) / 4D) * (2.56365D-(0.08633D)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 1.98484D + (((tickAnim - 22D) / 4D) * (2.49962D-(1.98484D)));
            yy = 0.59916D + (((tickAnim - 22D) / 4D) * (-0.99905D-(0.59916D)));
            zz = 2.56365D + (((tickAnim - 22D) / 4D) * (0.04362D-(2.56365D)));
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.4D + (((tickAnim - 0D) / 1D) * (2.49962D-(2.4D)));
            yy = -0.92D + (((tickAnim - 0D) / 1D) * (-0.99905D-(-0.92D)));
            zz = 0.04D + (((tickAnim - 0D) / 1D) * (0.04362D-(0.04D)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 2.49962D + (((tickAnim - 1D) / 3D) * (3.37509D-(2.49962D)));
            yy = -0.99905D + (((tickAnim - 1D) / 3D) * (3.09014D-(-0.99905D)));
            zz = 0.04362D + (((tickAnim - 1D) / 3D) * (-4.65899D-(0.04362D)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 3.37509D + (((tickAnim - 4D) / 3D) * (0D-(3.37509D)));
            yy = 3.09014D + (((tickAnim - 4D) / 3D) * (1D-(3.09014D)));
            zz = -4.65899D + (((tickAnim - 4D) / 3D) * (0D-(-4.65899D)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 7D) / 9D) * (1.25667D-(0D)));
            yy = 1D + (((tickAnim - 7D) / 9D) * (2.48966D-(1D)));
            zz = 0D + (((tickAnim - 7D) / 9D) * (0.22811D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 1.25667D + (((tickAnim - 16D) / 5D) * (1.85738D-(1.25667D)));
            yy = 2.48966D + (((tickAnim - 16D) / 5D) * (0.55201D-(2.48966D)));
            zz = 0.22811D + (((tickAnim - 16D) / 5D) * (2.62336D-(0.22811D)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 1.85738D + (((tickAnim - 21D) / 5D) * (2.4D-(1.85738D)));
            yy = 0.55201D + (((tickAnim - 21D) / 5D) * (-0.92D-(0.55201D)));
            zz = 2.62336D + (((tickAnim - 21D) / 5D) * (0.04D-(2.62336D)));
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -4.58D + (((tickAnim - 0D) / 2D) * (-4.98346D-(-4.58D)));
            yy = -3.1D + (((tickAnim - 0D) / 2D) * (-3.46102D-(-3.1D)));
            zz = -0.36D + (((tickAnim - 0D) / 2D) * (-0.39114D-(-0.36D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -4.98346D + (((tickAnim - 2D) / 3D) * (3.21262D-(-4.98346D)));
            yy = -3.46102D + (((tickAnim - 2D) / 3D) * (3.87542D-(-3.46102D)));
            zz = -0.39114D + (((tickAnim - 2D) / 3D) * (-6.89333D-(-0.39114D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 3.21262D + (((tickAnim - 5D) / 2D) * (0D-(3.21262D)));
            yy = 3.87542D + (((tickAnim - 5D) / 2D) * (1D-(3.87542D)));
            zz = -6.89333D + (((tickAnim - 5D) / 2D) * (0D-(-6.89333D)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 7D) / 7D) * (-1.7894D-(0D)));
            yy = 1D + (((tickAnim - 7D) / 7D) * (1.88326D-(1D)));
            zz = 0D + (((tickAnim - 7D) / 7D) * (0.10783D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -1.7894D + (((tickAnim - 14D) / 6D) * (-3.21525D-(-1.7894D)));
            yy = 1.88326D + (((tickAnim - 14D) / 6D) * (-0.79585D-(1.88326D)));
            zz = 0.10783D + (((tickAnim - 14D) / 6D) * (2.36706D-(0.10783D)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -3.21525D + (((tickAnim - 20D) / 6D) * (-4.58D-(-3.21525D)));
            yy = -0.79585D + (((tickAnim - 20D) / 6D) * (-3.1D-(-0.79585D)));
            zz = 2.36706D + (((tickAnim - 20D) / 6D) * (-0.36D-(2.36706D)));
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.14704D + (((tickAnim - 0D) / 3D) * (19.2543D-(7.14704D)));
            yy = 30.85399D + (((tickAnim - 0D) / 3D) * (36.79671D-(30.85399D)));
            zz = 0.80074D + (((tickAnim - 0D) / 3D) * (11.0042D-(0.80074D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 19.2543D + (((tickAnim - 3D) / 1D) * (-9.15038D-(19.2543D)));
            yy = 36.79671D + (((tickAnim - 3D) / 1D) * (29.52398D-(36.79671D)));
            zz = 11.0042D + (((tickAnim - 3D) / 1D) * (-15.93895D-(11.0042D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -9.15038D + (((tickAnim - 4D) / 2D) * (11.73264D-(-9.15038D)));
            yy = 29.52398D + (((tickAnim - 4D) / 2D) * (33.32259D-(29.52398D)));
            zz = -15.93895D + (((tickAnim - 4D) / 2D) * (5.69638D-(-15.93895D)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 11.73264D + (((tickAnim - 6D) / 12D) * (17.90022D-(11.73264D)));
            yy = 33.32259D + (((tickAnim - 6D) / 12D) * (32.81972D-(33.32259D)));
            zz = 5.69638D + (((tickAnim - 6D) / 12D) * (11.04432D-(5.69638D)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 17.90022D + (((tickAnim - 18D) / 8D) * (7.14704D-(17.90022D)));
            yy = 32.81972D + (((tickAnim - 18D) / 8D) * (30.85399D-(32.81972D)));
            zz = 11.04432D + (((tickAnim - 18D) / 8D) * (0.80074D-(11.04432D)));
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.2736D + (((tickAnim - 0D) / 3D) * (22.00864D-(4.2736D)));
            yy = -30.9347D + (((tickAnim - 0D) / 3D) * (-28.74034D-(-30.9347D)));
            zz = 3.59468D + (((tickAnim - 0D) / 3D) * (-13.41166D-(3.59468D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 22.00864D + (((tickAnim - 3D) / 3D) * (1.16787D-(22.00864D)));
            yy = -28.74034D + (((tickAnim - 3D) / 3D) * (-28.15278D-(-28.74034D)));
            zz = -13.41166D + (((tickAnim - 3D) / 3D) * (6.8507D-(-13.41166D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.16787D + (((tickAnim - 6D) / 2D) * (15.39674D-(1.16787D)));
            yy = -28.15278D + (((tickAnim - 6D) / 2D) * (-30.11286D-(-28.15278D)));
            zz = 6.8507D + (((tickAnim - 6D) / 2D) * (-7.78619D-(6.8507D)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 15.39674D + (((tickAnim - 8D) / 10D) * (18.38149D-(15.39674D)));
            yy = -30.11286D + (((tickAnim - 8D) / 10D) * (-31.87916D-(-30.11286D)));
            zz = -7.78619D + (((tickAnim - 8D) / 10D) * (-9.84601D-(-7.78619D)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 18.38149D + (((tickAnim - 18D) / 8D) * (4.2736D-(18.38149D)));
            yy = -31.87916D + (((tickAnim - 18D) / 8D) * (-30.9347D-(-31.87916D)));
            zz = -9.84601D + (((tickAnim - 18D) / 8D) * (3.59468D-(-9.84601D)));
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -21.97837D + (((tickAnim - 0D) / 2D) * (17.36806D-(-21.97837D)));
            yy = -17.834D + (((tickAnim - 0D) / 2D) * (-38.595D-(-17.834D)));
            zz = 21.482D + (((tickAnim - 0D) / 2D) * (-20.887D-(21.482D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.36806D + (((tickAnim - 2D) / 1D) * (-9.95572D-(17.36806D)));
            yy = -38.595D + (((tickAnim - 2D) / 1D) * (-41.6209D-(-38.595D)));
            zz = -20.887D + (((tickAnim - 2D) / 1D) * (11.0093D-(-20.887D)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -9.95572D + (((tickAnim - 3D) / 10D) * (11.37907D-(-9.95572D)));
            yy = -41.6209D + (((tickAnim - 3D) / 10D) * (12.5223D-(-41.6209D)));
            zz = 11.0093D + (((tickAnim - 3D) / 10D) * (-41.9591D-(11.0093D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.37907D + (((tickAnim - 13D) / 5D) * (18.46859D-(11.37907D)));
            yy = 12.5223D + (((tickAnim - 13D) / 5D) * (50.0976D-(12.5223D)));
            zz = -41.9591D + (((tickAnim - 13D) / 5D) * (-8.3893D-(-41.9591D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 18.46859D + (((tickAnim - 18D) / 4D) * (8.98301D-(18.46859D)));
            yy = 50.0976D + (((tickAnim - 18D) / 4D) * (6.7687D-(50.0976D)));
            zz = -8.3893D + (((tickAnim - 18D) / 4D) * (10.2766D-(-8.3893D)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 8.98301D + (((tickAnim - 22D) / 4D) * (-21.97837D-(8.98301D)));
            yy = 6.7687D + (((tickAnim - 22D) / 4D) * (-17.834D-(6.7687D)));
            zz = 10.2766D + (((tickAnim - 22D) / 4D) * (21.482D-(10.2766D)));
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 27.5D + (((tickAnim - 0D) / 3D) * (-31.56D-(27.5D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = -31.56D + (((tickAnim - 3D) / 4D) * (-47.5D-(-31.56D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
            yy = -47.5D + (((tickAnim - 7D) / 5D) * (-43.99D-(-47.5D)));
            zz = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = -43.99D + (((tickAnim - 12D) / 6D) * (-9.57D-(-43.99D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 18D) / 4D) * (0D-(0D)));
            yy = -9.57D + (((tickAnim - 18D) / 4D) * (47.71D-(-9.57D)));
            zz = 0D + (((tickAnim - 18D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
            yy = 47.71D + (((tickAnim - 22D) / 4D) * (27.5D-(47.71D)));
            zz = 0D + (((tickAnim - 22D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 39.52947D + (((tickAnim - 0D) / 1D) * (11.19209D-(39.52947D)));
            yy = 10.61627D + (((tickAnim - 0D) / 1D) * (10.0189D-(10.61627D)));
            zz = 44.74978D + (((tickAnim - 0D) / 1D) * (16.4495D-(44.74978D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 11.19209D + (((tickAnim - 1D) / 1D) * (8.7315D-(11.19209D)));
            yy = 10.0189D + (((tickAnim - 1D) / 1D) * (-5.425D-(10.0189D)));
            zz = 16.4495D + (((tickAnim - 1D) / 1D) * (7.6549D-(16.4495D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.7315D + (((tickAnim - 2D) / 1D) * (-20.73701D-(8.7315D)));
            yy = -5.425D + (((tickAnim - 2D) / 1D) * (-21.9801D-(-5.425D)));
            zz = 7.6549D + (((tickAnim - 2D) / 1D) * (-8.9487D-(7.6549D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20.73701D + (((tickAnim - 3D) / 2D) * (-33.95971D-(-20.73701D)));
            yy = -21.9801D + (((tickAnim - 3D) / 2D) * (-32.0515D-(-21.9801D)));
            zz = -8.9487D + (((tickAnim - 3D) / 2D) * (-0.6939D-(-8.9487D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -33.95971D + (((tickAnim - 5D) / 2D) * (-37.49233D-(-33.95971D)));
            yy = -32.0515D + (((tickAnim - 5D) / 2D) * (-34.2726D-(-32.0515D)));
            zz = -0.6939D + (((tickAnim - 5D) / 2D) * (1.1597D-(-0.6939D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -37.49233D + (((tickAnim - 7D) / 3D) * (-12.48D-(-37.49233D)));
            yy = -34.2726D + (((tickAnim - 7D) / 3D) * (-33.17D-(-34.2726D)));
            zz = 1.1597D + (((tickAnim - 7D) / 3D) * (10.11D-(1.1597D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12.48D + (((tickAnim - 10D) / 3D) * (-18.87335D-(-12.48D)));
            yy = -33.17D + (((tickAnim - 10D) / 3D) * (-21.0186D-(-33.17D)));
            zz = 10.11D + (((tickAnim - 10D) / 3D) * (-6.6116D-(10.11D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.87335D + (((tickAnim - 13D) / 2D) * (-27.73118D-(-18.87335D)));
            yy = -21.0186D + (((tickAnim - 13D) / 2D) * (-12.117D-(-21.0186D)));
            zz = -6.6116D + (((tickAnim - 13D) / 2D) * (-12.5719D-(-6.6116D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -27.73118D + (((tickAnim - 15D) / 3D) * (-11.72596D-(-27.73118D)));
            yy = -12.117D + (((tickAnim - 15D) / 3D) * (-24.3532D-(-12.117D)));
            zz = -12.5719D + (((tickAnim - 15D) / 3D) * (-2.3539D-(-12.5719D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -11.72596D + (((tickAnim - 18D) / 1D) * (6.57714D-(-11.72596D)));
            yy = -24.3532D + (((tickAnim - 18D) / 1D) * (4.8409D-(-24.3532D)));
            zz = -2.3539D + (((tickAnim - 18D) / 1D) * (4.0222D-(-2.3539D)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 6.57714D + (((tickAnim - 19D) / 3D) * (30.70439D-(6.57714D)));
            yy = 4.8409D + (((tickAnim - 19D) / 3D) * (-2.9562D-(4.8409D)));
            zz = 4.0222D + (((tickAnim - 19D) / 3D) * (25.7147D-(4.0222D)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 30.70439D + (((tickAnim - 22D) / 1D) * (36.32871D-(30.70439D)));
            yy = -2.9562D + (((tickAnim - 22D) / 1D) * (5.3094D-(-2.9562D)));
            zz = 25.7147D + (((tickAnim - 22D) / 1D) * (35.5252D-(25.7147D)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 36.32871D + (((tickAnim - 23D) / 3D) * (39.52947D-(36.32871D)));
            yy = 5.3094D + (((tickAnim - 23D) / 3D) * (10.61627D-(5.3094D)));
            zz = 35.5252D + (((tickAnim - 23D) / 3D) * (44.74978D-(35.5252D)));
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-10D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 3D) / 3D) * (0D-(0D)));
            yy = -10D + (((tickAnim - 3D) / 3D) * (0D-(-10D)));
            zz = 0D + (((tickAnim - 3D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 6D) / 20D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (10D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            yy = 10D + (((tickAnim - 4D) / 2D) * (0D-(10D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 6D) / 20D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 6D) / 20D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(xx), footR.rotateAngleY + (float) Math.toRadians(yy), footR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 5D) / 3D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 8D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 18D) * (0D-(0D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0.04884D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (-4.99515D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (-5.2255D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.04884D + (((tickAnim - 6D) / 2D) * (0D-(0.04884D)));
            yy = -4.99515D + (((tickAnim - 6D) / 2D) * (0D-(-4.99515D)));
            zz = -5.2255D + (((tickAnim - 6D) / 2D) * (0D-(-5.2255D)));
        }
        else if (tickAnim >= 8 && tickAnim < 26) {
            xx = 0D + (((tickAnim - 8D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 18D) * (0D-(0D)));
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIchthyostega entity = (EntityPrehistoricFloraIchthyostega) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 5.02D + (((tickAnim - 0D) / 2D) * (5.01745D-(5.02D)));
            yy = -0.67D + (((tickAnim - 0D) / 2D) * (-0.99985D-(-0.67D)));
            zz = -0.67D + (((tickAnim - 0D) / 2D) * (-1.00015D-(-0.67D)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 5.01745D + (((tickAnim - 2D) / 10D) * (5.01745D-(5.01745D)));
            yy = -0.99985D + (((tickAnim - 2D) / 10D) * (0.99985D-(-0.99985D)));
            zz = -1.00015D + (((tickAnim - 2D) / 10D) * (1.00015D-(-1.00015D)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 5.01745D + (((tickAnim - 12D) / 8D) * (5.02D-(5.01745D)));
            yy = 0.99985D + (((tickAnim - 12D) / 8D) * (-0.67D-(0.99985D)));
            zz = 1.00015D + (((tickAnim - 12D) / 8D) * (-0.67D-(1.00015D)));
        }
        this.setRotateAngle(bodyrear, bodyrear.rotateAngleX + (float) Math.toRadians(xx), bodyrear.rotateAngleY + (float) Math.toRadians(yy), bodyrear.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.09D + (((tickAnim - 0D) / 3D) * (0.08748D-(0.09D)));
            yy = -1.67D + (((tickAnim - 0D) / 3D) * (-4.99924D-(-1.67D)));
            zz = -0.33D + (((tickAnim - 0D) / 3D) * (-1.00382D-(-0.33D)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0.08748D + (((tickAnim - 3D) / 10D) * (0.08748D-(0.08748D)));
            yy = -4.99924D + (((tickAnim - 3D) / 10D) * (4.99924D-(-4.99924D)));
            zz = -1.00382D + (((tickAnim - 3D) / 10D) * (1.00382D-(-1.00382D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.08748D + (((tickAnim - 13D) / 7D) * (0.09D-(0.08748D)));
            yy = 4.99924D + (((tickAnim - 13D) / 7D) * (-1.67D-(4.99924D)));
            zz = 1.00382D + (((tickAnim - 13D) / 7D) * (-0.33D-(1.00382D)));
        }
        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(xx), tailbase.rotateAngleY + (float) Math.toRadians(yy), tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5.09D + (((tickAnim - 0D) / 5D) * (5.08779D-(5.09D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (-5.04286D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (-1.00293D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 5.08779D + (((tickAnim - 5D) / 10D) * (5.08779D-(5.08779D)));
            yy = -5.04286D + (((tickAnim - 5D) / 10D) * (5.04286D-(-5.04286D)));
            zz = -1.00293D + (((tickAnim - 5D) / 10D) * (1.00293D-(-1.00293D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5.08779D + (((tickAnim - 15D) / 5D) * (5.09D-(5.08779D)));
            yy = 5.04286D + (((tickAnim - 15D) / 5D) * (0D-(5.04286D)));
            zz = 1.00293D + (((tickAnim - 15D) / 5D) * (0D-(1.00293D)));
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 0D) / 2D) * (0D-(5D)));
            zz = -0.67D + (((tickAnim - 0D) / 2D) * (-1D-(-0.67D)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 2D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 2D) / 5D) * (-15D-(0D)));
            zz = -1D + (((tickAnim - 2D) / 5D) * (0D-(-1D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
            yy = -15D + (((tickAnim - 7D) / 5D) * (0D-(-15D)));
            zz = 0D + (((tickAnim - 7D) / 5D) * (1D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 12D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 5D) * (15D-(0D)));
            zz = 1D + (((tickAnim - 12D) / 5D) * (0D-(1D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            yy = 15D + (((tickAnim - 17D) / 3D) * (5D-(15D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (-0.67D-(0D)));
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.46D + (((tickAnim - 0D) / 3D) * (-2.50095D-(-2.46D)));
            yy = 13.35D + (((tickAnim - 0D) / 3D) * (0.04362D-(13.35D)));
            zz = -0.65D + (((tickAnim - 0D) / 3D) * (-2.49962D-(-0.65D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.50095D + (((tickAnim - 3D) / 5D) * (-2.43988D-(-2.50095D)));
            yy = 0.04362D + (((tickAnim - 3D) / 5D) * (-19.99761D-(0.04362D)));
            zz = -2.49962D + (((tickAnim - 3D) / 5D) * (-0.27541D-(-2.49962D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -2.43988D + (((tickAnim - 8D) / 5D) * (-2.50095D-(-2.43988D)));
            yy = -19.99761D + (((tickAnim - 8D) / 5D) * (-0.04362D-(-19.99761D)));
            zz = -0.27541D + (((tickAnim - 8D) / 5D) * (2.49962D-(-0.27541D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.50095D + (((tickAnim - 13D) / 5D) * (-2.43988D-(-2.50095D)));
            yy = -0.04362D + (((tickAnim - 13D) / 5D) * (19.99757D-(-0.04362D)));
            zz = 2.49962D + (((tickAnim - 13D) / 5D) * (0.27545D-(2.49962D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.43988D + (((tickAnim - 18D) / 2D) * (-2.46D-(-2.43988D)));
            yy = 19.99757D + (((tickAnim - 18D) / 2D) * (13.35D-(19.99757D)));
            zz = 0.27545D + (((tickAnim - 18D) / 2D) * (-0.65D-(0.27545D)));
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 14.33801D + (((tickAnim - 0D) / 10D) * (7.48899D-(14.33801D)));
            yy = -13.14643D + (((tickAnim - 0D) / 10D) * (-12.19886D-(-13.14643D)));
            zz = 5.49207D + (((tickAnim - 0D) / 10D) * (-0.34104D-(5.49207D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.48899D + (((tickAnim - 10D) / 10D) * (14.33801D-(7.48899D)));
            yy = -12.19886D + (((tickAnim - 10D) / 10D) * (-13.14643D-(-12.19886D)));
            zz = -0.34104D + (((tickAnim - 10D) / 10D) * (5.49207D-(-0.34104D)));
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = -45D + (((tickAnim - 0D) / 20D) * (-45D-(-45D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.87947D + (((tickAnim - 0D) / 5D) * (-3.70163D-(-13.87947D)));
            yy = -20.46014D + (((tickAnim - 0D) / 5D) * (-22.72357D-(-20.46014D)));
            zz = -6.73686D + (((tickAnim - 0D) / 5D) * (5.53302D-(-6.73686D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.70163D + (((tickAnim - 5D) / 5D) * (-13.21642D-(-3.70163D)));
            yy = -22.72357D + (((tickAnim - 5D) / 5D) * (-21.54701D-(-22.72357D)));
            zz = 5.53302D + (((tickAnim - 5D) / 5D) * (18.24854D-(5.53302D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.21642D + (((tickAnim - 10D) / 5D) * (-23.3999D-(-13.21642D)));
            yy = -21.54701D + (((tickAnim - 10D) / 5D) * (-19.27085D-(-21.54701D)));
            zz = 18.24854D + (((tickAnim - 10D) / 5D) * (5.68073D-(18.24854D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -23.3999D + (((tickAnim - 15D) / 5D) * (-13.87947D-(-23.3999D)));
            yy = -19.27085D + (((tickAnim - 15D) / 5D) * (-20.46014D-(-19.27085D)));
            zz = 5.68073D + (((tickAnim - 15D) / 5D) * (-6.73686D-(5.68073D)));
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.48899D + (((tickAnim - 0D) / 10D) * (14.33801D-(7.48899D)));
            yy = 12.19886D + (((tickAnim - 0D) / 10D) * (13.14643D-(12.19886D)));
            zz = 0.34104D + (((tickAnim - 0D) / 10D) * (-5.49207D-(0.34104D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.33801D + (((tickAnim - 10D) / 10D) * (7.48899D-(14.33801D)));
            yy = 13.14643D + (((tickAnim - 10D) / 10D) * (12.19886D-(13.14643D)));
            zz = -5.49207D + (((tickAnim - 10D) / 10D) * (0.34104D-(-5.49207D)));
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
            yy = 45D + (((tickAnim - 0D) / 20D) * (45D-(45D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13.21642D + (((tickAnim - 0D) / 5D) * (-23.3999D-(-13.21642D)));
            yy = 21.54701D + (((tickAnim - 0D) / 5D) * (19.27085D-(21.54701D)));
            zz = -18.24854D + (((tickAnim - 0D) / 5D) * (-5.68073D-(-18.24854D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.3999D + (((tickAnim - 5D) / 5D) * (-13.87947D-(-23.3999D)));
            yy = 19.27085D + (((tickAnim - 5D) / 5D) * (20.46014D-(19.27085D)));
            zz = -5.68073D + (((tickAnim - 5D) / 5D) * (6.73686D-(-5.68073D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.87947D + (((tickAnim - 10D) / 5D) * (-3.70163D-(-13.87947D)));
            yy = 20.46014D + (((tickAnim - 10D) / 5D) * (22.72357D-(20.46014D)));
            zz = 6.73686D + (((tickAnim - 10D) / 5D) * (-5.53302D-(6.73686D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.70163D + (((tickAnim - 15D) / 5D) * (-13.21642D-(-3.70163D)));
            yy = 22.72357D + (((tickAnim - 15D) / 5D) * (21.54701D-(22.72357D)));
            zz = -5.53302D + (((tickAnim - 15D) / 5D) * (-18.24854D-(-5.53302D)));
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -7.5D + (((tickAnim - 0D) / 5D) * (-7.5D-(-7.5D)));
            yy = 25D + (((tickAnim - 0D) / 5D) * (0D-(25D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.5D + (((tickAnim - 5D) / 5D) * (-7.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (-25D-(0D)));
            zz = -2.5D + (((tickAnim - 5D) / 5D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -7.5D + (((tickAnim - 10D) / 5D) * (-7.5D-(-7.5D)));
            yy = -25D + (((tickAnim - 10D) / 5D) * (0D-(-25D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.5D + (((tickAnim - 15D) / 5D) * (-7.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (25D-(0D)));
            zz = 2.5D + (((tickAnim - 15D) / 5D) * (0D-(2.5D)));
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 34.6706D + (((tickAnim - 0D) / 1D) * (35.52929D-(34.6706D)));
            yy = -44.0574D + (((tickAnim - 0D) / 1D) * (-46.2792D-(-44.0574D)));
            zz = 24.7607D + (((tickAnim - 0D) / 1D) * (19.3447D-(24.7607D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 35.52929D + (((tickAnim - 1D) / 1D) * (35.63788D-(35.52929D)));
            yy = -46.2792D + (((tickAnim - 1D) / 1D) * (-45.3219D-(-46.2792D)));
            zz = 19.3447D + (((tickAnim - 1D) / 1D) * (13.7152D-(19.3447D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 35.63788D + (((tickAnim - 2D) / 1D) * (34.68456D-(35.63788D)));
            yy = -45.3219D + (((tickAnim - 2D) / 1D) * (-40.1245D-(-45.3219D)));
            zz = 13.7152D + (((tickAnim - 2D) / 1D) * (7.615D-(13.7152D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 34.68456D + (((tickAnim - 3D) / 2D) * (21.2087D-(34.68456D)));
            yy = -40.1245D + (((tickAnim - 3D) / 2D) * (-8.8951D-(-40.1245D)));
            zz = 7.615D + (((tickAnim - 3D) / 2D) * (-16.4868D-(7.615D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 21.2087D + (((tickAnim - 5D) / 2D) * (2.61003D-(21.2087D)));
            yy = -8.8951D + (((tickAnim - 5D) / 2D) * (3.4627D-(-8.8951D)));
            zz = -16.4868D + (((tickAnim - 5D) / 2D) * (-27.1097D-(-16.4868D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 2.61003D + (((tickAnim - 7D) / 1D) * (-10.96451D-(2.61003D)));
            yy = 3.4627D + (((tickAnim - 7D) / 1D) * (7.7576D-(3.4627D)));
            zz = -27.1097D + (((tickAnim - 7D) / 1D) * (-31.9069D-(-27.1097D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -10.96451D + (((tickAnim - 8D) / 0D) * (-16.56958D-(-10.96451D)));
            yy = 7.7576D + (((tickAnim - 8D) / 0D) * (9.5061D-(7.7576D)));
            zz = -31.9069D + (((tickAnim - 8D) / 0D) * (-32.6187D-(-31.9069D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.56958D + (((tickAnim - 8D) / 2D) * (-18.38342D-(-16.56958D)));
            yy = 9.5061D + (((tickAnim - 8D) / 2D) * (12.6098D-(9.5061D)));
            zz = -32.6187D + (((tickAnim - 8D) / 2D) * (-27.4643D-(-32.6187D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18.38342D + (((tickAnim - 10D) / 3D) * (-6.62981D-(-18.38342D)));
            yy = 12.6098D + (((tickAnim - 10D) / 3D) * (11.5535D-(12.6098D)));
            zz = -27.4643D + (((tickAnim - 10D) / 3D) * (-0.2686D-(-27.4643D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -6.62981D + (((tickAnim - 13D) / 3D) * (12.78452D-(-6.62981D)));
            yy = 11.5535D + (((tickAnim - 13D) / 3D) * (-24.6381D-(11.5535D)));
            zz = -0.2686D + (((tickAnim - 13D) / 3D) * (27.585D-(-0.2686D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 12.78452D + (((tickAnim - 16D) / 2D) * (23.42242D-(12.78452D)));
            yy = -24.6381D + (((tickAnim - 16D) / 2D) * (-39.292D-(-24.6381D)));
            zz = 27.585D + (((tickAnim - 16D) / 2D) * (29.343D-(27.585D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 23.42242D + (((tickAnim - 18D) / 2D) * (34.6706D-(23.42242D)));
            yy = -39.292D + (((tickAnim - 18D) / 2D) * (-44.0574D-(-39.292D)));
            zz = 29.343D + (((tickAnim - 18D) / 2D) * (24.7607D-(29.343D)));
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
            yy = -28.72D + (((tickAnim - 0D) / 1D) * (-30.43D-(-28.72D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
            yy = -30.43D + (((tickAnim - 1D) / 2D) * (-27.63D-(-30.43D)));
            zz = 0D + (((tickAnim - 1D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -27.63D + (((tickAnim - 3D) / 2D) * (-16.43D-(-27.63D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            yy = -16.43D + (((tickAnim - 5D) / 3D) * (7D-(-16.43D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = 7D + (((tickAnim - 8D) / 2D) * (14.37D-(7D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 14.37D + (((tickAnim - 10D) / 2D) * (18.75D-(14.37D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = 18.75D + (((tickAnim - 12D) / 1D) * (16.62D-(18.75D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 16.62D + (((tickAnim - 13D) / 2D) * (6.5D-(16.62D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
            yy = 6.5D + (((tickAnim - 15D) / 3D) * (-17.5D-(6.5D)));
            zz = 0D + (((tickAnim - 15D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
            yy = -17.5D + (((tickAnim - 18D) / 1D) * (-27D-(-17.5D)));
            zz = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
            yy = -27D + (((tickAnim - 19D) / 1D) * (-28.71D-(-27D)));
            zz = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -6D + (((tickAnim - 0D) / 2D) * (10D-(-6D)));
            yy = 11D + (((tickAnim - 0D) / 2D) * (4D-(11D)));
            zz = -6.5D + (((tickAnim - 0D) / 2D) * (26.5D-(-6.5D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10D + (((tickAnim - 2D) / 1D) * (15D-(10D)));
            yy = 4D + (((tickAnim - 2D) / 1D) * (2D-(4D)));
            zz = 26.5D + (((tickAnim - 2D) / 1D) * (38.5D-(26.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 15D + (((tickAnim - 3D) / 1D) * (21.37D-(15D)));
            yy = 2D + (((tickAnim - 3D) / 1D) * (0.5D-(2D)));
            zz = 38.5D + (((tickAnim - 3D) / 1D) * (47.8D-(38.5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 21.37D + (((tickAnim - 4D) / 2D) * (25.5D-(21.37D)));
            yy = 0.5D + (((tickAnim - 4D) / 2D) * (0D-(0.5D)));
            zz = 47.8D + (((tickAnim - 4D) / 2D) * (51.7D-(47.8D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 25.5D + (((tickAnim - 6D) / 2D) * (25.75D-(25.5D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (1D-(0D)));
            zz = 51.7D + (((tickAnim - 6D) / 2D) * (45.17D-(51.7D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25.75D + (((tickAnim - 8D) / 2D) * (23.5D-(25.75D)));
            yy = 1D + (((tickAnim - 8D) / 2D) * (4D-(1D)));
            zz = 45.17D + (((tickAnim - 8D) / 2D) * (33D-(45.17D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 23.5D + (((tickAnim - 10D) / 3D) * (11.95145D-(23.5D)));
            yy = 4D + (((tickAnim - 10D) / 3D) * (18.2676D-(4D)));
            zz = 33D + (((tickAnim - 10D) / 3D) * (-3.4787D-(33D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.95145D + (((tickAnim - 13D) / 3D) * (-6.12306D-(11.95145D)));
            yy = 18.2676D + (((tickAnim - 13D) / 3D) * (22.5926D-(18.2676D)));
            zz = -3.4787D + (((tickAnim - 13D) / 3D) * (-20.9817D-(-3.4787D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -6.12306D + (((tickAnim - 16D) / 2D) * (-11D-(-6.12306D)));
            yy = 22.5926D + (((tickAnim - 16D) / 2D) * (20D-(22.5926D)));
            zz = -20.9817D + (((tickAnim - 16D) / 2D) * (-22.5D-(-20.9817D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -11D + (((tickAnim - 18D) / 1D) * (-10D-(-11D)));
            yy = 20D + (((tickAnim - 18D) / 1D) * (15D-(20D)));
            zz = -22.5D + (((tickAnim - 18D) / 1D) * (-15D-(-22.5D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -10D + (((tickAnim - 19D) / 1D) * (-6D-(-10D)));
            yy = 15D + (((tickAnim - 19D) / 1D) * (11D-(15D)));
            zz = -15D + (((tickAnim - 19D) / 1D) * (-6.5D-(-15D)));
        }
        this.setRotateAngle(footR, footR.rotateAngleX + (float) Math.toRadians(xx), footR.rotateAngleY + (float) Math.toRadians(yy), footR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -16.56958D + (((tickAnim - 0D) / 2D) * (-18.38342D-(-16.56958D)));
            yy = -9.50607D + (((tickAnim - 0D) / 2D) * (-12.60984D-(-9.50607D)));
            zz = 32.61865D + (((tickAnim - 0D) / 2D) * (27.46427D-(32.61865D)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -18.38342D + (((tickAnim - 2D) / 2D) * (-6.62981D-(-18.38342D)));
            yy = -12.60984D + (((tickAnim - 2D) / 2D) * (-11.55349D-(-12.60984D)));
            zz = 27.46427D + (((tickAnim - 2D) / 2D) * (0.26863D-(27.46427D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -6.62981D + (((tickAnim - 4D) / 4D) * (12.78452D-(-6.62981D)));
            yy = -11.55349D + (((tickAnim - 4D) / 4D) * (24.63806D-(-11.55349D)));
            zz = 0.26863D + (((tickAnim - 4D) / 4D) * (-27.58498D-(0.26863D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 12.78452D + (((tickAnim - 8D) / 2D) * (23.42242D-(12.78452D)));
            yy = 24.63806D + (((tickAnim - 8D) / 2D) * (39.292D-(24.63806D)));
            zz = -27.58498D + (((tickAnim - 8D) / 2D) * (-29.34295D-(-27.58498D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 23.42242D + (((tickAnim - 10D) / 2D) * (34.6706D-(23.42242D)));
            yy = 39.292D + (((tickAnim - 10D) / 2D) * (44.05744D-(39.292D)));
            zz = -29.34295D + (((tickAnim - 10D) / 2D) * (-24.76065D-(-29.34295D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 34.6706D + (((tickAnim - 12D) / 1D) * (35.52929D-(34.6706D)));
            yy = 44.05744D + (((tickAnim - 12D) / 1D) * (46.2792D-(44.05744D)));
            zz = -24.76065D + (((tickAnim - 12D) / 1D) * (-19.34475D-(-24.76065D)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 35.52929D + (((tickAnim - 13D) / 0D) * (35.63788D-(35.52929D)));
            yy = 46.2792D + (((tickAnim - 13D) / 0D) * (45.32194D-(46.2792D)));
            zz = -19.34475D + (((tickAnim - 13D) / 0D) * (-13.71517D-(-19.34475D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 35.63788D + (((tickAnim - 13D) / 1D) * (34.68456D-(35.63788D)));
            yy = 45.32194D + (((tickAnim - 13D) / 1D) * (40.12448D-(45.32194D)));
            zz = -13.71517D + (((tickAnim - 13D) / 1D) * (-7.615D-(-13.71517D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 34.68456D + (((tickAnim - 14D) / 3D) * (21.2087D-(34.68456D)));
            yy = 40.12448D + (((tickAnim - 14D) / 3D) * (8.89511D-(40.12448D)));
            zz = -7.615D + (((tickAnim - 14D) / 3D) * (16.48683D-(-7.615D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 21.2087D + (((tickAnim - 17D) / 1D) * (2.61003D-(21.2087D)));
            yy = 8.89511D + (((tickAnim - 17D) / 1D) * (-3.4627D-(8.89511D)));
            zz = 16.48683D + (((tickAnim - 17D) / 1D) * (27.10968D-(16.48683D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 2.61003D + (((tickAnim - 18D) / 1D) * (-10.96451D-(2.61003D)));
            yy = -3.4627D + (((tickAnim - 18D) / 1D) * (-7.75763D-(-3.4627D)));
            zz = 27.10968D + (((tickAnim - 18D) / 1D) * (31.90689D-(27.10968D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -10.96451D + (((tickAnim - 19D) / 1D) * (-16.56958D-(-10.96451D)));
            yy = -7.75763D + (((tickAnim - 19D) / 1D) * (-9.50607D-(-7.75763D)));
            zz = 31.90689D + (((tickAnim - 19D) / 1D) * (32.61865D-(31.90689D)));
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = -7D + (((tickAnim - 0D) / 2D) * (-14.37D-(-7D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = -14.37D + (((tickAnim - 2D) / 1D) * (-18.75D-(-14.37D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -18.75D + (((tickAnim - 3D) / 2D) * (-16.62D-(-18.75D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = -16.62D + (((tickAnim - 5D) / 2D) * (-7.5D-(-16.62D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = -7.5D + (((tickAnim - 7D) / 2D) * (17.5D-(-7.5D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 9D) / 2D) * (0D-(0D)));
            yy = 17.5D + (((tickAnim - 9D) / 2D) * (27D-(17.5D)));
            zz = 0D + (((tickAnim - 9D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
            yy = 27D + (((tickAnim - 11D) / 2D) * (30.43D-(27D)));
            zz = 0D + (((tickAnim - 11D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
            yy = 30.43D + (((tickAnim - 13D) / 1D) * (27.63D-(30.43D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 14D) / 3D) * (0D-(0D)));
            yy = 27.63D + (((tickAnim - 14D) / 3D) * (16.43D-(27.63D)));
            zz = 0D + (((tickAnim - 14D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            yy = 16.43D + (((tickAnim - 17D) / 3D) * (-7D-(16.43D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25.75D + (((tickAnim - 0D) / 2D) * (23.5D-(25.75D)));
            yy = -1D + (((tickAnim - 0D) / 2D) * (-4D-(-1D)));
            zz = -45.17D + (((tickAnim - 0D) / 2D) * (-33D-(-45.17D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 23.5D + (((tickAnim - 2D) / 3D) * (11.95145D-(23.5D)));
            yy = -4D + (((tickAnim - 2D) / 3D) * (-18.2676D-(-4D)));
            zz = -33D + (((tickAnim - 2D) / 3D) * (3.4787D-(-33D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.95145D + (((tickAnim - 5D) / 3D) * (-6.12306D-(11.95145D)));
            yy = -18.2676D + (((tickAnim - 5D) / 3D) * (-22.5926D-(-18.2676D)));
            zz = 3.4787D + (((tickAnim - 5D) / 3D) * (20.9817D-(3.4787D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -6.12306D + (((tickAnim - 8D) / 1D) * (-11D-(-6.12306D)));
            yy = -22.5926D + (((tickAnim - 8D) / 1D) * (-20D-(-22.5926D)));
            zz = 20.9817D + (((tickAnim - 8D) / 1D) * (22.5D-(20.9817D)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -11D + (((tickAnim - 9D) / 2D) * (-10D-(-11D)));
            yy = -20D + (((tickAnim - 9D) / 2D) * (-15D-(-20D)));
            zz = 22.5D + (((tickAnim - 9D) / 2D) * (15D-(22.5D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -10D + (((tickAnim - 11D) / 1D) * (-6D-(-10D)));
            yy = -15D + (((tickAnim - 11D) / 1D) * (-11D-(-15D)));
            zz = 15D + (((tickAnim - 11D) / 1D) * (6.5D-(15D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -6D + (((tickAnim - 12D) / 1D) * (10D-(-6D)));
            yy = -11D + (((tickAnim - 12D) / 1D) * (-4D-(-11D)));
            zz = 6.5D + (((tickAnim - 12D) / 1D) * (-26.5D-(6.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 10D + (((tickAnim - 13D) / 1D) * (15D-(10D)));
            yy = -4D + (((tickAnim - 13D) / 1D) * (-2D-(-4D)));
            zz = -26.5D + (((tickAnim - 13D) / 1D) * (-38.5D-(-26.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 15D + (((tickAnim - 14D) / 2D) * (21.37D-(15D)));
            yy = -2D + (((tickAnim - 14D) / 2D) * (-0.5D-(-2D)));
            zz = -38.5D + (((tickAnim - 14D) / 2D) * (-47.8D-(-38.5D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 21.37D + (((tickAnim - 16D) / 2D) * (25.5D-(21.37D)));
            yy = -0.5D + (((tickAnim - 16D) / 2D) * (0D-(-0.5D)));
            zz = -47.8D + (((tickAnim - 16D) / 2D) * (-51.7D-(-47.8D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 25.5D + (((tickAnim - 18D) / 2D) * (25.75D-(25.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (-1D-(0D)));
            zz = -51.7D + (((tickAnim - 18D) / 2D) * (-45.17D-(-51.7D)));
        }
        this.setRotateAngle(footL, footL.rotateAngleX + (float) Math.toRadians(xx), footL.rotateAngleY + (float) Math.toRadians(yy), footL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 0D) / 5D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (-1D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (1D-(0D)));
            zz = -1D + (((tickAnim - 5D) / 5D) * (0D-(-1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 10D) / 5D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (1D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (-1D-(0D)));
            zz = 1D + (((tickAnim - 15D) / 5D) * (0D-(1D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (-0.1D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.1D + (((tickAnim - 5D) / 5D) * (0D-(-0.1D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0.1D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.1D + (((tickAnim - 15D) / 5D) * (0D-(0.1D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = -0.67D + (((tickAnim - 0D) / 2D) * (-1D-(-0.67D)));
            zz = 0.33D + (((tickAnim - 0D) / 2D) * (0D-(0.33D)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 2D) / 5D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 2D) / 5D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 2D) / 5D) * (-1D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 7D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 5D) * (1D-(0D)));
            zz = -1D + (((tickAnim - 7D) / 5D) * (0D-(-1D)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 12D) / 5D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 12D) / 5D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 12D) / 5D) * (1D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (-0.67D-(0D)));
            zz = 1D + (((tickAnim - 17D) / 3D) * (0.33D-(1D)));
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = -0.33D + (((tickAnim - 0D) / 3D) * (-1D-(-0.33D)));
            zz = 0.67D + (((tickAnim - 0D) / 3D) * (0D-(0.67D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 3D) / 5D) * (0D-(-1D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (-1D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (1D-(0D)));
            zz = -1D + (((tickAnim - 8D) / 5D) * (0D-(-1D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 13D) / 5D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (1D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (-0.33D-(0D)));
            zz = 1D + (((tickAnim - 18D) / 2D) * (0.67D-(1D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 5D + (((tickAnim - 0D) / 5D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = -5D + (((tickAnim - 10D) / 5D) * (0D-(-5D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 5D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));

    }
    

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
