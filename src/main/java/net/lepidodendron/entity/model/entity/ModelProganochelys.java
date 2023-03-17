package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProganochelys;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProganochelys extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer frontlegleft1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frontlegleft2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontlegleft3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontlegright1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontlegright2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontlegright3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backlegleft1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer backlegleft2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer backlegleft3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backlegright1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backlegright2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backlegright3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer lowerjaw;

    private ModelAnimator animator;

    public ModelProganochelys() {
        this.textureWidth = 79;
        this.textureHeight = 70;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 20.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 29, 22, -6.0F, -1.0F, -4.5F, 11, 2, 10, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 40, 5.25F, -3.25F, -7.5F, 2, 1, 16, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 34, -8.25F, -3.25F, -7.5F, 2, 1, 16, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 51, 1.6158F, -4.3797F, -9.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 5, -6.3842F, -4.3797F, -9.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 44, -6.75F, -3.75F, 8.5F, 4, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 29, 34, 1.75F, -3.75F, 8.5F, 4, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 22, -4.0F, -2.0F, -7.0F, 7, 3, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -6.0F, -8.0F, 13, 5, 17, 0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -4.0F, 8.25F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 7, -2.5F, -0.5F, -0.75F, 5, 4, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 2.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -2.0F, -0.25F, -0.25F, 4, 3, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 12, 0.0F, -1.25F, -0.25F, 0, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -0.25F, 1.75F);
        this.tail2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.5236F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -0.15F, -0.65F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -0.25F, 1.75F);
        this.tail2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.5236F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 12, 0.15F, -0.65F, -2.0F, 0, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.75F, 3.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 43, 11, -1.5F, -1.0F, -0.25F, 3, 2, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 46, 0.0F, -2.0F, -0.25F, 0, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -1.0F, -0.25F);
        this.tail3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.9599F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 44, -0.5F, -0.65F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -1.0F, -0.25F);
        this.tail3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.9599F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 46, 0.5F, -0.65F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 3.65F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 43, 5, -1.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 27, 0.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 22, -2.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 9, 0.0F, -1.5F, 0.0F, 0, 1, 5, 0.0F, false));

        this.frontlegleft1 = new AdvancedModelRenderer(this);
        this.frontlegleft1.setRotationPoint(2.5867F, -1.0325F, -6.0F);
        this.body.addChild(frontlegleft1);
        this.setRotateAngle(frontlegleft1, 0.0F, 0.5236F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.4133F, -0.2175F, 0.0F);
        this.frontlegleft1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.6545F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 39, 0.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.frontlegleft2 = new AdvancedModelRenderer(this);
        this.frontlegleft2.setRotationPoint(3.2874F, 1.5438F, 0.0F);
        this.frontlegleft1.addChild(frontlegleft2);
        this.setRotateAngle(frontlegleft2, 0.0F, -0.5236F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.frontlegleft2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 53, -1.75F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.frontlegleft3 = new AdvancedModelRenderer(this);
        this.frontlegleft3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontlegleft2.addChild(frontlegleft3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.frontlegleft3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 7, 0.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.frontlegright1 = new AdvancedModelRenderer(this);
        this.frontlegright1.setRotationPoint(-3.5867F, -1.0325F, -6.0F);
        this.body.addChild(frontlegright1);
        this.setRotateAngle(frontlegright1, 0.0F, -0.5236F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.4133F, -0.2175F, 0.0F);
        this.frontlegright1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.6545F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 46, -4.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.frontlegright2 = new AdvancedModelRenderer(this);
        this.frontlegright2.setRotationPoint(-3.2874F, 1.5438F, 0.0F);
        this.frontlegright1.addChild(frontlegright2);
        this.setRotateAngle(frontlegright2, 0.0F, 0.5236F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.frontlegright2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 52, -0.25F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.frontlegright3 = new AdvancedModelRenderer(this);
        this.frontlegright3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontlegright2.addChild(frontlegright3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.frontlegright3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 51, -1.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.backlegleft1 = new AdvancedModelRenderer(this);
        this.backlegleft1.setRotationPoint(2.5867F, -0.7825F, 7.0F);
        this.body.addChild(backlegleft1);
        this.setRotateAngle(backlegleft1, 0.0F, -0.5672F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.4133F, -0.4675F, 0.0F);
        this.backlegleft1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.6545F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 34, 0.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.backlegleft2 = new AdvancedModelRenderer(this);
        this.backlegleft2.setRotationPoint(3.2874F, 1.2938F, 0.0F);
        this.backlegleft1.addChild(backlegleft2);
        this.setRotateAngle(backlegleft2, 0.0F, 0.3491F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.backlegleft2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 1.5708F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 0, -1.75F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.backlegleft3 = new AdvancedModelRenderer(this);
        this.backlegleft3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.backlegleft2.addChild(backlegleft3);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.backlegleft3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.5708F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 46, 51, 0.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.backlegright1 = new AdvancedModelRenderer(this);
        this.backlegright1.setRotationPoint(-3.5867F, -0.7825F, 7.0F);
        this.body.addChild(backlegright1);
        this.setRotateAngle(backlegright1, 0.0F, 0.5672F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4133F, -0.4675F, 0.0F);
        this.backlegright1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.6545F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 45, -4.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.backlegright2 = new AdvancedModelRenderer(this);
        this.backlegright2.setRotationPoint(-3.2874F, 1.2938F, 0.0F);
        this.backlegright1.addChild(backlegright2);
        this.setRotateAngle(backlegright2, 0.0F, -0.3491F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.backlegright2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -1.5708F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 51, -0.25F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.backlegright3 = new AdvancedModelRenderer(this);
        this.backlegright3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.backlegright2.addChild(backlegright3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.backlegright3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -1.5708F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 41, -1.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.25F, -7.75F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 22, -2.0F, -1.5F, -3.75F, 3, 3, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 33, 19, 0.0F, -2.25F, -2.75F, 0, 3, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 9, 26, -1.0F, -2.25F, -2.75F, 0, 3, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 3.0F, -1.25F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5672F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 29, -1.0F, -2.5F, -2.5F, 2, 2, 5, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.3335F, -2.7091F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 40, -2.0F, -0.6665F, -4.0409F, 4, 2, 4, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 43, 0, -2.0F, -1.1665F, -4.0409F, 4, 1, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 51, -1.5F, -0.6665F, -4.7909F, 3, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.4829F, -5.2205F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 57, -1.5F, -1.0F, -0.5F, 3, 2, 1, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.4165F, -3.7909F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 47, -1.5F, 0.0F, -2.25F, 3, 1, 2, -0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.3335F, -1.1659F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 8, 51, -1.5F, 0.0F, -3.875F, 3, 1, 1, 0.005F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 20, 40, -2.0F, 0.0F, -2.875F, 4, 1, 4, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 26, 51, -1.5F, -1.0F, -1.625F, 3, 1, 2, -0.001F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraProganochelys entityProganochelys = (EntityPrehistoricFloraProganochelys) e;


        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};


        if (entityProganochelys.getAnimation() == entityProganochelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityProganochelys.isReallyInWater()) {

                if (f3 == 0.0F || !entityProganochelys.getIsMoving()) {
                    if (entityProganochelys.getAnimation() != entityProganochelys.EAT_ANIMATION
                        && entityProganochelys.getAnimation() != entityProganochelys.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityProganochelys.getIsFast()) { //Running


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
        EntityPrehistoricFloraProganochelys ee = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProganochelys entity = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProganochelys entity = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraProganochelys entity = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;


}

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProganochelys e = (EntityPrehistoricFloraProganochelys) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
