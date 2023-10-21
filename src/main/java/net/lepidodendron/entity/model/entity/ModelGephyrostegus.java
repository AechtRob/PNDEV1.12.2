package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGephyrostegus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGephyrostegus extends AdvancedModelBase {
    private final AdvancedModelRenderer gephyrostegus;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer frontrightLeg;
    private final AdvancedModelRenderer frontrightLeg2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer frontrightLeg3;
    private final AdvancedModelRenderer frontleftLeg;
    private final AdvancedModelRenderer frontleftLeg2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer frontleftLeg3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelGephyrostegus() {
        this.textureWidth = 58;
        this.textureHeight = 50;

        this.gephyrostegus = new AdvancedModelRenderer(this);
        this.gephyrostegus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.5F, 3.0F);
        this.gephyrostegus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.5F, -11.0F, 5, 5, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 6, 6, -2.5F, -1.5F, -3.0F, 5, 5, 3, -0.01F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.5F, 0.75F, -11.0F);
        this.body.addChild(upperbody);
        this.setRotateAngle(upperbody, 0.0873F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 17, 23, -2.5F, -2.0F, -2.0F, 4, 4, 3, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1903F, -2.0064F);
        this.upperbody.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 29, 17, -2.5F, -1.9683F, -2.5358F, 4, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.7183F, -4.4858F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 35, -1.0F, 0.0241F, -2.9845F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.9683F, -2.5358F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 23, -2.0F, 0.0109F, -1.95F, 3, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.9683F, -2.2858F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 24, -1.5F, 1.0019F, -5.0F, 2, 1, 5, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.5F, -0.3716F, -2.4682F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0447F, -0.218F, -0.0097F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 14, 0.0F, -0.5748F, -4.4981F, 1, 1, 1, -0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 0.25F, -0.3372F, -4.7481F, 0, 1, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 35, 0.0F, -0.5872F, -3.9981F, 1, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -0.3716F, -2.4682F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0447F, 0.218F, 0.0097F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 14, -1.0F, -0.5748F, -4.4981F, 1, 1, 1, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 3, -0.25F, -0.3372F, -4.7481F, 0, 1, 4, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 35, -1.0F, -0.5872F, -3.9981F, 1, 1, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.25F, 0.0412F, -6.9663F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.5708F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 2, 5, -0.1F, -0.5876F, -0.25F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.7817F, 0.0965F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 0, -1.5F, -1.0F, -2.8823F, 3, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0317F, -2.5358F);
        this.head.addChild(jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, 0.25F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, -2.0F, 1.0F, -1.25F, 3, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 25, -1.5F, 2.0219F, -5.0F, 2, 1, 5, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -0.4033F, 0.0676F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0447F, 0.218F, 0.0097F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 2, -0.2F, 0.1628F, -4.7481F, 0, 1, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.25F, 0.0095F, -4.4305F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.5708F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 5, -0.1F, -0.0376F, -0.25F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.5F, -0.4033F, 0.0676F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0447F, -0.218F, -0.0097F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 2, 0.2F, 0.1628F, -4.7481F, 0, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.5F, -0.4033F, 0.0676F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0447F, -0.218F, -0.0097F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 16, 0.0F, 0.4052F, -4.7481F, 1, 1, 1, -0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 35, 0.0F, 0.4128F, -3.9981F, 1, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -0.4033F, 0.0676F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0447F, 0.218F, 0.0097F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 16, -1.0F, 0.4052F, -4.7481F, 1, 1, 1, -0.01F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 35, -1.0F, 0.4128F, -3.9981F, 1, 1, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.0628F, -2.3786F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 31, -1.0F, -0.9171F, -0.2621F, 2, 1, 4, 0.001F, false));

        this.frontrightLeg = new AdvancedModelRenderer(this);
        this.frontrightLeg.setRotationPoint(-2.5F, 2.0F, -9.0F);
        this.body.addChild(frontrightLeg);
        this.frontrightLeg.cubeList.add(new ModelBox(frontrightLeg, 33, 9, -3.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.frontrightLeg2 = new AdvancedModelRenderer(this);
        this.frontrightLeg2.setRotationPoint(-2.5F, 0.25F, 0.0F);
        this.frontrightLeg.addChild(frontrightLeg2);
        this.setRotateAngle(frontrightLeg2, 0.0F, 0.1222F, 0.3054F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.25F, 0.5F, 0.0F);
        this.frontrightLeg2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.1309F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 14, -1.0F, -1.5F, -1.0F, 2, 3, 2, -0.01F, false));

        this.frontrightLeg3 = new AdvancedModelRenderer(this);
        this.frontrightLeg3.setRotationPoint(0.25F, 1.25F, 0.25F);
        this.frontrightLeg2.addChild(frontrightLeg3);
        this.setRotateAngle(frontrightLeg3, 0.0436F, 0.0F, -0.3054F);
        this.frontrightLeg3.cubeList.add(new ModelBox(frontrightLeg3, 14, 30, -2.0F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.frontleftLeg = new AdvancedModelRenderer(this);
        this.frontleftLeg.setRotationPoint(2.5F, 2.0F, -9.0F);
        this.body.addChild(frontleftLeg);
        this.setRotateAngle(frontleftLeg, 0.0F, -0.5672F, 0.0F);
        this.frontleftLeg.cubeList.add(new ModelBox(frontleftLeg, 33, 9, -0.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.frontleftLeg2 = new AdvancedModelRenderer(this);
        this.frontleftLeg2.setRotationPoint(2.5F, 0.25F, 0.0F);
        this.frontleftLeg.addChild(frontleftLeg2);
        this.setRotateAngle(frontleftLeg2, 0.0F, 0.1309F, -0.3054F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.25F, 0.5F, 0.0F);
        this.frontleftLeg2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1309F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, -1.0F, -1.5F, -1.0F, 2, 3, 2, -0.01F, true));

        this.frontleftLeg3 = new AdvancedModelRenderer(this);
        this.frontleftLeg3.setRotationPoint(-0.25F, 1.25F, 0.25F);
        this.frontleftLeg2.addChild(frontleftLeg3);
        this.setRotateAngle(frontleftLeg3, 0.0F, 0.0F, 0.3054F);
        this.frontleftLeg3.cubeList.add(new ModelBox(frontleftLeg3, 14, 30, -1.0F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.0F, 2.0F);
        this.gephyrostegus.addChild(body2);
        this.setRotateAngle(body2, -0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 19, 0, -2.0F, -1.75F, 0.0F, 4, 4, 5, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-0.75F, 1.0F, 3.5F);
        this.body2.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.1067F, -0.4755F, 0.1473F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.5F, 0.0F, 0.0F);
        this.backrightleg.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.0436F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 31, -0.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-3.75F, 0.25F, 0.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0422F, -0.1613F, 0.1675F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 0, 0, -1.25F, -1.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(-0.5368F, 3.2245F, -0.0449F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.0873F, 0.8727F, -0.3122F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 0, 30, -1.5673F, -0.6539F, -3.0241F, 3, 1, 4, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(0.75F, 1.0F, 3.5F);
        this.body2.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.0678F, 0.4755F, -0.1473F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(3.5F, 0.0F, 0.0F);
        this.backleftleg.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 31, -3.5F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(3.75F, 0.25F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0422F, 0.1613F, -0.1675F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 0, -0.75F, -1.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.5368F, 3.2245F, -0.0449F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.0873F, -0.8727F, 0.3122F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 0, 30, -1.4327F, -0.6539F, -3.0241F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.2926F, 4.9763F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 11, 14, -1.5F, -0.124F, -1.1147F, 3, 3, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4224F, 4.8219F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 9, -1.0F, -0.0785F, -1.0701F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.7325F, 4.8684F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 14, -0.5F, -0.5545F, -0.7512F, 1, 1, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.gephyrostegus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(body, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(upperbody, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftLeg, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(frontrightLeg, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(frontrightLeg3, 0.55F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftLeg3, 0.55F, 0.0F, 0.0F);
        this.body.offsetY = 0.0F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = -0.35F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(upperbody, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(frontrightLeg, 0.15F, 0.4F, -0.4F);
        this.setRotateAngle(frontrightLeg2, -0.25F, 0.0F, 0.4F);
        this.setRotateAngle(frontrightLeg3, -0.1F, 0.0F, -0.05F);
        this.setRotateAngle(frontleftLeg, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(frontleftLeg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftLeg3, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(backrightleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg3, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(backleftleg, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(backleftleg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.05F, -0.4F, 0.0F);
        this.setRotateAngle(tail3, 0.15F, -0.2F, 0.0F);
        this.gephyrostegus.offsetY = 0.15F;
        this.gephyrostegus.render(0.01F);
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
        this.resetToDefaultPose();
        //this.gephyrostegus.offsetY = 1.20F;

        EntityPrehistoricFloraGephyrostegus entityCasineria = (EntityPrehistoricFloraGephyrostegus) e;

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

        this.flap(backrightleg, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
        this.swing(backrightleg, speed, 0.5F, true, 2, -1F, f2, 0.5F);
        this.walk(backrightleg2, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
        this.flap(backrightleg2, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
        this.flap(backrightleg3, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
        this.walk(backrightleg3, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
        this.swing(backrightleg3, speed, -0.2F, false, 6, 0F, f2, 0.5F);

        this.flap(frontleftLeg, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
        this.swing(frontleftLeg, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
        this.walk(frontleftLeg2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(frontleftLeg3, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(frontleftLeg3, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(frontleftLeg3, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(frontrightLeg, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(frontrightLeg, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(frontrightLeg2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(frontrightLeg3, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(frontrightLeg3, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(frontrightLeg3, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGephyrostegus e = (EntityPrehistoricFloraGephyrostegus) entity;
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
