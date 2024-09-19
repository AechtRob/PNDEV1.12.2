package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCasineria;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCasineria extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer casineria;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer frontleftLeg;
    private final AdvancedModelRenderer frontleftLeg2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer frontleftLeg3;
    private final AdvancedModelRenderer frontrightLeg4;
    private final AdvancedModelRenderer frontrightLeg5;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer frontrightLeg6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backrightleg5;
    private final AdvancedModelRenderer backrightleg6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelCasineria() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.casineria = new AdvancedModelRenderer(this);
        this.casineria.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.5F, 4.0F);
        this.casineria.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.5F, -13.0F, 5, 5, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 5, 5, -2.5F, -1.5F, -4.0F, 5, 5, 4, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.5F, 0.75F, -13.0F);
        this.body.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 17, 23, -2.5F, -2.0F, -3.0F, 4, 4, 3, 0.01F, false));
        this.upperbody.cubeList.add(new ModelBox(upperbody, 19, 25, -2.5F, -2.0F, 0.0F, 4, 4, 1, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0597F, -3.0064F);
        this.upperbody.addChild(head);
        this.setRotateAngle(head, -0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 31, -2.5F, -1.7622F, -1.5258F, 4, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.5122F, -3.4758F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 6, -1.0F, 0.0241F, -1.9845F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.7622F, -1.5258F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 35, -2.0F, 0.0109F, -1.95F, 3, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.7622F, -1.2758F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, -1.5F, 1.0F, -4.25F, 2, 1, 4, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, -0.1655F, -1.4583F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0452F, -0.2615F, -0.0117F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 35, 0.0F, -0.5872F, -3.9981F, 1, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -0.1655F, -1.4583F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0452F, 0.2615F, 0.0117F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 35, -1.0F, -0.5872F, -3.9981F, 1, 1, 4, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 5.2378F, 9.7242F);
        this.head.addChild(bone);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -4.0937F, -10.5028F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 31, -1.5F, -0.5F, -1.5F, 3, 1, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.2378F, -1.5258F);
        this.head.addChild(jaw);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, 0.25F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 19, -2.0F, 1.0F, -1.25F, 3, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 30, -1.5F, 1.99F, -4.25F, 2, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.5F, -0.4033F, 0.0676F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0452F, -0.2615F, -0.0117F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 34, 0.0F, 0.4128F, -3.9981F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -0.4033F, 0.0676F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0452F, 0.2615F, 0.0117F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 13, -1.0F, 0.4128F, -3.9981F, 1, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.0628F, -2.3786F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 19, -1.0F, -0.9171F, -0.2621F, 2, 1, 4, 0.001F, false));

        this.frontleftLeg = new AdvancedModelRenderer(this);
        this.frontleftLeg.setRotationPoint(2.5F, 2.0F, -11.0F);
        this.body.addChild(frontleftLeg);
        this.setRotateAngle(frontleftLeg, 0.0F, -0.5672F, 0.0F);
        this.frontleftLeg.cubeList.add(new ModelBox(frontleftLeg, 32, 0, -0.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.frontleftLeg2 = new AdvancedModelRenderer(this);
        this.frontleftLeg2.setRotationPoint(2.5F, 0.25F, 0.0F);
        this.frontleftLeg.addChild(frontleftLeg2);
        this.setRotateAngle(frontleftLeg2, 0.0F, 0.1309F, -0.3054F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, 0.5F, 0.0F);
        this.frontleftLeg2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.1309F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 14, -1.0F, -1.5F, -1.0F, 2, 3, 2, -0.01F, false));

        this.frontleftLeg3 = new AdvancedModelRenderer(this);
        this.frontleftLeg3.setRotationPoint(-0.25F, 1.25F, 0.25F);
        this.frontleftLeg2.addChild(frontleftLeg3);
        this.setRotateAngle(frontleftLeg3, -0.0436F, 0.0F, 0.3054F);
        this.frontleftLeg3.cubeList.add(new ModelBox(frontleftLeg3, -1, 24, -1.5F, 0.5F, -4.5F, 4, 0, 5, 0.0F, false));

        this.frontrightLeg4 = new AdvancedModelRenderer(this);
        this.frontrightLeg4.setRotationPoint(-2.5F, 2.0F, -11.0F);
        this.body.addChild(frontrightLeg4);
        this.setRotateAngle(frontrightLeg4, 0.0F, 0.5672F, 0.0F);
        this.frontrightLeg4.cubeList.add(new ModelBox(frontrightLeg4, 32, 0, -3.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.frontrightLeg5 = new AdvancedModelRenderer(this);
        this.frontrightLeg5.setRotationPoint(-2.5F, 0.25F, 0.0F);
        this.frontrightLeg4.addChild(frontrightLeg5);
        this.setRotateAngle(frontrightLeg5, 0.0F, -0.1309F, 0.3054F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.25F, 0.5F, 0.0F);
        this.frontrightLeg5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.1309F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 14, -1.0F, -1.5F, -1.0F, 2, 3, 2, -0.01F, true));

        this.frontrightLeg6 = new AdvancedModelRenderer(this);
        this.frontrightLeg6.setRotationPoint(0.25F, 1.25F, 0.25F);
        this.frontrightLeg5.addChild(frontrightLeg6);
        this.setRotateAngle(frontrightLeg6, -0.0436F, 0.0F, -0.3054F);
        this.frontrightLeg6.cubeList.add(new ModelBox(frontrightLeg6, -1, 24, -2.5F, 0.5F, -4.5F, 4, 0, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.0F, 2.0F);
        this.casineria.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 19, 0, -2.0F, -1.75F, 0.0F, 4, 4, 5, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(0.75F, 1.0F, 3.5F);
        this.body2.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.0678F, 0.4755F, -0.1473F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.backleftleg.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.0436F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 9, -3.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(3.75F, 0.25F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0422F, 0.1613F, -0.1675F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 0, -0.75F, -1.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.5368F, 3.2245F, -0.0449F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.3873F, -1.3327F, 0.6749F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 26, 26, -1.9327F, -0.0745F, -4.0241F, 4, 0, 5, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(-0.75F, 1.0F, 3.5F);
        this.body2.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.0678F, -0.4755F, 0.1473F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.backrightleg4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0436F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 9, -0.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.backrightleg5 = new AdvancedModelRenderer(this);
        this.backrightleg5.setRotationPoint(-3.75F, 0.25F, 0.0F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, 0.0422F, -0.1613F, 0.1675F);
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 0, 0, -1.25F, -1.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.backrightleg6 = new AdvancedModelRenderer(this);
        this.backrightleg6.setRotationPoint(-0.5368F, 3.2245F, -0.0449F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, -0.8295F, 1.4408F, -1.118F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 26, 26, -2.0673F, -0.0745F, -4.0241F, 4, 0, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.2926F, 4.9763F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 11, 14, -1.5F, -0.124F, -1.1147F, 3, 3, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4224F, 4.8219F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 9, -1.0F, -0.0785F, 0.9299F, 2, 2, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 13, -1.0F, -0.0785F, -1.0701F, 2, 2, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.7325F, 6.8684F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 20, -0.5F, -0.5545F, -1.0012F, 1, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 14, -0.5F, -0.5545F, 0.9988F, 1, 1, 9, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.casineria.render(f5 * 0.2f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.casineria.offsetZ = -0.71F;
        this.casineria.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraCasineria entityCasineria = (EntityPrehistoricFloraCasineria) e;

        this.faceTarget(f3, f4, 8, upperbody);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.upperbody, this.body, this.body2};

        float speed = 0.85F;

        //EntityPrehistoricFloraentityCasineria entityCasineria = (EntityPrehistoricFloraentityCasineria) e;
        if (f3 == 0.0F || !entityCasineria.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
            return;
        }

        this.flap(backleftleg, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
        this.swing(backleftleg, speed, -0.5F, true, -1, 1F, f2, 0.5F);
        this.walk(backleftleg2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
        this.flap(backleftleg2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
        this.flap(backleftleg3, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
        this.walk(backleftleg3, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
        this.swing(backleftleg3, speed, 0.2F, false, 3, 0F, f2, 0.5F);

        this.flap(backrightleg4, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
        this.swing(backrightleg4, speed, 0.5F, true, 2, -1F, f2, 0.5F);
        this.walk(backrightleg5, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
        this.flap(backrightleg5, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
        this.flap(backrightleg6, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
        this.walk(backrightleg6, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
        this.swing(backrightleg6, speed, -0.2F, false, 6, 0F, f2, 0.5F);

        this.flap(frontleftLeg, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
        this.swing(frontleftLeg, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
        this.walk(frontleftLeg2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(frontleftLeg3, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(frontleftLeg3, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(frontleftLeg3, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(frontrightLeg4, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(frontrightLeg4, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(frontrightLeg5, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(frontrightLeg6, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(frontrightLeg6, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(frontrightLeg6, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCasineria e = (EntityPrehistoricFloraCasineria) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.upperbody, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.upperbody, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
