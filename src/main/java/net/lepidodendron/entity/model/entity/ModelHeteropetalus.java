package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHeteropetalus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer femalespike_r1;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftPelvic;
    private final AdvancedModelRenderer rightPelvic;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r24;

    private ModelAnimator animator;

    public ModelHeteropetalus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.75F, -3.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 6.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -9.75F, -2.5F, 4, 4, 4, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -9.5753F, -1.21F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 39, -1.0F, -0.275F, -1.1F, 2, 1, 2, -0.001F, false));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(1.5F, -7.1F, -1.6F);
        this.body.addChild(leftPectoral);
        this.setRotateAngle(leftPectoral, -0.6689F, 0.9611F, -0.4516F);
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 9, 40, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 2.5F);
        this.leftPectoral.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, 0.25F, -1.95F, -2.25F, 0, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.0F, 2.5F);
        this.leftPectoral.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 18, 0.25F, -0.05F, -2.25F, 0, 2, 3, 0.0F, false));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(-2.5F, -7.1F, -1.6F);
        this.body.addChild(rightPectoral);
        this.setRotateAngle(rightPectoral, -0.6689F, -0.9611F, 0.4516F);
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 9, 40, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, 2.5F);
        this.rightPectoral.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 17, -0.25F, -1.95F, -2.25F, 0, 2, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.0F, 2.5F);
        this.rightPectoral.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 18, -0.25F, -0.05F, -2.25F, 0, 2, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.3063F, -8.1809F, -2.2963F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 13, 28, -1.6938F, -1.5691F, -1.9537F, 3, 4, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 35, -1.1938F, -0.2691F, -4.8037F, 2, 1, 3, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.1937F, -1.1944F, -3.8932F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 8, -1.0F, -0.006F, -2.0058F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.1937F, -1.6191F, -1.9537F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 0, -1.0F, -0.0112F, 0.0088F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.1937F, -0.8191F, -3.3037F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 38, -1.0F, -0.5F, -0.5F, 2, 2, 2, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.9937F, 0.4217F, -3.4523F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2007F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.05F, -0.5F, -0.3F, 0, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 17, 0.0F, -0.65F, -0.7F, 0, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 1.55F, -0.5F, -0.3F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 17, 1.6F, -0.65F, -0.7F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.9937F, 0.4217F, -3.4523F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5498F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 17, 0.075F, -1.075F, -1.075F, 0, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 17, 1.525F, -1.075F, -1.075F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.1937F, 0.4927F, -2.3002F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1484F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 31, -1.0F, -0.5F, -1.65F, 2, 1, 3, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.6813F, -0.4941F, -2.4287F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.1745F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 26, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.0688F, -0.4941F, -2.4287F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, -0.1745F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 26, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.6937F, 1.0556F, -1.9432F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 34, -0.5F, -0.0619F, -2.8373F, 2, 1, 3, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 1.3881F, 0.1377F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1353F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 14, -1.0F, -1.05F, -2.95F, 2, 1, 3, -0.03F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.35F, -0.0026F, -1.3196F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4548F, 0.276F, -0.1325F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 17, 0.275F, -0.125F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.35F, -0.0026F, -1.3196F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4396F, -0.1186F, 0.0556F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 4, 17, -0.05F, -0.125F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.35F, 0.0631F, -2.3373F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 17, 0.0F, -0.3F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 17, 1.7F, -0.3F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.35F, -0.0026F, -1.3196F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4548F, -0.276F, 0.1325F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 4, 17, -0.275F, -0.125F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.35F, -0.0026F, -1.3196F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4396F, 0.1186F, -0.0556F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 4, 17, 0.05F, -0.125F, -0.5F, 0, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -7.6203F, 0.9095F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 13, 13, -2.0F, -1.3797F, -0.0095F, 4, 3, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 0, -2.0F, 0.8703F, -0.0095F, 4, 1, 4, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 28, 0.0F, -4.0212F, 0.1122F, 0, 3, 4, 0.0F, false));

        this.femalespike_r1 = new AdvancedModelRenderer(this);
        this.femalespike_r1.setRotationPoint(0.0F, -2.493F, 2.5588F);
        this.body2.addChild(femalespike_r1);
        this.setRotateAngle(femalespike_r1, -0.3491F, 0.0F, 0.0F);
        this.femalespike_r1.cubeList.add(new ModelBox(femalespike_r1, 24, 6, -0.5F, 0.55F, -3.25F, 1, 1, 1, 0.001F, false));
        this.femalespike_r1.cubeList.add(new ModelBox(femalespike_r1, 0, 9, -0.5F, -0.1F, -3.25F, 1, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -2.1297F, -0.0095F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 8, -1.5F, 0.025F, 0.05F, 4, 1, 4, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.243F, 4.0122F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 29, 32, 0.0F, -3.5282F, 0.1F, 0, 3, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 9, -1.5F, -1.0867F, -0.8967F, 3, 2, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -0.9867F, 1.6033F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 21, -0.5F, -0.45F, -2.475F, 3, 1, 5, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 1.6633F, 1.1033F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 4, -0.5F, -1.65F, -1.925F, 3, 2, 5, -0.01F, false));

        this.leftPelvic = new AdvancedModelRenderer(this);
        this.leftPelvic.setRotationPoint(1.525F, 1.0133F, 2.4533F);
        this.body3.addChild(leftPelvic);
        this.setRotateAngle(leftPelvic, -0.4363F, 0.48F, 0.0F);
        this.leftPelvic.cubeList.add(new ModelBox(leftPelvic, 15, 21, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.rightPelvic = new AdvancedModelRenderer(this);
        this.rightPelvic.setRotationPoint(-1.525F, 1.0133F, 2.4533F);
        this.body3.addChild(rightPelvic);
        this.setRotateAngle(rightPelvic, -0.4363F, -0.48F, 0.0F);
        this.rightPelvic.cubeList.add(new ModelBox(rightPelvic, 15, 21, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.1194F, 3.9743F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 16, 40, 0.0F, -3.2976F, 0.1257F, 0, 3, 2, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 37, 21, -1.0F, -0.5562F, -0.221F, 2, 1, 3, -0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -0.7062F, 0.954F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 37, 0.5F, -0.45F, -1.175F, 2, 1, 3, -0.03F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.7476F, 1.2723F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2443F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 25, -1.0F, -1.3F, -1.45F, 2, 2, 3, -0.032F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0995F, 2.5971F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 38, 3, -0.5F, -0.0567F, -0.7932F, 1, 1, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 0, 0.0F, -1.0567F, 0.2068F, 0, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.0F, -0.5567F, 0.7068F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3054F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 26, 1.5F, 0.1F, -0.675F, 1, 1, 2, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4869F, 2.2068F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 27, -0.5F, -0.5435F, 0.0F, 1, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 17, 0.0F, -1.5435F, 0.0F, 0, 2, 7, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.0F, 0.4565F, 3.0F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 16, 2.025F, -1.0F, -3.0F, 0, 2, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.root.offsetZ = -0.0F;
        this.root.offsetY = -0.05F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.0F;
        this.root.offsetX = 0.2F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.5F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(head, 0.0F, -0.05F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.root.offsetY = 1.4F;
        //this.root.offsetZ = -0.65F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.tail, this.tail2, this.tail3};
        float speed = 0.4F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0.2f, f2, 1);

            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(leftPectoral, (float) (speed ), 0.2F, true, 0, 0, f2, 0.5F);
            this.swing(leftPectoral, (float) (speed), 0.5F, true, 0, 0, f2, 0.5F);
            this.flap(rightPectoral, (float) (speed), 0.2F, true, -3, 0, f2, 0.5F);
            this.swing(rightPectoral, (float) (speed), 0.5F, true, -3, 0, f2, 0.5F);
            this.flap(leftPelvic, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);
            this.flap(rightPelvic, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);

                //this.root.offsetY = 1.25F;
                //this.root.offsetZ = -0.2F;
                this.bob(root, -speed, 2F, false, f2, 1);
            }
        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }


}