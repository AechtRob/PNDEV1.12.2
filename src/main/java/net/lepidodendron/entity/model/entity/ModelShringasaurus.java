package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraShringasaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelShringasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Shringasaurus;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended RLeg;
    private final AdvancedModelRendererExtended RLeg2;
    private final AdvancedModelRendererExtended RFoot;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended LLeg;
    private final AdvancedModelRendererExtended LLeg2;
    private final AdvancedModelRendererExtended LFoot;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended shoulder;
    private final AdvancedModelRendererExtended RArm;
    private final AdvancedModelRendererExtended RArm2;
    private final AdvancedModelRendererExtended RHand;
    private final AdvancedModelRendererExtended LArm;
    private final AdvancedModelRendererExtended LArm2;
    private final AdvancedModelRendererExtended LHand;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Neck3;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;

    private ModelAnimator animator;

    public ModelShringasaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Shringasaurus = new AdvancedModelRendererExtended(this);
        this.Shringasaurus.setRotationPoint(0.0F, 6.0F, -11.0F);
        this.setRotateAngle(Shringasaurus, -0.0436F, 0.0F, 0.0F);


        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.Shringasaurus.addChild(Body2);
        this.setRotateAngle(Body2, -0.2182F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 32, -4.5F, -5.5F, 0.0F, 9, 11, 12, -0.01F, false));

        this.RLeg = new AdvancedModelRendererExtended(this);
        this.RLeg.setRotationPoint(3.0F, 0.0F, 6.0F);
        this.Body2.addChild(RLeg);
        this.setRotateAngle(RLeg, -0.4129F, -0.4421F, -0.1803F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 0, 76, -1.0F, -2.0F, -3.5F, 5, 8, 7, 0.0F, false));

        this.RLeg2 = new AdvancedModelRendererExtended(this);
        this.RLeg2.setRotationPoint(1.5F, 4.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.7854F, 0.0F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 52, 82, -2.0F, 0.0F, -3.5F, 4, 11, 6, -0.01F, false));

        this.RFoot = new AdvancedModelRendererExtended(this);
        this.RFoot.setRotationPoint(0.0F, 11.5F, 0.0F);
        this.RLeg2.addChild(RFoot);
        this.setRotateAngle(RFoot, -0.0698F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.RFoot.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0262F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 67, -3.0F, -2.0F, -8.5F, 6, 3, 11, 0.0F, false));

        this.LLeg = new AdvancedModelRendererExtended(this);
        this.LLeg.setRotationPoint(-3.0F, 0.0F, 6.0F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, -0.4129F, 0.4421F, 0.1803F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 0, 76, -4.0F, -2.0F, -3.5F, 5, 8, 7, 0.0F, true));

        this.LLeg2 = new AdvancedModelRendererExtended(this);
        this.LLeg2.setRotationPoint(-1.5F, 4.0F, 0.0F);
        this.LLeg.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.7854F, 0.0F, 0.0F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 52, 82, -2.0F, 0.0F, -3.5F, 4, 11, 6, -0.01F, true));

        this.LFoot = new AdvancedModelRendererExtended(this);
        this.LFoot.setRotationPoint(0.0F, 11.5F, 0.0F);
        this.LLeg2.addChild(LFoot);
        this.setRotateAngle(LFoot, -0.0698F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.LFoot.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0262F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 67, -3.0F, -2.0F, -8.5F, 6, 3, 11, 0.0F, true));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, -1.0F, 10.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, -0.1309F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 56, -3.0F, -4.0F, 0.0F, 6, 7, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, -0.5F, 10.5F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.1309F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 59, 0, -2.0F, -2.5F, 0.0F, 4, 5, 12, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1745F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 25, 78, -1.5F, -1.5F, 0.0F, 3, 3, 10, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.1745F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 73, 82, -1.0F, -1.0F, 0.0F, 2, 2, 10, -0.01F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 0.5F, -15.0F);
        this.Body2.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -6.0F, -6.0F, 0.0F, 12, 14, 17, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 62, 57, -4.5F, 0.0F, 0.0F, 9, 1, 8, 0.0F, false));

        this.shoulder = new AdvancedModelRendererExtended(this);
        this.shoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addChild(shoulder);
        this.shoulder.cubeList.add(new ModelBox(shoulder, 43, 32, -5.0F, -7.0F, -7.0F, 10, 15, 9, 0.0F, false));

        this.RArm = new AdvancedModelRendererExtended(this);
        this.RArm.setRotationPoint(4.0F, 4.5F, -2.0F);
        this.shoulder.addChild(RArm);
        this.setRotateAngle(RArm, 0.8484F, 0.4289F, 0.0949F);
        this.RArm.cubeList.add(new ModelBox(RArm, 90, 76, -1.0F, -1.5F, -3.0F, 4, 9, 6, 0.0F, false));

        this.RArm2 = new AdvancedModelRendererExtended(this);
        this.RArm2.setRotationPoint(1.0F, 5.0F, 0.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, -0.6109F, 0.0F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 0, 92, -2.0F, 0.5F, -2.5F, 4, 10, 5, -0.01F, false));

        this.RHand = new AdvancedModelRendererExtended(this);
        this.RHand.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, -0.48F, 0.0F);
        this.RHand.cubeList.add(new ModelBox(RHand, 42, 0, -3.0F, -0.5F, -6.0F, 6, 3, 8, 0.0F, false));

        this.LArm = new AdvancedModelRendererExtended(this);
        this.LArm.setRotationPoint(-4.0F, 4.5F, -2.0F);
        this.shoulder.addChild(LArm);
        this.setRotateAngle(LArm, 0.8484F, -0.4289F, -0.0949F);
        this.LArm.cubeList.add(new ModelBox(LArm, 90, 76, -3.0F, -1.5F, -3.0F, 4, 9, 6, 0.0F, true));

        this.LArm2 = new AdvancedModelRendererExtended(this);
        this.LArm2.setRotationPoint(-1.0F, 5.0F, 0.0F);
        this.LArm.addChild(LArm2);
        this.setRotateAngle(LArm2, -0.6109F, 0.0F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 0, 92, -2.0F, 0.5F, -2.5F, 4, 10, 5, -0.01F, true));

        this.LHand = new AdvancedModelRendererExtended(this);
        this.LHand.setRotationPoint(0.0F, 10.5F, 0.0F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.0F, 0.48F, 0.0F);
        this.LHand.cubeList.add(new ModelBox(LHand, 42, 0, -3.0F, -0.5F, -6.0F, 6, 3, 8, 0.0F, true));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.shoulder.addChild(Neck);
        this.setRotateAngle(Neck, -0.2182F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 37, 57, -3.5F, -6.0F, -10.0F, 7, 10, 10, -0.01F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, -6.0F, -10.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, 0.1745F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 73, 18, -3.0F, 0.5F, -7.0F, 6, 9, 8, 0.0F, false));

        this.Neck3 = new AdvancedModelRendererExtended(this);
        this.Neck3.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.1745F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 82, 36, -2.5F, 0.5F, -6.0F, 5, 7, 7, -0.01F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 4.0F, -5.0F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2182F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -2.0F, -3.0F, -4.0F, 4, 4, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 25, 56, -1.0F, -2.0F, -8.0F, 2, 3, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 42, 12, -1.0F, 0.48F, -7.5F, 2, 1, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.9838F, -4.4142F, -3.3081F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0867F, 0.1311F, 0.0038F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 76, -1.1375F, -0.0888F, -3.3291F, 1, 1, 3, -0.01F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.9838F, -4.4142F, -3.3081F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0867F, -0.1311F, -0.0038F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 78, 0.1375F, -0.0888F, -3.3291F, 1, 1, 3, -0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(2.0F, -2.0F, -3.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2601F, 0.1324F, -0.0114F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 0, -1.1F, -2.5F, -2.0F, 1, 3, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-2.0F, -2.0F, -3.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2601F, -0.1324F, 0.0114F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 32, 0.1F, -2.5F, -2.0F, 1, 3, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(2.0F, -3.0F, -4.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.2513F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 56, -1.0F, 1.0F, -4.0F, 1, 3, 4, -0.01F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2513F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 40, -1.0F, 0.0F, -3.98F, 2, 1, 2, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 40, -1.5F, 0.0F, -2.0F, 3, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-2.0F, -3.0F, -4.0F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2513F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 56, 0.0F, 1.0F, -4.0F, 1, 3, 4, -0.01F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 9, -2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 59, 18, -1.0F, 0.0F, -7.0F, 2, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 73, 36, -1.5F, -2.0F, -2.0F, 3, 2, 2, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 69, 21, -1.0F, -0.5F, -6.5F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.171F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 32, -1.5F, -1.0F, -5.9F, 3, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(2.0F, -1.0F, -3.0F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2513F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 60, -1.0F, 1.0F, -4.0F, 1, 1, 4, -0.01F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-2.0F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2513F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 60, 0.0F, -1.0F, -4.0F, 1, 1, 4, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Shringasaurus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Neck2.offsetY = 0F;
        this.Neck2.offsetX = 0F;
        this.Neck2.offsetZ = 0.095F;
        this.Neck2.render(0.01F);
        resetToDefaultPose();

    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0262F);
        this.setRotateAngle(cube_r10, 0.0F, -0.2513F, 0.0F);
        this.setRotateAngle(cube_r11, -0.171F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.2513F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, -0.2513F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.0262F);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0867F, 0.1311F, 0.0038F);
        this.setRotateAngle(cube_r5, -0.0867F, -0.1311F, -0.0038F);
        this.setRotateAngle(cube_r6, 0.2601F, 0.1324F, -0.0114F);
        this.setRotateAngle(cube_r7, 0.2601F, -0.1324F, 0.0114F);
        this.setRotateAngle(cube_r8, 0.0F, 0.2513F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2513F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(LArm, 1.5029F, -0.4289F, -0.0949F);
        this.setRotateAngle(LArm2, -1.789F, 0.0F, 0.0F);
        this.setRotateAngle(LFoot, -0.3752F, 0.0F, 0.0F);
        this.setRotateAngle(LHand, 0.7418F, 0.48F, 0.0F);
        this.setRotateAngle(LLeg, 0.0671F, 0.4421F, 0.1803F);
        this.setRotateAngle(LLeg2, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(Neck2, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Neck3, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(RArm, 1.2411F, 0.4289F, 0.0949F);
        this.setRotateAngle(RArm2, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(RFoot, 0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(RHand, -0.0436F, -0.48F, 0.0873F);
        this.setRotateAngle(RLeg, -0.4129F, -0.4421F, -0.1803F);
        this.setRotateAngle(RLeg2, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(Shringasaurus, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, -0.1309F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.1309F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail3, 0.1745F, -0.1309F, 0.0F);
        this.setRotateAngle(Tail4, 0.1745F, -0.1745F, 0.0F);
        this.Shringasaurus.offsetY = -0.1F;
        this.Shringasaurus.render(0.01F);
        resetToDefaultPose();

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
        //this.Shringasaurus.offsetY = 0.56F;

        EntityPrehistoricFloraShringasaurus Shringasaurus = (EntityPrehistoricFloraShringasaurus) e;
        float masterSpeed = Shringasaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail, this.Tail2, this.Tail3};
        AdvancedModelRendererExtended[] NeckFull = {this.Neck, this.Neck2, this.Neck3};
        Shringasaurus.tailBuffer.applyChainSwingBuffer(Tail);

        // || (Shringasaurus.moveStrafing == 0 && Shringasaurus.moveVertical == 0 && Shringasaurus.moveForward == 0)

        if (Shringasaurus.getAnimation() == Shringasaurus.LAY_ANIMATION) {
            this.chainSwing(NeckFull, 0.5F, 0.01F, 0.2F, f2, 0.8F);
            this.chainWave(NeckFull, 0.5F * 0.2F, 0.02F, 0.1F, f2, 0.8F);
            //this.walk(Leftupperarm, 0.6F, 0.40F, true, 5, 0.30F, f2, 1F);
            //this.walk(Rightupperarm, 0.6F, 0.40F, true, 8, 0.30F, f2, 1F);
            //this.walk(Leftlowerarm, 0.6F, 0.25F, true, 6, 0F, f2, 1F);
            //this.walk(Rightlowerarm, 0.6F, 0.25F, true, 9, 0F, f2, 1F);
            //this.walk(Leftfrontfoot, 0.6F, 0.30F, true, 2, -0.10F, f2, 1F);
            //this.walk(Rightfrontfoot, 0.6F, 0.30F, true, 5, -0.10F, f2, 1F);
            return;
        }

        if (f3 == 0.0F || !Shringasaurus.getIsMoving() || Shringasaurus.getAnimation() == Shringasaurus.DRINK_ANIMATION) { //Not moving
            this.chainSwing(NeckFull, 0.5F, 0.01F, 0.2F, f2, 0.8F);
            this.chainWave(NeckFull, 0.5F * 0.2F, 0.02F, 0.1F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Shringasaurus.getIsFast()) {
            speed = speed * 2;
        }

        this.RArm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.LArm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.RLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.LLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(RArm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(LArm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(RLeg, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(LLeg, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(RArm, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(LArm, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(RLeg, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(LLeg, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(RArm2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(LArm2, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(RLeg2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(LLeg2, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(RArm2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(LArm2, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(RLeg2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(LLeg2, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(RHand, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(LHand, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(RFoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(LFoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Body2, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(Body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(Body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(shoulder, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(shoulder, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.chainSwing(NeckFull, speed, 0.02F, 0.2F, f2, 0.8F);
        this.chainWave(NeckFull, speed * 0.2F, 0.1F, 0.1F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Shringasaurus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraShringasaurus e = (EntityPrehistoricFloraShringasaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.Body, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.shoulder, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.RArm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LArm, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.RArm2, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LArm2, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.Body, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.shoulder, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.RArm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LArm, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.move(this.Shringasaurus, 0 , 5,0);
        //animator.rotate(this.Tail1, (float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Leftthigh, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Rightthigh, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Leftshin, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Rightshin, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Hips, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);

        animator.setAnimation(e.DRINK_ANIMATION); //120
        animator.startKeyframe(10);
        //animator.rotate(this.Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
