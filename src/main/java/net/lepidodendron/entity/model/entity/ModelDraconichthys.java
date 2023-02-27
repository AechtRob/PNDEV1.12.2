package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDraconichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;

    private ModelAnimator animator;

    public ModelDraconichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.401F, -3.519F);
        this.setRotateAngle(main, 0.0F, 3.1416F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 24, 0, -2.5F, -2.901F, -3.481F, 5, 6, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 34, -2.0F, 2.499F, -3.481F, 4, 1, 7, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.901F, -3.481F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 35, -2.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(-2.5F, 2.599F, -0.481F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -0.3054F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 0, 0, -7.0F, 0.0F, -3.5F, 8, 0, 7, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(2.5F, 2.599F, -0.481F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.3054F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 0, 0, -1.0F, 0.0F, -3.5F, 8, 0, 7, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.7111F, -3.515F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 17, 20, -3.0F, -3.19F, -6.9661F, 6, 7, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.21F, 0.0339F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0567F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, -2.5F, -1.0F, -7.0F, 5, 1, 7, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.19F, -7.4661F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 4, 0.0F, -1.375F, -0.5F, 0, 6, 9, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.2856F, -6.8996F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 37, 14, -2.5F, -2.4756F, -5.0665F, 5, 5, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -3.4756F, -0.0665F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 0, -1.5F, 0.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 3.5244F, -0.0665F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1614F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 29, -1.5F, -1.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(-2.5F, 2.3744F, -2.0665F);
        this.body2.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.5672F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 7, -6.0F, 0.0F, -3.0F, 6, 0, 5, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(2.5F, 2.3744F, -2.0665F);
        this.body2.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.5672F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 7, 0.0F, 0.0F, -3.0F, 6, 0, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0112F, -5.1475F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 18, 42, -1.5F, -1.9868F, -3.919F, 3, 4, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -2.4868F, -1.919F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 24, -0.5F, -0.025F, -1.925F, 2, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 3.0132F, 0.081F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 43, 8, -0.5F, -1.325F, -4.225F, 2, 1, 5, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.7857F, -3.8897F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 11, 47, -1.0F, -2.2725F, -3.0293F, 2, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -2.9599F, 0.0678F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2313F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 35, 0.0F, -0.0097F, -2.9774F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.9775F, -1.5293F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.5F, 0.15F, -0.5F, 0, 2, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 34, 0.0F, -0.85F, -1.5F, 1, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.7725F, -3.0293F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 23, 0, -0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -9.0F, -12.0F, 0, 15, 12, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 6.349F, -11.481F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 35, 38, -2.0F, -8.275F, 14.55F, 4, 4, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -9.5F, 15.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2793F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 46, -1.5F, 0.0F, -0.2F, 3, 2, 4, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.25F, -5.7563F, 20.735F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.036F, -0.0318F, -0.0391F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 1, -0.175F, -0.5F, -0.7F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.25F, -5.7563F, 20.735F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.036F, 0.0318F, 0.0391F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 1, 0.175F, -0.5F, -0.7F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.25F, -5.7356F, 21.7101F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.4399F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 2, 1, -0.225F, -0.4F, -0.775F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 2, 1, -2.325F, -0.4F, -0.775F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -5.9538F, 20.9564F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.3177F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 24, -1.5F, -1.2F, -0.6F, 3, 2, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -3.2828F, 18.531F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0829F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 43, -1.5F, -1.9F, -3.825F, 3, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -4.3821F, 19.9111F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0611F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 5, -1.5F, 0.0744F, -1.3801F, 3, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.075F, -6.56F, 19.8282F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1222F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 5, -0.45F, -0.475F, -0.75F, 1, 1, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 5, -2.7F, -0.475F, -0.75F, 1, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 7, -0.5F, -0.975F, -1.25F, 1, 2, 2, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 7, -2.65F, -0.975F, -1.25F, 1, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -4.3821F, 19.4111F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2531F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 46, -1.5F, -3.2129F, -2.4165F, 3, 4, 3, 0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -7.3088F, 21.1122F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5018F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -1.0F, 0.0333F, 0.0178F, 2, 1, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -8.275F, 18.55F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4276F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 35, -1.5F, -0.15F, -0.25F, 3, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -5.128F, 19.3778F);
        this.head.addChild(jaw);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.8012F, 0.1623F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.0341F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 27, -0.5F, -2.9743F, -0.9719F, 2, 3, 1, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.25F, -0.618F, 1.3742F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.0821F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 6, 0.0F, -1.275F, 0.025F, 0, 3, 1, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 6, -1.5F, -1.275F, 0.025F, 0, 3, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.8258F, 1.5786F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.3177F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 35, -0.5F, -1.25F, 0.4F, 2, 3, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(-90);
        this.main.offsetX = -0.1F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.2182F, (float) Math.toRadians(-90), 0.0F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(body, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0567F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1614F, 0.0F, 0.0F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.5672F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.5672F);
        this.setRotateAngle(tail, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r8, 0.2313F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r10, -0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.036F, -0.0318F, -0.0391F);
        this.setRotateAngle(cube_r12, 0.036F, 0.0318F, 0.0391F);
        this.setRotateAngle(cube_r13, -1.4399F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -1.3177F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.5018F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.4276F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, -0.829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, -1.0341F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -1.0821F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -1.3177F, 0.0F, 0.0F);
        this.main.offsetX = -0.03F;
        this.main.offsetZ = 0.035F;
        this.main.offsetY = -0.4F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.main.offsetY = -0.3F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.25F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontleftfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontleftfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontrightfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontrightfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backleftfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backleftfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backrightfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backrightfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = 0.0F;
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, -(float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, -(float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

