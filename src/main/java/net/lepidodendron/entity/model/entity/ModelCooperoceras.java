package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCooperoceras extends AdvancedModelBase {
    private final AdvancedModelRenderer whole;
    private final AdvancedModelRenderer lefteye_r1;
    private final AdvancedModelRenderer siphon_r1;
    private final AdvancedModelRenderer shell_r1;
    private final AdvancedModelRenderer shell_r2;
    private final AdvancedModelRenderer shell_r3;
    private final AdvancedModelRenderer shell_r4;
    private final AdvancedModelRenderer shell_r5;
    private final AdvancedModelRenderer shell_r6;
    private final AdvancedModelRenderer shell_r7;
    private final AdvancedModelRenderer spike_r1;
    private final AdvancedModelRenderer spike_r2;
    private final AdvancedModelRenderer spike_r3;
    private final AdvancedModelRenderer spike_r4;
    private final AdvancedModelRenderer shell_r8;
    private final AdvancedModelRenderer shell_r9;
    private final AdvancedModelRenderer shell_r10;
    private final AdvancedModelRenderer shell_r11;
    private final AdvancedModelRenderer hood_r1;
    private final AdvancedModelRenderer hood_r2;
    private final AdvancedModelRenderer topmiddleright;
    private final AdvancedModelRenderer topmiddleleft;
    private final AdvancedModelRenderer lowerleft;
    private final AdvancedModelRenderer bottommiddleleft;
    private final AdvancedModelRenderer bottommiddleright;
    private final AdvancedModelRenderer bottomright;
    private final AdvancedModelRenderer bottom;
    private final AdvancedModelRenderer toprightarm;
    private final AdvancedModelRenderer topleft;
    private final AdvancedModelRenderer top;
    private final AdvancedModelRenderer rightspikecurved;
    private final AdvancedModelRenderer spike_r5;
    private final AdvancedModelRenderer spike_r6;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer spike_r7;
    private final AdvancedModelRenderer spike_r8;
    private final AdvancedModelRenderer spike_r9;
    private final AdvancedModelRenderer spike_r10;
    private final AdvancedModelRenderer spike_r11;
    private final AdvancedModelRenderer spike_r12;
    private final AdvancedModelRenderer spike_r13;
    private final AdvancedModelRenderer spike_r14;
    private final AdvancedModelRenderer spike_r15;
    private final AdvancedModelRenderer spike_r16;
    private final AdvancedModelRenderer spike_r17;
    private final AdvancedModelRenderer spike_r18;
    private final AdvancedModelRenderer spike_r19;
    private final AdvancedModelRenderer spike_r20;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer spike_r21;
    private final AdvancedModelRenderer spike_r22;
    private final AdvancedModelRenderer spike_r23;
    private final AdvancedModelRenderer spike_r24;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer spike_r25;
    private final AdvancedModelRenderer spike_r26;
    private final AdvancedModelRenderer spike_r27;
    private final AdvancedModelRenderer spike_r28;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer spike_r29;
    private final AdvancedModelRenderer spike_r30;
    private final AdvancedModelRenderer spike_r31;
    private final AdvancedModelRenderer spike_r32;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer spike_r33;
    private final AdvancedModelRenderer spike_r34;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer spike_r35;
    private final AdvancedModelRenderer spike_r36;
    private final AdvancedModelRenderer leftspikecurved;
    private final AdvancedModelRenderer spike_r37;
    private final AdvancedModelRenderer spike_r38;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer spike_r39;
    private final AdvancedModelRenderer spike_r40;
    private final AdvancedModelRenderer tentaclebase;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacles9;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacles10;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacles8;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacles11;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacles7;
    private final AdvancedModelRenderer tentacle12;
    private final AdvancedModelRenderer tentacles12;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacles6;
    private final AdvancedModelRenderer tentacle13;
    private final AdvancedModelRenderer tentacles13;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacles5;
    private final AdvancedModelRenderer tentacle14;
    private final AdvancedModelRenderer tentacles14;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacles4;
    private final AdvancedModelRenderer tentacle15;
    private final AdvancedModelRenderer tentacles15;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacles3;
    private final AdvancedModelRenderer tentacle16;
    private final AdvancedModelRenderer tentacles16;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacles2;
    private final AdvancedModelRenderer tentacle17;
    private final AdvancedModelRenderer tentacles17;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacles;

    public ModelCooperoceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.whole = new AdvancedModelRenderer(this);
        this.whole.setRotationPoint(-4.5F, 16.0F, -10.0F);
        this.setRotateAngle(whole, -1.6144F, 0.0F, 0.0F);


        this.lefteye_r1 = new AdvancedModelRenderer(this);
        this.lefteye_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.whole.addChild(lefteye_r1);
        this.setRotateAngle(lefteye_r1, 0.0873F, 0.0F, 0.0F);
        this.lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 32, 48, -1.0F, -6.0F, -2.0F, 1, 3, 3, 0.0F, false));
        this.lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 0, 64, 8.0F, -6.0F, -2.0F, 1, 3, 3, 0.0F, false));

        this.siphon_r1 = new AdvancedModelRenderer(this);
        this.siphon_r1.setRotationPoint(4.0F, -2.0F, 5.0F);
        this.whole.addChild(siphon_r1);
        this.setRotateAngle(siphon_r1, 0.1309F, 0.0F, 0.0F);
        this.siphon_r1.cubeList.add(new ModelBox(siphon_r1, 0, 78, -1.5F, -5.0198F, -2.3624F, 3, 12, 3, 0.0F, false));

        this.shell_r1 = new AdvancedModelRenderer(this);
        this.shell_r1.setRotationPoint(7.5F, 0.0F, 2.0F);
        this.whole.addChild(shell_r1);
        this.setRotateAngle(shell_r1, 0.1745F, 0.0F, 0.0F);
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 0, 48, -10.0F, -10.25F, -0.25F, 13, 10, 6, 0.0F, false));

        this.shell_r2 = new AdvancedModelRenderer(this);
        this.shell_r2.setRotationPoint(3.25F, -19.0F, -9.0F);
        this.whole.addChild(shell_r2);
        this.setRotateAngle(shell_r2, 0.6109F, 0.0F, 0.0F);
        this.shell_r2.cubeList.add(new ModelBox(shell_r2, 46, 0, -2.25F, 3.5322F, -17.2149F, 6, 6, 8, 0.0F, false));

        this.shell_r3 = new AdvancedModelRenderer(this);
        this.shell_r3.setRotationPoint(3.25F, -19.0F, -9.0F);
        this.whole.addChild(shell_r3);
        this.setRotateAngle(shell_r3, 0.1309F, 0.0F, 0.0F);
        this.shell_r3.cubeList.add(new ModelBox(shell_r3, 65, 63, -2.75F, 0.2822F, -14.2149F, 7, 12, 8, 0.0F, false));

        this.shell_r4 = new AdvancedModelRenderer(this);
        this.shell_r4.setRotationPoint(3.25F, -19.0F, -9.0F);
        this.whole.addChild(shell_r4);
        this.setRotateAngle(shell_r4, -0.829F, 0.0F, 0.0F);
        this.shell_r4.cubeList.add(new ModelBox(shell_r4, 40, 39, -3.25F, -1.9678F, -8.2149F, 8, 14, 10, 0.0F, false));

        this.shell_r5 = new AdvancedModelRenderer(this);
        this.shell_r5.setRotationPoint(3.25F, -19.0F, -9.0F);
        this.whole.addChild(shell_r5);
        this.setRotateAngle(shell_r5, -0.0436F, 0.0F, 0.0F);
        this.shell_r5.cubeList.add(new ModelBox(shell_r5, 37, 14, -3.75F, -7.2178F, -5.4649F, 9, 13, 12, 0.0F, false));

        this.shell_r6 = new AdvancedModelRenderer(this);
        this.shell_r6.setRotationPoint(3.25F, -15.0F, 0.0F);
        this.whole.addChild(shell_r6);
        this.setRotateAngle(shell_r6, 0.5672F, 0.0F, 0.0F);
        this.shell_r6.cubeList.add(new ModelBox(shell_r6, 0, 0, -4.25F, -10.427F, -8.6562F, 10, 13, 13, 0.0F, false));

        this.shell_r7 = new AdvancedModelRenderer(this);
        this.shell_r7.setRotationPoint(3.75F, -7.0F, -15.0F);
        this.whole.addChild(shell_r7);
        this.setRotateAngle(shell_r7, 0.6109F, 0.0F, 0.0F);
        this.shell_r7.cubeList.add(new ModelBox(shell_r7, 0, 64, -1.75F, 1.2349F, 0.1785F, 4, 6, 8, 0.0F, false));

        this.spike_r1 = new AdvancedModelRenderer(this);
        this.spike_r1.setRotationPoint(7.2F, -1.4F, -13.0F);
        this.whole.addChild(spike_r1);
        this.setRotateAngle(spike_r1, -0.2638F, -0.1635F, 1.0071F);
        this.spike_r1.cubeList.add(new ModelBox(spike_r1, 87, 25, -2.2F, 0.1548F, 0.4056F, 5, 1, 1, 0.0F, false));

        this.spike_r2 = new AdvancedModelRenderer(this);
        this.spike_r2.setRotationPoint(1.8F, -1.4F, -13.0F);
        this.whole.addChild(spike_r2);
        this.setRotateAngle(spike_r2, -0.2638F, 0.1635F, -1.0071F);
        this.spike_r2.cubeList.add(new ModelBox(spike_r2, 66, 41, -3.3F, -0.7452F, 0.0056F, 4, 1, 1, 0.0F, false));

        this.spike_r3 = new AdvancedModelRenderer(this);
        this.spike_r3.setRotationPoint(7.2F, -2.6F, -9.6F);
        this.whole.addChild(spike_r3);
        this.setRotateAngle(spike_r3, -0.0591F, -0.4536F, 0.944F);
        this.spike_r3.cubeList.add(new ModelBox(spike_r3, 16, 66, -1.2F, 0.1548F, 0.4056F, 3, 1, 1, -0.1F, false));

        this.spike_r4 = new AdvancedModelRenderer(this);
        this.spike_r4.setRotationPoint(1.8F, -2.6F, -9.6F);
        this.whole.addChild(spike_r4);
        this.setRotateAngle(spike_r4, -0.0591F, 0.4536F, -0.944F);
        this.spike_r4.cubeList.add(new ModelBox(spike_r4, 66, 43, -2.3F, -0.7452F, 0.0056F, 3, 1, 1, -0.1F, false));

        this.shell_r8 = new AdvancedModelRenderer(this);
        this.shell_r8.setRotationPoint(3.75F, -7.0F, -15.0F);
        this.whole.addChild(shell_r8);
        this.setRotateAngle(shell_r8, -0.0873F, 0.0F, 0.0F);
        this.shell_r8.cubeList.add(new ModelBox(shell_r8, 67, 7, -2.25F, -1.5151F, -1.8215F, 5, 7, 7, 0.0F, false));

        this.shell_r9 = new AdvancedModelRenderer(this);
        this.shell_r9.setRotationPoint(7.5F, -8.0F, -12.0F);
        this.whole.addChild(shell_r9);
        this.setRotateAngle(shell_r9, 0.8727F, -0.0436F, 0.0F);
        this.shell_r9.cubeList.add(new ModelBox(shell_r9, 0, 26, -3.9393F, -5.7495F, 4.6307F, 1, 8, 4, 0.0F, false));

        this.shell_r10 = new AdvancedModelRenderer(this);
        this.shell_r10.setRotationPoint(7.5F, 0.0F, 2.0F);
        this.whole.addChild(shell_r10);
        this.setRotateAngle(shell_r10, -0.0873F, -0.0436F, 0.0F);
        this.shell_r10.cubeList.add(new ModelBox(shell_r10, 0, 0, -5.05F, -12.5F, -12.25F, 2, 8, 4, 0.0F, false));

        this.shell_r11 = new AdvancedModelRenderer(this);
        this.shell_r11.setRotationPoint(7.5F, 0.0F, 2.0F);
        this.whole.addChild(shell_r11);
        this.setRotateAngle(shell_r11, 0.0436F, 0.0F, 0.0F);
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 0, 26, -9.5F, -15.75F, -9.25F, 12, 9, 13, 0.0F, false));
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 29, 63, -8.0F, -7.0F, -6.0F, 9, 8, 9, 0.0F, false));

        this.hood_r1 = new AdvancedModelRenderer(this);
        this.hood_r1.setRotationPoint(8.0F, 1.0F, -7.0F);
        this.whole.addChild(hood_r1);
        this.setRotateAngle(hood_r1, -0.0873F, 0.0F, 0.0F);
        this.hood_r1.cubeList.add(new ModelBox(hood_r1, 76, 39, -9.0F, -8.75F, 1.25F, 10, 10, 2, 0.0F, false));

        this.hood_r2 = new AdvancedModelRenderer(this);
        this.hood_r2.setRotationPoint(8.0F, 1.0F, -7.0F);
        this.whole.addChild(hood_r2);
        this.setRotateAngle(hood_r2, -0.0436F, 0.0F, 0.0F);
        this.hood_r2.cubeList.add(new ModelBox(hood_r2, 76, 51, -8.0F, -8.25F, -0.25F, 8, 8, 3, 0.0F, false));

        this.topmiddleright = new AdvancedModelRenderer(this);
        this.topmiddleright.setRotationPoint(7.0F, 4.25F, -0.5F);
        this.whole.addChild(topmiddleright);


        this.topmiddleleft = new AdvancedModelRenderer(this);
        this.topmiddleleft.setRotationPoint(1.0F, 4.5F, -0.5F);
        this.whole.addChild(topmiddleleft);
        this.setRotateAngle(topmiddleleft, 0.0873F, 0.0F, 0.0F);


        this.lowerleft = new AdvancedModelRenderer(this);
        this.lowerleft.setRotationPoint(2.1F, 3.75F, 3.6F);
        this.whole.addChild(lowerleft);


        this.bottommiddleleft = new AdvancedModelRenderer(this);
        this.bottommiddleleft.setRotationPoint(1.0F, 3.75F, 1.5F);
        this.whole.addChild(bottommiddleleft);
        this.setRotateAngle(bottommiddleleft, -0.0436F, 0.0F, 0.0F);


        this.bottommiddleright = new AdvancedModelRenderer(this);
        this.bottommiddleright.setRotationPoint(7.0F, 3.75F, 1.25F);
        this.whole.addChild(bottommiddleright);


        this.bottomright = new AdvancedModelRenderer(this);
        this.bottomright.setRotationPoint(6.0F, 3.75F, 3.5F);
        this.whole.addChild(bottomright);


        this.bottom = new AdvancedModelRenderer(this);
        this.bottom.setRotationPoint(4.0F, 3.75F, 3.5F);
        this.whole.addChild(bottom);


        this.toprightarm = new AdvancedModelRenderer(this);
        this.toprightarm.setRotationPoint(6.0F, 4.75F, -2.5F);
        this.whole.addChild(toprightarm);


        this.topleft = new AdvancedModelRenderer(this);
        this.topleft.setRotationPoint(2.0F, 4.75F, -2.5F);
        this.whole.addChild(topleft);


        this.top = new AdvancedModelRenderer(this);
        this.top.setRotationPoint(4.0F, 4.75F, -2.5F);
        this.whole.addChild(top);


        this.rightspikecurved = new AdvancedModelRenderer(this);
        this.rightspikecurved.setRotationPoint(7.2F, -1.4F, -16.9F);
        this.whole.addChild(rightspikecurved);


        this.spike_r5 = new AdvancedModelRenderer(this);
        this.spike_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightspikecurved.addChild(spike_r5);
        this.setRotateAngle(spike_r5, -0.2605F, 0.0473F, 0.9506F);
        this.spike_r5.cubeList.add(new ModelBox(spike_r5, 87, 23, -3.2F, 0.1548F, 0.4056F, 5, 1, 1, 0.0F, false));

        this.spike_r6 = new AdvancedModelRenderer(this);
        this.spike_r6.setRotationPoint(0.3F, 1.7F, 0.4F);
        this.rightspikecurved.addChild(spike_r6);
        this.setRotateAngle(spike_r6, -0.2924F, 0.4676F, 0.8283F);
        this.spike_r6.cubeList.add(new ModelBox(spike_r6, 16, 64, -0.3F, -0.3858F, -0.1788F, 3, 1, 1, -0.2F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightspikecurved.addChild(bone);
        this.setRotateAngle(bone, -0.1309F, 0.0F, 0.0F);


        this.spike_r7 = new AdvancedModelRenderer(this);
        this.spike_r7.setRotationPoint(-3.3F, -8.1141F, -6.0124F);
        this.bone.addChild(spike_r7);
        this.setRotateAngle(spike_r7, -0.4842F, 0.431F, 0.8501F);
        this.spike_r7.cubeList.add(new ModelBox(spike_r7, 28, 66, 3.3145F, -1.0914F, 3.8735F, 4, 1, 1, 0.1F, false));

        this.spike_r8 = new AdvancedModelRenderer(this);
        this.spike_r8.setRotationPoint(-0.3F, -9.1444F, -5.9151F);
        this.bone.addChild(spike_r8);
        this.setRotateAngle(spike_r8, -1.2029F, 0.7481F, 0.2892F);
        this.spike_r8.cubeList.add(new ModelBox(spike_r8, 87, 21, 4.6907F, -0.4556F, 0.8384F, 5, 1, 1, -0.1F, false));

        this.spike_r9 = new AdvancedModelRenderer(this);
        this.spike_r9.setRotationPoint(-1.8F, -24.4444F, 4.0849F);
        this.bone.addChild(spike_r9);
        this.setRotateAngle(spike_r9, 2.7721F, -0.1159F, -0.7708F);
        this.spike_r9.cubeList.add(new ModelBox(spike_r9, 56, 69, 1.8114F, -1.6098F, -0.4733F, 5, 1, 1, 0.5F, false));

        this.spike_r10 = new AdvancedModelRenderer(this);
        this.spike_r10.setRotationPoint(4.2F, -29.4444F, 3.9849F);
        this.bone.addChild(spike_r10);
        this.setRotateAngle(spike_r10, 2.709F, 0.4363F, -0.9539F);
        this.spike_r10.cubeList.add(new ModelBox(spike_r10, 56, 67, -0.8889F, -0.6371F, -0.6481F, 5, 1, 1, 0.1F, false));

        this.spike_r11 = new AdvancedModelRenderer(this);
        this.spike_r11.setRotationPoint(-3.8F, -24.4444F, 4.0849F);
        this.bone.addChild(spike_r11);
        this.setRotateAngle(spike_r11, 2.8314F, -0.0078F, 0.7592F);
        this.spike_r11.cubeList.add(new ModelBox(spike_r11, 67, 23, -8.1473F, -2.1894F, -1.0177F, 5, 1, 1, 0.5F, false));

        this.spike_r12 = new AdvancedModelRenderer(this);
        this.spike_r12.setRotationPoint(-11.8F, -29.4444F, 3.9849F);
        this.bone.addChild(spike_r12);
        this.setRotateAngle(spike_r12, 2.8402F, -0.4363F, 0.9753F);
        this.spike_r12.cubeList.add(new ModelBox(spike_r12, 67, 21, -3.9934F, -0.263F, -0.3255F, 5, 1, 1, 0.1F, false));

        this.spike_r13 = new AdvancedModelRenderer(this);
        this.spike_r13.setRotationPoint(-0.8F, -16.7444F, -5.1151F);
        this.bone.addChild(spike_r13);
        this.setRotateAngle(spike_r13, -1.6871F, 0.7732F, 0.0943F);
        this.spike_r13.cubeList.add(new ModelBox(spike_r13, 84, 9, 0.3864F, -0.2504F, -0.1248F, 5, 1, 1, 0.2F, false));

        this.spike_r14 = new AdvancedModelRenderer(this);
        this.spike_r14.setRotationPoint(2.2F, -16.7444F, -8.1151F);
        this.bone.addChild(spike_r14);
        this.setRotateAngle(spike_r14, -1.3439F, 0.7854F, 0.6498F);
        this.spike_r14.cubeList.add(new ModelBox(spike_r14, 84, 7, 0.2715F, -0.3689F, -0.2735F, 5, 1, 1, -0.1F, false));

        this.spike_r15 = new AdvancedModelRenderer(this);
        this.spike_r15.setRotationPoint(-9.4F, -15.6444F, -8.6151F);
        this.bone.addChild(spike_r15);
        this.setRotateAngle(spike_r15, -1.3439F, -0.7854F, -0.4438F);
        this.spike_r15.cubeList.add(new ModelBox(spike_r15, 80, 83, -4.6366F, -0.3712F, -0.7375F, 5, 1, 1, -0.1F, false));

        this.spike_r16 = new AdvancedModelRenderer(this);
        this.spike_r16.setRotationPoint(-6.4F, -16.6444F, -5.6151F);
        this.bone.addChild(spike_r16);
        this.setRotateAngle(spike_r16, -1.5207F, -0.7246F, -0.2506F);
        this.spike_r16.cubeList.add(new ModelBox(spike_r16, 68, 83, -5.1859F, -0.1984F, -0.3206F, 5, 1, 1, 0.2F, false));

        this.spike_r17 = new AdvancedModelRenderer(this);
        this.spike_r17.setRotationPoint(-0.3F, -9.1444F, -5.9151F);
        this.bone.addChild(spike_r17);
        this.setRotateAngle(spike_r17, -1.0821F, 0.6283F, 0.4887F);
        this.spike_r17.cubeList.add(new ModelBox(spike_r17, 80, 85, 0.3864F, -0.2504F, -0.1248F, 5, 1, 1, 0.1F, false));

        this.spike_r18 = new AdvancedModelRenderer(this);
        this.spike_r18.setRotationPoint(-6.1F, -8.8444F, -5.9151F);
        this.bone.addChild(spike_r18);
        this.setRotateAngle(spike_r18, -1.0948F, -0.7346F, -0.3517F);
        this.spike_r18.cubeList.add(new ModelBox(spike_r18, 68, 85, -9.3694F, -0.4556F, 0.3272F, 5, 1, 1, -0.1F, false));

        this.spike_r19 = new AdvancedModelRenderer(this);
        this.spike_r19.setRotationPoint(-6.1F, -8.8444F, -5.9151F);
        this.bone.addChild(spike_r19);
        this.setRotateAngle(spike_r19, -1.0821F, -0.6283F, -0.4887F);
        this.spike_r19.cubeList.add(new ModelBox(spike_r19, 84, 11, -5.1859F, -0.1984F, -0.3206F, 5, 1, 1, 0.1F, false));

        this.spike_r20 = new AdvancedModelRenderer(this);
        this.spike_r20.setRotationPoint(-3.3F, -8.1141F, -6.0124F);
        this.bone.addChild(spike_r20);
        this.setRotateAngle(spike_r20, -0.5516F, 0.7183F, 0.7153F);
        this.spike_r20.cubeList.add(new ModelBox(spike_r20, 46, 3, 5.5928F, -1.1147F, 5.9322F, 3, 1, 1, -0.1F, false));

        this.bone8 = new AdvancedModelRenderer(this);
        this.bone8.setRotationPoint(-2.4F, -20.8444F, -1.1151F);
        this.bone.addChild(bone8);


        this.spike_r21 = new AdvancedModelRenderer(this);
        this.spike_r21.setRotationPoint(0.1F, -0.1F, -0.1F);
        this.bone8.addChild(spike_r21);
        this.setRotateAngle(spike_r21, -2.7894F, 0.8378F, -0.5139F);
        this.spike_r21.cubeList.add(new ModelBox(spike_r21, 77, 5, 6.4578F, -1.7253F, -3.0651F, 5, 1, 1, 0.1F, false));

        this.spike_r22 = new AdvancedModelRenderer(this);
        this.spike_r22.setRotationPoint(0.1F, -0.1F, 0.0F);
        this.bone8.addChild(spike_r22);
        this.setRotateAngle(spike_r22, -2.8059F, 0.4991F, -0.6241F);
        this.spike_r22.cubeList.add(new ModelBox(spike_r22, 79, 36, 1.8114F, -1.6098F, -0.4733F, 5, 1, 1, 0.5F, false));

        this.spike_r23 = new AdvancedModelRenderer(this);
        this.spike_r23.setRotationPoint(-0.4F, 0.1F, 0.0F);
        this.bone8.addChild(spike_r23);
        this.setRotateAngle(spike_r23, -2.656F, -0.736F, 0.5323F);
        this.spike_r23.cubeList.add(new ModelBox(spike_r23, 77, 1, -12.9102F, -2.806F, -2.0643F, 5, 1, 1, 0.1F, false));

        this.spike_r24 = new AdvancedModelRenderer(this);
        this.spike_r24.setRotationPoint(-0.4F, 0.1F, 0.1F);
        this.bone8.addChild(spike_r24);
        this.setRotateAngle(spike_r24, -2.6909F, -0.5834F, 0.5173F);
        this.spike_r24.cubeList.add(new ModelBox(spike_r24, 77, 3, -8.1473F, -2.1894F, -1.0177F, 5, 1, 1, 0.5F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(-1.8F, -21.9444F, 13.7849F);
        this.bone.addChild(bone3);
        this.setRotateAngle(bone3, -0.3054F, 0.0F, 0.0F);


        this.spike_r25 = new AdvancedModelRenderer(this);
        this.spike_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone3.addChild(spike_r25);
        this.setRotateAngle(spike_r25, 2.7721F, -0.1159F, -0.7708F);
        this.spike_r25.cubeList.add(new ModelBox(spike_r25, 66, 0, 1.8114F, -1.6098F, -0.4733F, 5, 1, 1, 0.5F, false));

        this.spike_r26 = new AdvancedModelRenderer(this);
        this.spike_r26.setRotationPoint(6.0F, -5.0F, -0.1F);
        this.bone3.addChild(spike_r26);
        this.setRotateAngle(spike_r26, 2.6897F, 0.5152F, -0.9959F);
        this.spike_r26.cubeList.add(new ModelBox(spike_r26, 66, 2, -0.8889F, -0.6371F, -0.3981F, 5, 1, 1, 0.1F, false));

        this.spike_r27 = new AdvancedModelRenderer(this);
        this.spike_r27.setRotationPoint(-10.0F, -5.0F, -0.1F);
        this.bone3.addChild(spike_r27);
        this.setRotateAngle(spike_r27, 2.8265F, -0.5195F, 1.0051F);
        this.spike_r27.cubeList.add(new ModelBox(spike_r27, 66, 4, -3.9934F, -0.263F, 0.1745F, 5, 1, 1, 0.1F, false));

        this.spike_r28 = new AdvancedModelRenderer(this);
        this.spike_r28.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.bone3.addChild(spike_r28);
        this.setRotateAngle(spike_r28, 2.8314F, -0.0078F, 0.7592F);
        this.spike_r28.cubeList.add(new ModelBox(spike_r28, 66, 39, -8.1473F, -2.1894F, -1.0177F, 5, 1, 1, 0.5F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.5F, 1.3F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, -0.5149F, 0.0F, 0.0F);


        this.spike_r29 = new AdvancedModelRenderer(this);
        this.spike_r29.setRotationPoint(0.0F, 2.0F, 7.0F);
        this.bone4.addChild(spike_r29);
        this.setRotateAngle(spike_r29, 2.8472F, -0.0427F, -0.7768F);
        this.spike_r29.cubeList.add(new ModelBox(spike_r29, 33, 8, 1.8114F, -1.6098F, -0.4733F, 5, 1, 1, 0.5F, false));

        this.spike_r30 = new AdvancedModelRenderer(this);
        this.spike_r30.setRotationPoint(6.0F, -3.0F, 6.2F);
        this.bone4.addChild(spike_r30);
        this.setRotateAngle(spike_r30, 2.8228F, 0.6726F, -0.9211F);
        this.spike_r30.cubeList.add(new ModelBox(spike_r30, 33, 10, -0.8889F, -0.6371F, -0.3981F, 5, 1, 1, 0.1F, false));

        this.spike_r31 = new AdvancedModelRenderer(this);
        this.spike_r31.setRotationPoint(-10.0F, -3.0F, 6.2F);
        this.bone4.addChild(spike_r31);
        this.setRotateAngle(spike_r31, 2.9582F, -0.6779F, 0.9306F);
        this.spike_r31.cubeList.add(new ModelBox(spike_r31, 56, 63, -3.9934F, -0.263F, 0.1745F, 5, 1, 1, 0.1F, false));

        this.spike_r32 = new AdvancedModelRenderer(this);
        this.spike_r32.setRotationPoint(-2.0F, 2.0F, 7.0F);
        this.bone4.addChild(spike_r32);
        this.setRotateAngle(spike_r32, 2.9075F, -0.0798F, 0.7558F);
        this.spike_r32.cubeList.add(new ModelBox(spike_r32, 56, 65, -8.1473F, -2.1894F, -1.0177F, 5, 1, 1, 0.5F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, -0.5149F, 0.0F, 0.0F);


        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(-6.0F, -4.05F, 14.2F);
        this.bone5.addChild(bone7);
        this.setRotateAngle(bone7, 0.0F, 0.0F, -0.2182F);


        this.spike_r33 = new AdvancedModelRenderer(this);
        this.spike_r33.setRotationPoint(-4.0F, -3.0F, 0.0F);
        this.bone7.addChild(spike_r33);
        this.setRotateAngle(spike_r33, 2.9582F, -0.6779F, 0.9306F);
        this.spike_r33.cubeList.add(new ModelBox(spike_r33, 33, 4, -4.7934F, -0.263F, -0.3255F, 6, 1, 1, 0.1F, false));

        this.spike_r34 = new AdvancedModelRenderer(this);
        this.spike_r34.setRotationPoint(4.0F, 2.0F, 0.8F);
        this.bone7.addChild(spike_r34);
        this.setRotateAngle(spike_r34, 2.9075F, -0.0798F, 0.7558F);
        this.spike_r34.cubeList.add(new ModelBox(spike_r34, 33, 6, -9.1473F, -2.1894F, -1.0177F, 6, 1, 1, 0.5F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(4.0F, -4.8F, 14.2F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, 0.0F, 0.0F, 0.2182F);


        this.spike_r35 = new AdvancedModelRenderer(this);
        this.spike_r35.setRotationPoint(3.0F, -3.0F, 0.0F);
        this.bone6.addChild(spike_r35);
        this.setRotateAngle(spike_r35, 2.8228F, 0.6726F, -0.9211F);
        this.spike_r35.cubeList.add(new ModelBox(spike_r35, 33, 2, -1.3889F, -0.6371F, -0.8981F, 6, 1, 1, 0.1F, false));

        this.spike_r36 = new AdvancedModelRenderer(this);
        this.spike_r36.setRotationPoint(-3.0F, 2.0F, 0.8F);
        this.bone6.addChild(spike_r36);
        this.setRotateAngle(spike_r36, 2.8472F, -0.0427F, -0.7768F);
        this.spike_r36.cubeList.add(new ModelBox(spike_r36, 33, 0, 1.8114F, -1.6098F, -0.4733F, 6, 1, 1, 0.5F, false));

        this.leftspikecurved = new AdvancedModelRenderer(this);
        this.leftspikecurved.setRotationPoint(1.5F, 0.3F, -16.5F);
        this.whole.addChild(leftspikecurved);


        this.spike_r37 = new AdvancedModelRenderer(this);
        this.spike_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftspikecurved.addChild(spike_r37);
        this.setRotateAngle(spike_r37, -0.2924F, -0.4676F, -0.8283F);
        this.spike_r37.cubeList.add(new ModelBox(spike_r37, 46, 5, -3.4793F, -1.4271F, -0.2947F, 3, 1, 1, -0.2F, false));

        this.spike_r38 = new AdvancedModelRenderer(this);
        this.spike_r38.setRotationPoint(0.3F, -1.7F, -0.4F);
        this.leftspikecurved.addChild(spike_r38);
        this.setRotateAngle(spike_r38, -0.2605F, -0.0473F, -0.9506F);
        this.spike_r38.cubeList.add(new ModelBox(spike_r38, 66, 6, -2.3F, -0.7452F, 0.0056F, 3, 1, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftspikecurved.addChild(bone2);
        this.setRotateAngle(bone2, -0.1309F, 0.0F, 0.0F);


        this.spike_r39 = new AdvancedModelRenderer(this);
        this.spike_r39.setRotationPoint(2.4F, -9.8141F, -6.4124F);
        this.bone2.addChild(spike_r39);
        this.setRotateAngle(spike_r39, -0.518F, -0.7406F, -0.7656F);
        this.spike_r39.cubeList.add(new ModelBox(spike_r39, 46, 1, -8.4304F, -1.2875F, 5.7209F, 3, 1, 1, -0.1F, false));

        this.spike_r40 = new AdvancedModelRenderer(this);
        this.spike_r40.setRotationPoint(2.4F, -9.8141F, -6.4124F);
        this.bone2.addChild(spike_r40);
        this.setRotateAngle(spike_r40, -0.4842F, -0.431F, -0.8501F);
        this.spike_r40.cubeList.add(new ModelBox(spike_r40, 28, 64, -7.114F, -1.0394F, 3.6777F, 4, 1, 1, 0.1F, false));

        this.tentaclebase = new AdvancedModelRenderer(this);
        this.tentaclebase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.whole.addChild(tentaclebase);


        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(4.0F, 1.0F, -2.5F);
        this.tentaclebase.addChild(tentacle9);
        this.setRotateAngle(tentacle9, -0.3054F, 0.0F, 0.0F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles9 = new AdvancedModelRenderer(this);
        this.tentacles9.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle9.addChild(tentacles9);
        this.tentacles9.cubeList.add(new ModelBox(tentacles9, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(3.0F, 1.0F, -2.0F);
        this.tentaclebase.addChild(tentacle10);
        this.setRotateAngle(tentacle10, -0.0873F, 0.0F, 0.0873F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles10 = new AdvancedModelRenderer(this);
        this.tentacles10.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle10.addChild(tentacles10);
        this.tentacles10.cubeList.add(new ModelBox(tentacles10, 6, 93, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(5.0F, 1.0F, -2.0F);
        this.tentaclebase.addChild(tentacle8);
        this.setRotateAngle(tentacle8, -0.0873F, 0.0F, -0.0873F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles8 = new AdvancedModelRenderer(this);
        this.tentacles8.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle8.addChild(tentacles8);
        this.tentacles8.cubeList.add(new ModelBox(tentacles8, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(3.0F, 1.0F, 1.5F);
        this.tentaclebase.addChild(tentacle11);
        this.setRotateAngle(tentacle11, 0.0873F, 0.0F, 0.0873F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles11 = new AdvancedModelRenderer(this);
        this.tentacles11.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle11.addChild(tentacles11);
        this.tentacles11.cubeList.add(new ModelBox(tentacles11, 6, 93, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(5.0F, 1.0F, 1.5F);
        this.tentaclebase.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.0873F, 0.0F, -0.0873F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles7 = new AdvancedModelRenderer(this);
        this.tentacles7.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle7.addChild(tentacles7);
        this.tentacles7.cubeList.add(new ModelBox(tentacles7, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(3.0F, 1.0F, -0.5F);
        this.tentaclebase.addChild(tentacle12);
        this.setRotateAngle(tentacle12, 0.0F, 0.0F, 0.1309F);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles12 = new AdvancedModelRenderer(this);
        this.tentacles12.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle12.addChild(tentacles12);
        this.tentacles12.cubeList.add(new ModelBox(tentacles12, 6, 93, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(5.0F, 1.0F, -0.5F);
        this.tentaclebase.addChild(tentacle6);
        this.setRotateAngle(tentacle6, 0.0F, 0.0F, -0.1309F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles6 = new AdvancedModelRenderer(this);
        this.tentacles6.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle6.addChild(tentacles6);
        this.tentacles6.cubeList.add(new ModelBox(tentacles6, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle13 = new AdvancedModelRenderer(this);
        this.tentacle13.setRotationPoint(1.75F, 1.0F, 3.5F);
        this.tentaclebase.addChild(tentacle13);
        this.setRotateAngle(tentacle13, 0.1745F, 0.0F, 0.0F);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles13 = new AdvancedModelRenderer(this);
        this.tentacles13.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle13.addChild(tentacles13);
        this.tentacles13.cubeList.add(new ModelBox(tentacles13, 6, 93, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(6.25F, 1.0F, 3.5F);
        this.tentaclebase.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.1745F, 0.0F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles5 = new AdvancedModelRenderer(this);
        this.tentacles5.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle5.addChild(tentacles5);
        this.tentacles5.cubeList.add(new ModelBox(tentacles5, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle14 = new AdvancedModelRenderer(this);
        this.tentacle14.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.tentaclebase.addChild(tentacle14);
        this.setRotateAngle(tentacle14, 0.1309F, 0.0F, 0.2182F);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles14 = new AdvancedModelRenderer(this);
        this.tentacles14.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle14.addChild(tentacles14);
        this.tentacles14.cubeList.add(new ModelBox(tentacles14, 6, 93, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(7.0F, 1.0F, 1.5F);
        this.tentaclebase.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.1309F, 0.0F, -0.2182F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles4 = new AdvancedModelRenderer(this);
        this.tentacles4.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle4.addChild(tentacles4);
        this.tentacles4.cubeList.add(new ModelBox(tentacles4, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle15 = new AdvancedModelRenderer(this);
        this.tentacle15.setRotationPoint(1.0F, 1.0F, 0.5F);
        this.tentaclebase.addChild(tentacle15);
        this.setRotateAngle(tentacle15, 0.0F, 0.0F, 0.2618F);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles15 = new AdvancedModelRenderer(this);
        this.tentacles15.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle15.addChild(tentacles15);
        this.tentacles15.cubeList.add(new ModelBox(tentacles15, 6, 93, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(7.0F, 1.0F, 0.5F);
        this.tentaclebase.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.0F, -0.2618F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles3 = new AdvancedModelRenderer(this);
        this.tentacles3.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle3.addChild(tentacles3);
        this.tentacles3.cubeList.add(new ModelBox(tentacles3, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle16 = new AdvancedModelRenderer(this);
        this.tentacle16.setRotationPoint(1.0F, 1.0F, -0.5F);
        this.tentaclebase.addChild(tentacle16);
        this.setRotateAngle(tentacle16, -0.1309F, 0.0F, 0.2182F);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles16 = new AdvancedModelRenderer(this);
        this.tentacles16.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle16.addChild(tentacles16);
        this.tentacles16.cubeList.add(new ModelBox(tentacles16, 6, 93, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(7.0F, 1.0F, -0.5F);
        this.tentaclebase.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.1309F, 0.0F, -0.2182F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles2 = new AdvancedModelRenderer(this);
        this.tentacles2.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle2.addChild(tentacles2);
        this.tentacles2.cubeList.add(new ModelBox(tentacles2, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle17 = new AdvancedModelRenderer(this);
        this.tentacle17.setRotationPoint(2.0F, 1.0F, -2.5F);
        this.tentaclebase.addChild(tentacle17);
        this.setRotateAngle(tentacle17, -0.2182F, 0.0F, 0.0873F);
        this.tentacle17.cubeList.add(new ModelBox(tentacle17, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles17 = new AdvancedModelRenderer(this);
        this.tentacles17.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle17.addChild(tentacles17);
        this.tentacles17.cubeList.add(new ModelBox(tentacles17, 6, 93, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(6.0F, 1.0F, -2.5F);
        this.tentaclebase.addChild(tentacle);
        this.setRotateAngle(tentacle, -0.2182F, 0.0F, -0.0873F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 0, 93, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles = new AdvancedModelRenderer(this);
        this.tentacles.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle.addChild(tentacles);
        this.tentacles.cubeList.add(new ModelBox(tentacles, 6, 93, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.whole.render(f5 * 0.076F);
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
        this.whole.offsetY = 1.35F;
        this.whole.rotateAngleY = (float)Math.toRadians(180D);

        AdvancedModelRenderer[] tentacle1 = {this.tentacle, this.tentacles};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2, this.tentacles2};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3, this.tentacles3};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4, this.tentacles4};
        AdvancedModelRenderer[] tentacle5 = {this.tentacle5, this.tentacles5};
        AdvancedModelRenderer[] tentacle6 = {this.tentacle6, this.tentacles6};
        AdvancedModelRenderer[] tentacle7 = {this.tentacle7, this.tentacles7};
        AdvancedModelRenderer[] tentacle8 = {this.tentacle8, this.tentacles8};
        AdvancedModelRenderer[] tentacle9 = {this.tentacle9, this.tentacles9};
        AdvancedModelRenderer[] tentacle10 = {this.tentacle10, this.tentacles10};
        AdvancedModelRenderer[] tentacle11 = {this.tentacle11, this.tentacles11};
        AdvancedModelRenderer[] tentacle12 = {this.tentacle12, this.tentacles12};
        AdvancedModelRenderer[] tentacle13 = {this.tentacle13, this.tentacles13};
        AdvancedModelRenderer[] tentacle14 = {this.tentacle14, this.tentacles14};
        AdvancedModelRenderer[] tentacle15 = {this.tentacle15, this.tentacles15};
        AdvancedModelRenderer[] tentacle16 = {this.tentacle16, this.tentacles16};
        AdvancedModelRenderer[] tentacle17 = {this.tentacle17, this.tentacles17};

        float speed = 0.19F;
        float greaterFloat = 0.44F;
        float lesserFloat = 0.26F;

        //top set:
        this.chainWave(tentacle1, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle1, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle8, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle9, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle10, speed, greaterFloat, 1.5F, f2, 0.8F);

        this.chainWave(tentacle17, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle17, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //bottom set:
        this.chainWave(tentacle5, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle5, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle13, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle13, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //left set:
        this.chainFlap(tentacle2, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle2, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle3, speed, greaterFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle4, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle4, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //right set:
        this.chainFlap(tentacle16, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainWave(tentacle16, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle15, speed, -greaterFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle14, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainWave(tentacle14, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //centre four:
        this.chainWave(tentacle6, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle6, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle12, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle12, speed, -lesserFloat, 1.5F, f2, 0.8F);

        this.chainWave(tentacle7, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle7, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle11, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle11, speed, -lesserFloat, 1.5F, f2, 0.8F);


        if (e.isInWater()) {
            this.bob(whole, 0.22F, 0.90F, false, f2, 2);
            this.walk(whole, 0.2F, 0.15F, false, 0,0.15F,1.5F,1.0F);
        }
        else {
            this.whole.rotateAngleZ = (float) Math.toRadians(90);
            this.whole.offsetY = 1.45F;
        }
    }
}
