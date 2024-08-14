package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeothyris;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeothyris;
import net.lepidodendron.entity.EntityPrehistoricFloraLimusaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArchaeothyris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r29;

    private ModelAnimator animator;

    public ModelArchaeothyris() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(-0.0198F, 19.7475F, 3.5176F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.2896F, 0.0F, -2.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -2.9671F, 0.0F, -3.1416F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -1.7302F, -2.0782F, -3.8256F, 4, 4, 6, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.8887F, 1.3883F, -0.1263F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, -0.4363F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1515F, -0.1359F, -1.9921F);
        this.leftleg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 26, -0.5F, -0.75F, -1.5F, 1, 2, 4, 0.01F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1515F, 0.0484F, -3.3954F);
        this.leftleg.addChild(leftleg2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.4158F, 0.4033F);
        this.leftleg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, -0.5F, -1.7F, -0.3F, 1, 3, 1, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 2.7158F, 0.7033F);
        this.leftleg2.addChild(leftfoot);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 0, 32, -1.5F, 0.0F, -2.35F, 3, 0, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.8492F, 1.3883F, -0.1263F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, 0.4363F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.1515F, -0.1359F, -1.9921F);
        this.rightleg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 26, -0.5F, -0.75F, -1.5F, 1, 2, 4, 0.01F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1515F, 0.0484F, -3.3954F);
        this.rightleg.addChild(rightleg2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.4158F, 0.4033F);
        this.rightleg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, -0.5F, -1.7F, -0.3F, 1, 3, 1, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 2.7158F, 0.7033F);
        this.rightleg2.addChild(rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 0, 32, -1.5F, 0.0F, -2.35F, 3, 0, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.25F, -3.0F);
        this.hips.addChild(body);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.2896F, 1.25F, 1.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -3.1416F, 0.0F, 3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -2.2302F, -2.6467F, 0.9911F, 5, 5, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.25F, -5.75F);
        this.body.addChild(chest);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.2896F, 1.5F, 6.75F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 2.9671F, 0.0F, 3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 0, -1.7302F, -3.5167F, 6.3105F, 4, 4, 4, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(2.0161F, 2.7525F, -1.3524F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.0F, 0.48F, 0.0F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 6, 38, -0.4295F, -0.5F, -0.3359F, 1, 1, 3, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0709F, 0.25F, 2.2341F);
        this.leftarm.addChild(leftarm2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.0004F, 2.05F, -0.9451F);
        this.leftarm2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.9163F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.25F, -2.3F, 0.075F, 1, 3, 1, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.3884F, 2.65F, -0.2653F);
        this.leftarm2.addChild(lefthand);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.3888F, -0.6F, -0.6797F);
        this.lefthand.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.9163F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 0, -0.75F, 0.6F, -2.675F, 3, 0, 3, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.9765F, 2.7525F, -1.3524F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, -0.48F, 0.0F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 6, 38, -0.5705F, -0.5F, -0.3359F, 1, 1, 3, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.0709F, 0.25F, 2.2341F);
        this.rightarm.addChild(rightarm2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0004F, 2.05F, -0.9451F);
        this.rightarm2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.9163F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.25F, -2.3F, 0.075F, 1, 3, 1, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.3884F, 2.65F, -0.2653F);
        this.rightarm2.addChild(righthand);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.3888F, -0.6F, -0.6797F);
        this.righthand.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.9163F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 0, -2.25F, 0.6F, -2.675F, 3, 0, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.0198F, 0.5243F, -3.698F);
        this.chest.addChild(neck);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0396F, 0.75F, -1.25F);
        this.neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -3.0543F, 0.0F, -3.1416F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 23, -1.5F, -1.5F, -2.75F, 3, 3, 5, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0049F, -0.1259F, -2.9023F);
        this.neck.addChild(head);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.3044F, 1.186F, 13.2811F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 3.0543F, 0.0F, -3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 0, 0.7302F, -2.0405F, 16.5333F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.2456F, 1.186F, 13.2811F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 3.0005F, 0.298F, 3.0735F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 36, 4.5045F, -3.1836F, 14.0168F, 1, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2351F, 1.186F, 13.2811F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 3.0543F, 0.0F, 3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 0, -0.7302F, -2.0405F, 16.5333F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.3044F, 1.186F, 13.2811F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 3.0543F, 0.0F, 3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 38, -0.2302F, -2.3405F, 16.5333F, 1, 1, 2, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.3044F, 1.186F, 13.2811F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 2.8362F, 0.0F, 3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 22, -0.2302F, -6.3379F, 13.3575F, 1, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.3149F, 1.186F, 13.2811F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 3.0005F, -0.298F, -3.0735F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 36, -5.5045F, -3.1836F, 14.0168F, 1, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.3044F, 1.186F, 13.2811F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 3.1416F, 0.0F, 3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 31, 34, -1.2302F, -1.1722F, 13.4479F, 3, 1, 2, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 34, -1.2302F, -2.1722F, 13.4479F, 3, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3343F, -0.0692F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.3044F, 1.5521F, 13.2602F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -2.9147F, 0.0F, 3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 38, -0.2302F, 1.4504F, 16.314F, 1, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.3044F, 1.5521F, 13.2602F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -3.0107F, 0.0F, 3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 25, -0.2302F, -0.189F, 13.5675F, 1, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0941F, -0.1714F, -2.524F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -2.9347F, 0.2426F, -3.0817F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 32, 0.0329F, -0.4949F, -2.1359F, 1, 1, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.0248F, -0.1714F, -2.524F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -2.9347F, -0.2426F, 3.0817F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 9, 32, -1.0329F, -0.4949F, -2.1359F, 1, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.3044F, 1.5521F, 13.2602F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -2.8362F, 0.0F, 3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 34, 9, -1.2302F, 1.269F, 12.4569F, 3, 2, 2, -0.007F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0346F, 0.0137F, -1.1668F);
        this.head.addChild(eye);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.2698F, 1.1722F, 14.4479F);
        this.eye.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 3.1416F, 0.0F, 3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 14, -1.2302F, -1.6722F, 13.9479F, 3, 1, 1, 0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.25F, 0.0F, 1.75F);
        this.hips.addChild(tail);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5396F, 0.0F, -3.75F);
        this.tail.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -2.8798F, 0.0F, -3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 14, -1.2302F, -2.1104F, -6.206F, 3, 3, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, 2.25F);
        this.tail.addChild(tail2);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5396F, -0.75F, -6.0F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -3.0107F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 28, -0.7302F, -0.8597F, -9.0106F, 2, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 2.75F);
        this.tail2.addChild(tail3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5396F, -1.0F, -8.75F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -3.098F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 15, 17, -0.7302F, -0.0982F, -14.5331F, 2, 2, 6, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 5.25F);
        this.tail3.addChild(tail4);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5396F, -1.5F, -14.0F);
        this.tail4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -3.098F, 0.0F, -3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 15, 4, -0.2302F, 0.4018F, -21.6831F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.2F;
        this.hips.offsetX = -0.05F;
        this.hips.rotateAngleY = (float)Math.toRadians(-120);
        this.hips.rotateAngleX = (float)Math.toRadians(15);
        this.hips.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 0.60F;
        this.hips.scaleChildren = true;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraArchaeothyris ee = (EntityPrehistoricFloraArchaeothyris) entitylivingbaseIn;

        if (ee.getIsFast()) {
            animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animSleep(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }


    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeothyris entity = (EntityPrehistoricFloraArchaeothyris) entitylivingbaseIn;
        int animCycle = 115;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 4.25 + (((tickAnim - 17) / 23) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 40) / 75) * (0-(0)));
            yy = 4.25 + (((tickAnim - 40) / 75) * (0-(4.25)));
            zz = 0 + (((tickAnim - 40) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = -5.75 + (((tickAnim - 17) / 23) * (-5.75-(-5.75)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 40) / 75) * (0-(0)));
            yy = -5.75 + (((tickAnim - 40) / 75) * (0-(-5.75)));
            zz = 0 + (((tickAnim - 40) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -6.75 + (((tickAnim - 18) / 22) * (-6.75-(-6.75)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 40) / 75) * (0-(0)));
            yy = -6.75 + (((tickAnim - 40) / 75) * (0-(-6.75)));
            zz = 0 + (((tickAnim - 40) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -5.75 + (((tickAnim - 18) / 22) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 115) {
            xx = -5.75 + (((tickAnim - 40) / 75) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 18) / 22) * (7-(7)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 115) {
            xx = 7 + (((tickAnim - 40) / 75) * (0-(7)));
            yy = 0 + (((tickAnim - 40) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-5.35-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = -5.35 + (((tickAnim - 17) / 23) * (-5.35-(-5.35)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 40) / 75) * (0-(0)));
            yy = -5.35 + (((tickAnim - 40) / 75) * (0-(-5.35)));
            zz = 0 + (((tickAnim - 40) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-0.27-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = -0.27 + (((tickAnim - 17) / 23) * (-0.27-(-0.27)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0.00942-(0)));
            yy = -0.27 + (((tickAnim - 40) / 20) * (-0.26984-(-0.27)));
            zz = 0 + (((tickAnim - 40) / 20) * (-2.00002-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0.00942 + (((tickAnim - 60) / 8) * (0.00942-(0.00942)));
            yy = -0.26984 + (((tickAnim - 60) / 8) * (-0.26984-(-0.26984)));
            zz = -2.00002 + (((tickAnim - 60) / 8) * (-2.00002-(-2.00002)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = 0.00942 + (((tickAnim - 68) / 8) * (0.00942-(0.00942)));
            yy = -0.26984 + (((tickAnim - 68) / 8) * (-0.26984-(-0.26984)));
            zz = -2.00002 + (((tickAnim - 68) / 8) * (-2.00002-(-2.00002)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = 0.00942 + (((tickAnim - 76) / 8) * (0.00942-(0.00942)));
            yy = -0.26984 + (((tickAnim - 76) / 8) * (-0.26984-(-0.26984)));
            zz = -2.00002 + (((tickAnim - 76) / 8) * (-2.00002-(-2.00002)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = 0.00942 + (((tickAnim - 84) / 31) * (0-(0.00942)));
            yy = -0.26984 + (((tickAnim - 84) / 31) * (0-(-0.26984)));
            zz = -2.00002 + (((tickAnim - 84) / 31) * (0-(-2.00002)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 4.5 + (((tickAnim - 17) / 23) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-106.4471-(0)));
            yy = 4.5 + (((tickAnim - 40) / 20) * (23.89221-(4.5)));
            zz = 0 + (((tickAnim - 40) / 20) * (-133.12787-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -106.4471 + (((tickAnim - 60) / 8) * (-246.23266-(-106.4471)));
            yy = 23.89221 + (((tickAnim - 60) / 8) * (36.50076-(23.89221)));
            zz = -133.12787 + (((tickAnim - 60) / 8) * (-278.54375-(-133.12787)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -246.23266 + (((tickAnim - 68) / 8) * (-106.4471-(-246.23266)));
            yy = 36.50076 + (((tickAnim - 68) / 8) * (23.89221-(36.50076)));
            zz = -278.54375 + (((tickAnim - 68) / 8) * (-133.12787-(-278.54375)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = -106.4471 + (((tickAnim - 76) / 8) * (-246.23266-(-106.4471)));
            yy = 23.89221 + (((tickAnim - 76) / 8) * (36.50076-(23.89221)));
            zz = -133.12787 + (((tickAnim - 76) / 8) * (-278.54375-(-133.12787)));
        }
        else if (tickAnim >= 84 && tickAnim < 106) {
            xx = -246.23266 + (((tickAnim - 84) / 22) * (-45.46316-(-246.23266)));
            yy = 36.50076 + (((tickAnim - 84) / 22) * (43.64987-(36.50076)));
            zz = -278.54375 + (((tickAnim - 84) / 22) * (-50.45871-(-278.54375)));
        }
        else if (tickAnim >= 106 && tickAnim < 115) {
            xx = -45.46316 + (((tickAnim - 106) / 9) * (0-(-45.46316)));
            yy = 43.64987 + (((tickAnim - 106) / 9) * (0-(43.64987)));
            zz = -50.45871 + (((tickAnim - 106) / 9) * (0-(-50.45871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (-32.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = -32.25 + (((tickAnim - 60) / 8) * (-1.5-(-32.25)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 68) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 8) * (0-(0)));
            zz = -1.5 + (((tickAnim - 68) / 8) * (-32.25-(-1.5)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 76) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 8) * (0-(0)));
            zz = -32.25 + (((tickAnim - 76) / 8) * (-1.5-(-32.25)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 84) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 31) * (0-(0)));
            zz = -1.5 + (((tickAnim - 84) / 31) * (0-(-1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-57.53003-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (-50.90692-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (37.93991-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = -57.53003 + (((tickAnim - 60) / 3) * (-37.63123-(-57.53003)));
            yy = -50.90692 + (((tickAnim - 60) / 3) * (-57.02388-(-50.90692)));
            zz = 37.93991 + (((tickAnim - 60) / 3) * (-11.69153-(37.93991)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = -37.63123 + (((tickAnim - 63) / 5) * (0-(-37.63123)));
            yy = -57.02388 + (((tickAnim - 63) / 5) * (-19.5-(-57.02388)));
            zz = -11.69153 + (((tickAnim - 63) / 5) * (0-(-11.69153)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (-25.68301-(0)));
            yy = -19.5 + (((tickAnim - 68) / 5) * (-52.04655-(-19.5)));
            zz = 0 + (((tickAnim - 68) / 5) * (-40.93812-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = -25.68301 + (((tickAnim - 73) / 3) * (-57.53003-(-25.68301)));
            yy = -52.04655 + (((tickAnim - 73) / 3) * (-50.90692-(-52.04655)));
            zz = -40.93812 + (((tickAnim - 73) / 3) * (37.93991-(-40.93812)));
        }
        else if (tickAnim >= 76 && tickAnim < 79) {
            xx = -57.53003 + (((tickAnim - 76) / 3) * (-37.63123-(-57.53003)));
            yy = -50.90692 + (((tickAnim - 76) / 3) * (-57.02388-(-50.90692)));
            zz = 37.93991 + (((tickAnim - 76) / 3) * (-11.69153-(37.93991)));
        }
        else if (tickAnim >= 79 && tickAnim < 84) {
            xx = -37.63123 + (((tickAnim - 79) / 5) * (0-(-37.63123)));
            yy = -57.02388 + (((tickAnim - 79) / 5) * (-19.5-(-57.02388)));
            zz = -11.69153 + (((tickAnim - 79) / 5) * (0-(-11.69153)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 84) / 31) * (0-(0)));
            yy = -19.5 + (((tickAnim - 84) / 31) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 84) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (3.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 3.5 + (((tickAnim - 17) / 23) * (3.5-(3.5)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-1.11258-(0)));
            yy = 3.5 + (((tickAnim - 40) / 20) * (3.52428-(3.5)));
            zz = 0 + (((tickAnim - 40) / 20) * (2.73625-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -1.11258 + (((tickAnim - 60) / 8) * (-1.11258-(-1.11258)));
            yy = 3.52428 + (((tickAnim - 60) / 8) * (3.52428-(3.52428)));
            zz = 2.73625 + (((tickAnim - 60) / 8) * (2.73625-(2.73625)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -1.11258 + (((tickAnim - 68) / 8) * (-1.11258-(-1.11258)));
            yy = 3.52428 + (((tickAnim - 68) / 8) * (3.52428-(3.52428)));
            zz = 2.73625 + (((tickAnim - 68) / 8) * (2.73625-(2.73625)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = -1.11258 + (((tickAnim - 76) / 8) * (-1.11258-(-1.11258)));
            yy = 3.52428 + (((tickAnim - 76) / 8) * (3.52428-(3.52428)));
            zz = 2.73625 + (((tickAnim - 76) / 8) * (2.73625-(2.73625)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = -1.11258 + (((tickAnim - 84) / 31) * (0-(-1.11258)));
            yy = 3.52428 + (((tickAnim - 84) / 31) * (0-(3.52428)));
            zz = 2.73625 + (((tickAnim - 84) / 31) * (0-(2.73625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = -3.75 + (((tickAnim - 17) / 23) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (4.75-(0)));
            yy = -3.75 + (((tickAnim - 40) / 20) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 4.75 + (((tickAnim - 60) / 8) * (4.75-(4.75)));
            yy = -3.75 + (((tickAnim - 60) / 8) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = 4.75 + (((tickAnim - 68) / 8) * (4.75-(4.75)));
            yy = -3.75 + (((tickAnim - 68) / 8) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 68) / 8) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = 4.75 + (((tickAnim - 76) / 8) * (4.75-(4.75)));
            yy = -3.75 + (((tickAnim - 76) / 8) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 76) / 8) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = 4.75 + (((tickAnim - 84) / 31) * (0-(4.75)));
            yy = -3.75 + (((tickAnim - 84) / 31) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 84) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-6.4988-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0.09156-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (1.4972-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -6.4988 + (((tickAnim - 60) / 8) * (-6.4988-(-6.4988)));
            yy = 0.09156 + (((tickAnim - 60) / 8) * (0.09156-(0.09156)));
            zz = 1.4972 + (((tickAnim - 60) / 8) * (1.4972-(1.4972)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = -6.4988 + (((tickAnim - 68) / 8) * (-6.4988-(-6.4988)));
            yy = 0.09156 + (((tickAnim - 68) / 8) * (0.09156-(0.09156)));
            zz = 1.4972 + (((tickAnim - 68) / 8) * (1.4972-(1.4972)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = -6.4988 + (((tickAnim - 76) / 8) * (-6.4988-(-6.4988)));
            yy = 0.09156 + (((tickAnim - 76) / 8) * (0.09156-(0.09156)));
            zz = 1.4972 + (((tickAnim - 76) / 8) * (1.4972-(1.4972)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = -6.4988 + (((tickAnim - 84) / 31) * (0-(-6.4988)));
            yy = 0.09156 + (((tickAnim - 84) / 31) * (0-(0.09156)));
            zz = 1.4972 + (((tickAnim - 84) / 31) * (0-(1.4972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -8 + (((tickAnim - 8) / 5) * (-7.25-(-8)));
            yy = 5 + (((tickAnim - 8) / 5) * (5-(5)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -7.25 + (((tickAnim - 13) / 13) * (1.98497-(-7.25)));
            yy = 5 + (((tickAnim - 13) / 13) * (-12.72915-(5)));
            zz = 0 + (((tickAnim - 13) / 13) * (-3.33198-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 1.98497 + (((tickAnim - 26) / 7) * (3.99312-(1.98497)));
            yy = -12.72915 + (((tickAnim - 26) / 7) * (-13.72855-(-12.72915)));
            zz = -3.33198 + (((tickAnim - 26) / 7) * (-3.36763-(-3.33198)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 3.99312 + (((tickAnim - 33) / 27) * (13.15474-(3.99312)));
            yy = -13.72855 + (((tickAnim - 33) / 27) * (-30.86303-(-13.72855)));
            zz = -3.36763 + (((tickAnim - 33) / 27) * (-1.3848-(-3.36763)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 13.15474 + (((tickAnim - 60) / 4) * (10.16714-(13.15474)));
            yy = -30.86303 + (((tickAnim - 60) / 4) * (-31.87459-(-30.86303)));
            zz = -1.3848 + (((tickAnim - 60) / 4) * (-1.0491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8-(-1.3848)));
        }
        else if (tickAnim >= 64 && tickAnim < 75) {
            xx = 10.16714 + (((tickAnim - 64) / 11) * (17.31858-(10.16714)));
            yy = -31.87459 + (((tickAnim - 64) / 11) * (-28.88805-(-31.87459)));
            zz = -1.0491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8 + (((tickAnim - 64) / 11) * (-10.73161-(-1.0491+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 17.31858 + (((tickAnim - 75) / 10) * (5.83846-(17.31858)));
            yy = -28.88805 + (((tickAnim - 75) / 10) * (-26.90981-(-28.88805)));
            zz = -10.73161 + (((tickAnim - 75) / 10) * (5.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10-(-10.73161)));
        }
        else if (tickAnim >= 85 && tickAnim < 115) {
            xx = 5.83846 + (((tickAnim - 85) / 30) * (0-(5.83846)));
            yy = -26.90981 + (((tickAnim - 85) / 30) * (0-(-26.90981)));
            zz = 5.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10 + (((tickAnim - 85) / 30) * (0-(5.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (11.28023-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.16819-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.8306-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 11.28023 + (((tickAnim - 8) / 5) * (9.78023-(11.28023)));
            yy = 4.16819 + (((tickAnim - 8) / 5) * (4.16819-(4.16819)));
            zz = 0.8306 + (((tickAnim - 8) / 5) * (0.8306-(0.8306)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 9.78023 + (((tickAnim - 13) / 13) * (10.76337-(9.78023)));
            yy = 4.16819 + (((tickAnim - 13) / 13) * (-2.4841-(4.16819)));
            zz = 0.8306 + (((tickAnim - 13) / 13) * (-0.31452-(0.8306)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 10.76337 + (((tickAnim - 26) / 7) * (11.76337-(10.76337)));
            yy = -2.4841 + (((tickAnim - 26) / 7) * (-4.4841-(-2.4841)));
            zz = -0.31452 + (((tickAnim - 26) / 7) * (-0.31452-(-0.31452)));
        }
        else if (tickAnim >= 33 && tickAnim < 60) {
            xx = 11.76337 + (((tickAnim - 33) / 27) * (13.09049-(11.76337)));
            yy = -4.4841 + (((tickAnim - 33) / 27) * (-12.96323-(-4.4841)));
            zz = -0.31452 + (((tickAnim - 33) / 27) * (-2.73802-(-0.31452)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 13.09049 + (((tickAnim - 60) / 8) * (13.09049-(13.09049)));
            yy = -12.96323 + (((tickAnim - 60) / 8) * (-12.96323-(-12.96323)));
            zz = -2.73802 + (((tickAnim - 60) / 8) * (-2.73802-(-2.73802)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = 13.09049 + (((tickAnim - 68) / 8) * (13.09049-(13.09049)));
            yy = -12.96323 + (((tickAnim - 68) / 8) * (-12.96323-(-12.96323)));
            zz = -2.73802 + (((tickAnim - 68) / 8) * (-2.73802-(-2.73802)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = 13.09049 + (((tickAnim - 76) / 7) * (13.09049-(13.09049)));
            yy = -12.96323 + (((tickAnim - 76) / 7) * (-12.96323-(-12.96323)));
            zz = -2.73802 + (((tickAnim - 76) / 7) * (-2.73802-(-2.73802)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = 13.09049 + (((tickAnim - 83) / 6) * (9.63889-(13.09049)));
            yy = -12.96323 + (((tickAnim - 83) / 6) * (-15.96085-(-12.96323)));
            zz = -2.73802 + (((tickAnim - 83) / 6) * (2.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10-(-2.73802)));
        }
        else if (tickAnim >= 89 && tickAnim < 115) {
            xx = 9.63889 + (((tickAnim - 89) / 26) * (0-(9.63889)));
            yy = -15.96085 + (((tickAnim - 89) / 26) * (0-(-15.96085)));
            zz = 2.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10 + (((tickAnim - 89) / 26) * (0-(2.789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (9.75-(0)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 9.75 + (((tickAnim - 26) / 9) * (5.5-(9.75)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 115) {
            xx = 5.5 + (((tickAnim - 35) / 80) * (0-(5.5)));
            yy = 0 + (((tickAnim - 35) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 3) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 8) / 3) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 11) / 2) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 11) / 2) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 11) / 2) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 13) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 13) * (0.235-(1)));
            zz = 1 + (((tickAnim - 13) / 13) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 26) / 9) * (1-(1)));
            yy = 0.235 + (((tickAnim - 26) / 9) * (0.8375-(0.235)));
            zz = 1 + (((tickAnim - 26) / 9) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 35) / 25) * (1-(1)));
            yy = 0.8375 + (((tickAnim - 35) / 25) * (0.015-(0.8375)));
            zz = 1 + (((tickAnim - 35) / 25) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 60) / 8) * (1-(1)));
            yy = 0.015 + (((tickAnim - 60) / 8) * (0.015-(0.015)));
            zz = 1 + (((tickAnim - 60) / 8) * (1-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 76) {
            xx = 1 + (((tickAnim - 68) / 8) * (1-(1)));
            yy = 0.015 + (((tickAnim - 68) / 8) * (0.015-(0.015)));
            zz = 1 + (((tickAnim - 68) / 8) * (1-(1)));
        }
        else if (tickAnim >= 76 && tickAnim < 84) {
            xx = 1 + (((tickAnim - 76) / 8) * (1-(1)));
            yy = 0.015 + (((tickAnim - 76) / 8) * (0.015-(0.015)));
            zz = 1 + (((tickAnim - 76) / 8) * (1-(1)));
        }
        else if (tickAnim >= 84 && tickAnim < 89) {
            xx = 1 + (((tickAnim - 84) / 5) * (1-(1)));
            yy = 0.015 + (((tickAnim - 84) / 5) * (0.7-(0.015)));
            zz = 1 + (((tickAnim - 84) / 5) * (1-(1)));
        }
        else if (tickAnim >= 89 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 89) / 26) * (1-(1)));
            yy = 0.7 + (((tickAnim - 89) / 26) * (1-(0.7)));
            zz = 1 + (((tickAnim - 89) / 26) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (9.75-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -0.25 + (((tickAnim - 18) / 22) * (-0.25122-(-0.25)));
            yy = 9.75 + (((tickAnim - 18) / 22) * (11.24999-(9.75)));
            zz = 0 + (((tickAnim - 18) / 22) * (-0.00667-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 84) {
            xx = -0.25122 + (((tickAnim - 40) / 44) * (-0.25508-(-0.25122)));
            yy = 11.24999 + (((tickAnim - 40) / 44) * (-14.99977-(11.24999)));
            zz = -0.00667 + (((tickAnim - 40) / 44) * (0.10836-(-0.00667)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = -0.25508 + (((tickAnim - 84) / 31) * (0-(-0.25508)));
            yy = -14.99977 + (((tickAnim - 84) / 31) * (0-(-14.99977)));
            zz = 0.10836 + (((tickAnim - 84) / 31) * (0-(0.10836)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -4.25 + (((tickAnim - 18) / 22) * (-3.51242-(-4.25)));
            yy = 7 + (((tickAnim - 18) / 22) * (8.24655-(7)));
            zz = 0 + (((tickAnim - 18) / 22) * (-0.0936-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 84) {
            xx = -3.51242 + (((tickAnim - 40) / 44) * (-4.26201-(-3.51242)));
            yy = 8.24655 + (((tickAnim - 40) / 44) * (-8.20844-(8.24655)));
            zz = -0.0936 + (((tickAnim - 40) / 44) * (1.12849-(-0.0936)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = -4.26201 + (((tickAnim - 84) / 31) * (0-(-4.26201)));
            yy = -8.20844 + (((tickAnim - 84) / 31) * (0-(-8.20844)));
            zz = 1.12849 + (((tickAnim - 84) / 31) * (0-(1.12849)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (3.25-(0)));
            yy = -11.5 + (((tickAnim - 18) / 22) * (-11.5-(-11.5)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 3.25 + (((tickAnim - 40) / 22) * (1.65833-(3.25)));
            yy = -11.5 + (((tickAnim - 40) / 22) * (3.28617-(-11.5)));
            zz = 0 + (((tickAnim - 40) / 22) * (0.10845-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 84) {
            xx = 1.65833 + (((tickAnim - 62) / 22) * (0-(1.65833)));
            yy = 3.28617 + (((tickAnim - 62) / 22) * (11-(3.28617)));
            zz = 0.10845 + (((tickAnim - 62) / 22) * (0-(0.10845)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 84) / 31) * (0-(0)));
            yy = 11 + (((tickAnim - 84) / 31) * (0-(11)));
            zz = 0 + (((tickAnim - 84) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (2.43536-(0)));
            yy = -30 + (((tickAnim - 18) / 22) * (-27.25255-(-30)));
            zz = 0 + (((tickAnim - 18) / 22) * (0.13488-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 2.43536 + (((tickAnim - 40) / 22) * (1.24945-(2.43536)));
            yy = -27.25255 + (((tickAnim - 40) / 22) * (8.1844-(-27.25255)));
            zz = 0.13488 + (((tickAnim - 40) / 22) * (0.34532-(0.13488)));
        }
        else if (tickAnim >= 62 && tickAnim < 84) {
            xx = 1.24945 + (((tickAnim - 62) / 22) * (0-(1.24945)));
            yy = 8.1844 + (((tickAnim - 62) / 22) * (19-(8.1844)));
            zz = 0.34532 + (((tickAnim - 62) / 22) * (0-(0.34532)));
        }
        else if (tickAnim >= 84 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 84) / 31) * (0-(0)));
            yy = 19 + (((tickAnim - 84) / 31) * (0-(19)));
            zz = 0 + (((tickAnim - 84) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animSleep(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeothyris entity = (EntityPrehistoricFloraArchaeothyris) entitylivingbaseIn;
        int animCycle = 335;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.17897-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.09772-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.55047-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 2.17897 + (((tickAnim - 25) / 75) * (2.17897-(2.17897)));
            yy = 0.09772 + (((tickAnim - 25) / 75) * (0.09772-(0.09772)));
            zz = -0.55047 + (((tickAnim - 25) / 75) * (-0.55047-(-0.55047)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 2.17897 + (((tickAnim - 100) / 50) * (2.17897-(2.17897)));
            yy = 0.09772 + (((tickAnim - 100) / 50) * (0.09772-(0.09772)));
            zz = -0.55047 + (((tickAnim - 100) / 50) * (-0.55047-(-0.55047)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 2.17897 + (((tickAnim - 150) / 145) * (2.17897-(2.17897)));
            yy = 0.09772 + (((tickAnim - 150) / 145) * (0.09772-(0.09772)));
            zz = -0.55047 + (((tickAnim - 150) / 145) * (-0.55047-(-0.55047)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = 2.17897 + (((tickAnim - 295) / 14) * (-8.82103-(2.17897)));
            yy = 0.09772 + (((tickAnim - 295) / 14) * (0.09772-(0.09772)));
            zz = -0.55047 + (((tickAnim - 295) / 14) * (-0.55047-(-0.55047)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = -8.82103 + (((tickAnim - 309) / 11) * (-8.82103-(-8.82103)));
            yy = 0.09772 + (((tickAnim - 309) / 11) * (0.09772-(0.09772)));
            zz = -0.55047 + (((tickAnim - 309) / 11) * (-0.55047-(-0.55047)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = -8.82103 + (((tickAnim - 320) / 15) * (0-(-8.82103)));
            yy = 0.09772 + (((tickAnim - 320) / 15) * (0-(0.09772)));
            zz = -0.55047 + (((tickAnim - 320) / 15) * (0-(-0.55047)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.85-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = -1.85 + (((tickAnim - 25) / 75) * (-1.85-(-1.85)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            yy = -1.85 + (((tickAnim - 100) / 50) * (-1.85-(-1.85)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            yy = -1.85 + (((tickAnim - 150) / 145) * (-1.85-(-1.85)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            yy = -1.85 + (((tickAnim - 295) / 25) * (-1.85-(-1.85)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = -1.85 + (((tickAnim - 320) / 15) * (0-(-1.85)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.42326-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.40764-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-22.13214-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -6.42326 + (((tickAnim - 25) / 75) * (-6.42326-(-6.42326)));
            yy = -2.40764 + (((tickAnim - 25) / 75) * (-2.40764-(-2.40764)));
            zz = -22.13214 + (((tickAnim - 25) / 75) * (-22.13214-(-22.13214)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -6.42326 + (((tickAnim - 100) / 50) * (-6.42326-(-6.42326)));
            yy = -2.40764 + (((tickAnim - 100) / 50) * (-2.40764-(-2.40764)));
            zz = -22.13214 + (((tickAnim - 100) / 50) * (-22.13214-(-22.13214)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -6.42326 + (((tickAnim - 150) / 145) * (-6.42326-(-6.42326)));
            yy = -2.40764 + (((tickAnim - 150) / 145) * (-2.40764-(-2.40764)));
            zz = -22.13214 + (((tickAnim - 150) / 145) * (-22.13214-(-22.13214)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = -6.42326 + (((tickAnim - 295) / 14) * (5.88877-(-6.42326)));
            yy = -2.40764 + (((tickAnim - 295) / 14) * (-1.9055-(-2.40764)));
            zz = -22.13214 + (((tickAnim - 295) / 14) * (-28.2884-(-22.13214)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 5.88877 + (((tickAnim - 309) / 11) * (5.88877-(5.88877)));
            yy = -1.9055 + (((tickAnim - 309) / 11) * (-1.9055-(-1.9055)));
            zz = -28.2884 + (((tickAnim - 309) / 11) * (-28.2884-(-28.2884)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 5.88877 + (((tickAnim - 320) / 15) * (0-(5.88877)));
            yy = -1.9055 + (((tickAnim - 320) / 15) * (0-(-1.9055)));
            zz = -28.2884 + (((tickAnim - 320) / 15) * (0-(-28.2884)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 38.25 + (((tickAnim - 25) / 75) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 38.25 + (((tickAnim - 100) / 50) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 38.25 + (((tickAnim - 150) / 145) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 38.25 + (((tickAnim - 295) / 25) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 38.25 + (((tickAnim - 320) / 15) * (0-(38.25)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-21.74879-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.31142-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (21.93347-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -21.74879 + (((tickAnim - 25) / 75) * (-21.74879-(-21.74879)));
            yy = 0.31142 + (((tickAnim - 25) / 75) * (0.31142-(0.31142)));
            zz = 21.93347 + (((tickAnim - 25) / 75) * (21.93347-(21.93347)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -21.74879 + (((tickAnim - 100) / 50) * (-21.74879-(-21.74879)));
            yy = 0.31142 + (((tickAnim - 100) / 50) * (0.31142-(0.31142)));
            zz = 21.93347 + (((tickAnim - 100) / 50) * (21.93347-(21.93347)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -21.74879 + (((tickAnim - 150) / 145) * (-21.74879-(-21.74879)));
            yy = 0.31142 + (((tickAnim - 150) / 145) * (0.31142-(0.31142)));
            zz = 21.93347 + (((tickAnim - 150) / 145) * (21.93347-(21.93347)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = -21.74879 + (((tickAnim - 295) / 25) * (-21.74879-(-21.74879)));
            yy = 0.31142 + (((tickAnim - 295) / 25) * (0.31142-(0.31142)));
            zz = 21.93347 + (((tickAnim - 295) / 25) * (21.93347-(21.93347)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = -21.74879 + (((tickAnim - 320) / 15) * (0-(-21.74879)));
            yy = 0.31142 + (((tickAnim - 320) / 15) * (0-(0.31142)));
            zz = 21.93347 + (((tickAnim - 320) / 15) * (0-(21.93347)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = 0.25 + (((tickAnim - 25) / 75) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            yy = 0.25 + (((tickAnim - 100) / 50) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            yy = 0.25 + (((tickAnim - 150) / 145) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            yy = 0.25 + (((tickAnim - 295) / 25) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            yy = 0.25 + (((tickAnim - 320) / 8) * (0.16-(0.25)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 328) / 7) * (0-(0)));
            yy = 0.16 + (((tickAnim - 328) / 7) * (0-(0.16)));
            zz = 0 + (((tickAnim - 328) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.42326-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.40764-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (22.1321-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -6.42326 + (((tickAnim - 25) / 75) * (-6.42326-(-6.42326)));
            yy = -2.40764 + (((tickAnim - 25) / 75) * (-2.40764-(-2.40764)));
            zz = 22.1321 + (((tickAnim - 25) / 75) * (22.1321-(22.1321)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -6.42326 + (((tickAnim - 100) / 50) * (-6.42326-(-6.42326)));
            yy = -2.40764 + (((tickAnim - 100) / 50) * (-2.40764-(-2.40764)));
            zz = 22.1321 + (((tickAnim - 100) / 50) * (22.1321-(22.1321)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -6.42326 + (((tickAnim - 150) / 145) * (-6.42326-(-6.42326)));
            yy = -2.40764 + (((tickAnim - 150) / 145) * (-2.40764-(-2.40764)));
            zz = 22.1321 + (((tickAnim - 150) / 145) * (22.1321-(22.1321)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = -6.42326 + (((tickAnim - 295) / 14) * (8.85504-(-6.42326)));
            yy = -2.40764 + (((tickAnim - 295) / 14) * (-3.23426-(-2.40764)));
            zz = 22.1321 + (((tickAnim - 295) / 14) * (28.82283-(22.1321)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 8.85504 + (((tickAnim - 309) / 11) * (8.85504-(8.85504)));
            yy = -3.23426 + (((tickAnim - 309) / 11) * (-3.23426-(-3.23426)));
            zz = 28.82283 + (((tickAnim - 309) / 11) * (28.82283-(28.82283)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 8.85504 + (((tickAnim - 320) / 15) * (0-(8.85504)));
            yy = -3.23426 + (((tickAnim - 320) / 15) * (0-(-3.23426)));
            zz = 28.82283 + (((tickAnim - 320) / 15) * (0-(28.82283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 38.25 + (((tickAnim - 25) / 75) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 38.25 + (((tickAnim - 100) / 50) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 38.25 + (((tickAnim - 150) / 145) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 38.25 + (((tickAnim - 295) / 25) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 38.25 + (((tickAnim - 320) / 15) * (0-(38.25)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-25.736-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-14.09663-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-16.2925-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -25.736 + (((tickAnim - 25) / 75) * (-25.736-(-25.736)));
            yy = -14.09663 + (((tickAnim - 25) / 75) * (-14.09663-(-14.09663)));
            zz = -16.2925 + (((tickAnim - 25) / 75) * (-16.2925-(-16.2925)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -25.736 + (((tickAnim - 100) / 50) * (-25.736-(-25.736)));
            yy = -14.09663 + (((tickAnim - 100) / 50) * (-14.09663-(-14.09663)));
            zz = -16.2925 + (((tickAnim - 100) / 50) * (-16.2925-(-16.2925)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -25.736 + (((tickAnim - 150) / 145) * (-25.736-(-25.736)));
            yy = -14.09663 + (((tickAnim - 150) / 145) * (-14.09663-(-14.09663)));
            zz = -16.2925 + (((tickAnim - 150) / 145) * (-16.2925-(-16.2925)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = -25.736 + (((tickAnim - 295) / 25) * (-25.736-(-25.736)));
            yy = -14.09663 + (((tickAnim - 295) / 25) * (-14.09663-(-14.09663)));
            zz = -16.2925 + (((tickAnim - 295) / 25) * (-16.2925-(-16.2925)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = -25.736 + (((tickAnim - 320) / 15) * (0-(-25.736)));
            yy = -14.09663 + (((tickAnim - 320) / 15) * (0-(-14.09663)));
            zz = -16.2925 + (((tickAnim - 320) / 15) * (0-(-16.2925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = 0.375 + (((tickAnim - 25) / 75) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            yy = 0.375 + (((tickAnim - 100) / 50) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            yy = 0.375 + (((tickAnim - 150) / 145) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            yy = 0.375 + (((tickAnim - 295) / 25) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            yy = 0.375 + (((tickAnim - 320) / 8) * (0.245-(0.375)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 328) / 7) * (0-(0)));
            yy = 0.245 + (((tickAnim - 328) / 7) * (0-(0.245)));
            zz = 0 + (((tickAnim - 328) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -2 + (((tickAnim - 25) / 75) * (-2-(-2)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -2 + (((tickAnim - 100) / 50) * (-2-(-2)));
            yy = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -2 + (((tickAnim - 150) / 145) * (-2-(-2)));
            yy = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = -2 + (((tickAnim - 295) / 25) * (-2-(-2)));
            yy = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = -2 + (((tickAnim - 320) / 15) * (0-(-2)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 10 + (((tickAnim - 25) / 75) * (10-(10)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 10 + (((tickAnim - 100) / 50) * (10-(10)));
            yy = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 10 + (((tickAnim - 150) / 145) * (10-(10)));
            yy = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 10 + (((tickAnim - 295) / 25) * (10-(10)));
            yy = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 10 + (((tickAnim - 320) / 15) * (0-(10)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.82751-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.60824-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-9.32539-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 7.82751 + (((tickAnim - 25) / 75) * (7.82751-(7.82751)));
            yy = -2.60824 + (((tickAnim - 25) / 75) * (-2.60824-(-2.60824)));
            zz = -9.32539 + (((tickAnim - 25) / 75) * (-9.32539-(-9.32539)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 7.82751 + (((tickAnim - 100) / 50) * (7.82751-(7.82751)));
            yy = -2.60824 + (((tickAnim - 100) / 50) * (-2.60824-(-2.60824)));
            zz = -9.32539 + (((tickAnim - 100) / 50) * (-9.32539-(-9.32539)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 7.82751 + (((tickAnim - 150) / 145) * (7.82751-(7.82751)));
            yy = -2.60824 + (((tickAnim - 150) / 145) * (-2.60824-(-2.60824)));
            zz = -9.32539 + (((tickAnim - 150) / 145) * (-9.32539-(-9.32539)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = 7.82751 + (((tickAnim - 295) / 14) * (0-(7.82751)));
            yy = -2.60824 + (((tickAnim - 295) / 14) * (0-(-2.60824)));
            zz = -9.32539 + (((tickAnim - 295) / 14) * (0-(-9.32539)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-66.60217-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.48592-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-28.82825-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -66.60217 + (((tickAnim - 25) / 75) * (-66.60217-(-66.60217)));
            yy = -0.48592 + (((tickAnim - 25) / 75) * (-0.48592-(-0.48592)));
            zz = -28.82825 + (((tickAnim - 25) / 75) * (-28.82825-(-28.82825)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -66.60217 + (((tickAnim - 100) / 50) * (-66.60217-(-66.60217)));
            yy = -0.48592 + (((tickAnim - 100) / 50) * (-0.48592-(-0.48592)));
            zz = -28.82825 + (((tickAnim - 100) / 50) * (-28.82825-(-28.82825)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -66.60217 + (((tickAnim - 150) / 145) * (-66.60217-(-66.60217)));
            yy = -0.48592 + (((tickAnim - 150) / 145) * (-0.48592-(-0.48592)));
            zz = -28.82825 + (((tickAnim - 150) / 145) * (-28.82825-(-28.82825)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = -66.60217 + (((tickAnim - 295) / 14) * (0-(-66.60217)));
            yy = -0.48592 + (((tickAnim - 295) / 14) * (0-(-0.48592)));
            zz = -28.82825 + (((tickAnim - 295) / 14) * (0-(-28.82825)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.43066-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7.32626-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (11.30796-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 16.43066 + (((tickAnim - 8) / 17) * (38.23358-(16.43066)));
            yy = -7.32626 + (((tickAnim - 8) / 17) * (-17.58303-(-7.32626)));
            zz = 11.30796 + (((tickAnim - 8) / 17) * (27.13911-(11.30796)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 38.23358 + (((tickAnim - 25) / 75) * (38.23358-(38.23358)));
            yy = -17.58303 + (((tickAnim - 25) / 75) * (-17.58303-(-17.58303)));
            zz = 27.13911 + (((tickAnim - 25) / 75) * (27.13911-(27.13911)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 38.23358 + (((tickAnim - 100) / 50) * (38.23358-(38.23358)));
            yy = -17.58303 + (((tickAnim - 100) / 50) * (-17.58303-(-17.58303)));
            zz = 27.13911 + (((tickAnim - 100) / 50) * (27.13911-(27.13911)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 38.23358 + (((tickAnim - 150) / 145) * (38.23358-(38.23358)));
            yy = -17.58303 + (((tickAnim - 150) / 145) * (-17.58303-(-17.58303)));
            zz = 27.13911 + (((tickAnim - 150) / 145) * (27.13911-(27.13911)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = 38.23358 + (((tickAnim - 295) / 14) * (0-(38.23358)));
            yy = -17.58303 + (((tickAnim - 295) / 14) * (0-(-17.58303)));
            zz = 27.13911 + (((tickAnim - 295) / 14) * (0-(27.13911)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -0.15 + (((tickAnim - 8) / 17) * (0-(-0.15)));
            yy = 0.25 + (((tickAnim - 8) / 17) * (0-(0.25)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 295) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 8) * (0.305-(0)));
            zz = 0 + (((tickAnim - 295) / 8) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 309) {
            xx = 0 + (((tickAnim - 303) / 6) * (0-(0)));
            yy = 0.305 + (((tickAnim - 303) / 6) * (0.25-(0.305)));
            zz = 0 + (((tickAnim - 303) / 6) * (0-(0)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            yy = 0.25 + (((tickAnim - 309) / 11) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            yy = 0.25 + (((tickAnim - 320) / 8) * (0.05-(0.25)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 328) / 7) * (0-(0)));
            yy = 0.05 + (((tickAnim - 328) / 7) * (0-(0.05)));
            zz = 0 + (((tickAnim - 328) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.82751-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.60824-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-9.32539-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 7.82751 + (((tickAnim - 25) / 75) * (7.82751-(7.82751)));
            yy = -2.60824 + (((tickAnim - 25) / 75) * (-2.60824-(-2.60824)));
            zz = -9.32539 + (((tickAnim - 25) / 75) * (-9.32539-(-9.32539)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 7.82751 + (((tickAnim - 100) / 50) * (7.82751-(7.82751)));
            yy = -2.60824 + (((tickAnim - 100) / 50) * (-2.60824-(-2.60824)));
            zz = -9.32539 + (((tickAnim - 100) / 50) * (-9.32539-(-9.32539)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 7.82751 + (((tickAnim - 150) / 145) * (7.82751-(7.82751)));
            yy = -2.60824 + (((tickAnim - 150) / 145) * (-2.60824-(-2.60824)));
            zz = -9.32539 + (((tickAnim - 150) / 145) * (-9.32539-(-9.32539)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = 7.82751 + (((tickAnim - 295) / 14) * (0-(7.82751)));
            yy = -2.60824 + (((tickAnim - 295) / 14) * (0-(-2.60824)));
            zz = -9.32539 + (((tickAnim - 295) / 14) * (0-(-9.32539)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-63.8586-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (7.9984-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (45.3439-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -63.8586 + (((tickAnim - 25) / 75) * (-63.8586-(-63.8586)));
            yy = 7.9984 + (((tickAnim - 25) / 75) * (7.9984-(7.9984)));
            zz = 45.3439 + (((tickAnim - 25) / 75) * (45.3439-(45.3439)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -63.8586 + (((tickAnim - 100) / 50) * (-63.8586-(-63.8586)));
            yy = 7.9984 + (((tickAnim - 100) / 50) * (7.9984-(7.9984)));
            zz = 45.3439 + (((tickAnim - 100) / 50) * (45.3439-(45.3439)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -63.8586 + (((tickAnim - 150) / 145) * (-63.8586-(-63.8586)));
            yy = 7.9984 + (((tickAnim - 150) / 145) * (7.9984-(7.9984)));
            zz = 45.3439 + (((tickAnim - 150) / 145) * (45.3439-(45.3439)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = -63.8586 + (((tickAnim - 295) / 14) * (0-(-63.8586)));
            yy = 7.9984 + (((tickAnim - 295) / 14) * (0-(7.9984)));
            zz = 45.3439 + (((tickAnim - 295) / 14) * (0-(45.3439)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (49.06888-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (19.50046-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-28.07375-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 49.06888 + (((tickAnim - 25) / 75) * (49.06888-(49.06888)));
            yy = 19.50046 + (((tickAnim - 25) / 75) * (19.50046-(19.50046)));
            zz = -28.07375 + (((tickAnim - 25) / 75) * (-28.07375-(-28.07375)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 49.06888 + (((tickAnim - 100) / 50) * (49.06888-(49.06888)));
            yy = 19.50046 + (((tickAnim - 100) / 50) * (19.50046-(19.50046)));
            zz = -28.07375 + (((tickAnim - 100) / 50) * (-28.07375-(-28.07375)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 49.06888 + (((tickAnim - 150) / 145) * (49.06888-(49.06888)));
            yy = 19.50046 + (((tickAnim - 150) / 145) * (19.50046-(19.50046)));
            zz = -28.07375 + (((tickAnim - 150) / 145) * (-28.07375-(-28.07375)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = 49.06888 + (((tickAnim - 295) / 14) * (0-(49.06888)));
            yy = 19.50046 + (((tickAnim - 295) / 14) * (0-(19.50046)));
            zz = -28.07375 + (((tickAnim - 295) / 14) * (0-(-28.07375)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.18 + (((tickAnim - 6) / 2) * (0.295-(0.18)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.295 + (((tickAnim - 8) / 3) * (0.25-(0.295)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (-0.05-(0)));
            yy = 0.25 + (((tickAnim - 11) / 3) * (0.21-(0.25)));
            zz = 0 + (((tickAnim - 11) / 3) * (-0.075-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -0.05 + (((tickAnim - 14) / 3) * (-0.05-(-0.05)));
            yy = 0.21 + (((tickAnim - 14) / 3) * (0.16-(0.21)));
            zz = -0.075 + (((tickAnim - 14) / 3) * (-0.075-(-0.075)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -0.05 + (((tickAnim - 17) / 8) * (0-(-0.05)));
            yy = 0.16 + (((tickAnim - 17) / 8) * (0-(0.16)));
            zz = -0.075 + (((tickAnim - 17) / 8) * (0-(-0.075)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 0 + (((tickAnim - 295) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 295) / 8) * (0.55-(0)));
            zz = 0 + (((tickAnim - 295) / 8) * (0-(0)));
        }
        else if (tickAnim >= 303 && tickAnim < 309) {
            xx = 0 + (((tickAnim - 303) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 303) / 6) * (0.375-(0.55)));
            zz = 0 + (((tickAnim - 303) / 6) * (0-(0)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 309) / 11) * (0-(0)));
            yy = 0.375 + (((tickAnim - 309) / 11) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 309) / 11) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 328) {
            xx = 0 + (((tickAnim - 320) / 8) * (0-(0)));
            yy = 0.375 + (((tickAnim - 320) / 8) * (0.075-(0.375)));
            zz = 0 + (((tickAnim - 320) / 8) * (0-(0)));
        }
        else if (tickAnim >= 328 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 328) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 328) / 7) * (0-(0.075)));
            zz = 0 + (((tickAnim - 328) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.99192-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (6.49845-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.14241-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 2.99192 + (((tickAnim - 25) / 75) * (2.99192-(2.99192)));
            yy = 6.49845 + (((tickAnim - 25) / 75) * (6.49845-(6.49845)));
            zz = -0.14241 + (((tickAnim - 25) / 75) * (-0.14241-(-0.14241)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 2.99192 + (((tickAnim - 100) / 50) * (2.99192-(2.99192)));
            yy = 6.49845 + (((tickAnim - 100) / 50) * (6.49845-(6.49845)));
            zz = -0.14241 + (((tickAnim - 100) / 50) * (-0.14241-(-0.14241)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 2.99192 + (((tickAnim - 150) / 145) * (2.99192-(2.99192)));
            yy = 6.49845 + (((tickAnim - 150) / 145) * (6.49845-(6.49845)));
            zz = -0.14241 + (((tickAnim - 150) / 145) * (-0.14241-(-0.14241)));
        }
        else if (tickAnim >= 295 && tickAnim < 308) {
            xx = 2.99192 + (((tickAnim - 295) / 13) * (2.2592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(2.99192)));
            yy = 6.49845 + (((tickAnim - 295) / 13) * (9.69611-(6.49845)));
            zz = -0.14241 + (((tickAnim - 295) / 13) * (-0.72926-(-0.14241)));
        }
        else if (tickAnim >= 308 && tickAnim < 320) {
            xx = 2.2592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 308) / 12) * (4.2342+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(2.2592+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = 9.69611 + (((tickAnim - 308) / 12) * (9.69611-(9.69611)));
            zz = -0.72926 + (((tickAnim - 308) / 12) * (-0.72926-(-0.72926)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 4.2342+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 320) / 15) * (0-(4.2342+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            yy = 9.69611 + (((tickAnim - 320) / 15) * (0-(9.69611)));
            zz = -0.72926 + (((tickAnim - 320) / 15) * (0-(-0.72926)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-10.31178-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (6.66652-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-1.06072-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -10.31178 + (((tickAnim - 25) / 75) * (-10.31178-(-10.31178)));
            yy = 6.66652 + (((tickAnim - 25) / 75) * (6.66652-(6.66652)));
            zz = -1.06072 + (((tickAnim - 25) / 75) * (-1.06072-(-1.06072)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -10.31178 + (((tickAnim - 100) / 50) * (-10.31178-(-10.31178)));
            yy = 6.66652 + (((tickAnim - 100) / 50) * (6.66652-(6.66652)));
            zz = -1.06072 + (((tickAnim - 100) / 50) * (-1.06072-(-1.06072)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -10.31178 + (((tickAnim - 150) / 145) * (-10.31178-(-10.31178)));
            yy = 6.66652 + (((tickAnim - 150) / 145) * (6.66652-(6.66652)));
            zz = -1.06072 + (((tickAnim - 150) / 145) * (-1.06072-(-1.06072)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = -10.31178 + (((tickAnim - 295) / 8) * (-10.31178-(-10.31178)));
            yy = 6.66652 + (((tickAnim - 295) / 8) * (6.66652-(6.66652)));
            zz = -1.06072 + (((tickAnim - 295) / 8) * (-1.06072-(-1.06072)));
        }
        else if (tickAnim >= 303 && tickAnim < 308) {
            xx = -10.31178 + (((tickAnim - 303) / 5) * (0-(-10.31178)));
            yy = 6.66652 + (((tickAnim - 303) / 5) * (6.25-(6.66652)));
            zz = -1.06072 + (((tickAnim - 303) / 5) * (0-(-1.06072)));
        }
        else if (tickAnim >= 308 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 308) / 12) * (0-(0)));
            yy = 6.25 + (((tickAnim - 308) / 12) * (6.25-(6.25)));
            zz = 0 + (((tickAnim - 308) / 12) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 6.25 + (((tickAnim - 320) / 15) * (0-(6.25)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.3-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = -0.275 + (((tickAnim - 25) / 75) * (-0.275-(-0.275)));
            zz = 0.3 + (((tickAnim - 25) / 75) * (0.3-(0.3)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            yy = -0.275 + (((tickAnim - 100) / 50) * (-0.275-(-0.275)));
            zz = 0.3 + (((tickAnim - 100) / 50) * (0.3-(0.3)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            yy = -0.275 + (((tickAnim - 150) / 145) * (-0.275-(-0.275)));
            zz = 0.3 + (((tickAnim - 150) / 145) * (0.3-(0.3)));
        }
        else if (tickAnim >= 295 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 295) / 13) * (0-(0)));
            yy = -0.275 + (((tickAnim - 295) / 13) * (0-(-0.275)));
            zz = 0.3 + (((tickAnim - 295) / 13) * (0-(0.3)));
        }
        else if (tickAnim >= 308 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 308) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 308) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 12) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.51349-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-3.21426-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.48089-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -8.51349 + (((tickAnim - 25) / 75) * (-8.51349-(-8.51349)));
            yy = -3.21426 + (((tickAnim - 25) / 75) * (-3.21426-(-3.21426)));
            zz = 0.48089 + (((tickAnim - 25) / 75) * (0.48089-(0.48089)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = -8.51349 + (((tickAnim - 100) / 50) * (-8.5823-(-8.51349)));
            yy = -3.21426 + (((tickAnim - 100) / 50) * (7.91156-(-3.21426)));
            zz = 0.48089 + (((tickAnim - 100) / 50) * (-1.19005-(0.48089)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = -8.5823 + (((tickAnim - 150) / 145) * (-8.5823-(-8.5823)));
            yy = 7.91156 + (((tickAnim - 150) / 145) * (7.91156-(7.91156)));
            zz = -1.19005 + (((tickAnim - 150) / 145) * (-1.19005-(-1.19005)));
        }
        else if (tickAnim >= 295 && tickAnim < 309) {
            xx = -8.5823 + (((tickAnim - 295) / 14) * (2.9177-(-8.5823)));
            yy = 7.91156 + (((tickAnim - 295) / 14) * (7.91156-(7.91156)));
            zz = -1.19005 + (((tickAnim - 295) / 14) * (-1.19005-(-1.19005)));
        }
        else if (tickAnim >= 309 && tickAnim < 320) {
            xx = 2.9177 + (((tickAnim - 309) / 11) * (2.9177-(2.9177)));
            yy = 7.91156 + (((tickAnim - 309) / 11) * (7.91156-(7.91156)));
            zz = -1.19005 + (((tickAnim - 309) / 11) * (-1.19005-(-1.19005)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 2.9177 + (((tickAnim - 320) / 15) * (0-(2.9177)));
            yy = 7.91156 + (((tickAnim - 320) / 15) * (0-(7.91156)));
            zz = -1.19005 + (((tickAnim - 320) / 15) * (0-(-1.19005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 5.75 + (((tickAnim - 25) / 75) * (5.75-(5.75)));
            yy = -17.5 + (((tickAnim - 25) / 75) * (-17.5-(-17.5)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 5.75 + (((tickAnim - 100) / 50) * (5.56569-(5.75)));
            yy = -17.5 + (((tickAnim - 100) / 50) * (9.87111-(-17.5)));
            zz = 0 + (((tickAnim - 100) / 50) * (2.69142-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 5.56569 + (((tickAnim - 150) / 145) * (5.56569-(5.56569)));
            yy = 9.87111 + (((tickAnim - 150) / 145) * (9.87111-(9.87111)));
            zz = 2.69142 + (((tickAnim - 150) / 145) * (2.69142-(2.69142)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 5.56569 + (((tickAnim - 295) / 25) * (5.56569-(5.56569)));
            yy = 9.87111 + (((tickAnim - 295) / 25) * (9.87111-(9.87111)));
            zz = 2.69142 + (((tickAnim - 295) / 25) * (2.69142-(2.69142)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 5.56569 + (((tickAnim - 320) / 15) * (0-(5.56569)));
            yy = 9.87111 + (((tickAnim - 320) / 15) * (0-(9.87111)));
            zz = 2.69142 + (((tickAnim - 320) / 15) * (0-(2.69142)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-19-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = -19 + (((tickAnim - 25) / 75) * (-19-(-19)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 100) / 50) * (0-(0)));
            yy = -19 + (((tickAnim - 100) / 50) * (13.75-(-19)));
            zz = 0 + (((tickAnim - 100) / 50) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            yy = 13.75 + (((tickAnim - 150) / 145) * (13.75-(13.75)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            yy = 13.75 + (((tickAnim - 295) / 25) * (13.75-(13.75)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 13.75 + (((tickAnim - 320) / 15) * (0-(13.75)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-9.75-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = -9.75 + (((tickAnim - 25) / 75) * (-9.75-(-9.75)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 100) / 28) * (0-(0)));
            yy = -9.75 + (((tickAnim - 100) / 28) * (-13.18-(-9.75)));
            zz = 0 + (((tickAnim - 100) / 28) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 128) / 22) * (0-(0)));
            yy = -13.18 + (((tickAnim - 128) / 22) * (33.75-(-13.18)));
            zz = 0 + (((tickAnim - 128) / 22) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 295) {
            xx = 0 + (((tickAnim - 150) / 145) * (0-(0)));
            yy = 33.75 + (((tickAnim - 150) / 145) * (33.75-(33.75)));
            zz = 0 + (((tickAnim - 150) / 145) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 295) / 25) * (0-(0)));
            yy = 33.75 + (((tickAnim - 295) / 25) * (33.75-(33.75)));
            zz = 0 + (((tickAnim - 295) / 25) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 33.75 + (((tickAnim - 320) / 15) * (0-(33.75)));
            zz = 0 + (((tickAnim - 320) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 309) {
            xx = 0 + (((tickAnim - 0) / 309) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 309) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 309) * (0-(0)));
        }
        else if (tickAnim >= 309 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 309) / 6) * (10.75-(0)));
            yy = 0 + (((tickAnim - 309) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 309) / 6) * (0-(0)));
        }
        else if (tickAnim >= 315 && tickAnim < 320) {
            xx = 10.75 + (((tickAnim - 315) / 5) * (0-(10.75)));
            yy = 0 + (((tickAnim - 315) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 315) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 38 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 38) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 10) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 38) / 10) * (1-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 57) {
            xx = 1 + (((tickAnim - 48) / 9) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 48) / 9) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 48) / 9) * (1-(1)));
        }
        else if (tickAnim >= 57 && tickAnim < 175) {
            xx = 1 + (((tickAnim - 57) / 118) * (1-(1)));
            yy = 1 + (((tickAnim - 57) / 118) * (1-(1)));
            zz = 1 + (((tickAnim - 57) / 118) * (1-(1)));
        }
        else if (tickAnim >= 175 && tickAnim < 184) {
            xx = 1 + (((tickAnim - 175) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 175) / 9) * (0.6125-(1)));
            zz = 1 + (((tickAnim - 175) / 9) * (1-(1)));
        }
        else if (tickAnim >= 184 && tickAnim < 193) {
            xx = 1 + (((tickAnim - 184) / 9) * (1-(1)));
            yy = 0.6125 + (((tickAnim - 184) / 9) * (0.68-(0.6125)));
            zz = 1 + (((tickAnim - 184) / 9) * (1-(1)));
        }
        else if (tickAnim >= 193 && tickAnim < 205) {
            xx = 1 + (((tickAnim - 193) / 12) * (1-(1)));
            yy = 0.68 + (((tickAnim - 193) / 12) * (0.0075-(0.68)));
            zz = 1 + (((tickAnim - 193) / 12) * (1-(1)));
        }
        else if (tickAnim >= 205 && tickAnim < 295) {
            xx = 1 + (((tickAnim - 205) / 90) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 205) / 90) * (0.0075-(0.0075)));
            zz = 1 + (((tickAnim - 205) / 90) * (1-(1)));
        }
        else if (tickAnim >= 295 && tickAnim < 303) {
            xx = 1 + (((tickAnim - 295) / 8) * (1-(1)));
            yy = 0.0075 + (((tickAnim - 295) / 8) * (1-(0.0075)));
            zz = 1 + (((tickAnim - 295) / 8) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeothyris entity = (EntityPrehistoricFloraArchaeothyris) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.38141 + (((tickAnim - 0) / 5) * (3.75049-(14.38141)));
            yy = -25.40724 + (((tickAnim - 0) / 5) * (13.63002-(-25.40724)));
            zz = -44.53411 + (((tickAnim - 0) / 5) * (2.54658-(-44.53411)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 3.75049 + (((tickAnim - 5) / 11) * (92.84789-(3.75049)));
            yy = 13.63002 + (((tickAnim - 5) / 11) * (-18.48692-(13.63002)));
            zz = 2.54658 + (((tickAnim - 5) / 11) * (-79.0688-(2.54658)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 92.84789 + (((tickAnim - 16) / 5) * (14.38141-(92.84789)));
            yy = -18.48692 + (((tickAnim - 16) / 5) * (-25.40724-(-18.48692)));
            zz = -79.0688 + (((tickAnim - 16) / 5) * (-44.53411-(-79.0688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -53.9145 + (((tickAnim - 0) / 5) * (0-(-53.9145)));
            yy = 61.76727 + (((tickAnim - 0) / 5) * (0-(61.76727)));
            zz = -53.7372 + (((tickAnim - 0) / 5) * (0-(-53.7372)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 5) / 11) * (-17-(0)));
            yy = 0 + (((tickAnim - 5) / 11) * (65.75-(0)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -17 + (((tickAnim - 16) / 5) * (-53.9145-(-17)));
            yy = 65.75 + (((tickAnim - 16) / 5) * (61.76727-(65.75)));
            zz = 0 + (((tickAnim - 16) / 5) * (-53.7372-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 67 + (((tickAnim - 0) / 4) * (-14.93469-(67)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.64978-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (6.43361-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -14.93469 + (((tickAnim - 4) / 1) * (0-(-14.93469)));
            yy = 0.64978 + (((tickAnim - 4) / 1) * (0-(0.64978)));
            zz = 6.43361 + (((tickAnim - 4) / 1) * (0-(6.43361)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-7.4676-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.98563-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (2.83695-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.4676 + (((tickAnim - 6) / 2) * (-22.8704-(-7.4676)));
            yy = 0.98563 + (((tickAnim - 6) / 2) * (3.94253-(0.98563)));
            zz = 2.83695 + (((tickAnim - 6) / 2) * (11.34781-(2.83695)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -22.8704 + (((tickAnim - 8) / 3) * (-24.90103-(-22.8704)));
            yy = 3.94253 + (((tickAnim - 8) / 3) * (6.38017-(3.94253)));
            zz = 11.34781 + (((tickAnim - 8) / 3) * (12.70665-(11.34781)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -24.90103 + (((tickAnim - 11) / 5) * (-29.43243-(-24.90103)));
            yy = 6.38017 + (((tickAnim - 11) / 5) * (2.09135-(6.38017)));
            zz = 12.70665 + (((tickAnim - 11) / 5) * (3.70066-(12.70665)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -29.43243 + (((tickAnim - 16) / 2) * (10.18129-(-29.43243)));
            yy = 2.09135 + (((tickAnim - 16) / 2) * (2.31534-(2.09135)));
            zz = 3.70066 + (((tickAnim - 16) / 2) * (4.10997-(3.70066)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 10.18129 + (((tickAnim - 18) / 3) * (67-(10.18129)));
            yy = 2.31534 + (((tickAnim - 18) / 3) * (0-(2.31534)));
            zz = 4.10997 + (((tickAnim - 18) / 3) * (0-(4.10997)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.205-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.205 + (((tickAnim - 6) / 1) * (0.435-(0.205)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.435 + (((tickAnim - 7) / 1) * (0.575-(0.435)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 0) * (0.715-(0.575)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.715 + (((tickAnim - 8) / 1) * (0.89-(0.715)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.89 + (((tickAnim - 9) / 1) * (1.06-(0.89)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 1.06 + (((tickAnim - 10) / 1) * (1.15-(1.06)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 11) / 2) * (0.605-(1.15)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.605 + (((tickAnim - 13) / 3) * (0.15-(0.605)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 16) / 5) * (0-(0.15)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 48.80099 + (((tickAnim - 0) / 6) * (92.84789-(48.80099)));
            yy = 17.80093 + (((tickAnim - 0) / 6) * (18.4869-(17.80093)));
            zz = 42.06652 + (((tickAnim - 0) / 6) * (79.0688-(42.06652)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 92.84789 + (((tickAnim - 6) / 5) * (14.38141-(92.84789)));
            yy = 18.4869 + (((tickAnim - 6) / 5) * (25.4072-(18.4869)));
            zz = 79.0688 + (((tickAnim - 6) / 5) * (44.5341-(79.0688)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 14.38141 + (((tickAnim - 11) / 4) * (5.25-(14.38141)));
            yy = 25.4072 + (((tickAnim - 11) / 4) * (-13.75-(25.4072)));
            zz = 44.5341 + (((tickAnim - 11) / 4) * (0-(44.5341)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 5.25 + (((tickAnim - 15) / 6) * (48.80099-(5.25)));
            yy = -13.75 + (((tickAnim - 15) / 6) * (17.80093-(-13.75)));
            zz = 0 + (((tickAnim - 15) / 6) * (42.06652-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -7.84615 + (((tickAnim - 0) / 6) * (-17-(-7.84615)));
            yy = -30.3462 + (((tickAnim - 0) / 6) * (-65.75-(-30.3462)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -17 + (((tickAnim - 6) / 5) * (-56.62076-(-17)));
            yy = -65.75 + (((tickAnim - 6) / 5) * (-46.04637-(-65.75)));
            zz = 0 + (((tickAnim - 6) / 5) * (44.78748-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -56.62076 + (((tickAnim - 11) / 4) * (-8.47697-(-56.62076)));
            yy = -46.04637 + (((tickAnim - 11) / 4) * (-0.62763-(-46.04637)));
            zz = 44.78748 + (((tickAnim - 11) / 4) * (-4.20349-(44.78748)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -8.47697 + (((tickAnim - 15) / 6) * (-7.84615-(-8.47697)));
            yy = -0.62763 + (((tickAnim - 15) / 6) * (-30.3462-(-0.62763)));
            zz = -4.20349 + (((tickAnim - 15) / 6) * (0-(-4.20349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -109.1047 + (((tickAnim - 0) / 10) * (20-(-109.1047)));
            yy = -42.42671 + (((tickAnim - 0) / 10) * (0-(-42.42671)));
            zz = 94.7961 + (((tickAnim - 0) / 10) * (0-(94.7961)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 10) / 5) * (-80.37676-(20)));
            yy = 0 + (((tickAnim - 10) / 5) * (-14.54247-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (116.68952-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -80.37676 + (((tickAnim - 15) / 6) * (-109.1047-(-80.37676)));
            yy = -14.54247 + (((tickAnim - 15) / 6) * (-42.42671-(-14.54247)));
            zz = 116.68952 + (((tickAnim - 15) / 6) * (94.7961-(116.68952)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10.5 + (((tickAnim - 0) / 4) * (-4.58491-(10.5)));
            yy = 49.75 + (((tickAnim - 0) / 4) * (29.27968-(49.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (-21.78491-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -4.58491 + (((tickAnim - 4) / 6) * (12.5-(-4.58491)));
            yy = 29.27968 + (((tickAnim - 4) / 6) * (0-(29.27968)));
            zz = -21.78491 + (((tickAnim - 4) / 6) * (0-(-21.78491)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 12.5 + (((tickAnim - 10) / 5) * (20.75556-(12.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (44.86127-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-9.41701-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 20.75556 + (((tickAnim - 15) / 4) * (13.09687-(20.75556)));
            yy = 44.86127 + (((tickAnim - 15) / 4) * (43.73108-(44.86127)));
            zz = -9.41701 + (((tickAnim - 15) / 4) * (12.98932-(-9.41701)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 13.09687 + (((tickAnim - 19) / 2) * (10.5-(13.09687)));
            yy = 43.73108 + (((tickAnim - 19) / 2) * (49.75-(43.73108)));
            zz = 12.98932 + (((tickAnim - 19) / 2) * (0-(12.98932)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 0) / 4) * (15.73604-(10)));
            yy = 0 + (((tickAnim - 0) / 4) * (-1.7643-(0)));
            zz = -9.75 + (((tickAnim - 0) / 4) * (-5.06926-(-9.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 15.73604 + (((tickAnim - 4) / 2) * (8.29385-(15.73604)));
            yy = -1.7643 + (((tickAnim - 4) / 2) * (-1.62721-(-1.7643)));
            zz = -5.06926 + (((tickAnim - 4) / 2) * (-5.82389-(-5.06926)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.29385 + (((tickAnim - 6) / 2) * (-1.78988-(8.29385)));
            yy = -1.62721 + (((tickAnim - 6) / 2) * (-0.16043-(-1.62721)));
            zz = -5.82389 + (((tickAnim - 6) / 2) * (-5.73168-(-5.82389)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.78988 + (((tickAnim - 8) / 2) * (-7.75-(-1.78988)));
            yy = -0.16043 + (((tickAnim - 8) / 2) * (-5-(-0.16043)));
            zz = -5.73168 + (((tickAnim - 8) / 2) * (-15-(-5.73168)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.75 + (((tickAnim - 10) / 3) * (7.04099-(-7.75)));
            yy = -5 + (((tickAnim - 10) / 3) * (3.58579-(-5)));
            zz = -15 + (((tickAnim - 10) / 3) * (-66.10107-(-15)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.04099 + (((tickAnim - 13) / 2) * (53.71196-(7.04099)));
            yy = 3.58579 + (((tickAnim - 13) / 2) * (15.1898-(3.58579)));
            zz = -66.10107 + (((tickAnim - 13) / 2) * (-70.51308-(-66.10107)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 53.71196 + (((tickAnim - 15) / 4) * (-0.54419-(53.71196)));
            yy = 15.1898 + (((tickAnim - 15) / 4) * (-4.4894-(15.1898)));
            zz = -70.51308 + (((tickAnim - 15) / 4) * (-12.58694-(-70.51308)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -0.54419 + (((tickAnim - 19) / 2) * (10-(-0.54419)));
            yy = -4.4894 + (((tickAnim - 19) / 2) * (0-(-4.4894)));
            zz = -12.58694 + (((tickAnim - 19) / 2) * (-9.75-(-12.58694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.34-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.34 + (((tickAnim - 4) / 2) * (0.29-(0.34)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.29 + (((tickAnim - 6) / 2) * (0.325-(0.29)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 8) / 2) * (0.7-(0.325)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 10) / 5) * (0-(0.7)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*0.9), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-150))*8), hips.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*0.2);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-80))*0.05);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-60))*0.15);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -21.02918 + (((tickAnim - 0) / 2) * (-25.38369-(-21.02918)));
            yy = -3.86546 + (((tickAnim - 0) / 2) * (-4.61019-(-3.86546)));
            zz = -12.18557 + (((tickAnim - 0) / 2) * (-8.33133-(-12.18557)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.38369 + (((tickAnim - 2) / 1) * (-28.52599-(-25.38369)));
            yy = -4.61019 + (((tickAnim - 2) / 1) * (-5.15012-(-4.61019)));
            zz = -8.33133 + (((tickAnim - 2) / 1) * (-2.0138-Math.sin((Math.PI/180)*(((double)tickAnim/20)*345+60))*2-(-8.33133)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -28.52599 + (((tickAnim - 3) / 3) * (-29.47662-(-28.52599)));
            yy = -5.15012 + (((tickAnim - 3) / 3) * (-1.23076-(-5.15012)));
            zz = -2.0138-Math.sin((Math.PI/180)*(((double)tickAnim/20)*345+60))*2 + (((tickAnim - 3) / 3) * (-2.17622-(-2.0138-Math.sin((Math.PI/180)*(((double)tickAnim/20)*345+60))*2)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -29.47662 + (((tickAnim - 6) / 5) * (67-(-29.47662)));
            yy = -1.23076 + (((tickAnim - 6) / 5) * (0-(-1.23076)));
            zz = -2.17622 + (((tickAnim - 6) / 5) * (0-(-2.17622)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 67 + (((tickAnim - 11) / 3) * (0.49503-(67)));
            yy = 0 + (((tickAnim - 11) / 3) * (4.13798-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (-13.90917-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0.49503 + (((tickAnim - 14) / 1) * (3.74872-(0.49503)));
            yy = 4.13798 + (((tickAnim - 14) / 1) * (-0.09809-(4.13798)));
            zz = -13.90917 + (((tickAnim - 14) / 1) * (1.49679-(-13.90917)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 3.74872 + (((tickAnim - 15) / 3) * (-8.75936-(3.74872)));
            yy = -0.09809 + (((tickAnim - 15) / 3) * (-3.01546-(-0.09809)));
            zz = 1.49679 + (((tickAnim - 15) / 3) * (-11.99989-(1.49679)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -8.75936 + (((tickAnim - 18) / 1) * (-15.00172-(-8.75936)));
            yy = -3.01546 + (((tickAnim - 18) / 1) * (-2.92453-(-3.01546)));
            zz = -11.99989 + (((tickAnim - 18) / 1) * (-10.15743-(-11.99989)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -15.00172 + (((tickAnim - 19) / 2) * (-21.02918-(-15.00172)));
            yy = -2.92453 + (((tickAnim - 19) / 2) * (-3.86546-(-2.92453)));
            zz = -10.15743 + (((tickAnim - 19) / 2) * (-12.18557-(-10.15743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.66 + (((tickAnim - 0) / 2) * (0.685-(0.66)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.685 + (((tickAnim - 2) / 1) * (0.535-(0.685)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.535 + (((tickAnim - 3) / 3) * (0-(0.535)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.025-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 15) / 3) * (0.55-(0.025)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.55 + (((tickAnim - 18) / 1) * (0.705-(0.55)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = 0.705 + (((tickAnim - 19) / 2) * (0.66-(0.705)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-30))*6), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-60))*8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*-1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-10))*7), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*-5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 0) / 5) * (-48.9539-(20)));
            yy = 0 + (((tickAnim - 0) / 5) * (51.51223-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-83.68783-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -48.9539 + (((tickAnim - 5) / 5) * (0-(-48.9539)));
            yy = 51.51223 + (((tickAnim - 5) / 5) * (100-(51.51223)));
            zz = -83.68783 + (((tickAnim - 5) / 5) * (0-(-83.68783)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-0.26923-(0)));
            yy = 100 + (((tickAnim - 10) / 5) * (53.84615-(100)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -0.26923 + (((tickAnim - 15) / 6) * (20-(-0.26923)));
            yy = 53.84615 + (((tickAnim - 15) / 6) * (0-(53.84615)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (25.14489-(12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-22.66549-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-23.41183-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 25.14489 + (((tickAnim - 5) / 4) * (20.10734-(25.14489)));
            yy = -22.66549 + (((tickAnim - 5) / 4) * (-57.95436-(-22.66549)));
            zz = -23.41183 + (((tickAnim - 5) / 4) * (-32.71465-(-23.41183)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 20.10734 + (((tickAnim - 9) / 1) * (2.2245-(20.10734)));
            yy = -57.95436 + (((tickAnim - 9) / 1) * (-72.30842-(-57.95436)));
            zz = -32.71465 + (((tickAnim - 9) / 1) * (4.65637-(-32.71465)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 2.2245 + (((tickAnim - 10) / 11) * (12.5-(2.2245)));
            yy = -72.30842 + (((tickAnim - 10) / 11) * (0-(-72.30842)));
            zz = 4.65637 + (((tickAnim - 10) / 11) * (0-(4.65637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = -0.35 + (((tickAnim - 10) / 11) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -11.74974 + (((tickAnim - 0) / 5) * (36.62651-(-11.74974)));
            yy = 27.73282 + (((tickAnim - 0) / 5) * (-3.47789-(27.73282)));
            zz = 8.59923 + (((tickAnim - 0) / 5) * (86.00127-(8.59923)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.62651 + (((tickAnim - 5) / 3) * (-25.39493-(36.62651)));
            yy = -3.47789 + (((tickAnim - 5) / 3) * (11.01321-(-3.47789)));
            zz = 86.00127 + (((tickAnim - 5) / 3) * (-14.6285-(86.00127)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25.39493 + (((tickAnim - 8) / 2) * (-10.98633-(-25.39493)));
            yy = 11.01321 + (((tickAnim - 8) / 2) * (14.89966-(11.01321)));
            zz = -14.6285 + (((tickAnim - 8) / 2) * (3.67884-(-14.6285)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -10.98633 + (((tickAnim - 10) / 5) * (-9.0374-(-10.98633)));
            yy = 14.89966 + (((tickAnim - 10) / 5) * (19.19997-(14.89966)));
            zz = 3.67884 + (((tickAnim - 10) / 5) * (-5.46216-(3.67884)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -9.0374 + (((tickAnim - 15) / 6) * (-11.74974-(-9.0374)));
            yy = 19.19997 + (((tickAnim - 15) / 6) * (27.73282-(19.19997)));
            zz = -5.46216 + (((tickAnim - 15) / 6) * (8.59923-(-5.46216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 5) * (0.3-(0.425)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 5) / 5) * (-0.175-(0.3)));
            zz = 0.4 + (((tickAnim - 5) / 5) * (0-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.175 + (((tickAnim - 10) / 7) * (0.475-(-0.175)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 17) / 4) * (0.425-(0.475)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+30))*15), neck.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345))*-14), head.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+30))*-10), tail.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-20))*3), tail2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+10))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+30))*6));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.5-20))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345-50))*-18), tail4.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345+60))*7));


    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeothyris entity = (EntityPrehistoricFloraArchaeothyris) entitylivingbaseIn;
        int animCycle = 10;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -23.25 + (((tickAnim - 0) / 2) * (-1.75-(-23.25)));
            yy = -15.75 + (((tickAnim - 0) / 2) * (-15.75-(-15.75)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -1.75 + (((tickAnim - 2) / 5) * (150.6613-(-1.75)));
            yy = -15.75 + (((tickAnim - 2) / 5) * (-2.98989-(-15.75)));
            zz = 0 + (((tickAnim - 2) / 5) * (-114.43023-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 150.6613 + (((tickAnim - 7) / 3) * (-23.25-(150.6613)));
            yy = -2.98989 + (((tickAnim - 7) / 3) * (-15.75-(-2.98989)));
            zz = -114.43023 + (((tickAnim - 7) / 3) * (0-(-114.43023)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -22.25 + (((tickAnim - 0) / 2) * (-21.95476-(-22.25)));
            yy = 15 + (((tickAnim - 0) / 2) * (19.85478-(15)));
            zz = 0 + (((tickAnim - 0) / 2) * (-2.3941-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -21.95476 + (((tickAnim - 2) / 3) * (-19.11429-(-21.95476)));
            yy = 19.85478 + (((tickAnim - 2) / 3) * (29.56434-(19.85478)));
            zz = -2.3941 + (((tickAnim - 2) / 3) * (-7.1823-(-2.3941)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -19.11429 + (((tickAnim - 5) / 2) * (-59.13634-(-19.11429)));
            yy = 29.56434 + (((tickAnim - 5) / 2) * (-1.7803-(29.56434)));
            zz = -7.1823 + (((tickAnim - 5) / 2) * (-34.79642-(-7.1823)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -59.13634 + (((tickAnim - 7) / 1) * (-50.15255-(-59.13634)));
            yy = -1.7803 + (((tickAnim - 7) / 1) * (16.14423-(-1.7803)));
            zz = -34.79642 + (((tickAnim - 7) / 1) * (-25.28924-(-34.79642)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -50.15255 + (((tickAnim - 8) / 2) * (-22.25-(-50.15255)));
            yy = 16.14423 + (((tickAnim - 8) / 2) * (15-(16.14423)));
            zz = -25.28924 + (((tickAnim - 8) / 2) * (0-(-25.28924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 105.24579 + (((tickAnim - 0) / 2) * (151.88561-(105.24579)));
            yy = 22.16209 + (((tickAnim - 0) / 2) * (3.32004-(22.16209)));
            zz = 100.39915 + (((tickAnim - 0) / 2) * (100.01513-(100.39915)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 151.88561 + (((tickAnim - 2) / 1) * (21.50905-(151.88561)));
            yy = 3.32004 + (((tickAnim - 2) / 1) * (25.68766-(3.32004)));
            zz = 100.01513 + (((tickAnim - 2) / 1) * (51.81151-(100.01513)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 21.50905 + (((tickAnim - 3) / 2) * (1.5-(21.50905)));
            yy = 25.68766 + (((tickAnim - 3) / 2) * (15.75-(25.68766)));
            zz = 51.81151 + (((tickAnim - 3) / 2) * (0-(51.81151)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 5) / 5) * (105.24579-(1.5)));
            yy = 15.75 + (((tickAnim - 5) / 5) * (22.16209-(15.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (100.39915-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -19.11429 + (((tickAnim - 0) / 2) * (-61.90397-(-19.11429)));
            yy = -29.5643 + (((tickAnim - 0) / 2) * (5.10761-(-29.5643)));
            zz = 7.1823 + (((tickAnim - 0) / 2) * (27.43868-(7.1823)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -61.90397 + (((tickAnim - 2) / 1) * (-52.77493-(-61.90397)));
            yy = 5.10761 + (((tickAnim - 2) / 1) * (-10.09831-(5.10761)));
            zz = 27.43868 + (((tickAnim - 2) / 1) * (14.75408-(27.43868)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -52.77493 + (((tickAnim - 3) / 2) * (-21.95476-(-52.77493)));
            yy = -10.09831 + (((tickAnim - 3) / 2) * (-19.8548-(-10.09831)));
            zz = 14.75408 + (((tickAnim - 3) / 2) * (-2.3941-(14.75408)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -21.95476 + (((tickAnim - 5) / 5) * (-19.11429-(-21.95476)));
            yy = -19.8548 + (((tickAnim - 5) / 5) * (-29.5643-(-19.8548)));
            zz = -2.3941 + (((tickAnim - 5) / 5) * (7.1823-(-2.3941)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.82972 + (((tickAnim - 0) / 2) * (-0.32972-(-7.82972)));
            yy = -16.3978 + (((tickAnim - 0) / 2) * (-16.3978-(-16.3978)));
            zz = -25.3727 + (((tickAnim - 0) / 2) * (-25.3727-(-25.3727)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.32972 + (((tickAnim - 2) / 1) * (94.5878-(-0.32972)));
            yy = -16.3978 + (((tickAnim - 2) / 1) * (0.23307-(-16.3978)));
            zz = -25.3727 + (((tickAnim - 2) / 1) * (-12.69636-(-25.3727)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 94.5878 + (((tickAnim - 3) / 1) * (15.67965-(94.5878)));
            yy = 0.23307 + (((tickAnim - 3) / 1) * (-2.97673-(0.23307)));
            zz = -12.69636 + (((tickAnim - 3) / 1) * (-12.90864-(-12.69636)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 15.67965 + (((tickAnim - 4) / 1) * (23.06192-(15.67965)));
            yy = -2.97673 + (((tickAnim - 4) / 1) * (-22.50446-(-2.97673)));
            zz = -12.90864 + (((tickAnim - 4) / 1) * (-3.30522-(-12.90864)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 23.06192 + (((tickAnim - 5) / 1) * (15.83006-(23.06192)));
            yy = -22.50446 + (((tickAnim - 5) / 1) * (-21.08029-(-22.50446)));
            zz = -3.30522 + (((tickAnim - 5) / 1) * (-8.49309-(-3.30522)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 15.83006 + (((tickAnim - 6) / 2) * (0.52694-(15.83006)));
            yy = -21.08029 + (((tickAnim - 6) / 2) * (-18.84046-(-21.08029)));
            zz = -8.49309 + (((tickAnim - 6) / 2) * (-16.54571-(-8.49309)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.52694 + (((tickAnim - 8) / 2) * (-7.82972-(0.52694)));
            yy = -18.84046 + (((tickAnim - 8) / 2) * (-16.3978-(-18.84046)));
            zz = -16.54571 + (((tickAnim - 8) / 2) * (-25.3727-(-16.54571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 5) * (0.125-(0.15)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.125 + (((tickAnim - 5) / 1) * (0.365-(0.125)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.365 + (((tickAnim - 6) / 1) * (0.45-(0.365)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 7) / 1) * (0.465-(0.45)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.465 + (((tickAnim - 8) / 2) * (0.15-(0.465)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11.3032-(0)));
            yy = -114.25 + (((tickAnim - 0) / 4) * (-3.97941-(-114.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (-20.94518-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11.3032 + (((tickAnim - 4) / 4) * (82.21265-(11.3032)));
            yy = -3.97941 + (((tickAnim - 4) / 4) * (-53.40571-(-3.97941)));
            zz = -20.94518 + (((tickAnim - 4) / 4) * (-61.20503-(-20.94518)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 82.21265 + (((tickAnim - 8) / 2) * (0-(82.21265)));
            yy = -53.40571 + (((tickAnim - 8) / 2) * (-114.25-(-53.40571)));
            zz = -61.20503 + (((tickAnim - 8) / 2) * (0-(-61.20503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24.47861 + (((tickAnim - 0) / 4) * (49.73151-(24.47861)));
            yy = 45.36478 + (((tickAnim - 0) / 4) * (38.02734-(45.36478)));
            zz = 32.61097 + (((tickAnim - 0) / 4) * (49.42614-(32.61097)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 49.73151 + (((tickAnim - 4) / 4) * (70.10685-(49.73151)));
            yy = 38.02734 + (((tickAnim - 4) / 4) * (34.46329-(38.02734)));
            zz = 49.42614 + (((tickAnim - 4) / 4) * (51.9413-(49.42614)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 70.10685 + (((tickAnim - 8) / 2) * (24.47861-(70.10685)));
            yy = 34.46329 + (((tickAnim - 8) / 2) * (45.36478-(34.46329)));
            zz = 51.9413 + (((tickAnim - 8) / 2) * (32.61097-(51.9413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 24.75 + (((tickAnim - 2) / 1) * (-12.47654-(24.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (4.1589-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (22.83825-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -12.47654 + (((tickAnim - 3) / 1) * (-33.53982-(-12.47654)));
            yy = 4.1589 + (((tickAnim - 3) / 1) * (9.12989-(4.1589)));
            zz = 22.83825 + (((tickAnim - 3) / 1) * (23.8509-(22.83825)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -33.53982 + (((tickAnim - 4) / 3) * (0.17028-(-33.53982)));
            yy = 9.12989 + (((tickAnim - 4) / 3) * (16.39784-(9.12989)));
            zz = 23.8509 + (((tickAnim - 4) / 3) * (25.37269-(23.8509)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0.17028 + (((tickAnim - 7) / 2) * (79.07166-(0.17028)));
            yy = 16.39784 + (((tickAnim - 7) / 2) * (4.28275-(16.39784)));
            zz = 25.37269 + (((tickAnim - 7) / 2) * (-10.11934-(25.37269)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 79.07166 + (((tickAnim - 9) / 1) * (0-(79.07166)));
            yy = 4.28275 + (((tickAnim - 9) / 1) * (0-(4.28275)));
            zz = -10.11934 + (((tickAnim - 9) / 1) * (0-(-10.11934)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 1.2 + (((tickAnim - 3) / 7) * (0-(1.2)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-4.22814-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-27.48361-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-25.91117-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -4.22814 + (((tickAnim - 2) / 1) * (-7.81169-(-4.22814)));
            yy = -27.48361 + (((tickAnim - 2) / 1) * (-40.71311-(-27.48361)));
            zz = -25.91117 + (((tickAnim - 2) / 1) * (-16.51042-(-25.91117)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -7.81169 + (((tickAnim - 3) / 0) * (-31.23736-(-7.81169)));
            yy = -40.71311 + (((tickAnim - 3) / 0) * (-46.43925-(-40.71311)));
            zz = -16.51042 + (((tickAnim - 3) / 0) * (7.22682-(-16.51042)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -31.23736 + (((tickAnim - 3) / 1) * (-39.55442-(-31.23736)));
            yy = -46.43925 + (((tickAnim - 3) / 1) * (-55.38868-(-46.43925)));
            zz = 7.22682 + (((tickAnim - 3) / 1) * (22.6472-(7.22682)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -39.55442 + (((tickAnim - 4) / 4) * (51.3679-(-39.55442)));
            yy = -55.38868 + (((tickAnim - 4) / 4) * (22.54098-(-55.38868)));
            zz = 22.6472 + (((tickAnim - 4) / 4) * (-53.37916-(22.6472)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 51.3679 + (((tickAnim - 8) / 2) * (0-(51.3679)));
            yy = 22.54098 + (((tickAnim - 8) / 2) * (0-(22.54098)));
            zz = -53.37916 + (((tickAnim - 8) / 2) * (0-(-53.37916)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.155-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.155 + (((tickAnim - 2) / 1) * (1.075-(-0.155)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.075 + (((tickAnim - 3) / 1) * (2.155-(1.075)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 2.155 + (((tickAnim - 4) / 6) * (0-(2.155)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (54.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22 + (((tickAnim - 3) / 2) * (0-(22)));
            yy = 54.5 + (((tickAnim - 3) / 2) * (109-(54.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 109 + (((tickAnim - 5) / 3) * (53.25-(109)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 53.25 + (((tickAnim - 8) / 2) * (0-(53.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 44.25 + (((tickAnim - 0) / 3) * (69.08805-(44.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-32.33718-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-25.59502-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 69.08805 + (((tickAnim - 3) / 2) * (48.9531-(69.08805)));
            yy = -32.33718 + (((tickAnim - 3) / 2) * (-72.76388-(-32.33718)));
            zz = -25.59502 + (((tickAnim - 3) / 2) * (-62.741-(-25.59502)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 48.9531 + (((tickAnim - 5) / 3) * (27.85155-(48.9531)));
            yy = -72.76388 + (((tickAnim - 5) / 3) * (-36.38194-(-72.76388)));
            zz = -62.741 + (((tickAnim - 5) / 3) * (-31.3705-(-62.741)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 27.85155 + (((tickAnim - 8) / 2) * (44.25-(27.85155)));
            yy = -36.38194 + (((tickAnim - 8) / 2) * (0-(-36.38194)));
            zz = -31.3705 + (((tickAnim - 8) / 2) * (0-(-31.3705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -33.20937 + (((tickAnim - 0) / 3) * (32.87268-(-33.20937)));
            yy = -4.67948 + (((tickAnim - 0) / 3) * (-12.39441-(-4.67948)));
            zz = -7.10386 + (((tickAnim - 0) / 3) * (53.88847-(-7.10386)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 32.87268 + (((tickAnim - 3) / 1) * (-18.22944-(32.87268)));
            yy = -12.39441 + (((tickAnim - 3) / 1) * (8.18434-(-12.39441)));
            zz = 53.88847 + (((tickAnim - 3) / 1) * (34.57228-(53.88847)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -18.22944 + (((tickAnim - 4) / 1) * (1.72411-(-18.22944)));
            yy = 8.18434 + (((tickAnim - 4) / 1) * (0.7268-(8.18434)));
            zz = 34.57228 + (((tickAnim - 4) / 1) * (21.59026-(34.57228)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.72411 + (((tickAnim - 5) / 3) * (-7.53924-(1.72411)));
            yy = 0.7268 + (((tickAnim - 5) / 3) * (-17.39599-(0.7268)));
            zz = 21.59026 + (((tickAnim - 5) / 3) * (20.90054-(21.59026)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.53924 + (((tickAnim - 8) / 2) * (-33.20937-(-7.53924)));
            yy = -17.39599 + (((tickAnim - 8) / 2) * (-4.67948-(-17.39599)));
            zz = 20.90054 + (((tickAnim - 8) / 2) * (-7.10386-(20.90054)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 0) / 4) * (-0.475-(1.15)));
            zz = 0.025 + (((tickAnim - 0) / 4) * (0-(0.025)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.475 + (((tickAnim - 4) / 2) * (-0.325-(-0.475)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 6) / 2) * (0.38-(-0.325)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.38 + (((tickAnim - 8) / 0) * (1.48-(0.38)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.48 + (((tickAnim - 8) / 1) * (1.72-(1.48)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.72 + (((tickAnim - 9) / 1) * (0.95-(1.72)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48))*3), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-170))*15), hips.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*8));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48))*-2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-30))*15), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-60))*14));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48))*-1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-10))*12), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*-8));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+30))*18), neck.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*6));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48))*-20), head.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48+60))*6));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-100))*18), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-80))*25), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450/0.63-100))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-200))*35), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*345/0.48-250))*40), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraArchaeothyris entityArchaeothyris = (EntityPrehistoricFloraArchaeothyris) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraArchaeothyris e = (EntityPrehistoricFloraArchaeothyris) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
