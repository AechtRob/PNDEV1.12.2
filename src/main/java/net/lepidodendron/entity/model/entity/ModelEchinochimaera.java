package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEchinochimaera;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelEchinochimaera extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer malehead;
    private final AdvancedModelRenderer malecube_r1;
    private final AdvancedModelRenderer malecube_r2;
    private final AdvancedModelRenderer malecube_r3;
    private final AdvancedModelRenderer malecube_r4;
    private final AdvancedModelRenderer malecube_r5;
    private final AdvancedModelRenderer hornmale;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer hornmale2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer femalehead;
    private final AdvancedModelRenderer femalecube_r1;
    private final AdvancedModelRenderer femalecube_r2;
    private final AdvancedModelRenderer femalecube_r3;
    private final AdvancedModelRenderer femalecube_r4;
    private final AdvancedModelRenderer femalecube_r5;
    private final AdvancedModelRenderer femalecube_r6;
    private final AdvancedModelRenderer femalehorn;
    private final AdvancedModelRenderer femalecube_r7;
    private final AdvancedModelRenderer femalehorn2;
    private final AdvancedModelRenderer femalecube_r8;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer femalejaw;
    private final AdvancedModelRenderer femalejaw_r1;
    private final AdvancedModelRenderer femalejaw_r2;
    private final AdvancedModelRenderer malejaw;
    private final AdvancedModelRenderer malejaw_r1;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer malebody;
    private final AdvancedModelRenderer malecube_r6;
    private final AdvancedModelRenderer malecube_r7;
    private final AdvancedModelRenderer malecube_r8;
    private final AdvancedModelRenderer femalebody;
    private final AdvancedModelRenderer femalecube_r9;
    private final AdvancedModelRenderer femalecube_r10;
    private final AdvancedModelRenderer femalecube_r11;
    private final AdvancedModelRenderer dorsalmale;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer dorsalfemale;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer dorsalfemale2;
    private final AdvancedModelRenderer tailfemale;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backleftfinfemale;
    private final AdvancedModelRenderer backrightfinfemale;
    private final AdvancedModelRenderer tailfemale2;
    private final AdvancedModelRenderer tailfemale3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tailmale;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tailmale2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tailmale3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tailmale4;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer horn2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer dorsalmale2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer backleftfinmale;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backrightfinmale;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;

    public ModelEchinochimaera() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.25F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -11.95F, -3.25F, 4, 5, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -12.7F, -0.2F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1789F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -1.0F, -0.0221F, 0.012F, 3, 1, 4, -0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.0042F, -10.4882F, -3.0194F);
        this.body.addChild(head);


        this.malehead = new AdvancedModelRenderer(this);
        this.malehead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(malehead);


        this.malecube_r1 = new AdvancedModelRenderer(this);
        this.malecube_r1.setRotationPoint(0.0042F, -1.8118F, -2.6556F);
        this.malehead.addChild(malecube_r1);
        this.setRotateAngle(malecube_r1, 0.0262F, 0.0F, 0.0F);
        this.malecube_r1.cubeList.add(new ModelBox(malecube_r1, 34, 34, -1.5F, -0.0087F, 0.0155F, 3, 3, 3, -0.001F, false));

        this.malecube_r2 = new AdvancedModelRenderer(this);
        this.malecube_r2.setRotationPoint(-0.4958F, 3.2382F, -0.6806F);
        this.malehead.addChild(malecube_r2);
        this.setRotateAngle(malecube_r2, 0.0436F, 0.0F, 0.0F);
        this.malecube_r2.cubeList.add(new ModelBox(malecube_r2, 47, 37, -1.0F, -1.4F, -1.0F, 3, 2, 2, -0.01F, false));

        this.malecube_r3 = new AdvancedModelRenderer(this);
        this.malecube_r3.setRotationPoint(0.0042F, 2.4882F, -1.4806F);
        this.malehead.addChild(malecube_r3);
        this.setRotateAngle(malecube_r3, 0.1745F, 0.0F, 0.0F);
        this.malecube_r3.cubeList.add(new ModelBox(malecube_r3, 23, 0, -1.5F, -2.6F, -2.75F, 3, 3, 5, 0.001F, false));

        this.malecube_r4 = new AdvancedModelRenderer(this);
        this.malecube_r4.setRotationPoint(0.0042F, 0.4189F, -4.6388F);
        this.malehead.addChild(malecube_r4);
        this.setRotateAngle(malecube_r4, -0.6545F, 0.0F, 0.0F);
        this.malecube_r4.cubeList.add(new ModelBox(malecube_r4, 51, 9, -1.5F, -2.9887F, 0.9758F, 3, 3, 1, -0.01F, false));

        this.malecube_r5 = new AdvancedModelRenderer(this);
        this.malecube_r5.setRotationPoint(0.0042F, 0.4189F, -4.6388F);
        this.malehead.addChild(malecube_r5);
        this.setRotateAngle(malecube_r5, -0.7374F, 0.0F, 0.0F);
        this.malecube_r5.cubeList.add(new ModelBox(malecube_r5, 51, 9, -1.5F, -2.9887F, -0.0242F, 3, 3, 1, 0.0F, false));

        this.hornmale = new AdvancedModelRenderer(this);
        this.hornmale.setRotationPoint(0.0042F, -1.1118F, -0.4806F);
        this.malehead.addChild(hornmale);
        this.setRotateAngle(hornmale, 0.1309F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.4864F, -1.9719F);
        this.hornmale.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.3875F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.425F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.75F, -0.5579F, -1.391F);
        this.hornmale.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9076F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.0F, -0.55F, -0.575F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.0073F, 0.3721F);
        this.hornmale.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.637F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.3F, -0.9F, -1.675F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hornmale.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0785F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 1, 1.0F, -1.475F, -0.05F, 0, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.475F, -1.2565F, 0.3525F);
        this.hornmale.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4625F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.3F, -0.725F, 0, 1, 1, 0.0F, false));

        this.hornmale2 = new AdvancedModelRenderer(this);
        this.hornmale2.setRotationPoint(0.0042F, -1.1118F, -0.4806F);
        this.malehead.addChild(hornmale2);
        this.setRotateAngle(hornmale2, 0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.4864F, -1.9719F);
        this.hornmale2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.3875F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 1, -0.425F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.75F, -0.5579F, -1.391F);
        this.hornmale2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9076F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 1, 0.0F, -0.55F, -0.575F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -1.0073F, 0.3721F);
        this.hornmale2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.637F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 1, 1, -0.3F, -0.9F, -1.675F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hornmale2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0785F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 1, 1, -1.0F, -1.475F, -0.05F, 0, 2, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.475F, -1.2565F, 0.3525F);
        this.hornmale2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4625F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.5F, -0.3F, -0.725F, 0, 1, 1, 0.0F, true));

        this.femalehead = new AdvancedModelRenderer(this);
        this.femalehead.setRotationPoint(0.0042F, 0.2861F, -4.327F);
        this.head.addChild(femalehead);


        this.femalecube_r1 = new AdvancedModelRenderer(this);
        this.femalecube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.femalehead.addChild(femalecube_r1);
        this.setRotateAngle(femalecube_r1, 0.0F, 0.0F, 0.0F);
        this.femalecube_r1.cubeList.add(new ModelBox(femalecube_r1, 15, 25, -1.5F, -0.0116F, 0.3682F, 3, 2, 4, 0.001F, false));

        this.femalecube_r2 = new AdvancedModelRenderer(this);
        this.femalecube_r2.setRotationPoint(0.0F, 1.4411F, 1.2626F);
        this.femalehead.addChild(femalecube_r2);
        this.setRotateAngle(femalecube_r2, 0.1745F, 0.0F, 0.0F);
        this.femalecube_r2.cubeList.add(new ModelBox(femalecube_r2, 49, 22, -1.5F, -0.5F, -1.0F, 3, 1, 2, -0.02F, false));

        this.femalecube_r3 = new AdvancedModelRenderer(this);
        this.femalecube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.femalehead.addChild(femalecube_r3);
        this.setRotateAngle(femalecube_r3, 0.1745F, 0.0F, 0.0F);
        this.femalecube_r3.cubeList.add(new ModelBox(femalecube_r3, 16, 0, -1.5F, 0.0134F, -0.0068F, 3, 2, 2, -0.002F, false));

        this.femalecube_r4 = new AdvancedModelRenderer(this);
        this.femalecube_r4.setRotationPoint(-0.5F, 2.9521F, 3.6463F);
        this.femalehead.addChild(femalecube_r4);
        this.setRotateAngle(femalecube_r4, -0.1745F, 0.0F, 0.0F);
        this.femalecube_r4.cubeList.add(new ModelBox(femalecube_r4, 47, 17, -1.0F, -1.4F, -1.075F, 3, 2, 2, -0.01F, false));

        this.femalecube_r5 = new AdvancedModelRenderer(this);
        this.femalecube_r5.setRotationPoint(0.0F, -1.45F, 1.35F);
        this.femalehead.addChild(femalecube_r5);
        this.setRotateAngle(femalecube_r5, -0.7418F, 0.0F, 0.0F);
        this.femalecube_r5.cubeList.add(new ModelBox(femalecube_r5, 24, 46, -1.5F, -0.0116F, -0.0105F, 3, 2, 2, 0.0F, false));

        this.femalecube_r6 = new AdvancedModelRenderer(this);
        this.femalecube_r6.setRotationPoint(0.0F, -1.2979F, 3.8463F);
        this.femalehead.addChild(femalecube_r6);
        this.setRotateAngle(femalecube_r6, 0.3054F, 0.0F, 0.0F);
        this.femalecube_r6.cubeList.add(new ModelBox(femalecube_r6, 12, 38, -1.5F, -0.925F, -2.325F, 3, 3, 3, -0.001F, false));

        this.femalehorn = new AdvancedModelRenderer(this);
        this.femalehorn.setRotationPoint(0.0F, -2.2007F, 2.5287F);
        this.femalehead.addChild(femalehorn);
        this.setRotateAngle(femalehorn, -0.6545F, 0.0F, 0.0F);


        this.femalecube_r7 = new AdvancedModelRenderer(this);
        this.femalecube_r7.setRotationPoint(0.0F, -1.0972F, 1.5676F);
        this.femalehorn.addChild(femalecube_r7);
        this.setRotateAngle(femalecube_r7, 0.3054F, 0.0F, 0.0F);
        this.femalecube_r7.cubeList.add(new ModelBox(femalecube_r7, 8, 13, 1.0F, -0.6F, -2.15F, 0, 2, 1, 0.0F, false));

        this.femalehorn2 = new AdvancedModelRenderer(this);
        this.femalehorn2.setRotationPoint(0.0F, -2.2007F, 2.5287F);
        this.femalehead.addChild(femalehorn2);
        this.setRotateAngle(femalehorn2, -0.6545F, 0.0F, 0.0F);


        this.femalecube_r8 = new AdvancedModelRenderer(this);
        this.femalecube_r8.setRotationPoint(0.0F, -1.0972F, 1.5676F);
        this.femalehorn2.addChild(femalecube_r8);
        this.setRotateAngle(femalecube_r8, 0.3054F, 0.0F, 0.0F);
        this.femalecube_r8.cubeList.add(new ModelBox(femalecube_r8, 8, 13, -1.0F, -0.6F, -2.15F, 0, 2, 1, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(2.1792F, -0.3618F, -1.7306F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.2182F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 29, 51, -1.525F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 28, 17, -1.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-2.1708F, -0.3618F, -1.7306F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.2182F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 29, 51, 0.525F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 28, 17, 0.475F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.femalejaw = new AdvancedModelRenderer(this);
        this.femalejaw.setRotationPoint(0.0042F, 2.2808F, -1.5559F);
        this.head.addChild(femalejaw);


        this.femalejaw_r1 = new AdvancedModelRenderer(this);
        this.femalejaw_r1.setRotationPoint(0.0F, 0.9628F, -0.982F);
        this.femalejaw.addChild(femalejaw_r1);
        this.setRotateAngle(femalejaw_r1, -0.144F, 0.0F, 0.0F);
        this.femalejaw_r1.cubeList.add(new ModelBox(femalejaw_r1, 50, 42, -1.0F, -0.775F, -1.025F, 2, 1, 2, -0.001F, false));

        this.femalejaw_r2 = new AdvancedModelRenderer(this);
        this.femalejaw_r2.setRotationPoint(0.0F, -0.0426F, -0.1247F);
        this.femalejaw.addChild(femalejaw_r2);
        this.setRotateAngle(femalejaw_r2, 0.0F, 0.0F, 0.0F);
        this.femalejaw_r2.cubeList.add(new ModelBox(femalejaw_r2, 51, 52, -1.0F, 0.0054F, -1.8573F, 2, 1, 2, 0.0F, false));

        this.malejaw = new AdvancedModelRenderer(this);
        this.malejaw.setRotationPoint(0.0042F, 2.9308F, -1.5559F);
        this.head.addChild(malejaw);
        this.setRotateAngle(malejaw, 0.3491F, 0.0F, 0.0F);


        this.malejaw_r1 = new AdvancedModelRenderer(this);
        this.malejaw_r1.setRotationPoint(0.0F, 0.3074F, 0.8753F);
        this.malejaw.addChild(malejaw_r1);
        this.setRotateAngle(malejaw_r1, -0.0436F, 0.0F, 0.0F);
        this.malejaw_r1.cubeList.add(new ModelBox(malejaw_r1, 42, 52, -1.0F, -0.35F, -2.9F, 2, 1, 2, -0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(1.6F, -7.8F, -2.325F);
        this.body.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.1777F, 0.6468F, 0.1078F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 50, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 35, 46, 0.0F, -1.5F, 0.75F, 0, 2, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-1.6F, -7.8F, -2.325F);
        this.body.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.1777F, -0.6468F, -0.1078F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 50, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 35, 46, 0.0F, -1.5F, 0.75F, 0, 2, 4, 0.0F, true));

        this.malebody = new AdvancedModelRenderer(this);
        this.malebody.setRotationPoint(-0.5F, -6.95F, -1.25F);
        this.body.addChild(malebody);


        this.malecube_r6 = new AdvancedModelRenderer(this);
        this.malecube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.malebody.addChild(malecube_r6);
        this.setRotateAngle(malecube_r6, -0.0873F, 0.0F, 0.0F);
        this.malecube_r6.cubeList.add(new ModelBox(malecube_r6, 34, 41, -1.0F, -0.6F, -2.0F, 3, 1, 3, 0.001F, false));

        this.malecube_r7 = new AdvancedModelRenderer(this);
        this.malecube_r7.setRotationPoint(0.0F, -5.05F, 1.25F);
        this.malebody.addChild(malecube_r7);
        this.setRotateAngle(malecube_r7, 0.1309F, 0.0F, 0.0F);
        this.malecube_r7.cubeList.add(new ModelBox(malecube_r7, 0, 42, -1.0F, -0.75F, -3.0F, 3, 1, 3, 0.001F, false));

        this.malecube_r8 = new AdvancedModelRenderer(this);
        this.malecube_r8.setRotationPoint(0.0F, 0.5F, 0.975F);
        this.malebody.addChild(malecube_r8);
        this.setRotateAngle(malecube_r8, 0.1222F, 0.0F, 0.0F);
        this.malecube_r8.cubeList.add(new ModelBox(malecube_r8, 11, 32, -1.0F, -1.0131F, -0.0149F, 3, 1, 4, 0.0F, false));

        this.femalebody = new AdvancedModelRenderer(this);
        this.femalebody.setRotationPoint(-0.5F, -12.0F, 0.0F);
        this.body.addChild(femalebody);


        this.femalecube_r9 = new AdvancedModelRenderer(this);
        this.femalecube_r9.setRotationPoint(0.5F, 5.9401F, -0.2235F);
        this.femalebody.addChild(femalecube_r9);
        this.setRotateAngle(femalecube_r9, 0.2182F, 0.0F, 0.0F);
        this.femalecube_r9.cubeList.add(new ModelBox(femalecube_r9, 31, 28, -1.5F, -0.9997F, -0.0024F, 3, 1, 4, -0.001F, false));

        this.femalecube_r10 = new AdvancedModelRenderer(this);
        this.femalecube_r10.setRotationPoint(0.5F, 5.075F, -1.625F);
        this.femalebody.addChild(femalecube_r10);
        this.setRotateAngle(femalecube_r10, -0.1309F, 0.0F, 0.0F);
        this.femalecube_r10.cubeList.add(new ModelBox(femalecube_r10, 37, 19, -1.5F, -0.325F, -1.5F, 3, 1, 3, 0.0F, false));

        this.femalecube_r11 = new AdvancedModelRenderer(this);
        this.femalecube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.femalebody.addChild(femalecube_r11);
        this.setRotateAngle(femalecube_r11, 0.0436F, 0.0F, 0.0F);
        this.femalecube_r11.cubeList.add(new ModelBox(femalecube_r11, 41, 12, -1.0F, -0.725F, -3.125F, 3, 1, 3, 0.0F, false));

        this.dorsalmale = new AdvancedModelRenderer(this);
        this.dorsalmale.setRotationPoint(-0.5F, -12.7F, -0.275F);
        this.body.addChild(dorsalmale);
        this.setRotateAngle(dorsalmale, -0.1309F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dorsalmale.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 51, 0.0F, -5.5971F, -0.263F, 1, 6, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 45, 0.5F, -5.5221F, 0.737F, 0, 6, 3, 0.0F, false));

        this.dorsalfemale = new AdvancedModelRenderer(this);
        this.dorsalfemale.setRotationPoint(-0.5F, -12.7F, -1.475F);
        this.body.addChild(dorsalfemale);
        this.setRotateAngle(dorsalfemale, -0.4363F, 0.0F, 0.0F);
        this.dorsalfemale.cubeList.add(new ModelBox(dorsalfemale, 25, 36, 0.5F, -4.7822F, -0.1876F, 0, 5, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.dorsalfemale.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 53, 0.0F, -4.5971F, -0.263F, 1, 5, 1, 0.0F, false));

        this.dorsalfemale2 = new AdvancedModelRenderer(this);
        this.dorsalfemale2.setRotationPoint(0.0F, -12.5F, 3.525F);
        this.body.addChild(dorsalfemale2);
        this.setRotateAngle(dorsalfemale2, -0.6981F, 0.0F, 0.0F);
        this.dorsalfemale2.cubeList.add(new ModelBox(dorsalfemale2, 17, 13, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));
        this.dorsalfemale2.cubeList.add(new ModelBox(dorsalfemale2, 17, 45, 0.0F, -4.5F, -0.5F, 0, 5, 3, 0.0F, false));

        this.tailfemale = new AdvancedModelRenderer(this);
        this.tailfemale.setRotationPoint(0.0F, -10.3713F, 3.2969F);
        this.body.addChild(tailfemale);
        this.tailfemale.cubeList.add(new ModelBox(tailfemale, 23, 9, -1.5F, -1.5287F, -0.0469F, 3, 3, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.3949F, 0.5118F);
        this.tailfemale.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4712F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 21, -1.5F, -2.242F, -0.2444F, 3, 2, 4, -0.01F, false));

        this.backleftfinfemale = new AdvancedModelRenderer(this);
        this.backleftfinfemale.setRotationPoint(1.5F, 1.8949F, 0.5118F);
        this.tailfemale.addChild(backleftfinfemale);
        this.setRotateAngle(backleftfinfemale, -0.2867F, 0.4677F, -0.2449F);
        this.backleftfinfemale.cubeList.add(new ModelBox(backleftfinfemale, 44, 30, 0.0F, -1.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.backrightfinfemale = new AdvancedModelRenderer(this);
        this.backrightfinfemale.setRotationPoint(-1.5F, 1.8949F, 0.5118F);
        this.tailfemale.addChild(backrightfinfemale);
        this.setRotateAngle(backrightfinfemale, -0.2867F, -0.4677F, 0.2449F);
        this.backrightfinfemale.cubeList.add(new ModelBox(backrightfinfemale, 44, 30, 0.0F, -1.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.tailfemale2 = new AdvancedModelRenderer(this);
        this.tailfemale2.setRotationPoint(0.0F, -0.4787F, 3.4531F);
        this.tailfemale.addChild(tailfemale2);
        this.setRotateAngle(tailfemale2, 0.0873F, 0.0F, 0.0F);
        this.tailfemale2.cubeList.add(new ModelBox(tailfemale2, 8, 13, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tailfemale3 = new AdvancedModelRenderer(this);
        this.tailfemale3.setRotationPoint(0.0F, -0.4F, 3.65F);
        this.tailfemale2.addChild(tailfemale3);
        this.setRotateAngle(tailfemale3, 0.2618F, 0.0F, 0.0F);
        this.tailfemale3.cubeList.add(new ModelBox(tailfemale3, 43, 42, -0.5F, -0.4523F, 0.1121F, 1, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.0477F, 1.6121F);
        this.tailfemale3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7418F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 33, -0.025F, -2.15F, -0.125F, 0, 3, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0477F, 4.1121F);
        this.tailfemale3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3491F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 13, 0.0F, -1.2F, -1.9F, 0, 4, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0477F, 4.1121F);
        this.tailfemale3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 42, 24, -0.5F, -0.5F, -0.15F, 1, 1, 4, -0.01F, false));

        this.tailmale = new AdvancedModelRenderer(this);
        this.tailmale.setRotationPoint(0.0F, -9.5213F, 3.3719F);
        this.body.addChild(tailmale);
        this.tailmale.cubeList.add(new ModelBox(tailmale, 0, 25, -1.5F, -1.5287F, -0.2969F, 3, 3, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 2.3713F, 0.1031F);
        this.tailmale.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.528F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 48, -0.5F, -0.9029F, -0.0997F, 3, 1, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, -2.5287F, -0.2969F);
        this.tailmale.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3403F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 0, -0.5F, -0.125F, 0.4F, 3, 1, 3, -0.01F, false));

        this.tailmale2 = new AdvancedModelRenderer(this);
        this.tailmale2.setRotationPoint(0.0F, -0.6169F, 3.4949F);
        this.tailmale.addChild(tailmale2);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, -0.9118F, -0.5417F);
        this.tailmale2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 36, 5, 0.5F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tailmale3 = new AdvancedModelRenderer(this);
        this.tailmale3.setRotationPoint(0.0F, -0.4764F, 3.2007F);
        this.tailmale2.addChild(tailmale3);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.8067F, 1.3848F);
        this.tailmale3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.7854F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 13, 0.0F, -0.7F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.0F, -0.8604F, 0.2576F);
        this.tailmale3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 27, 1.5F, 0.3F, -0.6F, 1, 1, 3, 0.0F, false));

        this.tailmale4 = new AdvancedModelRenderer(this);
        this.tailmale4.setRotationPoint(0.0F, -0.5221F, 3.7158F);
        this.tailmale3.addChild(tailmale4);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.0F, -0.3383F, -3.4582F);
        this.tailmale4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 15, 13, 2.0F, -0.7F, 2.7F, 0, 4, 7, -0.001F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 33, 12, 1.5F, 0.3F, 2.35F, 1, 1, 5, -0.001F, false));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(-0.5F, 9.4713F, -3.5469F);
        this.tailmale.addChild(horn);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.3F, -11.3124F, 4.7792F);
        this.horn.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.288F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 1, 1, 0.075F, 0.375F, 0.35F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 1, 1, 0.125F, -0.075F, -0.125F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 1, 1, 0.15F, -0.475F, -0.625F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 1, 1, 0.2F, -0.875F, -1.125F, 0, 1, 1, 0.0F, false));

        this.horn2 = new AdvancedModelRenderer(this);
        this.horn2.setRotationPoint(0.5F, 9.4713F, -3.5469F);
        this.tailmale.addChild(horn2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.3F, -11.3124F, 4.7792F);
        this.horn2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.288F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 1, 1, -0.075F, 0.375F, 0.35F, 0, 1, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 1, 1, -0.125F, -0.075F, -0.125F, 0, 1, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 1, 1, -0.15F, -0.475F, -0.625F, 0, 1, 1, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 1, 1, -0.2F, -0.875F, -1.125F, 0, 1, 1, 0.0F, true));

        this.dorsalmale2 = new AdvancedModelRenderer(this);
        this.dorsalmale2.setRotationPoint(0.5F, -2.5287F, -0.2969F);
        this.tailmale.addChild(dorsalmale2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.0879F, 2.677F);
        this.dorsalmale2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3054F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 45, 1, 0.0F, -1.425F, -2.05F, 0, 3, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -0.25F, 0.5F);
        this.dorsalmale2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3054F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 23, 17, -0.5F, -0.5F, -0.375F, 1, 1, 1, 0.0F, false));

        this.backleftfinmale = new AdvancedModelRenderer(this);
        this.backleftfinmale.setRotationPoint(1.375F, 1.0713F, 0.6031F);
        this.tailmale.addChild(backleftfinmale);
        this.setRotateAngle(backleftfinmale, -0.1745F, 0.0F, -0.7418F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.4863F, 0.8611F);
        this.backleftfinmale.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 28, -0.025F, 0.5932F, -0.4195F, 0, 1, 6, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.1927F, 0.7599F);
        this.backleftfinmale.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3491F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 47, 0.0F, -1.0F, -0.75F, 0, 4, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.backleftfinmale.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1897F, -0.1084F, -0.5133F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 25, -1.25F, -0.3F, -0.5F, 1, 2, 1, 0.0F, false));

        this.backrightfinmale = new AdvancedModelRenderer(this);
        this.backrightfinmale.setRotationPoint(-1.375F, 1.0713F, 0.6031F);
        this.tailmale.addChild(backrightfinmale);
        this.setRotateAngle(backrightfinmale, -0.1745F, 0.0F, 0.7418F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.4863F, 0.8611F);
        this.backrightfinmale.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 24, 28, 0.025F, 0.5932F, -0.4195F, 0, 1, 6, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.1927F, 0.7599F);
        this.backrightfinmale.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3491F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 47, 0.0F, -1.0F, -0.75F, 0, 4, 3, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.backrightfinmale.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.1897F, 0.1084F, 0.5133F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 11, 25, 0.25F, -0.3F, -0.5F, 1, 2, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.body.offsetY = -0.01F;
        this.body.offsetX = 0.01F;
        this.body.offsetZ = 0.13F;
        this.malejaw.rotateAngleX = (float) Math.toRadians(22.5);
        this.body.rotateAngleX = (float) Math.toRadians(0);
        this.body.rotateAngleZ = (float) Math.toRadians(0);
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tailmale, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tailmale2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tailmale3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tailmale4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tailfemale, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tailfemale2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tailfemale3, 0.0F, -0.5F, 0.0F);
        this.root.offsetY = -0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.root.offsetY = 0F;
        EntityPrehistoricFloraEchinochimaera ee = (EntityPrehistoricFloraEchinochimaera) e;
        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
            AdvancedModelRenderer[] fishTailF = {this.tailfemale, this.tailfemale2, this.tailfemale3};

            AdvancedModelRenderer[] fishTailM = {this.tailmale, this.tailmale2, this.tailmale3, this.tailmale4};

        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.6F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            if (ee.getPNType() == EntityPrehistoricFloraEchinochimaera.Type.FEMALE) {
                this.walk(femalejaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
                this.chainSwing(fishTailF, speed*0.75F, 0.27F, 0, f2, 1);
                this.walk(backleftfinfemale, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.swing(backleftfinfemale, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.walk(backrightfinfemale, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.swing(backrightfinfemale, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            } else {

                this.chainSwing(fishTailM, speed * 0.8F, 0.27F, 0, f2, 1);
                this.walk(malejaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

                this.walk(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.swing(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.walk(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.swing(frontrightfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.walk(backleftfinmale, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.swing(backleftfinmale, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.walk(backrightfinmale, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
                this.swing(backrightfinmale, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            }

            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                //this.root.offsetY = 0.58F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
