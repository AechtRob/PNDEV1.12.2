package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOrthocormus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Maxilla;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer TailFin;
    private final AdvancedModelRenderer PectoralFinL2;
    private final AdvancedModelRenderer PectoralFinR2;
    private final AdvancedModelRenderer PectoralFinL;
    private final AdvancedModelRenderer PectoralFinR;
    private final AdvancedModelRenderer GillL;
    private final AdvancedModelRenderer GillL2;

    private ModelAnimator animator;

    public ModelOrthocormus() {
        this.textureWidth = 73;
        this.textureHeight = 69;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 27.0F, 5.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -6.25F, -13.0F);
        this.Root.addChild(Head);
        this.setRotateAngle(Head, 0.0F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0916F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 37, -2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.0F, -4.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2051F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 42, -2.5F, 0.0F, 0.0F, 5, 3, 5, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Head.addChild(head2);
        this.setRotateAngle(head2, -0.3491F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 28, 61, -2.0F, -1.0F, -3.0F, 4, 1, 3, -0.001F, false));
        this.head2.cubeList.add(new ModelBox(head2, 55, 59, -2.0F, -1.8F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -0.75F, -2.5F);
        this.head2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 0, -0.125F, -0.5F, -0.325F, 1, 1, 1, 0.001F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 0, 3.125F, -0.5F, -0.325F, 1, 1, 1, 0.001F, false));

        this.Maxilla = new AdvancedModelRenderer(this);
        this.Maxilla.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.head2.addChild(Maxilla);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.55F, 0.0F, 0.0F);
        this.Maxilla.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1327F, -0.1278F, 0.0721F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 16, 0.0F, -3.0F, 0.7F, 0, 2, 2, 0.001F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 0, 0.025F, -3.0F, 0.7F, 0, 2, 2, 0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.55F, 0.0F, 0.0F);
        this.Maxilla.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1327F, 0.1278F, -0.0721F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 0, -0.025F, -3.0F, 0.7F, 0, 2, 2, 0.001F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 16, 0.0F, -3.0F, 0.7F, 0, 2, 2, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.95F, 0.0F, 0.0F);
        this.Maxilla.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1327F, -0.1278F, 0.0285F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 63, 0, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.95F, 0.0F, 0.0F);
        this.Maxilla.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1327F, 0.1278F, -0.0285F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 0, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.75F, 0.25F);
        this.head2.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 59, 44, -2.0F, -0.7863F, -2.0817F, 4, 1, 3, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.2137F, -2.0817F);
        this.Jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0873F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 48, 36, -1.5F, -1.0F, -2.0F, 3, 1, 2, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.25F, -1.0F, 1.0F);
        this.jaw2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, -0.1571F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.1F, -0.3F, -3.6F, 0, 1, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.25F, -1.0F, 1.0F);
        this.jaw2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.1571F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.1F, -0.3F, -3.6F, 0, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.jaw2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 21, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1309F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.jaw3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0305F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 0, -1.0F, -1.0F, 0.0F, 3, 1, 5, -0.002F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -1.75F, -3.0F);
        this.head2.addChild(forehead);
        this.setRotateAngle(forehead, 0.6109F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 38, 21, -2.0F, 0.0F, 0.0F, 4, 1, 1, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0F, 1.0F);
        this.forehead.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3927F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 42, -2.0F, -1.0F, 0.0F, 4, 2, 2, -0.001F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.head2.addChild(snout);
        this.setRotateAngle(snout, 0.2182F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 9, 56, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 1.0F, -2.0F);
        this.snout.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, -0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 43, 51, 0.25F, -0.6F, -0.7F, 0, 1, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 1.0F, -2.0F);
        this.snout.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.1745F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 51, -0.25F, -0.6F, -0.7F, 0, 1, 4, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.snout.addChild(nose);
        this.setRotateAngle(nose, 0.3447F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 30, 42, -1.0F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 0, 6, -1.0F, 0.0F, 1.3F, 2, 1, 1, -0.001F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Head.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 19, 0, -3.0F, -4.0F, 0.0F, 6, 7, 8, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 32, -3.0F, 2.5F, 0.0F, 6, 1, 8, -0.001F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 19, 16, -2.5F, -4.0F, 0.0F, 5, 7, 8, -0.001F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 29, 32, -2.5F, 2.5F, 0.0F, 5, 1, 8, -0.002F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.25F, 7.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 42, -2.0F, -3.25F, 0.0F, 4, 7, 6, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 46, 59, 0.0F, -9.25F, 2.0F, 0, 6, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -3.75F, 0.0F);
        this.Body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0785F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 51, -1.5F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body3.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 41, 9, -1.5F, -2.0F, -1.0F, 3, 4, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.0F, 6.0F);
        this.Tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2269F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 21, -1.0F, -2.0F, -7.0F, 2, 2, 7, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 42, 0.0F, 0.0F, -7.0F, 0, 4, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.25F, -1.0F);
        this.Tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1265F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 51, -1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.75F, 5.75F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 16, 55, -1.0F, -1.0F, 0.0F, 2, 3, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.0F, 5.0F);
        this.Tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1484F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 32, -0.5F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.Tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1091F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 56, -0.5F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.TailFin = new AdvancedModelRenderer(this);
        this.TailFin.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.Tail2.addChild(TailFin);
        this.TailFin.cubeList.add(new ModelBox(TailFin, 62, 15, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));
        this.TailFin.cubeList.add(new ModelBox(TailFin, 0, 0, 0.0F, -10.0F, 1.0F, 0, 20, 9, 0.0F, false));
        this.TailFin.cubeList.add(new ModelBox(TailFin, 48, 5, 0.5F, 0.0F, 0.0F, 2, 0, 3, 0.001F, false));
        this.TailFin.cubeList.add(new ModelBox(TailFin, 48, 5, -2.5F, 0.0F, 0.0F, 2, 0, 3, 0.0F, true));

        this.PectoralFinL2 = new AdvancedModelRenderer(this);
        this.PectoralFinL2.setRotationPoint(3.0F, 3.5F, 6.0F);
        this.Body.addChild(PectoralFinL2);
        this.setRotateAngle(PectoralFinL2, 0.0F, 0.0F, 1.0036F);
        this.PectoralFinL2.cubeList.add(new ModelBox(PectoralFinL2, 58, 21, 0.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.PectoralFinR2 = new AdvancedModelRenderer(this);
        this.PectoralFinR2.setRotationPoint(-3.0F, 3.5F, 6.0F);
        this.Body.addChild(PectoralFinR2);
        this.setRotateAngle(PectoralFinR2, 0.0F, 0.0F, -1.0036F);
        this.PectoralFinR2.cubeList.add(new ModelBox(PectoralFinR2, 58, 21, -5.0F, 0.0F, 0.0F, 5, 0, 3, 0.0F, true));

        this.PectoralFinL = new AdvancedModelRenderer(this);
        this.PectoralFinL.setRotationPoint(2.5F, 1.5F, -1.0F);
        this.Head.addChild(PectoralFinL);
        this.setRotateAngle(PectoralFinL, 0.0F, 0.0F, 0.1309F);
        this.PectoralFinL.cubeList.add(new ModelBox(PectoralFinL, 40, 0, -1.0F, 0.01F, 0.0F, 7, 0, 4, 0.0F, true));
        this.PectoralFinL.cubeList.add(new ModelBox(PectoralFinL, 48, 31, -1.0F, 0.0F, 0.0F, 7, 0, 4, 0.001F, false));

        this.PectoralFinR = new AdvancedModelRenderer(this);
        this.PectoralFinR.setRotationPoint(-2.5F, 1.5F, -1.0F);
        this.Head.addChild(PectoralFinR);
        this.setRotateAngle(PectoralFinR, 0.0F, 0.0F, -0.1309F);
        this.PectoralFinR.cubeList.add(new ModelBox(PectoralFinR, 48, 31, -6.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, true));
        this.PectoralFinR.cubeList.add(new ModelBox(PectoralFinR, 40, 0, -6.0F, 0.01F, 0.0F, 7, 0, 4, 0.0F, false));

        this.GillL = new AdvancedModelRenderer(this);
        this.GillL.setRotationPoint(2.0F, -0.5F, -4.0F);
        this.Head.addChild(GillL);
        this.setRotateAngle(GillL, 0.0F, 0.1527F, 0.0F);
        this.GillL.cubeList.add(new ModelBox(GillL, 55, 5, -1.5F, -2.0F, 0.0F, 2, 4, 5, 0.0F, false));

        this.GillL2 = new AdvancedModelRenderer(this);
        this.GillL2.setRotationPoint(-2.0F, -0.5F, -4.0F);
        this.Head.addChild(GillL2);
        this.setRotateAngle(GillL2, 0.0F, -0.1527F, 0.0F);
        this.GillL2.cubeList.add(new ModelBox(GillL2, 55, 5, -0.5F, -2.0F, 0.0F, 2, 4, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(TailFin, 0.0F, 0.1F, 0.0F);
        this.Root.offsetY = -0.18F;
        this.Root.offsetX = 0.0F;
        this.Root.offsetZ = -0.27F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Head, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(Maxilla, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Tail2, 0.F, -0.1F, 0.0F);
        this.setRotateAngle(TailFin, 0.0F, -0.05F, 0.0F);
        this.Root.offsetY = -0.25F;
        this.Root.render(0.01F);
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

        //this.Body.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Tail, this.Tail2, this.TailFin};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.35F * still, -0.85, f2, 0.5F * still);
            this.swing(Root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralFinL, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralFinL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(PectoralFinR, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralFinR, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(PectoralFinL2, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PectoralFinL2, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(PectoralFinR2, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PectoralFinR2, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.Root.rotateAngleZ = -(float) Math.toRadians(90);
            this.Root.offsetY = -0.3F;
            //this.Root.offsetX = 0.7F;
            this.bob(Root, -speed * 3.2F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 2.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 2.7F, 0.1F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Cephalon, 0,0,-0.5F);
       // animator.rotate(this.Cephalon, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
       // animator.rotate(this.maxillae, -(float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Maxilla, -(float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, -(float) Math.toRadians(-52.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

